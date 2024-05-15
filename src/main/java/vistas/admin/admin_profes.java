package vistas.admin;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;
import modelo.Profesor;
import modeloDAO.PersonaDao;

public class admin_profes extends javax.swing.JPanel {
    //Declarar un objeto de la clase Profesor
    Profesor prof;
    //Declarar un objeto de la clase personaDAO para utilizar sus metodos
    PersonaDao pd;
    String codigo;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public admin_profes() {
        initComponents();
        establecerColumnas();
        mostrarProfes();
        
    }
    
    private void establecerColumnas(){
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Correo");
        tblProfes.setModel(modelo);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreProfe = new javax.swing.JTextField();
        txtCorreoProfe = new javax.swing.JTextField();
        txtApellidosProfe = new javax.swing.JTextField();
        txtDNIProfe = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfes = new javax.swing.JTable();
        btnAgregarProfe = new javax.swing.JButton();
        btnModificarProfe = new javax.swing.JButton();
        btnEliminarProfe = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 49, 194));
        jLabel1.setText("Registro de profesores");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("DNI");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Correo");

        txtDNIProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIProfeActionPerformed(evt);
            }
        });

        tblProfes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblProfes);

        btnAgregarProfe.setText("Agregar");
        btnAgregarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProfeActionPerformed(evt);
            }
        });

        btnModificarProfe.setText("Modificar");
        btnModificarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProfeActionPerformed(evt);
            }
        });

        btnEliminarProfe.setText("Eliminar");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 49, 194));
        jLabel6.setText("Buscar profesores");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jButton1.setText("Buscar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidosProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDNIProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificarProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminarProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregarProfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(txtNombreProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAgregarProfe))
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtApellidosProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnModificarProfe)))
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDNIProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEliminarProfe)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCorreoProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProfeActionPerformed
        int a= -1;
        // Verificar si el texto tiene exactamente 8 caracteres
        if (txtDNIProfe.getText().length() == 8) {
            // Verificar si todos los caracteres son dígitos
            for (int i = 0; i < txtDNIProfe.getText().length(); i++) {
                System.out.println("i antes:   " + i);
                if (!Character.isDigit(txtDNIProfe.getText().charAt(i))) {
                    
                    i = txtDNIProfe.getText().length();
                    a = txtDNIProfe.getText().length();
                    JOptionPane.showMessageDialog(null, "El Dni deben ser números", "Alerta", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            a = txtDNIProfe.getText().length();
            JOptionPane.showMessageDialog(null, "El DNI debe tener 8 dígitos", "Alerta", JOptionPane.ERROR_MESSAGE);
        }

        if( a != txtDNIProfe.getText().length()){
            //Instanciando un objeto de la clase Profesor
            prof = new Profesor();
            //Declarando e instanciando un DAO de Persona para agregar al Profe a la tabla de Persona
            PersonaDao pd = new PersonaDao();

            prof.setDni(txtDNIProfe.getText());
            prof.setNombre(txtNombreProfe.getText());
            prof.setApellido(txtApellidosProfe.getText());
            prof.setEmail(txtCorreoProfe.getText());
            prof.setId_rol(1003);
            prof.setPassword(null);

            pd.agregar(prof);
            System.out.println("Profe agregado correctamente");
            mostrarProfes();
        }


        
    }//GEN-LAST:event_btnAgregarProfeActionPerformed

    private void txtDNIProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIProfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIProfeActionPerformed

    private void btnModificarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProfeActionPerformed
        int fila = tblProfes.getSelectedRow();
        codigo = tblProfes.getValueAt(fila, 0).toString();
        pd = new PersonaDao();
        prof = (Profesor) pd.listarUno(codigo);
        
        txtDNIProfe.setText(prof.getDni());
        txtNombreProfe.setText(prof.getNombre());
        txtApellidosProfe.setText(prof.getApellido());
        txtCorreoProfe.setText(prof.getEmail());
        
    }//GEN-LAST:event_btnModificarProfeActionPerformed
    public void mostrarProfes(){
        modelo.setRowCount(0);
        pd = new PersonaDao();
        ArrayList<Persona> lista = new ArrayList<>();
        lista = pd.listarTodos(1003);
        for(int i=0; i<lista.size(); i++){
            Object[] data = {
                lista.get(i).getDni(), 
                lista.get(i).getNombre(),
                lista.get(i).getApellido(),
                lista.get(i).getEmail()
                };
            modelo.addRow(data);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProfe;
    private javax.swing.JButton btnEliminarProfe;
    private javax.swing.JButton btnModificarProfe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProfes;
    private javax.swing.JTextField txtApellidosProfe;
    private javax.swing.JTextField txtCorreoProfe;
    private javax.swing.JTextField txtDNIProfe;
    private javax.swing.JTextField txtNombreProfe;
    // End of variables declaration//GEN-END:variables
}
