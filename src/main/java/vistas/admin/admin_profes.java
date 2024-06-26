package vistas.admin;
//Para la funcionalidad de buscar
import java.awt.Image;
import javax.swing.table.TableRowSorter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.RowFilter;

//Otros imports
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;
import modelo.Profesor;
import modeloDAO.PersonaDao;

public class admin_profes extends javax.swing.JPanel {
    //Declarar un objeto de la clase Profesor
    Profesor prof;
    //Declarar un objeto de la clase personaDAO para utilizar sus metodos
    PersonaDao pd;
    String codigo;
    DefaultTableModel modelo = new DefaultTableModel();
    Persona p;
    
    //Para el filtro de busqueda
    private TableRowSorter trsfiltro;
    String filtro;
    
    File file;
    ImageIcon icono;
    ImageIcon iconoDefault = new ImageIcon("/img/cuenta/Profe.png");
    
    public admin_profes() {
        initComponents();
        establecerColumnas();
        mostrarProfes();
        ocultarCamposObligatorios();
        
        lblNombre.setVisible(false);
        txtNomProf.setVisible(false);
        lblDNI.setVisible(false);
        txtDNIProf.setVisible(false);
        pnlGuardar.setVisible(false);
        
    }
    
    private void establecerColumnas(){
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Correo");
        tblProfes.setModel(modelo);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreProfe = new javax.swing.JTextField();
        txtCorreoProfe = new javax.swing.JTextField();
        txtApellidosProfe = new javax.swing.JTextField();
        txtDNIProfe = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfes = new javax.swing.JTable();
        btnAgregarProfe = new javax.swing.JButton();
        btnModificarProfe = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rbtnDNI = new javax.swing.JRadioButton();
        rbtnNombre = new javax.swing.JRadioButton();
        lblNombre = new javax.swing.JLabel();
        txtNomProf = new javax.swing.JTextField();
        lblDNI = new javax.swing.JLabel();
        txtDNIProf = new javax.swing.JTextField();
        lblCampoNombreP = new javax.swing.JLabel();
        lblCampoApellidosP = new javax.swing.JLabel();
        lblCampoCorreoP = new javax.swing.JLabel();
        lblCampoDNIP = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlGuardar = new javax.swing.JPanel();
        btnGuardarCambios = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        txtNomImagen = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(17, 49, 194));
        lblTitulo.setText("Registro de profesores");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 39, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("DNI:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Apellidos:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Correo: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));
        jPanel1.add(txtNombreProfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 170, -1));
        jPanel1.add(txtCorreoProfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 170, -1));
        jPanel1.add(txtApellidosProfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 170, -1));

        txtDNIProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIProfeActionPerformed(evt);
            }
        });
        jPanel1.add(txtDNIProfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 170, -1));

        tblProfes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProfes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProfesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblProfesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProfes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 530, 410));

        btnAgregarProfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/add.png"))); // NOI18N
        btnAgregarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProfeActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarProfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 40, -1));

        btnModificarProfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crud_icons/modify.png"))); // NOI18N
        btnModificarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProfeActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarProfe, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 49, 194));
        jLabel6.setText("Lista de profesores");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Buscar por");

        buttonGroup1.add(rbtnDNI);
        rbtnDNI.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rbtnDNI.setText("DNI");
        rbtnDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDNIActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnNombre);
        rbtnNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rbtnNombre.setText("Apellido");
        rbtnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNombreActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNombre.setText("Apellido:");

        lblDNI.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDNI.setText("DNI:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnNombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDNI)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomProf, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txtDNIProf))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblNombre)
                    .addComponent(txtNomProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rbtnDNI)
                    .addComponent(rbtnNombre)
                    .addComponent(lblDNI)
                    .addComponent(txtDNIProf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 30, 530, 80));

        lblCampoNombreP.setForeground(new java.awt.Color(255, 51, 51));
        lblCampoNombreP.setText("Campo obligatorio");
        jPanel1.add(lblCampoNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, 30));

        lblCampoApellidosP.setForeground(new java.awt.Color(255, 51, 51));
        lblCampoApellidosP.setText("Campo obligatorio");
        jPanel1.add(lblCampoApellidosP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, 30));

        lblCampoCorreoP.setForeground(new java.awt.Color(255, 51, 51));
        lblCampoCorreoP.setText("Campo obligatorio");
        jPanel1.add(lblCampoCorreoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, 30));

        lblCampoDNIP.setForeground(new java.awt.Color(255, 51, 51));
        lblCampoDNIP.setText("Campo obligatorio");
        jPanel1.add(lblCampoDNIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 30));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 10, 570));

        btnGuardarCambios.setBackground(new java.awt.Color(27, 68, 255));
        btnGuardarCambios.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnGuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarCambios.setText("Guardar");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnSeleccionar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnSeleccionar.setText("Subir foto");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        txtNomImagen.setEditable(false);

        lblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuenta/Profe.png"))); // NOI18N

        javax.swing.GroupLayout pnlGuardarLayout = new javax.swing.GroupLayout(pnlGuardar);
        pnlGuardar.setLayout(pnlGuardarLayout);
        pnlGuardarLayout.setHorizontalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGuardarLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar)
                    .addComponent(txtNomImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        pnlGuardarLayout.setVerticalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuardarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnSeleccionar)
                .addGap(18, 18, 18)
                .addComponent(txtNomImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlGuardarLayout.createSequentialGroup()
                .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(pnlGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 400, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProfeActionPerformed
        verificacionDeCampos();
    }//GEN-LAST:event_btnAgregarProfeActionPerformed

    private void txtDNIProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIProfeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIProfeActionPerformed

    private void btnModificarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProfeActionPerformed
        lblTitulo.setText("Modificar datos");
        pnlGuardar.setVisible(true);
        btnAgregarProfe.setVisible(false);
        //btnEliminarProfe.setVisible(false);
        
        int fila = tblProfes.getSelectedRow();
        codigo = tblProfes.getValueAt(fila, 0).toString();
        pd = new PersonaDao();
        p = pd.listarUno(codigo);
        
        txtDNIProfe.setText(p.getDni());
        txtNombreProfe.setText(p.getNombre());
        txtApellidosProfe.setText(p.getApellido());
        txtCorreoProfe.setText(p.getEmail());
        
        //Para cargar la imagen
        BufferedImage imagen = null;

    try {
        //Recuperar la imagen segun el codigo
        imagen = pd.obtenerImagen(codigo);

        if (imagen != null) {
            icono = new ImageIcon(imagen);
            lblFoto.setIcon(icono);
        } else { // Si no se encuentra la imagen, se muestra una imagen por defecto en el JLabel
            lblFoto.setIcon(iconoDefault);
            }
        } catch (Exception ex) {
            // Manejar cualquier excepción que pueda ocurrir durante la recuperación de la imagen
    //        ex.printStackTrace(); // Opcional: imprime el stack trace para depuración
        }
        
    }//GEN-LAST:event_btnModificarProfeActionPerformed

    private void tblProfesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfesMouseClicked
        
    }//GEN-LAST:event_tblProfesMouseClicked

    private void tblProfesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfesMousePressed
        
    }//GEN-LAST:event_tblProfesMousePressed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        pd = new PersonaDao();
        p = pd.listarUno(codigo);
        
        //Modificar datos
        p.setDni(txtDNIProfe.getText());
        p.setNombre(txtNombreProfe.getText());
        p.setApellido(txtApellidosProfe.getText());
        p.setEmail(txtCorreoProfe.getText());
        pd.modificar(p);
        
        //Si se requiere agregar y/o modificar la foto
        if(file!=null){
            // Obtener solo el nombre del archivo sin la ruta
            String nombreArchivo = file.getName();
            p.setNom_imagen(nombreArchivo);
            p.setArchivoFoto(file);
            try {
                pd.agregarFoto(p);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(admin_profes.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }

        JOptionPane.showMessageDialog(null, "Cambios guardados", "Información", JOptionPane.INFORMATION_MESSAGE);
        limpiarCampos();
        lblTitulo.setText("Registro de profesores");
        btnAgregarProfe.setVisible(true);
        //btnEliminarProfe.setVisible(true);
        mostrarProfes();
        pnlGuardar.setVisible(false);
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void rbtnDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDNIActionPerformed
        lblNombre.setVisible(false);
        txtNomProf.setVisible(false);
        lblDNI.setVisible(true);
        txtDNIProf.setVisible(true);
        txtDNIProf.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(final KeyEvent e){
                    String cadena=txtDNIProf.getText();
                    txtDNIProf.setText(cadena);
                    repaint();
                    filtro1();
                    }
            }); 
    }//GEN-LAST:event_rbtnDNIActionPerformed

    private void rbtnNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNombreActionPerformed
        lblDNI.setVisible(false);
        txtDNIProf.setVisible(false);
        lblNombre.setVisible(true);
        txtNomProf.setVisible(true);
        txtNomProf.addKeyListener(new KeyAdapter(){
                @Override
                public void keyReleased(final KeyEvent e){
                String cadena=txtNomProf.getText();
                txtNomProf.setText(cadena);
                repaint();
                filtro2();
                   }
            });
    }//GEN-LAST:event_rbtnNombreActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // Crear un filtro para permitir solo archivos con extensión JPEG (JPG, JPEG)
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de archivos JPEG(*.JPG;*.JPEG)", "jpg", "jpeg");
        // Crear un selector de archivos
        JFileChooser archivo = new JFileChooser();
        // Añadir el filtro al selector de archivos
        archivo.addChoosableFileFilter(filtro);
        // Establecer el título del diálogo del selector de archivos
        archivo.setDialogTitle("Abrir archivo");
        // Mostrar el diálogo de selección de archivos y guardar la respuesta del usuario
        int ventana = archivo.showOpenDialog(null);
        // Verificar si el usuario seleccionó un archivo (aprobó la selección)
        if (ventana == JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado
            file = archivo.getSelectedFile();
            // Establecer la ruta del archivo seleccionado en un campo de texto (txtNomImagen)
            txtNomImagen.setText(String.valueOf(file));
            // Cargar la imagen desde la ruta del archivo
            Image foto = getToolkit().getImage(txtNomImagen.getText());
            // Escalar la imagen a un tamaño de 200x200 píxeles
            foto = foto.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            // Establecer la imagen escalada como un icono en una etiqueta (lblFoto)
            lblFoto.setIcon(new ImageIcon(foto));
        }

    }//GEN-LAST:event_btnSeleccionarActionPerformed
    
    public void filtro1(){
        filtro=txtDNIProf.getText();
        trsfiltro = new TableRowSorter(tblProfes.getModel()); 
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtDNIProf.getText(), 0));
        tblProfes.setRowSorter(trsfiltro);
    }
    
    public void filtro2(){
        filtro=txtNomProf.getText();
        trsfiltro = new TableRowSorter(tblProfes.getModel()); 
        trsfiltro.setRowFilter(RowFilter.regexFilter(txtNomProf.getText(), 2));
        tblProfes.setRowSorter(trsfiltro);
    }

    public void mostrarProfes(){
        modelo.setRowCount(0);
        pd = new PersonaDao();
        ArrayList<Persona> lista = new ArrayList<>();
        lista = pd.listarTodos(1003);
        for(int i=0; i<lista.size(); i++){
            Object[] data = {
                lista.get(i).getDni(), 
                lista.get(i).getNombre(),
                lista.get(i).getApellido(),
                lista.get(i).getEmail()
                };
            modelo.addRow(data);
        }
    }
    
    public void ocultarCamposObligatorios() {
        lblCampoNombreP.setVisible(false);       
        lblCampoApellidosP.setVisible(false);
        lblCampoDNIP.setVisible(false);
        lblCampoCorreoP.setVisible(false);

        
        
        lblCampoNombreP.setText("Campo obligatorio");
        lblCampoApellidosP.setText("Campo obligatorio");
        lblCampoDNIP.setText("Campo obligatorio");
        lblCampoCorreoP.setText("Campo obligatorio");

    }

    public void verificacionDeCampos() {
        ocultarCamposObligatorios();
        int a = 0;

        if (txtNombreProfe.getText().isEmpty() || txtNombreProfe.getText().equals("Ingrese sus nombres")) {
            lblCampoNombreP.setVisible(true);
            a = -1;
        }

        if (txtApellidosProfe.getText().isEmpty() || txtApellidosProfe.getText().equals("Ingrese sus apellidos")) {
            lblCampoApellidosP.setVisible(true);
            a = -1;
        }
        if (txtDNIProfe.getText().isEmpty() || txtDNIProfe.getText().equals("Ingrese DNI")) {
            lblCampoDNIP.setVisible(true);
            a = -1;

        }
        if (txtCorreoProfe.getText().isEmpty() || txtCorreoProfe.getText().equals("Ingrese correo electronico")) {
            lblCampoCorreoP.setVisible(true);
            a = -1;
        }

        if (a == 0) {
            verificacionDNI();
        }
    }
    
    public void verificacionDNI() {
        int a = -1;

        // Verificar si el texto tiene exactamente 8 caracteres
        if (txtDNIProfe.getText().length() == 8) {
            // Verificar si todos los caracteres son dígitos
            for (int i = 0; i < txtDNIProfe.getText().length(); i++) {
                
                if (!Character.isDigit(txtDNIProfe.getText().charAt(i))) {

                    i = txtDNIProfe.getText().length();
                    a = txtDNIProfe.getText().length();
                    
                    lblCampoDNIP.setText("El DNI deben ser números");
                    lblCampoDNIP.setVisible(true);
//                    JOptionPane.showMessageDialog(null, "El Dni deben ser números", "Alerta", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            a = txtDNIProfe.getText().length();
            lblCampoDNIP.setText("El DNI debe tener 8 dígitos");
            lblCampoDNIP.setVisible(true);
//            JOptionPane.showMessageDialog(null, "El DNI debe tener 8 dígitos", "Alerta", JOptionPane.ERROR_MESSAGE);
        }

        if (a != txtDNIProfe.getText().length()) {
            ocultarCamposObligatorios();
            verificacionEmail();
        }

    }

    public void verificacionEmail() {

        int a = 0;
        // Verificar si el correo electrónico contiene exactamente un '@'
        int atIndex = txtCorreoProfe.getText().indexOf('@');
        if (atIndex == -1 || txtCorreoProfe.getText().indexOf('@', atIndex + 1) != -1) {
            a = -1;
        }

        // Verificar si el dominio termina en '.com'
        int dotIndex = txtCorreoProfe.getText().lastIndexOf('.');
        if (dotIndex == -1 || !txtCorreoProfe.getText().substring(dotIndex).equals(".com")) {
            a = -1;
        }

        if (a == 0) {
            
            ocultarCamposObligatorios();
            registroAccion();
        }else{
            lblCampoCorreoP.setText("Ingrese un correo válido");
            lblCampoCorreoP.setVisible(true);
        }

    }
    
    public void registroAccion(){
        //Instanciando un objeto de la clase Profesor
            prof = new Profesor();
            //Declarando e instanciando un DAO de Persona para agregar al Profe a la tabla de Persona
            PersonaDao pd = new PersonaDao();

            prof.setDni(txtDNIProfe.getText());
            prof.setNombre(txtNombreProfe.getText());
            prof.setApellido(txtApellidosProfe.getText());
            prof.setEmail(txtCorreoProfe.getText());
            prof.setId_rol(1003);
            prof.setPassword(null);

            pd.agregar(prof);
            // Mostrar un mensaje informativo
            JOptionPane.showMessageDialog(null, "Profesor agregado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
            mostrarProfes();
    }
    
    public void limpiarCampos(){
        txtDNIProfe.setText(null);
        txtNombreProfe.setText(null);
        txtApellidosProfe.setText(null);
        txtCorreoProfe.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProfe;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnModificarProfe;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCampoApellidosP;
    private javax.swing.JLabel lblCampoCorreoP;
    private javax.swing.JLabel lblCampoDNIP;
    private javax.swing.JLabel lblCampoNombreP;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlGuardar;
    private javax.swing.JRadioButton rbtnDNI;
    private javax.swing.JRadioButton rbtnNombre;
    private javax.swing.JTable tblProfes;
    private javax.swing.JTextField txtApellidosProfe;
    private javax.swing.JTextField txtCorreoProfe;
    private javax.swing.JTextField txtDNIProf;
    private javax.swing.JTextField txtDNIProfe;
    private javax.swing.JTextField txtNomImagen;
    private javax.swing.JTextField txtNomProf;
    private javax.swing.JTextField txtNombreProfe;
    // End of variables declaration//GEN-END:variables
}
