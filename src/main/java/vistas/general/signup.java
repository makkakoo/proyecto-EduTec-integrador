package vistas.general;

import javax.swing.JOptionPane;
import modelo.Persona;
import modeloDAO.PersonaDao;

import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class signup extends javax.swing.JFrame {

    public signup() {
        initComponents();
        ocultarContra.setVisible(false);
        ocultarRepetir.setVisible(false);
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
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JButton();
        txtPassord = new javax.swing.JPasswordField();
        txtDNI = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtRepetirContra = new javax.swing.JPasswordField();
        mostrarContra = new javax.swing.JLabel();
        mostrarRepetir = new javax.swing.JLabel();
        ocultarRepetir = new javax.swing.JLabel();
        ocultarContra = new javax.swing.JLabel();
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

        txtApellidos.setForeground(new java.awt.Color(204, 204, 204));
        txtApellidos.setText("Ingrese sus apellidos");
        txtApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidosMousePressed(evt);
            }
        });
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 229, 262, 30));

        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese sus nombres");
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
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
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 215, 43));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("DNI");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 277, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Correo");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 132, -1, -1));

        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("Ingrese correo electronico");
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 156, 262, 30));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Repetir contraseña");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, 30));

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

        txtPassord.setForeground(new java.awt.Color(204, 204, 204));
        txtPassord.setText("**********");
        txtPassord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassordMousePressed(evt);
            }
        });
        jPanel2.add(txtPassord, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 260, 30));

        txtDNI.setForeground(new java.awt.Color(204, 204, 204));
        txtDNI.setText("Ingrese DNI");
        txtDNI.setToolTipText("");
        txtDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDNIMousePressed(evt);
            }
        });
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        jPanel2.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 306, 262, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Contraseña");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 193, -1, 30));

        txtRepetirContra.setForeground(new java.awt.Color(204, 204, 204));
        txtRepetirContra.setText("**********");
        txtRepetirContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRepetirContraMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtRepetirContraMouseReleased(evt);
            }
        });
        jPanel2.add(txtRepetirContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 260, 30));

        mostrarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/mostrar contra.png"))); // NOI18N
        mostrarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarContraMouseClicked(evt);
            }
        });
        jPanel2.add(mostrarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 20, 30));

        mostrarRepetir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/mostrar contra.png"))); // NOI18N
        mostrarRepetir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarRepetirMouseClicked(evt);
            }
        });
        jPanel2.add(mostrarRepetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 316, 20, 20));

        ocultarRepetir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/hide-password.png"))); // NOI18N
        ocultarRepetir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarRepetirMouseClicked(evt);
            }
        });
        jPanel2.add(ocultarRepetir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 316, 20, 20));

        ocultarContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/hide-password.png"))); // NOI18N
        ocultarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarContraMouseClicked(evt);
            }
        });
        jPanel2.add(ocultarContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 20, 30));

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

        verificacionDNI();


    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void verificacionDNI() {
        int a= -1;

        // Verificar si el texto tiene exactamente 8 caracteres
        if (txtDNI.getText().length() == 8) {
            // Verificar si todos los caracteres son dígitos
            for (int i = 0; i < txtDNI.getText().length(); i++) {
                System.out.println("i antes:   " + i);
                if (!Character.isDigit(txtDNI.getText().charAt(i))) {
                    
                    i = txtDNI.getText().length();
                    a = txtDNI.getText().length();
                    JOptionPane.showMessageDialog(null, "El Dni deben ser números", "Alerta", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            a = txtDNI.getText().length();
            JOptionPane.showMessageDialog(null, "El DNI debe tener 8 dígitos", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
        
        
        if( a != txtDNI.getText().length()){
            verificacionContra();
        }

    }
    
    public void verificacionContra(){
        if(  String.valueOf(txtRepetirContra.getPassword()).equals(String.valueOf(txtPassord.getPassword())) ){
            registroAccion();
        }else{
            JOptionPane.showMessageDialog(null, "La contraseña no coinciden", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    

    public void registroAccion() {
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

    }
    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        welcome w = new welcome();
        w.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_btn_regresarActionPerformed

    private void txtPassordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassordMousePressed
        if (String.valueOf(txtPassord.getPassword()).equals("**********")) {
            txtPassord.setText(null);
            txtPassord.setForeground(Color.black);
        }

        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Ingrese sus nombres");
            txtNombre.setForeground(new Color(204, 204, 204));
        }
        
        if (String.valueOf(txtRepetirContra.getPassword()).isEmpty()) {
            txtRepetirContra.setText("**********");
            txtRepetirContra.setForeground(new Color(204, 204, 204));
        }
        
        if (txtApellidos.getText().isEmpty()) {
            txtApellidos.setText("Ingrese sus apellidos");
            txtApellidos.setForeground(new Color(204, 204, 204));
        }

        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("Ingrese DNI");
            txtDNI.setForeground(new Color(204, 204, 204));
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese correo electronico");
            txtCorreo.setForeground(new Color(204, 204, 204));
        }


    }//GEN-LAST:event_txtPassordMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if (txtNombre.getText().equals("Ingrese sus nombres")) {
            txtNombre.setText(null);
            txtNombre.setForeground(Color.black);
        }

        if (String.valueOf(txtPassord.getPassword()).isEmpty()) {
            txtPassord.setText("**********");
            txtPassord.setForeground(new Color(204, 204, 204));
        }
        
        
        if (String.valueOf(txtRepetirContra.getPassword()).isEmpty()) {
            txtRepetirContra.setText("**********");
            txtRepetirContra.setForeground(new Color(204, 204, 204));
        }
        
        
        if (txtApellidos.getText().isEmpty()) {
            txtApellidos.setText("Ingrese sus apellidos");
            txtApellidos.setForeground(new Color(204, 204, 204));
        }

        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("Ingrese DNI");
            txtDNI.setForeground(new Color(204, 204, 204));
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese correo electronico");
            txtCorreo.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtApellidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidosMousePressed
        if (txtApellidos.getText().equals("Ingrese sus apellidos")) {
            txtApellidos.setText(null);
            txtApellidos.setForeground(Color.black);
        }

        if (String.valueOf(txtPassord.getPassword()).isEmpty()) {
            txtPassord.setText("**********");
            txtPassord.setForeground(new Color(204, 204, 204));
        }
        
        if (String.valueOf(txtRepetirContra.getPassword()).isEmpty()) {
            txtRepetirContra.setText("**********");
            txtRepetirContra.setForeground(new Color(204, 204, 204));
        }
        
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Ingrese sus nombres");
            txtNombre.setForeground(new Color(204, 204, 204));
        }

        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("Ingrese DNI");
            txtDNI.setForeground(new Color(204, 204, 204));
        }

        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese correo electronico");
            txtCorreo.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtApellidosMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if (txtCorreo.getText().equals("Ingrese correo electronico")) {
            txtCorreo.setText(null);
            txtCorreo.setForeground(Color.black);
        }

        if (String.valueOf(txtPassord.getPassword()).isEmpty()) {
            txtPassord.setText("**********");
            txtPassord.setForeground(new Color(204, 204, 204));
        }
        
        if (String.valueOf(txtRepetirContra.getPassword()).isEmpty()) {
            txtRepetirContra.setText("**********");
            txtRepetirContra.setForeground(new Color(204, 204, 204));
        }
        
        
        if (String.valueOf(txtRepetirContra.getPassword()).isEmpty()) {
            txtRepetirContra.setText("**********");
            txtRepetirContra.setForeground(new Color(204, 204, 204));
        }
        
        
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Ingrese sus nombres");
            txtNombre.setForeground(new Color(204, 204, 204));
        }

        if (txtApellidos.getText().isEmpty()) {
            txtApellidos.setText("Ingrese sus apellidos");
            txtApellidos.setForeground(new Color(204, 204, 204));
        }

        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("Ingrese DNI");
            txtDNI.setForeground(new Color(204, 204, 204));
        }


    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDNIMousePressed
        if (txtDNI.getText().equals("Ingrese DNI")) {
            txtDNI.setText(null);
            txtDNI.setForeground(Color.black);
        }

        if (String.valueOf(txtPassord.getPassword()).isEmpty()) {
            txtPassord.setText("**********");
            txtPassord.setForeground(new Color(204, 204, 204));
        }
        
        if (String.valueOf(txtRepetirContra.getPassword()).isEmpty()) {
            txtRepetirContra.setText("**********");
            txtRepetirContra.setForeground(new Color(204, 204, 204));
        }
        
        
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Ingrese sus nombres");
            txtNombre.setForeground(new Color(204, 204, 204));
        }

        if (txtApellidos.getText().isEmpty()) {
            txtApellidos.setText("Ingrese sus apellidos");
            txtApellidos.setForeground(new Color(204, 204, 204));
        }

        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese correo electronico");
            txtCorreo.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtDNIMousePressed

    private void txtRepetirContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRepetirContraMousePressed
        if (String.valueOf(txtRepetirContra.getPassword()).equals("**********")) {
            txtRepetirContra.setText(null);
            txtRepetirContra.setForeground(Color.black);
        }

        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Ingrese sus nombres");
            txtNombre.setForeground(new Color(204, 204, 204));
        }
        
        if (String.valueOf(txtPassord.getPassword()).isEmpty()) {
            txtPassord.setText("**********");
            txtPassord.setForeground(new Color(204, 204, 204));
        }
        
        if (txtApellidos.getText().isEmpty()) {
            txtApellidos.setText("Ingrese sus apellidos");
            txtApellidos.setForeground(new Color(204, 204, 204));
        }

        if (txtDNI.getText().isEmpty()) {
            txtDNI.setText("Ingrese DNI");
            txtDNI.setForeground(new Color(204, 204, 204));
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("Ingrese correo electronico");
            txtCorreo.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtRepetirContraMousePressed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtRepetirContraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRepetirContraMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepetirContraMouseReleased

    private void mostrarContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarContraMouseClicked
        txtRepetirContra.setEchoChar((char)0);
        ocultarContra.setVisible(true);
        mostrarContra.setVisible(false);
        
    }//GEN-LAST:event_mostrarContraMouseClicked

    private void mostrarRepetirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarRepetirMouseClicked
        txtPassord.setEchoChar((char)0);
        ocultarRepetir.setVisible(true);
        mostrarRepetir.setVisible(false);
        
    }//GEN-LAST:event_mostrarRepetirMouseClicked

    private void ocultarRepetirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarRepetirMouseClicked
       txtPassord.setEchoChar('*');
       mostrarRepetir.setVisible(true);
       ocultarRepetir.setVisible(false);
       
    }//GEN-LAST:event_ocultarRepetirMouseClicked

    private void ocultarContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarContraMouseClicked
        txtRepetirContra.setEchoChar('*');
        mostrarContra.setVisible(true);
        ocultarContra.setVisible(false);
    }//GEN-LAST:event_ocultarContraMouseClicked

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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mostrarContra;
    private javax.swing.JLabel mostrarRepetir;
    private javax.swing.JLabel ocultarContra;
    private javax.swing.JLabel ocultarRepetir;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassord;
    private javax.swing.JPasswordField txtRepetirContra;
    // End of variables declaration//GEN-END:variables
}
