package vistas.alumno;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ClaseDTO;
import modelo.Horario;
import modelo.Persona;
import modelo.Tema;
import modeloDAO.ClaseDAO;
import modeloDAO.HorarioDAO;
import modeloDAO.PersonaDao;
import modeloDAO.TemaDAO;

/**
 *
 * @author lesly
 */
public class alum_reservarclase extends javax.swing.JPanel {

    public alum_reservarclase() {
//        initComponents();
    }

    ArrayList<Persona> listaPersona = new ArrayList<>();
    PersonaDao objPersonaDao = new PersonaDao();

    ArrayList<Tema> listaTema = new ArrayList<>();
    TemaDAO objTemaDAO = new TemaDAO();

    ArrayList<Horario> listaHorario = new ArrayList<>();
    HorarioDAO objHorarioDao = new HorarioDAO();

    ArrayList<ClaseDTO> listaClase = new ArrayList<>();
    ClaseDAO objClaseDao = new ClaseDAO();

    DefaultTableModel x = new DefaultTableModel();

    public alum_reservarclase(String dniObtenido) {
        initComponents();
        dni = dniObtenido;
        mostrarTema();
        mostrarHorario();
        mostrarProfesor();
        mostrarNombreColumnas();
        listener();
    }
    String dni;

    public String obtenerFecha() {
        Date date = txtFecha.getDate();
        if (date == null) {
            return null; // o puedes retornar una cadena vacía o un mensaje de error
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }

    public void listener() {
        txtFecha.getDateEditor().addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                // Depuración: Imprimir mensaje cuando se detecta un cambio
                System.out.println("Cambio detectado en la fecha");

                mostrarDatos();

            }
        });
    }
    private void mostrarProfesor() {

        cbxTutor.removeAllItems();
        listaPersona.clear();

        listaPersona = objPersonaDao.listarSinRepetir();

        cbxTutor.addItem("Seleccionar");
        for (int i = 0; i < listaPersona.size(); i++) {
            cbxTutor.addItem(listaPersona.get(i).getApellido() + " " + listaPersona.get(i).getNombre());

        }

        cbxTutor.addActionListener((ActionEvent e1) -> {
            mostrarDatos();

        });
    }

    public void mostrarTema() {
        cbxTema.removeAllItems();
        listaTema.clear();
        listaTema = objTemaDAO.listarSinRepetir();

        cbxTema.addItem("Seleccionar");
        for (int i = 0; i < listaTema.size(); i++) {
            cbxTema.addItem(listaTema.get(i).getNombre());
        }
        cbxTema.addActionListener((ActionEvent e1) -> {
            mostrarDatos();

        });

    }

    private void mostrarHorario() {
        cbxHorario.removeAllItems();
        listaHorario.clear();

        cbxHorario.addItem("Seleccionar");
        listaHorario = objHorarioDao.listarSinRepetir();

        for (int i = 0; i < listaHorario.size(); i++) {
            cbxHorario.addItem(listaHorario.get(i).getInicio() + " - " + listaHorario.get(i).getFinale());

        }
        cbxHorario.addActionListener((ActionEvent e1) -> {
            mostrarDatos();

        });

    }

    private void mostrarNombreColumnas() {
        x.addColumn("Tema");
        x.addColumn("Tutor");
        x.addColumn("Aula");
        x.addColumn("Horario");
        x.addColumn("Fecha");

        tblDatos.setModel(x);
    }

    public void mostrarDatos() {
        limpiarTabla();
        listaClase.clear();

        //TEMA
        int indiceTema = cbxTema.getSelectedIndex() - 1;
        System.out.println("indiceTema = " + indiceTema);
        int tema_id_tema = -1;
        if (indiceTema != -1) {
            tema_id_tema = listaTema.get(indiceTema).getId_tema();
        }

        //Aula
        String aula_ambiente = "Seleccionar";

        //Hora
        int indiceHorario = cbxHorario.getSelectedIndex() - 1;
        int id_hora = -1;
        if (indiceHorario != -1) {
            id_hora = listaHorario.get(indiceHorario).getId_hora();
        }

        //DNI
        int indiceDNI = cbxTutor.getSelectedIndex() - 1;
        String persona_dni = "Seleccionar";
        if (indiceDNI != -1) {
            persona_dni = listaPersona.get(indiceDNI).getDni();
        }

        listaClase = objClaseDao.listarporFiltros(aula_ambiente, obtenerFecha(), id_hora, tema_id_tema, persona_dni);

        for (int i = 0; i < listaClase.size(); i++) {
            //AGREGANDO LOS DATOS A LA TABLA
            Object[] data = {listaClase.get(i).getTema().getNombre(), listaClase.get(i).getPersona().getApellido() + " " + listaClase.get(i).getPersona().getNombre(),
                listaClase.get(i).getAula().getAmbiente(), listaClase.get(i).getHorario().getInicio() + " - " + listaClase.get(i).getHorario().getFinale(),
                listaClase.get(i).getFecha()};
            x.addRow(data);
        }

    }

    public void limpiarTabla() {
        x.setRowCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxTema = new javax.swing.JComboBox<>();
        cbxHorario = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblFecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxTutor = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 49, 194));
        jLabel1.setText("Reservar clase");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        cbxTema.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        cbxTema.setForeground(new java.awt.Color(153, 153, 153));
        cbxTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel1.add(cbxTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 190, 40));

        cbxHorario.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        cbxHorario.setForeground(new java.awt.Color(153, 153, 153));
        cbxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHorarioActionPerformed(evt);
            }
        });
        jPanel1.add(cbxHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 200, 40));

        jButton1.setBackground(new java.awt.Color(27, 68, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reservar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 580, 261, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Elegir fecha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Elegir el tema");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Elegir Profesor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, -1, -1));

        txtFecha.setForeground(new java.awt.Color(153, 153, 153));
        txtFecha.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 200, 40));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, 300));

        lblFecha.setForeground(new java.awt.Color(153, 153, 153));
        lblFecha.setText("Limpiar fecha");
        lblFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFechaMouseClicked(evt);
            }
        });
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 200, 20));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Elegir horario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        cbxTutor.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        cbxTutor.setForeground(new java.awt.Color(153, 153, 153));
        cbxTutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTutorActionPerformed(evt);
            }
        });
        jPanel1.add(cbxTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, 210, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHorarioActionPerformed

    private void lblFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFechaMouseClicked

        // Método recomendado para establecer la fecha como nula
        txtFecha.setDate(null);
        txtFecha.getDateEditor().setDate(null);


    }//GEN-LAST:event_lblFechaMouseClicked

    private void cbxTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxHorario;
    private javax.swing.JComboBox<String> cbxTema;
    private javax.swing.JComboBox<String> cbxTutor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JTable tblDatos;
    private com.toedter.calendar.JDateChooser txtFecha;
    // End of variables declaration//GEN-END:variables
}
