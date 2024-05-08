package vistas.admin;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Aula;
import modeloDAO.AulaDAO;

public class admin_detalles extends javax.swing.JPanel {
    Aula au;
    AulaDAO aud;
    DefaultTableModel modelo = new DefaultTableModel();
    String codigo;
    
    public admin_detalles() {
        initComponents();
        establecerColumnas();
        mostrarAulas();
        pnlModificarAula.setVisible(false);
    }
    
     private void establecerColumnas(){
        modelo.addColumn("Ambiente");
        modelo.addColumn("Aforo");
        tblAulas.setModel(modelo);   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAmbiente = new javax.swing.JTextField();
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
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Información de aulas, temas y horarios");

        jLabel2.setText("Aula");

        jLabel3.setText("Ambiente");

        jLabel4.setText(" Aforo");

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

        txtModAmb.setEditable(false);

        jLabel5.setText("Ambiente");

        jLabel6.setText("Aforo");

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
                .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtModAmb, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(txtModAfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarAula)
                .addGap(31, 31, 31))
        );
        pnlModificarAulaLayout.setVerticalGroup(
            pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificarAulaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarAula)
                    .addGroup(pnlModificarAulaLayout.createSequentialGroup()
                        .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModAmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModAfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnIngresarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/add.png"))); // NOI18N
        btnIngresarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAulaActionPerformed(evt);
            }
        });

        btnEliminarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/delete.png"))); // NOI18N
        btnEliminarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAulaActionPerformed(evt);
            }
        });

        btnModificarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/modify.png"))); // NOI18N
        btnModificarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAulaActionPerformed(evt);
            }
        });

        jLabel7.setText("*Max. 4 aulas*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(txtAforo, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(txtAmbiente))
                                .addGap(36, 36, 36)
                                .addComponent(btnIngresarAula)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarAula)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarAula))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addComponent(pnlModificarAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnIngresarAula))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnModificarAula)
                                .addComponent(btnEliminarAula)))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(pnlModificarAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
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

    private void btnIngresarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAulaActionPerformed
        au = new Aula();
        aud = new AulaDAO();
        au.setAmbiente(txtAmbiente.getText());
        au.setAforo(Integer.parseInt(txtAforo.getText()));
        aud.agregar(au);
        
        //System.out.println("Aula agregada exitosamente a la BD");

        mostrarAulas();
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
        codigo = tblAulas.getValueAt(fila, 0).toString();
        aud = new AulaDAO();
        au = aud.listarUno(codigo);
        
        txtModAmb.setText(au.getAmbiente());
        txtModAfo.setText(au.getAforo()+"");
        pnlModificarAula.setVisible(true);
        
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

    public void mostrarAulas(){
        modelo.setRowCount(0);
        aud = new AulaDAO();
        ArrayList<Aula> lista = new ArrayList<>();
        lista = aud.listarTodos();
        for(int i=0; i<lista.size(); i++){
            Object[] data = {
                lista.get(i).getAmbiente(), 
                lista.get(i).getAforo(),
                };
            modelo.addRow(data);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarAula;
    private javax.swing.JButton btnGuardarAula;
    private javax.swing.JButton btnIngresarAula;
    private javax.swing.JButton btnModificarAula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlModificarAula;
    private javax.swing.JTable tblAulas;
    private javax.swing.JTextField txtAforo;
    private javax.swing.JTextField txtAmbiente;
    private javax.swing.JTextField txtModAfo;
    private javax.swing.JTextField txtModAmb;
    // End of variables declaration//GEN-END:variables
}
