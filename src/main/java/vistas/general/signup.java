
package vistas.general;


import javax.swing.JOptionPane;
import modelo.Persona;
import modeloDAO.PersonaDao;

import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;

public class signup extends javax.swing.JFrame {

    public signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        txtPassord = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 204), null));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 49, 194));
        jLabel4.setText("Datos personales");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 57, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Apellidos");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Complete sus datos para registrarse ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 98, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Nombre");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 130, -1, 20));
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 229, 262, 30));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 156, 262, 30));

        btnRegistrar.setBackground(new java.awt.Color(27, 68, 255));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrarse");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 215, 43));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("DNI");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 277, -1, -1));
        jPanel2.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 306, 262, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Correo");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 132, -1, -1));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 156, 262, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Contraseña");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 193, -1, 30));

        btn_regresar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_regresar.setForeground(new java.awt.Color(153, 153, 153));
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/flechita1.png"))); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.setBorderPainted(false);
        btn_regresar.setContentAreaFilled(false);
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        txtPassord.setText("jPasswordField1");
        jPanel2.add(txtPassord, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 260, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 835, 435));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/curvas1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/curvas2.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("© Grupo10");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 580, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("© Diseñado y desarrollado por Leslie, Adrián y Walter");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Persona objPersona = new Persona();
        PersonaDao objPerDAO = new PersonaDao();
        
        objPersona.setDni(txtDNI.getText());
        objPersona.setNombre(txtNombre.getText());
        objPersona.setApellido(txtApellidos.getText()); 
        
        objPersona.setEmail(txtCorreo.getText()); 
        objPersona.setPassword(String.valueOf(txtPassord.getPassword())); 
        objPersona.setId_rol(1002);
        
        objPerDAO.agregar(objPersona);
                
        JOptionPane.showMessageDialog(null, "El doctor se ha agregado correctamente.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        welcome w = new welcome();
        w.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_btn_regresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
//            UIManager.setLookAndFeel(new FlatLightLaf());
//             FlatArcIJTheme.setup();
            FlatLightFlatIJTheme.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassord;
    // End of variables declaration//GEN-END:variables
}
