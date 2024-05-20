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
    @Override
    public ArrayList<ClaseDTO> listarporFiltros(String aula_amnbiente, String fecha, int id_hora, int tema_id_tema, String persona_dni) {
        try {

            String sentencia = "";

            String coma = "";
            
            if (fecha != null) {
                if (coma.equals("")) {
                    sentencia += " rc.fecha = '" + fecha + "' \n ";
                    coma = "and ";
                }
            }
            System.out.println("coma: " + coma);
            if (id_hora >= 0) {
                if (coma.equals("")) {
                    sentencia += " rc.id_hora = " + id_hora + " \n ";
                    coma = "and ";
                } else {
                    sentencia += coma + " rc.id_hora = " + id_hora + " \n ";
                }
            }

            if (tema_id_tema >= 0) {
                if (coma.equals("")) {
                    sentencia += " rc.tema_id_tema = " + tema_id_tema + " \n ";
                    coma = "and ";
                } else {
                    sentencia += coma + " rc.tema_id_tema = " + tema_id_tema + " \n ";
                }

            }
            if (!"Seleccionar".equals(persona_dni)) {
                if (coma.equals("")) {
                    sentencia += " rc.persona_dni = '" + persona_dni + "' \n ";
                    coma = "and ";
                }else{
                    sentencia += coma + " rc.persona_dni = '" + persona_dni + "' \n ";
                }

            }
            if(coma.equals("")){
                sentencia += "rc.estado = 'En curso'";
            }else{
                sentencia += coma + " rc.estado = 'En curso'";
            }
            
            System.out.println("texto: " + sentencia);

//            
            String sql = "SELECT\n"
                    + "    rc.id_registro_clase,\n"
                    + "    rc.aula_ambiente,\n"
                    + "    rc.id_hora,\n"
                    + "    rc.tema_id_tema,\n"
                    + "    rc.persona_dni,\n"
                    + "    rc.estado,\n"
                    + "    rc.fecha,\n"
                    + "    a.aforo - COUNT(rr.id_reserva) AS cupos_disponibles\n"
                    + "FROM\n"
                    + "    registro_clases rc\n"
                    + "    INNER JOIN aula a ON rc.aula_ambiente = a.ambiente\n"
                    + "    LEFT JOIN registro_reserva rr ON rc.id_registro_clase = rr.id_registro_clase\n"
                    + "WHERE \n"
                    + sentencia + " \n"
                    
                    + "GROUP BY\n"
                    + "    rc.id_registro_clase,\n"
                    + "    rc.aula_ambiente,\n"
                    + "    rc.id_hora,\n"
                    + "    rc.tema_id_tema,\n"
                    + "    rc.persona_dni,\n"
                    + "    rc.estado,\n"
                    + "    rc.fecha,\n"
                    + "    a.aforo\n"
                    + "HAVING\n"
                    + "    cupos_disponibles > 0;";
            conn = con.getConexion();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                objCLase = new ClaseDTO();

                // Obtener el objeto Especialidad
                String ambiente = rs.getString("aula_ambiente");
                System.out.println("ambiente = " + ambiente);
                a = ad.listarUno(ambiente);
                objCLase.setAula(a);
                objCLase.setFecha(rs.getString("fecha"));

                int hora = rs.getInt("id_hora");
                h = hd.listarUno(hora + "");
                objCLase.setHorario(h);

                int tema = rs.getInt("tema_id_tema");
                t = td.listarUno(tema + "");
                objCLase.setTema(t);

                String persona = rs.getString("persona_dni");
                p = pd.listarUno(persona);
                objCLase.setPersona(p);

                lista.add(objCLase);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(AulaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;

    }
}
