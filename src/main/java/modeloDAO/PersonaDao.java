package modeloDAO;

import Conexion.Conexion;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import misInterfaces.PersonaInterface;
import modelo.Persona;

public class PersonaDao implements PersonaInterface {

    Connection conn;
    Conexion con = new Conexion();
    PreparedStatement ps;
    Statement s;
    ResultSet rs;

    Persona objPersona;   
    ArrayList<Persona> lista = new ArrayList<>(); 
    
    @Override
    public Persona validarLogueo(String dni, String contraseña) {

        try {
            String sql = " select * from persona "
                    + "where dni =" + "'" + dni + "'" + "and password =" + "'" + contraseña + "'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                objPersona = new Persona();
                objPersona.setDni(rs.getString("dni"));
                objPersona.setPassword(rs.getString("password"));
                objPersona.setId_rol(rs.getInt("id_rol"));

            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objPersona;
    }

    @Override
    public boolean agregar(Persona p) {
        
        try {
            String sql = "insert into persona (dni, nombre, apellido, email, password, id_rol) "
                    + "values (?,?,?,?,?,?) ";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            //PARA INGRESAR LOS DATOS BAJO LA SENTENCIA SQL
            ps.setString(1, p.getDni());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellido());
            ps.setString(4, p.getEmail());
            
            ps.setString(5, p.getPassword());
            ps.setInt(6, p.getId_rol());

            //EJECUTAR LOS VALORES
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Persona p) {
        try {
            String sql = "update persona set dni=?, nombre=?, apellido=?, email=?"
                    + " where dni = '"+p.getDni()+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, p.getDni());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getApellido());
            ps.setString(4, p.getEmail());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }

    @Override
    public ArrayList<Persona> listarTodos(int tipo) {
        try {
            String sql = "select * from persona where id_rol='"+tipo+"'";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                objPersona = new Persona();
                objPersona.setDni(rs.getString("dni"));
                objPersona.setNombre(rs.getString("nombre"));
                objPersona.setApellido(rs.getString("apellido"));
                objPersona.setEmail(rs.getString("email"));
                lista.add(objPersona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;         
    }

    @Override
    public Persona listarUno(String codigo) {
         try {
            String sql = "select * from persona where dni = '"+codigo+"'";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                objPersona = new Persona();
                objPersona.setDni(rs.getString("dni"));
                objPersona.setNombre(rs.getString("nombre"));
                objPersona.setApellido(rs.getString("apellido"));
                objPersona.setEmail(rs.getString("email"));
             }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objPersona;
    }
    
    
    // Método para agregar la foto a una persona en la base de datos
    public boolean agregarFoto(Persona p) throws FileNotFoundException {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // Consulta SQL para actualizar el nombre de la imagen y la imagen en la tabla persona
            String sql = "update persona set nom_imagen=?, imagen=?"
                       + " where dni = '"+p.getDni()+"'";

            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            // Asignar el nombre de la imagen al primer parámetro de la consulta
            ps.setString(1, p.getNom_imagen());
            // Obtener el archivo de la imagen desde el objeto Persona
            File archivoFoto = p.getArchivoFoto();
            if (archivoFoto != null) {
                // Crear un flujo de entrada de archivo (FileInputStream) para leer los datos binarios del archivo de imagen
                FileInputStream archivofoto = new FileInputStream(archivoFoto);

                // Asignar el flujo de entrada binario al segundo parámetro de la consulta preparada
                // El tercer argumento es la longitud del archivo en bytes, convertida a int
                ps.setBinaryStream(2, archivofoto, (int) archivoFoto.length());

            } else {
                // Si no hay archivo de imagen, asignar un valor nulo al segundo parámetro
                ps.setNull(2, java.sql.Types.BLOB);
            }
            // Ejecutar la actualización de la base de datos
            ps.executeUpdate();
        } catch (SQLException ex) {
            // Manejar la excepción de SQL y registrar el error
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }


    public BufferedImage obtenerImagen(String codigo) {
        BufferedImage imagen = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            // Consulta SQL para obtener la imagen en formato BLOB asociada al código de la persona
            String sql = "SELECT imagen FROM persona WHERE dni = ?";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                // Obtener los datos BLOB de la columna de imagen
                byte[] imageData = rs.getBytes("imagen");
                // Convertir los datos BLOB en BufferedImage
                imagen = convertByteArrayToImage(imageData);
            }
        } catch (SQLException | IOException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Cerrar los recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return imagen;
    }

    // Método para convertir un array de bytes en BufferedImage
    private BufferedImage convertByteArrayToImage(byte[] imageData) throws IOException {
        // Crear un flujo de entrada de bytes desde el array de bytes
        ByteArrayInputStream bis = new ByteArrayInputStream(imageData);
        // Leer la imagen desde el flujo de entrada de bytes
        BufferedImage imagen = ImageIO.read(bis);
        // Cerrar el flujo de entrada de bytes
        bis.close();
        return imagen;
    }
    
    public int contarPersonasPorCodigo(int codigo) {
        int totalPersonas = 0;
        try {
            // Llamada a la función almacenada
            String sql = "{? = call contar_personas(?)}";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            CallableStatement st = conn.prepareCall(sql);
            
            // Registrar el parámetro de salida
            st.registerOutParameter(1, Types.INTEGER);
            // Establecer el valor del parámetro de entrada
            st.setInt(2, codigo);
            st.execute();
            
            // Obtener el resultado del parámetro de salida
            totalPersonas = st.getInt(1);
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return totalPersonas;
    }
}
