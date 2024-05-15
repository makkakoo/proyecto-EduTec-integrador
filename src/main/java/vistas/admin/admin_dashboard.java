package vistas.admin;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import static vistas.admin.admin_sidebar.content;

public class admin_dashboard extends javax.swing.JPanel {
    public admin_dashboard() {
        initComponents();
    }
    
    admin_detalles dt;
    admin_profes pf;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnDetalles = new javax.swing.JButton();
        btnProfes = new javax.swing.JButton();
        btnAlumnos = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Dashboard del admin");

        btnDetalles.setText("Detalles");
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });

        btnProfes.setText("Ver personas");

        btnAlumnos.setText("Profesores");
        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlumnos)
                    .addComponent(btnProfes)
                    .addComponent(btnDetalles)
                    .addComponent(jLabel1))
                .addContainerGap(631, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(btnDetalles)
                .addGap(31, 31, 31)
                .addComponent(btnAlumnos)
                .addGap(18, 18, 18)
                .addComponent(btnProfes)
                .addContainerGap(362, Short.MAX_VALUE))
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

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        // Abrir sección
        dt = new admin_detalles();
        mostrarPanel(dt);
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        // Abrir sección
        pf = new admin_profes();
        mostrarPanel(pf);
    }//GEN-LAST:event_btnAlumnosActionPerformed
    private void mostrarPanel(JPanel p){
        p.setSize(1040, 620);
        p.setLocation(0,0);

        content.removeAll();  
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnDetalles;
    private javax.swing.JButton btnProfes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
