package vistas.admin;

import java.util.ArrayList;
import modelo.Aula;
import modelo.Horario;
import modelo.Persona;
import modelo.Tema;
import modeloDAO.AulaDAO;
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
        mostrarTema();
        mostrarAula();
        mostrarProfesor();
        mostrarHorario();
    }

    private void mostrarTema() {

        cbxTema.removeAllItems();
        listaTema = objTemaDAO.listarTodos();

        for (int i = 0; i < listaTema.size(); i++) {
            cbxTema.addItem(listaTema.get(i).getNombre());
        }
    }

    private void mostrarAula() {

        cbxAula.removeAllItems();
        listaAula = objAulaDAO.listarTodos();

        for (int i = 0; i < listaAula.size(); i++) {
            cbxAula.addItem(listaAula.get(i).getAmbiente());
        }
    }

    private void mostrarProfesor() {

        cbxTutor.removeAllItems();
        listaPersona = objPersonaDao.listarTodos(1003);

        for (int i = 0; i < listaPersona.size(); i++) {
            cbxTutor.addItem(listaPersona.get(i).getApellido() + " " + listaPersona.get(i).getNombre());

        }
    }

    private void mostrarHorario() {

        cbxHorario.removeAllItems();
        listaHorario = objHorarioDao.listarTodos();

        for (int i = 0; i < listaHorario.size(); i++) {
            cbxHorario.addItem(listaHorario.get(i).getInicio() + " - " + listaHorario.get(i).getFinale());

        }
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

        cbxAula.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        cbxAula.setForeground(new java.awt.Color(153, 153, 153));
        cbxAula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        cbxTutor.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        cbxTutor.setForeground(new java.awt.Color(153, 153, 153));
        cbxTutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));

        cbxHorario.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        cbxHorario.setForeground(new java.awt.Color(153, 153, 153));
        cbxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", " " }));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(cbxAula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxTutor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxTema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbxHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReservar, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                        .addGap(144, 144, 144))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel1)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxTema, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxAula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(213, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservarActionPerformed

    private void cbxHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHorarioActionPerformed


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
