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
import javax.swing.JOptionPane;
import misInterfaces.TemaInterface;
import modelo.Tema;

public class TemaDAO implements  TemaInterface{
    Connection conn;
    Conexion con = new Conexion();
    Tema t;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Tema> lista = new ArrayList<>(); 

    @Override
    public boolean agregar(Tema t) {
         try {
            String sql = "insert into tema (id_tema, nombre_tema)"
                    + " values (?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getId_tema());
            ps.setString(2, t.getNombre());
            ps.executeUpdate();
        } catch (SQLException ex) {
            if (ex.getSQLState().equals("45000")) {
                // Se ha alcanzado el límite máximo de registros en la tabla
                //System.out.println("No se puede agregar más registros. Se ha alcanzado el límite máximo.");                
                JOptionPane.showMessageDialog(null, "No se puede agregar más temas. Se ha alcanzado el límite máximo.");
            } else {
                // Otro tipo de error SQL
                Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    @Override
    public boolean eliminar(String codigo) {
        try {
            String sql = "delete from tema where id_tema = '"+codigo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean modificar(Tema t) {
        try {
            String sql = "update aula set id_tema=?, nombre_tema=?"
                    + " where id_tema = '"+t.getId_tema()+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, t.getId_tema());
            ps.setString(2, t.getNombre());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    }

    @Override
    public ArrayList<Tema> listarTodos() {
        try {
            String sql = "select * from tema";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new Tema();
                t.setId_tema(rs.getString("id_tema"));
                t.setNombre(rs.getString("nombre_tema"));
                lista.add(t);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public Tema listarUno(String codigo) {
        try {
            String sql = "select * from tema where id_tema = '"+codigo+"'";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new Tema();
                t.setId_tema(rs.getString("id_tema"));
                t.setNombre(rs.getString("nombre_tema"));
             }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
        
    }
}
