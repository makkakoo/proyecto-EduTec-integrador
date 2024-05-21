
package modeloDAO;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.ReservaInterface;
import modelo.ClaseDTO;
import modelo.ReservaDTO;

public class ReservaDAO implements ReservaInterface{
    
    Connection conn;
    Conexion con = new Conexion();
    PreparedStatement ps;
    Statement s;
    ResultSet rs;
    ReservaDTO objReservaDTO;
    ClaseDTO c;
    ClaseDAO cd = new ClaseDAO();
    ArrayList<ReservaDTO> lista = new ArrayList<>(); 

    @Override
    public boolean agregar(ReservaDTO r) {

        try {
            String sql = "insert into registro_reserva ( dni_alumno, id_registro_clase) "
                    + "values (?,?) ";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            //PARA INGRESAR LOS DATOS BAJO LA SENTENCIA SQL
            ps.setString(1, r.getPersona().getDni());
            
            ps.setString(2, r.getClase().getCod_clase());

            //EJECUTAR LOS VALORES
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(ReservaDTO c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ReservaDTO> listarTodos() {
         throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ReservaDTO listarUno(String codigo) {
         try {
            String sql = "select * from registro_reserva where id_reserva='"+codigo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                objReservaDTO = new ReservaDTO();
                objReservaDTO.setCodigo(rs.getInt("id_reserva"));
                //Para el aula
                String cc = rs.getString("id_registro_clase");
                c= cd.listarUno(cc);
                objReservaDTO.setClase(c);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objReservaDTO;
    }
    
    public ArrayList<ReservaDTO> listarReservasPorAlu(String codigo) {
        try {
            String sql = "select * from registro_reserva where dni_alumno = '"+codigo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                objReservaDTO = new ReservaDTO();
                objReservaDTO.setCodigo(rs.getInt("id_reserva"));
                //Para la clase
                String cc = rs.getString("id_registro_clase");
                c= cd.listarUno(cc);
                objReservaDTO.setClase(c);
                lista.add(objReservaDTO);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public ReservaDTO obtenerReservaProxima(String dniAlumno) {
    CallableStatement cs = null;
    ResultSet rs = null;
        try {
            conn = con.getConexion();
            cs = conn.prepareCall("{call sp_ObtenerClaseProxima(?)}");
            cs.setString(1, dniAlumno);
            rs = cs.executeQuery();

            if (rs.next()) {
                objReservaDTO = new ReservaDTO();
                objReservaDTO.setCodigo(rs.getInt("id_reserva"));
                //Para la clase
                String cc = rs.getString("id_registro_clase");
                c= cd.listarUno(cc);
                objReservaDTO.setClase(c); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReservaDAO.class.getName()).log(Level.SEVERE, "Error al obtener la reserva más próxima para el alumno", ex);
        } 
        return objReservaDTO;
    }
    
}
