package vistas.admin;

import java.awt.BorderLayout;
import java.time.LocalDate;
import javax.swing.JPanel;
import modeloDAO.PersonaDao;
import static vistas.admin.admin_sidebar.content;

public class admin_dashboard extends javax.swing.JPanel {
    PersonaDao pd;
    public admin_dashboard() {
        initComponents();
        
        //Para mostrar la fecha actual
         LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto"," ;septiembre"
            ,"octubre","noviembre","diciembre"};
        lblFecha.setText("Hoy es "+dia+" de "+meses[month - 1]+" de "+year);
        
        
        pd = new PersonaDao();
        //Contar profesores
        int cant_profes = pd.contarPersonasPorCodigo(1003);
        lblCantProfes.setText(cant_profes+"");
        //Contar alumnos
        int cant_alumnos = pd.contarPersonasPorCodigo(1002);
        lblCantAlumnos.setText(cant_alumnos+"");
    }
    
    admin_detalles dt;
    admin_profes pf;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        btnDetalles = new javax.swing.JButton();
        btnAlumnos = new javax.swing.JButton();
        btnProfes = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblHorarios = new javax.swing.JLabel();
        lblTemas = new javax.swing.JLabel();
        lblAulas = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblCantProfes = new javax.swing.JLabel();
        lblCantAlumnos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFecha.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(17, 49, 194));
        lblFecha.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 500, 60));

        btnDetalles.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDetalles.setText("Más detalles");
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, -1, -1));

        btnAlumnos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAlumnos.setText("Ver más");
        jPanel1.add(btnAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        btnProfes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnProfes.setText("Ver más");
        btnProfes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfesActionPerformed(evt);
            }
        });
        jPanel1.add(btnProfes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(153, 153, 153));
        jLabel33.setText("Horarios");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, -1, -1));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 153, 153));
        jLabel34.setText("Temas");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(153, 153, 153));
        jLabel35.setText("Aulas");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));

        lblHorarios.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblHorarios.setText("0");
        jPanel1.add(lblHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 20, -1));

        lblTemas.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblTemas.setText("0");
        jPanel1.add(lblTemas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 20, -1));

        lblAulas.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblAulas.setText("0");
        jPanel1.add(lblAulas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 20, -1));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("profesores");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("alumnos");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        lblCantProfes.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        lblCantProfes.setForeground(new java.awt.Color(255, 255, 255));
        lblCantProfes.setText("0");
        jPanel1.add(lblCantProfes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        lblCantAlumnos.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        lblCantAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        lblCantAlumnos.setText("0");
        jPanel1.add(lblCantAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/profe.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/card_verde.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 390, 200));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/alumno.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/card_amarilla.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 20, 550));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Estadísticas");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/reloj.png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 50, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/card_azul.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/card_azul.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/card_azul.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/personas.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/card_blanca_chiqui.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 290, 170));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/libritos.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 50, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/card_verde_claro.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/card_blanca_chiqui.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 290, 170));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/card_verde_claro.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 80, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/card_blanca_chiqui.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 290, 170));

        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(153, 153, 153));
        jLabel38.setText("Clases reservadas");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, -1));

        jLabel36.setBackground(new java.awt.Color(17, 49, 194));
        jLabel36.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(17, 49, 194));
        jLabel36.setText("02");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 60, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/excelencia1.png"))); // NOI18N
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel41.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/innovacion1.png"))); // NOI18N
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/compromiso1.png"))); // NOI18N
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel43.setText("Excelencia");
        jPanel2.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        jLabel44.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel44.setText("académica");
        jPanel2.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel45.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel45.setText("Compromiso");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel46.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel46.setText("Innovación");
        jPanel2.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_dash/empatia1.png"))); // NOI18N
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

        jLabel48.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel48.setText("Empatía");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel39.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(153, 153, 153));
        jLabel39.setText("valores");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 40));

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(153, 153, 153));
        jLabel49.setText("Nuestros ");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 670, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        // Abrir sección
        dt = new admin_detalles();
        mostrarPanel(dt);
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void btnProfesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfesActionPerformed
        // Abrir sección
        pf = new admin_profes();
        mostrarPanel(pf);
    }//GEN-LAST:event_btnProfesActionPerformed
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAulas;
    private javax.swing.JLabel lblCantAlumnos;
    private javax.swing.JLabel lblCantProfes;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHorarios;
    private javax.swing.JLabel lblTemas;
    // End of variables declaration//GEN-END:variables
}
