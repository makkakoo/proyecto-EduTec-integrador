package vistas.admin;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Alumno;
import modelo.Aula;
import modelo.ClaseDTO;
import modelo.Horario;
import modelo.Persona;
import modelo.Tema;
import modeloDAO.AulaDAO;
import modeloDAO.ClaseDAO;
import modeloDAO.HorarioDAO;
import modeloDAO.PersonaDao;
import modeloDAO.TemaDAO;

public class admin_programarclase extends javax.swing.JPanel {

    ArrayList<Tema> listaTema = new ArrayList<>();
    TemaDAO objTemaDAO = new TemaDAO();

    ArrayList<Aula> listaAula = new ArrayList<>();
    AulaDAO objAulaDAO = new AulaDAO();

    ArrayList<Persona> listaPersona = new ArrayList<>();
    PersonaDao objPersonaDao = new PersonaDao();

    ArrayList<Horario> listaHorario = new ArrayList<>();
    HorarioDAO objHorarioDao = new HorarioDAO();

    public admin_programarclase() {
        initComponents();
        listener();
        txtFecha.getDateEditor().setEnabled(false);

    }

    public void listener() {
        txtFecha.getDateEditor().addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                // Depuración: Imprimir mensaje cuando se detecta un cambio
                System.out.println("Cambio detectado en la fecha");

                mostrarHorario();

            }
        });
    }

    private void mostrarTema() {

        cbxTema.removeAllItems();
        listaTema.clear();
        listaTema = objTemaDAO.listarTodos();

        for (int i = 0; i < listaTema.size(); i++) {
            cbxTema.addItem(listaTema.get(i).getNombre());
        }
    }

    private void mostrarAula() {

        String fecha = obtenerFecha();

        if (fecha != null) {
            cbxAula.removeAllItems();
            listaAula.clear();
            listaAula = objAulaDAO.listarAulaPorFecha(fecha);

            for (int i = 0; i < listaAula.size(); i++) {
                cbxAula.addItem(listaAula.get(i).getAmbiente());
            }
        }

    }

    private void mostrarProfesor() {

        cbxTutor.removeAllItems();
        listaPersona.clear();
        listaPersona = objPersonaDao.listarTodos(1003);

        for (int i = 0; i < listaPersona.size(); i++) {
            cbxTutor.addItem(listaPersona.get(i).getApellido() + " " + listaPersona.get(i).getNombre());

        }
    }

    private void mostrarHorario() {

        String fecha = obtenerFecha();
        if (fecha != null) {
            
            cbxHorario.setEnabled(true);

            cbxHorario.removeAllItems();
            listaHorario.clear();

            listaHorario = objHorarioDao.listarHorarioPorFecha(fecha);

            for (int i = 0; i < listaHorario.size(); i++) {
                cbxHorario.addItem(listaHorario.get(i).getInicio() + " - " + listaHorario.get(i).getFinale());

            }

            if (listaHorario.size() == 0) {
                JOptionPane.showMessageDialog(null, "No hay horarios disponible para esa fecha", "Alerta", JOptionPane.WARNING_MESSAGE);
                limpiar();
            }

            cbxHorario.addActionListener((ActionEvent e1) -> {
                mostrarDatos();
                

            });

        }

    }

    public void mostrarDatos() {
        
        cbxTema.setEnabled(true);
        cbxAula.setEnabled(true);
        cbxTutor.setEnabled(true);
        mostrarAula();
        mostrarTema();

        mostrarProfesor();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxTema = new javax.swing.JComboBox<>();
        cbxAula = new javax.swing.JComboBox<>();
        cbxTutor = new javax.swing.JComboBox<>();
        cbxHorario = new javax.swing.JComboBox<>();
        btnReservar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 49, 194));
        jLabel1.setText("Reserva de aula");

        cbxTema.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        cbxTema.setForeground(new java.awt.Color(153, 153, 153));
        cbxTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));
        cbxTema.setEnabled(false);

        cbxAula.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        cbxAula.setForeground(new java.awt.Color(153, 153, 153));
        cbxAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cbxAula.setEnabled(false);

        cbxTutor.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        cbxTutor.setForeground(new java.awt.Color(153, 153, 153));
        cbxTutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));
        cbxTutor.setEnabled(false);

        cbxHorario.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        cbxHorario.setForeground(new java.awt.Color(153, 153, 153));
        cbxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));
        cbxHorario.setEnabled(false);
        cbxHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHorarioActionPerformed(evt);
            }
        });

        btnReservar.setBackground(new java.awt.Color(27, 68, 255));
        btnReservar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Elegir fecha");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Elegir el tema");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Elegir aula disponible");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Elegir tutor");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Elegir horario");

        txtFecha.setForeground(new java.awt.Color(153, 153, 153));
        txtFecha.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(415, 667, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxAula, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(238, 238, 238))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxTema, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cbxTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTema, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbxAula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed

        //CLASE DAO
        ClaseDAO objClaseDao = new ClaseDAO();

        //CLASE 
        ClaseDTO ObjClase = new ClaseDTO();

        //AULA
        Aula objAula = new Aula();
        AulaDAO objAulaDAO = new AulaDAO();

        //Horario
        Horario objHorario = new Horario();
        HorarioDAO objHorarioDAO = new HorarioDAO();

        //TEMA
        Tema objTema = new Tema();
        TemaDAO objTemaDAO = new TemaDAO();

        //Persona
        Persona objPersona = new Alumno();
        PersonaDao objPersonaDao = new PersonaDao();

        //ORDEN EN BASE A LA BASE DE DATOS
        //Agregando objeto Aula
        int indiceAmbiente = cbxAula.getSelectedIndex();
        objAula = objAulaDAO.listarUno(listaAula.get(indiceAmbiente).getAmbiente());
        ObjClase.setAula(objAula);

        //Agregando horario
        int indiceHora = cbxHorario.getSelectedIndex();
        objHorario = objHorarioDAO.listarUno(listaHorario.get(indiceHora).getId_hora() + "");
        System.out.println("" + listaHorario.get(indiceHora).getId_hora());
        ObjClase.setHorario(objHorario);

        //Agregando TEMA
        int indiceTema = cbxTema.getSelectedIndex();
        objTema = objTemaDAO.listarUno(listaTema.get(indiceTema).getId_tema() + "");
        ObjClase.setTema(objTema);

        //Agregando DNI
        int indiceDNI = cbxTutor.getSelectedIndex();
        objPersona = objPersonaDao.listarUno(listaPersona.get(indiceDNI).getDni() + "");
        ObjClase.setPersona(objPersona);

        //Agregando estado
        String estado = "En curso";
        ObjClase.setEstado(estado);

        //agregando fecha
        ObjClase.setFecha(obtenerFecha());

        objClaseDao.agregar(ObjClase);

        limpiar();


    }//GEN-LAST:event_btnReservarActionPerformed

    public String obtenerFecha() {
        Date date = txtFecha.getDate();
        if (date == null) {
            return null; // o puedes retornar una cadena vacía o un mensaje de error
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);
        return formattedDate;
    }

    public void limpiar() {

        // Método recomendado para establecer la fecha como nula
        txtFecha.setDate(null);
        txtFecha.getDateEditor().setDate(null);

        cbxAula.removeAllItems();
        cbxAula.addItem("Seleccionar fecha");

        cbxTutor.removeAllItems();
        cbxTutor.addItem("Seleccionar fecha");

        cbxTema.removeAllItems();
        cbxTema.addItem("Seleccionar fecha");

        cbxHorario.removeAllItems();
        cbxHorario.addItem("Seleccionar fecha");
        
        cbxAula.setEnabled(false);
        cbxHorario.setEnabled(false);
        cbxTema.setEnabled(false);
        cbxTutor.setEnabled(false);
        
        
        
    }


    private void cbxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHorarioActionPerformed

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cbxAula;
    private javax.swing.JComboBox<String> cbxHorario;
    private javax.swing.JComboBox<String> cbxTema;
    private javax.swing.JComboBox<String> cbxTutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser txtFecha;
    // End of variables declaration//GEN-END:variables
}
