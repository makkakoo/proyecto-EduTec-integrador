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
import misInterfaces.ClaseInterface;
import modelo.ClaseDTO;
import modelo.Horario;

public class ClaseDAO implements ClaseInterface {

    Connection conn;
    Conexion con = new Conexion();
    ClaseDTO objCLase;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<ClaseDTO> lista = new ArrayList<>();

    Horario h;
    HorarioDAO hDao = new HorarioDAO();

    @Override
    public boolean agregar(ClaseDTO c) {
        try {
            String sql = "insert into registro_clases ( aula_ambiente, id_hora, "
                    + "tema_id_tema, persona_dni, estado, fecha)"
                    + " values (?,?,?,?,?,?)";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getAula().getAmbiente());
            ps.setInt(2, c.getHorario().getId_hora());
            ps.setInt(3, c.getTema().getId_tema());
            ps.setString(4, c.getPersona().getDni());

            ps.setString(5, c.getEstado());
            ps.setString(6, c.getFecha());

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(ClaseDTO c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ClaseDTO> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ClaseDTO listarUno(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
