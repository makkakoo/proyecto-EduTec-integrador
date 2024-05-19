/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vistas.alumno;

import java.awt.Color;
import javax.swing.JOptionPane;
import modelo.Persona;
import modeloDAO.PersonaDao;

/**
 *
 * @author lesly
 */
public class alum_cuenta extends javax.swing.JPanel {

    public alum_cuenta() {
        initComponents();
        mostrarDatos();
        OcultarCampos();
        OcultarOrig.setVisible(false);
        OcultarNueva.setVisible(false);
        OcultarRep.setVisible(false);
        pnlContraseña.setVisible(false);
    }

    public alum_cuenta(String dniObtenido) {
        initComponents();
        dni = dniObtenido;
        mostrarDatos();
        OcultarCampos();
        OcultarOrig.setVisible(false);
        OcultarNueva.setVisible(false);
        OcultarRep.setVisible(false);
        pnlContraseña.setVisible(false);

    }
    String dni;

    private void mostrarDatos() {
        Persona objPersona = new Persona();
        PersonaDao objPersonaDao = new PersonaDao();
        objPersona = objPersonaDao.listarUno(dni);
        txtDNI.setText(objPersona.getDni());
        txtNombre.setText(objPersona.getNombre());
        txtApellido.setText(objPersona.getApellido());
        txtCorreo.setText(objPersona.getEmail());
    }

    public void OcultarCampos() {
        lblContOrig.setVisible(false);
        lblContNueva.setVisible(false);
        lblContRep.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlDatos = new javax.swing.JPanel();
        btnModificarContra = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pnlContraseña = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnActContra = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtRepetirContra = new javax.swing.JPasswordField();
        txtContraOriginal = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtContraNueva = new javax.swing.JPasswordField();
        lblContOrig = new javax.swing.JLabel();
        lblContNueva = new javax.swing.JLabel();
        lblContRep = new javax.swing.JLabel();
        mostrarOrig = new javax.swing.JLabel();
        mostrarNueva = new javax.swing.JLabel();
        mostrarRep = new javax.swing.JLabel();
        OcultarNueva = new javax.swing.JLabel();
        OcultarRep = new javax.swing.JLabel();
        OcultarOrig = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 49, 194));
        jLabel1.setText("Mi cuenta");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuenta/PerfilAlum.png"))); // NOI18N

        pnlDatos.setBackground(new java.awt.Color(255, 255, 255));

        btnModificarContra.setBackground(new java.awt.Color(27, 68, 255));
        btnModificarContra.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnModificarContra.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarContra.setText("Modificar contraseña");
        btnModificarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarContraActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Correo");

        txtDNI.setEditable(false);
        txtDNI.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Nombres");

        txtNombre.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Apellidos");

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(153, 153, 153));

        btnModificar.setBackground(new java.awt.Color(27, 68, 255));
        btnModificar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar datos");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtApellido.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("DNI");

        javax.swing.GroupLayout pnlDatosLayout = new javax.swing.GroupLayout(pnlDatos);
        pnlDatos.setLayout(pnlDatosLayout);
        pnlDatosLayout.setHorizontalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlDatosLayout.createSequentialGroup()
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(168, 168, 168))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDatosLayout.createSequentialGroup()
                                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(txtApellido)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnModificarContra)
                        .addGap(86, 86, 86)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlDatosLayout.setVerticalGroup(
            pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(120, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
        );

        pnlContraseña.setBackground(new java.awt.Color(255, 255, 255));
        pnlContraseña.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 49, 194));
        jLabel3.setText("Cambio de contraseña");
        pnlContraseña.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 310, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Contraseña nueva");
        pnlContraseña.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Repetir contraseña");
        pnlContraseña.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        btnActContra.setBackground(new java.awt.Color(27, 68, 255));
        btnActContra.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnActContra.setForeground(new java.awt.Color(255, 255, 255));
        btnActContra.setText("Actualizar");
        btnActContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActContraActionPerformed(evt);
            }
        });
        pnlContraseña.add(btnActContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(27, 68, 255));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlContraseña.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        txtRepetirContra.setForeground(new java.awt.Color(153, 153, 153));
        txtRepetirContra.setText("**********");
        txtRepetirContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRepetirContraMousePressed(evt);
            }
        });
        pnlContraseña.add(txtRepetirContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 260, 40));

        txtContraOriginal.setForeground(new java.awt.Color(153, 153, 153));
        txtContraOriginal.setText("**********");
        txtContraOriginal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraOriginalMousePressed(evt);
            }
        });
        pnlContraseña.add(txtContraOriginal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 260, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Contraseña original");
        pnlContraseña.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtContraNueva.setForeground(new java.awt.Color(153, 153, 153));
        txtContraNueva.setText("**********");
        txtContraNueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraNuevaMousePressed(evt);
            }
        });
        pnlContraseña.add(txtContraNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 260, 41));

        lblContOrig.setForeground(new java.awt.Color(255, 0, 0));
        lblContOrig.setText("Campo obligatorio");
        pnlContraseña.add(lblContOrig, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        lblContNueva.setForeground(new java.awt.Color(255, 0, 0));
        lblContNueva.setText("Campo obligatorio");
        pnlContraseña.add(lblContNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        lblContRep.setForeground(new java.awt.Color(255, 0, 0));
        lblContRep.setText("Campo obligatorio");
        pnlContraseña.add(lblContRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        mostrarOrig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/mostrar contra.png"))); // NOI18N
        mostrarOrig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarOrigMouseClicked(evt);
            }
        });
        pnlContraseña.add(mostrarOrig, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        mostrarNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/mostrar contra.png"))); // NOI18N
        mostrarNueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarNuevaMouseClicked(evt);
            }
        });
        pnlContraseña.add(mostrarNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        mostrarRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/mostrar contra.png"))); // NOI18N
        mostrarRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarRepMouseClicked(evt);
            }
        });
        pnlContraseña.add(mostrarRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        OcultarNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/hide-password.png"))); // NOI18N
        OcultarNueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OcultarNuevaMouseClicked(evt);
            }
        });
        pnlContraseña.add(OcultarNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, 40));

        OcultarRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/hide-password.png"))); // NOI18N
        OcultarRep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OcultarRepMouseClicked(evt);
            }
        });
        pnlContraseña.add(OcultarRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        OcultarOrig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_login/hide-password.png"))); // NOI18N
        OcultarOrig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OcultarOrigMouseClicked(evt);
            }
        });
        pnlContraseña.add(OcultarOrig, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 20, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(369, 369, 369))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(422, 422, 422))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void reiniciarPanel() {
        mostrarDatos();
    }

    private void confirmacionAgregar(String a) {
        JOptionPane.showMessageDialog(null, "" + a + " al alumno ");
    }

    private boolean validarCorreo(String correo) {
        // Verificar si el correo contiene "@" y ".com"
        return correo.contains("@") && correo.contains(".com");
    }


    private void btnModificarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarContraActionPerformed
        reiniciarpanelcontra();
        pnlContraseña.setVisible(true);
        pnlDatos.setVisible(false);
    }//GEN-LAST:event_btnModificarContraActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Persona objPersona = new Persona();
        PersonaDao objPersonaDao = new PersonaDao();
        objPersona.setDni(dni);
        objPersona.setNombre(txtNombre.getText());
        objPersona.setApellido(txtApellido.getText());
        String correo = txtCorreo.getText();

        if (!validarCorreo(correo)) {
            JOptionPane.showMessageDialog(null, "El correo ingresado no es válido");
            reiniciarPanel();
            return; // Sale del método si el correo no es válido
        }

        objPersona.setEmail(correo);
        objPersonaDao.modificar(objPersona);
        confirmacionAgregar("Se modificó correctamente");
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnActContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActContraActionPerformed
        verificacionDeCampos();
        //        Persona objPersona = new Persona();
        //        PersonaDao objPersonaDao = new PersonaDao();
        //        objPersona.setDni(dni);
        //        objPersona.setPassword(String.valueOf(txtContraNueva.getPassword()));
        //        objPersonaDao.modificarContra(objPersona);
    }//GEN-LAST:event_btnActContraActionPerformed
    public void verificacionDeCampos() {
        OcultarCampos();
        int a = 0;
        if (String.valueOf(txtRepetirContra.getPassword()).isEmpty() || String.valueOf(txtRepetirContra.getPassword()).equals("**********")) {
            lblContRep.setVisible(true);
            a = -1;
        }
        if (String.valueOf(txtContraNueva.getPassword()).isEmpty() || String.valueOf(txtContraNueva.getPassword()).equals("**********")) {
            lblContNueva.setVisible(true);
            a = -1;
        }
        if (String.valueOf(txtContraOriginal.getPassword()).isEmpty() || String.valueOf(txtContraOriginal.getPassword()).equals("**********")) {
            lblContOrig.setVisible(true);
            a = -1;
        }
        if (String.valueOf(txtContraOriginal.getPassword()).equals("**********") && String.valueOf(txtContraNueva.getPassword()).equals("**********") && String.valueOf(txtRepetirContra.getPassword()).equals("**********")) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            a = -1;
        }
        if (a == 0) {
            verificacionContra();
        }
    }

    public void verificacionContra() {

        if (String.valueOf(txtRepetirContra.getPassword()).equals(String.valueOf(txtContraNueva.getPassword()))) {
            registroAccion();
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña no coinciden", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void reiniciarpanelcontra() {

        txtContraOriginal.setText("**********");
        txtContraOriginal.setForeground(new Color(153, 153, 153));
        txtContraNueva.setText("**********");
        txtContraNueva.setForeground(new Color(153, 153, 153));
        txtRepetirContra.setText("**********");
        txtRepetirContra.setForeground(new Color(153, 153, 153));
        OcultarCampos();
        
        mostrarOrig.setVisible(true);
        mostrarNueva.setVisible(true);
        mostrarRep.setVisible(true);
        OcultarOrig.setVisible(false);
        OcultarNueva.setVisible(false);
        OcultarRep.setVisible(false);
        
        txtContraOriginal.setEchoChar('*');
        txtContraNueva.setEchoChar('*');
        txtRepetirContra.setEchoChar('*');

    }

    public void registroAccion() {
        Persona objPersona = new Persona();
        PersonaDao objPersonaDao = new PersonaDao();

        // Verificar la contraseña antigua
        objPersona = objPersonaDao.listarUno(dni); // Obtener los datos de la persona usando el dni
        String ContraOriginal = String.valueOf(txtContraOriginal.getPassword());
        if (!objPersona.getPassword().equals(ContraOriginal)) {
            JOptionPane.showMessageDialog(null, "La contraseña original no es correcta.", "Error", JOptionPane.ERROR_MESSAGE);
            reiniciarpanelcontra();
            return;

        }
        //Actualizar la contraseña
        objPersona.setDni(dni);
        objPersona.setPassword(String.valueOf(txtContraNueva.getPassword()));

        objPersonaDao.modificarContra(objPersona);

        JOptionPane.showMessageDialog(null, "La contraseña se ha modificado correctamente.", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
        pnlDatos.setVisible(true);
        pnlContraseña.setVisible(false);
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        pnlContraseña.setVisible(false);
        pnlDatos.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtRepetirContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRepetirContraMousePressed
        if (String.valueOf(txtRepetirContra.getPassword()).equals("**********")) {
            txtRepetirContra.setText(null);
            txtRepetirContra.setForeground(Color.black);
        }

        if (String.valueOf(txtContraNueva.getPassword()).isEmpty()) {
            txtContraNueva.setText("**********");
            txtContraNueva.setForeground(new Color(204, 204, 204));
        }
        if (String.valueOf(txtContraOriginal.getPassword()).isEmpty()) {
            txtContraOriginal.setText("**********");
            txtContraOriginal.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtRepetirContraMousePressed

    private void txtContraOriginalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraOriginalMousePressed
        if (String.valueOf(txtContraOriginal.getPassword()).equals("**********")) {
            txtContraOriginal.setText(null);
            txtContraOriginal.setForeground(Color.black);
        }
        if (String.valueOf(txtContraNueva.getPassword()).isEmpty()) {
            txtContraNueva.setText("**********");
            txtContraNueva.setForeground(new Color(204, 204, 204));
        }
        if (String.valueOf(txtRepetirContra.getPassword()).isEmpty()) {
            txtRepetirContra.setText("**********");
            txtRepetirContra.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txtContraOriginalMousePressed

    private void txtContraNuevaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraNuevaMousePressed
        if (String.valueOf(txtContraNueva.getPassword()).equals("**********")) {
            txtContraNueva.setText(null);
            txtContraNueva.setForeground(Color.black);
        }

        if (String.valueOf(txtRepetirContra.getPassword()).isEmpty()) {
            txtRepetirContra.setText("**********");
            txtRepetirContra.setForeground(new Color(204, 204, 204));
        }
        if (String.valueOf(txtContraOriginal.getPassword()).isEmpty()) {
            txtContraOriginal.setText("**********");
            txtContraOriginal.setForeground(new Color(204, 204, 204));
        }

    }//GEN-LAST:event_txtContraNuevaMousePressed

    private void mostrarOrigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarOrigMouseClicked
        txtContraOriginal.setEchoChar((char) 0);
        OcultarOrig.setVisible(true);
        mostrarOrig.setVisible(false);
    }//GEN-LAST:event_mostrarOrigMouseClicked

    private void mostrarNuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarNuevaMouseClicked
        txtContraNueva.setEchoChar((char) 0);
        OcultarNueva.setVisible(true);
        mostrarNueva.setVisible(false);
    }//GEN-LAST:event_mostrarNuevaMouseClicked

    private void mostrarRepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarRepMouseClicked
        txtRepetirContra.setEchoChar((char) 0);
        OcultarRep.setVisible(true);
        mostrarRep.setVisible(false);
    }//GEN-LAST:event_mostrarRepMouseClicked

    private void OcultarNuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarNuevaMouseClicked
        txtContraNueva.setEchoChar('*');
        mostrarNueva.setVisible(true);
        OcultarNueva.setVisible(false);
    }//GEN-LAST:event_OcultarNuevaMouseClicked

    private void OcultarRepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarRepMouseClicked
        txtRepetirContra.setEchoChar('*');
        mostrarRep.setVisible(true);
        OcultarRep.setVisible(false);
    }//GEN-LAST:event_OcultarRepMouseClicked

    private void OcultarOrigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarOrigMouseClicked
        txtContraOriginal.setEchoChar('*');
        mostrarOrig.setVisible(true);
        OcultarOrig.setVisible(false);
    }//GEN-LAST:event_OcultarOrigMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OcultarNueva;
    private javax.swing.JLabel OcultarOrig;
    private javax.swing.JLabel OcultarRep;
    private javax.swing.JButton btnActContra;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarContra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContNueva;
    private javax.swing.JLabel lblContOrig;
    private javax.swing.JLabel lblContRep;
    private javax.swing.JLabel mostrarNueva;
    private javax.swing.JLabel mostrarOrig;
    private javax.swing.JLabel mostrarRep;
    private javax.swing.JPanel pnlContraseña;
    private javax.swing.JPanel pnlDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContraNueva;
    private javax.swing.JPasswordField txtContraOriginal;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtRepetirContra;
    // End of variables declaration//GEN-END:variables
}
