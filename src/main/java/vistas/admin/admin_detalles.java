package vistas.admin;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Aula;
import modelo.Horario;
import modelo.Tema;
import modeloDAO.AulaDAO;
import modeloDAO.HorarioDAO;
import modeloDAO.TemaDAO;

public class admin_detalles extends javax.swing.JPanel {
    Aula au;
    AulaDAO aud;
    Tema t;
    TemaDAO td;
    Horario h;
    HorarioDAO hd;
    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo3 = new DefaultTableModel();
    String codigo;
    
    public admin_detalles() {
        initComponents();
        establecerColumnas1();
        establecerColumnas2();
        establecerColumnas3();
        mostrarAulas();
        mostrarTemas();
        mostrarHorarios();
        pnlModificarAula.setVisible(false);
        pnlModificarTema.setVisible(false);
        pnlModificarHorario.setVisible(false);
    }
    
     private void establecerColumnas1(){
        modelo1.addColumn("Ambiente");
        modelo1.addColumn("Aforo");
        tblAulas.setModel(modelo1);   
    }
     
     private void establecerColumnas2(){
        modelo2.addColumn("Codigo");
        modelo2.addColumn("Nombre");
        tblTemas.setModel(modelo2);   
    }
     
     private void establecerColumnas3(){
        modelo3.addColumn("Codigo");
        modelo3.addColumn("Inicio");
        modelo3.addColumn("Fin");
        tblHorarios.setModel(modelo3);   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAforo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAulas = new javax.swing.JTable();
        pnlModificarAula = new javax.swing.JPanel();
        txtModAmb = new javax.swing.JTextField();
        txtModAfo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardarAula = new javax.swing.JButton();
        btnIngresarAula = new javax.swing.JButton();
        btnEliminarAula = new javax.swing.JButton();
        btnModificarAula = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTemas = new javax.swing.JTable();
        txtCodTema = new javax.swing.JTextField();
        txtNomTema = new javax.swing.JTextField();
        pnlModificarTema = new javax.swing.JPanel();
        txtModCodTem = new javax.swing.JTextField();
        txtModNomTem = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGuardarTema = new javax.swing.JButton();
        btnModificarTema = new javax.swing.JButton();
        btnEliminarTema = new javax.swing.JButton();
        btnIngresarTema = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtAmbiente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodHorario = new javax.swing.JTextField();
        btnIngresarHorario = new javax.swing.JButton();
        btnEliminarHorario = new javax.swing.JButton();
        btnModificarHorario = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblHorarios = new javax.swing.JTable();
        pnlModificarHorario = new javax.swing.JPanel();
        txtModCodHor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnGuardarHorario = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        mhi1 = new javax.swing.JSpinner();
        mhf1 = new javax.swing.JSpinner();
        mhi2 = new javax.swing.JSpinner();
        mhf2 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        hi2 = new javax.swing.JSpinner();
        hi1 = new javax.swing.JSpinner();
        hf1 = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        hf2 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(17, 49, 194));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 49, 194));
        jLabel2.setText("Temas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));
        jPanel1.add(txtAforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 120, -1));

        tblAulas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAulas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 254, 114));

        pnlModificarAula.setForeground(new java.awt.Color(255, 255, 255));

        txtModAmb.setEditable(false);

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel5.setText("Ambiente:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel6.setText("Aforo:");

        btnGuardarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/save.png"))); // NOI18N
        btnGuardarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlModificarAulaLayout = new javax.swing.GroupLayout(pnlModificarAula);
        pnlModificarAula.setLayout(pnlModificarAulaLayout);
        pnlModificarAulaLayout.setHorizontalGroup(
            pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificarAulaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlModificarAulaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModAmb, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlModificarAulaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModAfo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarAula)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        pnlModificarAulaLayout.setVerticalGroup(
            pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificarAulaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarAula)
                    .addGroup(pnlModificarAulaLayout.createSequentialGroup()
                        .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModAmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModAfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(pnlModificarAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 240, 120));

        btnIngresarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/add.png"))); // NOI18N
        btnIngresarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAulaActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        btnEliminarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/delete.png"))); // NOI18N
        btnEliminarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAulaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        btnModificarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/modify.png"))); // NOI18N
        btnModificarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAulaActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        tblTemas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblTemas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 250, 114));
        jPanel1.add(txtCodTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 116, -1));
        jPanel1.add(txtNomTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 119, -1));

        txtModCodTem.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel11.setText("Código:");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel12.setText("Nombre:");

        btnGuardarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/save.png"))); // NOI18N
        btnGuardarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlModificarTemaLayout = new javax.swing.GroupLayout(pnlModificarTema);
        pnlModificarTema.setLayout(pnlModificarTemaLayout);
        pnlModificarTemaLayout.setHorizontalGroup(
            pnlModificarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificarTemaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlModificarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModificarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModNomTem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModCodTem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarTema)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pnlModificarTemaLayout.setVerticalGroup(
            pnlModificarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificarTemaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlModificarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarTema)
                    .addGroup(pnlModificarTemaLayout.createSequentialGroup()
                        .addGroup(pnlModificarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModCodTem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(pnlModificarTemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModNomTem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel1.add(pnlModificarTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 230, 120));

        btnModificarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/modify.png"))); // NOI18N
        btnModificarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTemaActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        btnEliminarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/delete.png"))); // NOI18N
        btnEliminarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTemaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        btnIngresarTema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/add.png"))); // NOI18N
        btnIngresarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarTemaActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Aforo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel4.setBackground(new java.awt.Color(17, 49, 194));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 49, 194));
        jLabel4.setText("Aulas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Ambiente:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Código:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 580, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 580, 10));
        jPanel1.add(txtAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 98, -1));

        jLabel8.setBackground(new java.awt.Color(17, 49, 194));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 49, 194));
        jLabel8.setText("Horarios");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Código:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Fin:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));
        jPanel1.add(txtCodHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 116, -1));

        btnIngresarHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/add.png"))); // NOI18N
        btnIngresarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarHorarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        btnEliminarHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/delete.png"))); // NOI18N
        btnEliminarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarHorarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        btnModificarHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/modify.png"))); // NOI18N
        btnModificarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarHorarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        tblHorarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblHorarios);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 250, 114));

        txtModCodHor.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel16.setText("Código:");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel17.setText("Inicio:");

        btnGuardarHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/save.png"))); // NOI18N
        btnGuardarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarHorarioActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Century Gothic", 3, 14)); // NOI18N
        jLabel20.setText("Fin:");

        jLabel21.setText(":");

        jLabel22.setText(":");

        javax.swing.GroupLayout pnlModificarHorarioLayout = new javax.swing.GroupLayout(pnlModificarHorario);
        pnlModificarHorario.setLayout(pnlModificarHorarioLayout);
        pnlModificarHorarioLayout.setHorizontalGroup(
            pnlModificarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificarHorarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlModificarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModificarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModCodHor, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlModificarHorarioLayout.createSequentialGroup()
                        .addGroup(pnlModificarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mhf1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(mhi1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlModificarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlModificarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mhi2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mhf2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnGuardarHorario)
                .addGap(24, 24, 24))
        );
        pnlModificarHorarioLayout.setVerticalGroup(
            pnlModificarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificarHorarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlModificarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModificarHorarioLayout.createSequentialGroup()
                        .addGroup(pnlModificarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModCodHor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(pnlModificarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(mhi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mhi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)))
                    .addComponent(btnGuardarHorario))
                .addGap(18, 18, 18)
                .addGroup(pnlModificarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(mhf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mhf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(pnlModificarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 290, 140));

        jLabel1.setText(":");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 0, -1));

        jLabel18.setText(":");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 10, 20));
        jPanel1.add(hi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 60, -1));
        jPanel1.add(hi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 60, -1));
        jPanel1.add(hf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 60, -1));

        jLabel19.setText(":");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 10, 20));
        jPanel1.add(hf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 60, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Inicio:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

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

    private void btnIngresarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAulaActionPerformed
        au = new Aula();
        aud = new AulaDAO();
        au.setAmbiente(txtAmbiente.getText());
        au.setAforo(Integer.parseInt(txtAforo.getText()));
        aud.agregar(au);
        
        //System.out.println("Aula agregada exitosamente a la BD");

        mostrarAulas();
        limpiarCampos();
    }//GEN-LAST:event_btnIngresarAulaActionPerformed

    private void btnEliminarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAulaActionPerformed
        int fila = tblAulas.getSelectedRow();
        aud = new AulaDAO();
        codigo = tblAulas.getValueAt(fila, 0).toString();
        aud.eliminar(codigo);
        mostrarAulas();
    }//GEN-LAST:event_btnEliminarAulaActionPerformed

    private void btnModificarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAulaActionPerformed
        int fila = tblAulas.getSelectedRow();
        if (fila==-1){
            // Mostrar un mensaje de error para notificar al usuario que debe seleccionar una fila.
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un aula de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            codigo = tblAulas.getValueAt(fila, 0).toString();
            aud = new AulaDAO();
            au = aud.listarUno(codigo);

            txtModAmb.setText(au.getAmbiente());
            txtModAfo.setText(au.getAforo()+"");
            pnlModificarAula.setVisible(true);
        }
        
        
    }//GEN-LAST:event_btnModificarAulaActionPerformed

    private void btnGuardarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAulaActionPerformed
        aud = new AulaDAO();
        au = aud.listarUno(codigo);
        
        au.setAmbiente(txtModAmb.getText());
        au.setAforo(Integer.parseInt(txtModAfo.getText()));
        
        aud.modificar(au);
        mostrarAulas();
        pnlModificarAula.setVisible(false);
    }//GEN-LAST:event_btnGuardarAulaActionPerformed

    private void btnGuardarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTemaActionPerformed
        td = new TemaDAO();
        t = td.listarUno(codigo);
        
        t.setId_tema(Integer.parseInt(txtModCodTem.getText()));
        t.setNombre(txtModNomTem.getText());
        
        td.modificar(t);
        mostrarTemas();
        pnlModificarTema.setVisible(false);
    }//GEN-LAST:event_btnGuardarTemaActionPerformed

    private void btnModificarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTemaActionPerformed
        int fila = tblTemas.getSelectedRow();
        
        if (fila==-1){
            // Mostrar un mensaje de error para notificar al usuario que debe seleccionar una fila.
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una clase de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            codigo = tblTemas.getValueAt(fila, 0).toString();
            td = new TemaDAO();
            t = td.listarUno(codigo);

            txtModCodTem.setText(t.getId_tema()+"");
            txtModNomTem.setText(t.getNombre());
            pnlModificarTema.setVisible(true);
        }
        
    }//GEN-LAST:event_btnModificarTemaActionPerformed

    private void btnEliminarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTemaActionPerformed
        int fila = tblTemas.getSelectedRow();
        td = new TemaDAO();
        codigo = tblTemas.getValueAt(fila, 0).toString();
        td.eliminar(codigo);
        mostrarTemas();
    }//GEN-LAST:event_btnEliminarTemaActionPerformed

    private void btnIngresarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarTemaActionPerformed
        t = new Tema();
        td = new TemaDAO();
        t.setId_tema(Integer.parseInt(txtCodTema.getText()));
        t.setNombre(txtNomTema.getText());
        td.agregar(t);
        
        //System.out.println("Tema agregado exitosamente a la BD");

        mostrarTemas();
        limpiarCampos();
    }//GEN-LAST:event_btnIngresarTemaActionPerformed

    private void btnIngresarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarHorarioActionPerformed
        h = new Horario();
        hd = new HorarioDAO();
        h.setId_hora(Integer.parseInt(txtCodHorario.getText()));
        h.setInicio(hi1.getValue().toString()+":"+hi2.getValue().toString());
        h.setFinale(hf1.getValue().toString()+":"+hf2.getValue().toString());
        hd.agregar(h);
        
        System.out.println("Horario agregado exitosamente a la BD");

        mostrarHorarios();
        limpiarCampos();
    }//GEN-LAST:event_btnIngresarHorarioActionPerformed

    private void btnEliminarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarHorarioActionPerformed
        int fila = tblHorarios.getSelectedRow();
        hd = new HorarioDAO();
        codigo = tblHorarios.getValueAt(fila, 0).toString();
        hd.eliminar(codigo);
        mostrarHorarios();
    }//GEN-LAST:event_btnEliminarHorarioActionPerformed

    private void btnModificarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarHorarioActionPerformed
        int fila = tblHorarios.getSelectedRow();
        if (fila==-1){
            // Mostrar un mensaje de error para notificar al usuario que debe seleccionar una fila.
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un horario de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            codigo = tblHorarios.getValueAt(fila, 0).toString();
            hd = new HorarioDAO();
            h = hd.listarUno(codigo);

            txtModCodHor.setText(h.getId_hora()+"");
            pnlModificarHorario.setVisible(true);
        }
        
    }//GEN-LAST:event_btnModificarHorarioActionPerformed

    private void btnGuardarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHorarioActionPerformed
        hd = new HorarioDAO();
        h = hd.listarUno(codigo);
        
        h.setInicio(mhi1.getValue().toString()+":"+mhi2.getValue().toString());
        h.setFinale(mhf1.getValue().toString()+":"+mhf2.getValue().toString());
        
        hd.modificar(h);
        mostrarHorarios();
        pnlModificarHorario.setVisible(false);
    }//GEN-LAST:event_btnGuardarHorarioActionPerformed

    public void mostrarAulas(){
        modelo1.setRowCount(0);
        aud = new AulaDAO();
        ArrayList<Aula> lista = new ArrayList<>();
        lista = aud.listarTodos();
        for(int i=0; i<lista.size(); i++){
            Object[] data = {
                lista.get(i).getAmbiente(), 
                lista.get(i).getAforo(),
                };
            modelo1.addRow(data);
        }
    }
    
    public void mostrarTemas(){
        modelo2.setRowCount(0);
        td = new TemaDAO();
        ArrayList<Tema> lista = new ArrayList<>();
        lista = td.listarTodos();
        for(int i=0; i<lista.size(); i++){
            Object[] data = {
                lista.get(i).getId_tema(), 
                lista.get(i).getNombre(),
                };
            modelo2.addRow(data);
        }
    }
    
    public void mostrarHorarios(){
        modelo3.setRowCount(0);
        hd = new HorarioDAO();
        ArrayList<Horario> lista = new ArrayList<>();
        lista = hd.listarTodos();
        for(int i=0; i<lista.size(); i++){
            Object[] data = {
                lista.get(i).getId_hora(), 
                lista.get(i).getInicio(),
                lista.get(i).getFinale(),
                };
            modelo3.addRow(data);
        }
    }
    
    public void limpiarCampos(){
        //Para la seccion de aulas
        txtAmbiente.setText(null);
        txtAforo.setText(null);
        
        //Para la seccion de temas
        txtCodTema.setText(null);
        txtNomTema.setText(null);
        
        //Para la seccion de horarios
        txtCodHorario.setText(null);
        hi1.setValue(0);
        hi2.setValue(0);
        hf1.setValue(0);
        hf2.setValue(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarAula;
    private javax.swing.JButton btnEliminarHorario;
    private javax.swing.JButton btnEliminarTema;
    private javax.swing.JButton btnGuardarAula;
    private javax.swing.JButton btnGuardarHorario;
    private javax.swing.JButton btnGuardarTema;
    private javax.swing.JButton btnIngresarAula;
    private javax.swing.JButton btnIngresarHorario;
    private javax.swing.JButton btnIngresarTema;
    private javax.swing.JButton btnModificarAula;
    private javax.swing.JButton btnModificarHorario;
    private javax.swing.JButton btnModificarTema;
    private javax.swing.JSpinner hf1;
    private javax.swing.JSpinner hf2;
    private javax.swing.JSpinner hi1;
    private javax.swing.JSpinner hi2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner mhf1;
    private javax.swing.JSpinner mhf2;
    private javax.swing.JSpinner mhi1;
    private javax.swing.JSpinner mhi2;
    private javax.swing.JPanel pnlModificarAula;
    private javax.swing.JPanel pnlModificarHorario;
    private javax.swing.JPanel pnlModificarTema;
    private javax.swing.JTable tblAulas;
    private javax.swing.JTable tblHorarios;
    private javax.swing.JTable tblTemas;
    private javax.swing.JTextField txtAforo;
    private javax.swing.JTextField txtAmbiente;
    private javax.swing.JTextField txtCodHorario;
    private javax.swing.JTextField txtCodTema;
    private javax.swing.JTextField txtModAfo;
    private javax.swing.JTextField txtModAmb;
    private javax.swing.JTextField txtModCodHor;
    private javax.swing.JTextField txtModCodTem;
    private javax.swing.JTextField txtModNomTem;
    private javax.swing.JTextField txtNomTema;
    // End of variables declaration//GEN-END:variables
}
