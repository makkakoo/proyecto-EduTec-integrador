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

public class PersonaDao implements PersonaInterface {

    Connection conn;
    Conexion con = new Conexion();
    PreparedStatement ps;
    Statement s;
    ResultSet rs;

    Persona objPersona;

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
