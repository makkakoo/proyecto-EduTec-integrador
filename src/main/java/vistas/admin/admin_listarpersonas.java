package vistas.admin;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Aula;
import modelo.Horario;
import modelo.Tema;
import modeloDAO.AulaDAO;
import modeloDAO.HorarioDAO;
import modeloDAO.TemaDAO;

public class admin_listarpersonas extends javax.swing.JPanel {

    public admin_listarpersonas() {
        initComponents();


    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlModificarAula = new javax.swing.JPanel();
        txtModAmb = new javax.swing.JTextField();
        txtModAfo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardarAula = new javax.swing.JButton();
        pnlModificarTema = new javax.swing.JPanel();
        txtModCodTem = new javax.swing.JTextField();
        txtModNomTem = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGuardarTema = new javax.swing.JButton();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

    private void btnGuardarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAulaActionPerformed

    }//GEN-LAST:event_btnGuardarAulaActionPerformed

    private void btnGuardarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTemaActionPerformed

    }//GEN-LAST:event_btnGuardarTemaActionPerformed

    private void btnGuardarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarHorarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarAula;
    private javax.swing.JButton btnGuardarHorario;
    private javax.swing.JButton btnGuardarTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner mhf1;
    private javax.swing.JSpinner mhf2;
    private javax.swing.JSpinner mhi1;
    private javax.swing.JSpinner mhi2;
    private javax.swing.JPanel pnlModificarAula;
    private javax.swing.JPanel pnlModificarHorario;
    private javax.swing.JPanel pnlModificarTema;
    private javax.swing.JTextField txtModAfo;
    private javax.swing.JTextField txtModAmb;
    private javax.swing.JTextField txtModCodHor;
    private javax.swing.JTextField txtModCodTem;
    private javax.swing.JTextField txtModNomTem;
    // End of variables declaration//GEN-END:variables
}
