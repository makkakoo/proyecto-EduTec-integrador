package vistas.admin;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Aula;
import modeloDAO.AulaDAO;

public class prueba extends javax.swing.JFrame {
    Aula au;
    AulaDAO aud;
    DefaultTableModel modelo = new DefaultTableModel();
    String codigo;
    
    public prueba() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAmbiente = new javax.swing.JTextField();
        txtAforo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAulas = new javax.swing.JTable();
        btnIngresarAula = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnEliminarAula = new javax.swing.JButton();
        btnModificarAula = new javax.swing.JButton();
        pnlModificarAula = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtModAmb = new javax.swing.JTextField();
        txtModAfo = new javax.swing.JTextField();
        btnGuardarAula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Aula");

        jLabel2.setText("Ambiente");

        jLabel3.setText("Aforo");

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

        btnIngresarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/add.png"))); // NOI18N
        btnIngresarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAulaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel10.setText("Solo se pueden agregar máximo 4 registros en la tabla");

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

        pnlModificarAula.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Ambiente");

        jLabel5.setText("Aforo");

        txtModAmb.setEditable(false);

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
            .addGroup(pnlModificarAulaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModificarAulaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtModAfo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlModificarAulaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModAmb, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(btnGuardarAula)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        pnlModificarAulaLayout.setVerticalGroup(
            pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificarAulaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarAula)
                    .addGroup(pnlModificarAulaLayout.createSequentialGroup()
                        .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtModAmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlModificarAulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtModAfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAmbiente, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtAforo))))
                .addGap(18, 18, 18)
                .addComponent(btnIngresarAula)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlModificarAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarAula)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModificarAula)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel10))
                    .addComponent(btnEliminarAula)
                    .addComponent(btnModificarAula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnIngresarAula))
                    .addComponent(pnlModificarAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(489, Short.MAX_VALUE))
        );

        pack();
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarAula;
    private javax.swing.JButton btnGuardarAula;
    private javax.swing.JButton btnIngresarAula;
    private javax.swing.JButton btnModificarAula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlModificarAula;
    private javax.swing.JTable tblAulas;
    private javax.swing.JTextField txtAforo;
    private javax.swing.JTextField txtAmbiente;
    private javax.swing.JTextField txtModAfo;
    private javax.swing.JTextField txtModAmb;
    // End of variables declaration//GEN-END:variables
}
