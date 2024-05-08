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
import misInterfaces.HorarioInterface;
import modelo.Horario;

public class HorarioDAO implements  HorarioInterface{
    Connection conn;
    Conexion con = new Conexion();
    Horario h;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Horario> lista = new ArrayList<>(); 

    @Override
    public boolean agregar(Horario h) {
         try {
            String sql = "insert into tema (id_hora, inicio, final)"
                    + " values (?, ?,?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, h.getId_hora());
            ps.setString(2, h.getInicio());
            ps.setString(3, h.getFinale());
            ps.executeUpdate();
        } catch (SQLException ex) {
            if (ex.getSQLState().equals("45000")) {
                // Se ha alcanzado el límite máximo de registros en la tabla
                //System.out.println("No se puede agregar más registros. Se ha alcanzado el límite máximo.");                
                JOptionPane.showMessageDialog(null, "No se puede agregar más horarios. Se ha alcanzado el límite máximo.");
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
            String sql = "delete from horario where id_hora = '"+codigo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean modificar(Horario h) {
        try {
            String sql = "update horario set id_hora=?, inicio=?, final=?"
                    + " where id_hora = '"+h.getId_hora()+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,h.getId_hora());
            ps.setString(2, h.getInicio());
            ps.setString(3, h.getFinale());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    }

    @Override
    public ArrayList<Horario> listarTodos() {
        try {
            String sql = "select * from horario";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                h = new Horario();
                h.setId_hora(rs.getInt("id_hora"));
                h.setInicio(rs.getString("inicio"));
                h.setFinale(rs.getString("final"));
                lista.add(h);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public Horario listarUno(String codigo) {
        try {
            String sql = "select * from horario where id_hora = '"+codigo+"'";            
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                h = new Horario();
                h.setId_hora(rs.getInt("id_hora"));
                h.setInicio(rs.getString("inicio"));
                h.setFinale(rs.getString("final"));
             }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h;
        
    }
}
