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
import misInterfaces.AulaInterface;
import modelo.Aula;

public class AulaDAO implements AulaInterface {

    Connection conn;
    Conexion con = new Conexion();
    Aula au;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<Aula> lista = new ArrayList<>();

    @Override
    public boolean agregar(Aula au) {
        try {
            String sql = "insert into aula (ambiente, aforo)"
                    + " values (?, ?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, au.getAmbiente());
            ps.setInt(2, au.getAforo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            if (ex.getSQLState().equals("45000")) {
                // Se ha alcanzado el límite máximo de registros en la tabla
                //System.out.println("No se puede agregar más registros. Se ha alcanzado el límite máximo.");                
                JOptionPane.showMessageDialog(null, "No se puede agregar más aulas. Se ha alcanzado el límite máximo.");
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
            String sql = "delete from aula where ambiente = '" + codigo + "'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean modificar(Aula au) {
        try {
            String sql = "update aula set ambiente=?, aforo=?"
                    + " where ambiente = '" + au.getAmbiente() + "'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, au.getAmbiente());
            ps.setInt(2, au.getAforo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ArrayList<Aula> listarTodos() {
        try {
            String sql = "select * from aula";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                au = new Aula();
                au.setAmbiente(rs.getString("ambiente"));
                au.setAforo(rs.getInt("aforo"));
                lista.add(au);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public Aula listarUno(String codigo) {
        try {
            String sql = "select * from aula where ambiente = '" + codigo + "'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                au = new Aula();
                au.setAmbiente(rs.getString("ambiente"));
                au.setAforo(rs.getInt("aforo"));
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return au;

    }

    @Override
    public ArrayList<Aula> listarAulaPorFecha(String fecha) {

        try {
            String sql = "SELECT * FROM aula a where a.ambiente not in "
                    + "(SELECT r.aula_ambiente from registro_clases r where r.fecha = '" + fecha + "' ); ";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                au = new Aula();
                au.setAmbiente(rs.getString("ambiente"));
                au.setAforo(rs.getInt("aforo"));
                lista.add(au);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}

