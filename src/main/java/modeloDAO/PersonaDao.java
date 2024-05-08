
package modeloDAO;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.PersonaInterface;
import modelo.Persona;

public class PersonaDao implements PersonaInterface{

    
    Connection conn;
    Conexion con = new Conexion();
    PreparedStatement ps;
    Statement s;
    ResultSet rs;
    
    Persona objPersona;
    
    
    @Override
    public Persona validarLogueo(String dni, String contraseña) {

        try {
            String sql = " select dni,password, rol from persona p JOIN tipo_usuario tp on p.id_rol = tp.id_rol "
                    + "where dni =" + "'" + dni + "'" + "and password =" + "'" + contraseña + "'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                objPersona = new Persona();
                objPersona.setDni(rs.getString("dni"));
                objPersona.setPassword(rs.getString("password"));
                objPersona.setRol(rs.getString("rol"));

            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objPersona;
    }

    @Override
    public boolean agregar(Persona c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Persona c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Persona> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Persona listarUno(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
