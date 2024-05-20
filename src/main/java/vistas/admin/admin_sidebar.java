/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas.admin;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import vistas.general.welcome;

/**
 *
 * @author lesly
 */
public class admin_sidebar extends javax.swing.JFrame {

    /**
     * Creates new form admin_sidebar
     */
    public admin_sidebar() {
//        initComponents();
//
//        //Para mostrar por defecto el panel del dashboard
//        d = new admin_dashboard();
//        d.setSize(1040, 620);
//        d.setLocation(0, 0);
//
//        content.removeAll();
//        content.add(d, BorderLayout.CENTER);
//        content.revalidate();
//        content.repaint();
    }

    admin_dashboard d;
    admin_clases c;
    admin_programarclase p;
    admin_cuenta cu;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        banner2 = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_cuenta = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_programar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btn_clases = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnLogOutAdm = new javax.swing.JButton();
        banner = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(198, 223, 255));
        sidebar.setForeground(new java.awt.Color(255, 255, 255));
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/logo_banner.png"))); // NOI18N
        sidebar.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        banner2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/banner2.png"))); // NOI18N
        sidebar.add(banner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btn_dashboard.setBackground(new java.awt.Color(184, 218, 255));
        btn_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_dashboardMousePressed(evt);
            }
        });
        btn_dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/chart_icon.png"))); // NOI18N
        btn_dashboard.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dashboard");
        btn_dashboard.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        sidebar.add(btn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 60));

        btn_cuenta.setBackground(new java.awt.Color(198, 223, 255));
        btn_cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_cuentaMousePressed(evt);
            }
        });
        btn_cuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/user_icon.png"))); // NOI18N
        btn_cuenta.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mi cuenta");
        btn_cuenta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        sidebar.add(btn_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 240, 60));

        btn_programar.setBackground(new java.awt.Color(198, 223, 255));
        btn_programar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_programarMousePressed(evt);
            }
        });
        btn_programar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/calendar_icon.png"))); // NOI18N
        btn_programar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Programar ");
        btn_programar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        sidebar.add(btn_programar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 240, 60));

        btn_clases.setBackground(new java.awt.Color(198, 223, 255));
        btn_clases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_clasesMousePressed(evt);
            }
        });
        btn_clases.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/writing_icon.png"))); // NOI18N
        btn_clases.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Clases");
        btn_clases.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        sidebar.add(btn_clases, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 240, 60));

        btnLogOutAdm.setBackground(new java.awt.Color(198, 223, 255));
        btnLogOutAdm.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnLogOutAdm.setForeground(new java.awt.Color(102, 102, 102));
        btnLogOutAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/logOut.png"))); // NOI18N
        btnLogOutAdm.setText("   Cerrar sesión");
        btnLogOutAdm.setBorderPainted(false);
        btnLogOutAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutAdmActionPerformed(evt);
            }
        });
        sidebar.add(btnLogOutAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 550, 230, 60));

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 720));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_sidebar/banner1.png"))); // NOI18N
        getContentPane().add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 1040, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public admin_sidebar(String dniObtenido) {
        initComponents();
        dni = dniObtenido;//se reserva el dni
        //Para mostrar por defecto el panel del dashboard
        d = new admin_dashboard(dni);
        d.setSize(1040, 620);
        d.setLocation(0, 0);

        content.removeAll();
        content.add(d, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        System.out.println(dniObtenido + " es el dni obtenido");
        prueba();
    }
    String dni;

    public void prueba() {
        System.out.println(dni);
    }
    private void btn_dashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMousePressed
        setColor(btn_dashboard);
        resetColor(btn_cuenta);
        resetColor(btn_programar);
        resetColor(btn_clases);

        // Abrir sección
        d = new admin_dashboard(dni);
        mostrarPanel(d);
    }//GEN-LAST:event_btn_dashboardMousePressed

    private void btn_cuentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cuentaMousePressed
        setColor(btn_cuenta);
        resetColor(btn_dashboard);
        resetColor(btn_programar);
        resetColor(btn_clases);
        // Abrir sección
        cu = new admin_cuenta(dni);
        mostrarPanel(cu);
    }//GEN-LAST:event_btn_cuentaMousePressed

    private void btn_clasesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clasesMousePressed
        setColor(btn_clases);
        resetColor(btn_dashboard);
        resetColor(btn_programar);
        resetColor(btn_cuenta);

        // Abrir sección
        c = new admin_clases(dni);
        mostrarPanel(c);
    }//GEN-LAST:event_btn_clasesMousePressed

    private void btn_programarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_programarMousePressed
        setColor(btn_programar);
        resetColor(btn_dashboard);
        resetColor(btn_clases);
        resetColor(btn_cuenta);

        // Abrir sección
        p = new admin_programarclase();
        mostrarPanel(p);
    }//GEN-LAST:event_btn_programarMousePressed

    private void btnLogOutAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutAdmActionPerformed
        welcome w = new welcome();
        w.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogOutAdmActionPerformed

//    public void CerrarAdmin(){
//        dispose();
//    }
    
    void setColor(JPanel panel) {
        panel.setBackground(new Color(184, 218, 255));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(198, 223, 255));
    }

    private void mostrarPanel(JPanel p) {
        p.setSize(1040, 620);
        p.setLocation(0, 0);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_sidebar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JLabel banner2;
    private javax.swing.JButton btnLogOutAdm;
    private javax.swing.JPanel btn_clases;
    private javax.swing.JPanel btn_cuenta;
    private javax.swing.JPanel btn_dashboard;
    private javax.swing.JPanel btn_programar;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
