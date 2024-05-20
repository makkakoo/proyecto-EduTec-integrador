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
import javax.swing.JOptionPane;
import misInterfaces.ClaseInterface;
import modelo.Aula;
import modelo.ClaseDTO;
import modelo.Horario;
import modelo.Persona;
import modelo.Tema;

public class ClaseDAO implements ClaseInterface {

    Connection conn;
    Conexion con = new Conexion();
    ClaseDTO objCLase;
    Statement st;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<ClaseDTO> lista = new ArrayList<>();

    //Para capturar datos del aula
    Aula a;
    AulaDAO ad = new AulaDAO();
    //Para capturar datos del horario
    Horario h;
    HorarioDAO hd= new HorarioDAO();
    //Para capturar datos del tema
    Tema t;
    TemaDAO td = new TemaDAO();
    //Para capturar datos del profesor
    Persona p;
    PersonaDao pd = new PersonaDao();

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
        try {
            String sql = "select * from registro_clases";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                objCLase = new ClaseDTO();
                objCLase.setCod_clase(rs.getString("id_registro_clase"));
                //Para el aula
                String ca = rs.getString("aula_ambiente");
                a= ad.listarUno(ca);
                objCLase.setAula(a);
                 //Para el horario
                String ch = rs.getString("id_hora");
                h= hd.listarUno(ch);
                objCLase.setHorario(h);
                 //Para el tema
                String ct = rs.getString("tema_id_tema");
                t= td.listarUno(ct);
                objCLase.setTema(t);
                 //Para el profe
                String cp = rs.getString("persona_dni");
                p= pd.listarUno(cp);
                objCLase.setPersona(p);
                
                objCLase.setEstado(rs.getString("estado"));
                objCLase.setFecha(rs.getString("fecha")); 
                lista.add(objCLase);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    @Override
    public ClaseDTO listarUno(String codigo) {
        try {
            String sql = "select * from registro_clases where id_registro_clase='"+codigo+"'";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                objCLase = new ClaseDTO();
                objCLase.setCod_clase(rs.getString("id_registro_clase"));
                //Para el aula
                String ca = rs.getString("aula_ambiente");
                a= ad.listarUno(ca);
                objCLase.setAula(a);
                //Para el horario
                String ch = rs.getString("id_hora");
                h= hd.listarUno(ch);
                objCLase.setHorario(h);
                //Para el tema
                String ct = rs.getString("tema_id_tema");
                t= td.listarUno(ct);
                objCLase.setTema(t);
                //Para la persona
                String cp = rs.getString("persona_dni");
                p= pd.listarUno(cp);
                objCLase.setPersona(p);
                objCLase.setEstado(rs.getString("estado"));
                objCLase.setFecha(rs.getString("fecha"));

            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return objCLase;
    }
    
    public ArrayList<ClaseDTO> listarPorIntervalo(String fechaInicio, String fechaFin) {
    ArrayList<ClaseDTO> lista = new ArrayList<>();
        try {
            conn = con.getConexion();
            CallableStatement cs = conn.prepareCall("{call sp_ListarClasesPorIntervalo(?, ?)}");
            cs.setString(1, fechaInicio);
            cs.setString(2, fechaFin);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                objCLase = new ClaseDTO();
                objCLase.setCod_clase(rs.getString("id_registro_clase"));
                //Para el aula
                String ca = rs.getString("aula_ambiente");
                a= ad.listarUno(ca);
                objCLase.setAula(a);
                 //Para el horario
                String ch = rs.getString("id_hora");
                h= hd.listarUno(ch);
                objCLase.setHorario(h);
                 //Para el tema
                String ct = rs.getString("tema_id_tema");
                t= td.listarUno(ct);
                objCLase.setTema(t);
                 //Para el profe
                String cp = rs.getString("persona_dni");
                p= pd.listarUno(cp);
                objCLase.setPersona(p);
                
                objCLase.setEstado(rs.getString("estado"));
                objCLase.setFecha(rs.getString("fecha")); 
                lista.add(objCLase);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClaseDAO.class.getName()).log(Level.SEVERE, "Error al listar clases por intervalo de fechas", ex);
        } 
        return lista;
    }
}
