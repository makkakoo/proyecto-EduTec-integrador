package vistas.alumno;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import modelo.Persona;
import modelo.ReservaDTO;
import modeloDAO.PersonaDao;
import modeloDAO.ReservaDAO;



public class alum_dashboard extends javax.swing.JPanel {
    Persona objPersona = new Persona();
    PersonaDao objPersonaDao = new PersonaDao();
    ReservaDTO r;
    ReservaDAO rd;
        
    public alum_dashboard() {
//        initComponents();
//        
//        lblNombre.setText(objPersona.getNombre());
   }
    
    public alum_dashboard(String dniObtenido) {
        initComponents();
        dni = dniObtenido;
        objPersona = objPersonaDao.listarUno(dni);
        String nombre = objPersona.getNombre();
        String mensajeB = nombre + "!";
        lblNombre.setText(mensajeB);
        mostrarClaseProxima();
    }
    String dni;
    
    public void mostrarClaseProxima(){
        rd = new ReservaDAO();
        r = rd.obtenerReservaProxima(dni);
        System.out.println("codigo de reserva prox"+r.getCodigo());
        lblTema.setText(r.getClase().getTema().getNombre());
        lblAula.setText(r.getClase().getAula().getAmbiente());
        lblFecha.setText(r.getClase().getFecha());
        lblHorario.setText(r.getClase().getHorario().getInicio()+" - "+r.getClase().getHorario().getFinale());
        lblApellidos.setText(r.getClase().getPersona().getApellido()+",");
        lblNombres.setText(r.getClase().getPersona().getNombre());
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblAula = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblTema = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblBienvenida = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 50, 570));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Conoce a nuestros");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("fundadores");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alum_dash/fund2.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alum_dash/fun6.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alum_dash/fund1.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alum_dash/fun3.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alum_dash/fun4.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alum_dash/fun5.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Miguel Romero");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("María Gómez");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Katia Sánchez");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Luis Gonzales");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Sol Porto");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText("Juan Pérez");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 250, 560));

        lblNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNombres.setText("Adrian Alexander");
        jPanel1.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 200, 30));

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 153, 153));
        jLabel27.setText("Profesor");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_clases/user.png"))); // NOI18N
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        lblApellidos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblApellidos.setText("Cisneros Camiloaga,");
        jPanel1.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 200, 30));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Aula");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_clases/location.png"))); // NOI18N
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, -1, -1));

        lblAula.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblAula.setText("0000");
        jPanel1.add(lblAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 60, 30));

        lblFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblFecha.setText("YYYY-MM-dd");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 130, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin_clases/calendar-event.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Fecha");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        lblTema.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTema.setText("Ejemplo de nombre de clase");
        jPanel1.add(lblTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        lblHorario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblHorario.setText("13:00:00 - 14:00:00");
        jPanel1.add(lblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alum_dash/lapicito.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        lblNombre.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(242, 242, 242));
        lblNombre.setText("nombre del alumno");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 290, 60));

        lblBienvenida.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        lblBienvenida.setForeground(new java.awt.Color(242, 242, 242));
        lblBienvenida.setText("!Bienvenid@ de vuelta,");
        jPanel1.add(lblBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 350, 60));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alum_dash/bienvenida.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Mi próxima clase");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alum_dash/proxima_clase.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel32.setText("Cisneros Camiloaga,");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblAula;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblTema;
    // End of variables declaration//GEN-END:variables
}
