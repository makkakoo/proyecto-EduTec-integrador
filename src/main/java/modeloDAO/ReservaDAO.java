
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
import misInterfaces.ReservaInterface;
import modelo.ReservaDTO;

public class ReservaDAO implements ReservaInterface{
    
    Connection conn;
    Conexion con = new Conexion();
    PreparedStatement ps;
    Statement s;
    ResultSet rs;

    ReservaDTO objReservaDTO;   
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
