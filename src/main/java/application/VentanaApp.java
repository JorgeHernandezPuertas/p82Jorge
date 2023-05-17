/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package application;

/**
 *
 * @author jorge
 */
public class VentanaApp extends javax.swing.JFrame {

    /**
     * Creates new form VentanaApp
     */
    public VentanaApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaSelect = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        TituloInsert = new javax.swing.JLabel();
        VentanaInsert = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        labelImporte = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        labelDescripcion = new javax.swing.JLabel();
        tituloInsertar = new javax.swing.JLabel();
        insertImporte = new javax.swing.JTextField();
        insertId = new javax.swing.JTextField();
        insertFecha = new javax.swing.JTextField();
        insertDescripcion = new javax.swing.JTextField();
        botonInsertar = new javax.swing.JButton();
        separadorInsertar = new javax.swing.JSeparator();
        VentanaModificar = new javax.swing.JDialog();
        VentanaBorrar = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        tituloBorrar = new javax.swing.JLabel();
        labelBorrar = new javax.swing.JLabel();
        botonDelete = new javax.swing.JButton();
        deleteId = new javax.swing.JTextField();
        separadorBorrar = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        PanelPrincipal = new javax.swing.JPanel();
        BotonSelect = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        BotonInsert = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();

        VentanaSelect.setTitle("Facturas Almacenadas");
        VentanaSelect.setBackground(new java.awt.Color(34, 40, 49));

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setMaximumSize(new java.awt.Dimension(854, 666));
        jPanel1.setMinimumSize(new java.awt.Dimension(854, 666));
        jPanel1.setPreferredSize(new java.awt.Dimension(854, 666));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(57, 62, 70));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181), 2));
        jScrollPane1.setForeground(new java.awt.Color(238, 238, 238));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setName("Tabla Facturas"); // NOI18N

        tabla.setBackground(new java.awt.Color(57, 62, 70));
        tabla.setForeground(new java.awt.Color(238, 238, 238));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Fecha Emisión", "Descripción", "Importe Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.setName(""); // NOI18N
        tabla.setSelectionBackground(new java.awt.Color(34, 40, 49));
        tabla.setSelectionForeground(new java.awt.Color(238, 238, 238));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 410, 360));

        TituloInsert.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        TituloInsert.setForeground(new java.awt.Color(0, 173, 181));
        TituloInsert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloInsert.setText("Lista de Facturas");
        TituloInsert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(TituloInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 450, -1));

        javax.swing.GroupLayout VentanaSelectLayout = new javax.swing.GroupLayout(VentanaSelect.getContentPane());
        VentanaSelect.getContentPane().setLayout(VentanaSelectLayout);
        VentanaSelectLayout.setHorizontalGroup(
            VentanaSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VentanaSelectLayout.setVerticalGroup(
            VentanaSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(34, 40, 49));
        jPanel2.setPreferredSize(new java.awt.Dimension(590, 321));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelImporte.setForeground(new java.awt.Color(238, 238, 238));
        labelImporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelImporte.setLabelFor(insertImporte);
        labelImporte.setText("- Importe total");
        jPanel2.add(labelImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, 30));

        labelCodigo.setForeground(new java.awt.Color(238, 238, 238));
        labelCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelCodigo.setLabelFor(insertId);
        labelCodigo.setText("- Código");
        jPanel2.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 90, 30));

        labelFecha.setForeground(new java.awt.Color(238, 238, 238));
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelFecha.setLabelFor(insertFecha);
        labelFecha.setText("- Fecha de emisión");
        jPanel2.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 140, 30));

        labelDescripcion.setForeground(new java.awt.Color(238, 238, 238));
        labelDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelDescripcion.setLabelFor(insertDescripcion);
        labelDescripcion.setText("- Descripción");
        jPanel2.add(labelDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 140, 30));

        tituloInsertar.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        tituloInsertar.setForeground(new java.awt.Color(0, 173, 181));
        tituloInsertar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloInsertar.setText("Insertar Factura");
        jPanel2.add(tituloInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 250, 50));

        insertImporte.setBackground(new java.awt.Color(57, 62, 70));
        insertImporte.setForeground(new java.awt.Color(238, 238, 238));
        insertImporte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insertImporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        insertImporte.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(insertImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 220, 30));

        insertId.setBackground(new java.awt.Color(57, 62, 70));
        insertId.setForeground(new java.awt.Color(238, 238, 238));
        insertId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insertId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        insertId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(insertId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 220, 30));

        insertFecha.setBackground(new java.awt.Color(57, 62, 70));
        insertFecha.setForeground(new java.awt.Color(238, 238, 238));
        insertFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insertFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        insertFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(insertFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 220, 30));

        insertDescripcion.setBackground(new java.awt.Color(57, 62, 70));
        insertDescripcion.setForeground(new java.awt.Color(238, 238, 238));
        insertDescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        insertDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        insertDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(insertDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 220, 30));

        botonInsertar.setBackground(new java.awt.Color(57, 62, 70));
        botonInsertar.setForeground(new java.awt.Color(238, 238, 238));
        botonInsertar.setText("Insertar");
        botonInsertar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        botonInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 70, 30));

        separadorInsertar.setForeground(new java.awt.Color(57, 62, 70));
        jPanel2.add(separadorInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 570, 10));

        javax.swing.GroupLayout VentanaInsertLayout = new javax.swing.GroupLayout(VentanaInsert.getContentPane());
        VentanaInsert.getContentPane().setLayout(VentanaInsertLayout);
        VentanaInsertLayout.setHorizontalGroup(
            VentanaInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VentanaInsertLayout.setVerticalGroup(
            VentanaInsertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaInsertLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VentanaModificarLayout = new javax.swing.GroupLayout(VentanaModificar.getContentPane());
        VentanaModificar.getContentPane().setLayout(VentanaModificarLayout);
        VentanaModificarLayout.setHorizontalGroup(
            VentanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        VentanaModificarLayout.setVerticalGroup(
            VentanaModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(34, 40, 49));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloBorrar.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        tituloBorrar.setForeground(new java.awt.Color(0, 173, 181));
        tituloBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBorrar.setText("Borrar Factura");
        jPanel3.add(tituloBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        labelBorrar.setForeground(new java.awt.Color(238, 238, 238));
        labelBorrar.setText("- Código");
        jPanel3.add(labelBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 70, 30));

        botonDelete.setBackground(new java.awt.Color(57, 62, 70));
        botonDelete.setForeground(new java.awt.Color(238, 238, 238));
        botonDelete.setText("Borrar");
        botonDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        botonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(botonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 70, 30));

        deleteId.setBackground(new java.awt.Color(57, 62, 70));
        deleteId.setForeground(new java.awt.Color(238, 238, 238));
        deleteId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        jPanel3.add(deleteId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 120, 30));

        separadorBorrar.setForeground(new java.awt.Color(57, 62, 70));
        jPanel3.add(separadorBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 83, 330, 10));

        javax.swing.GroupLayout VentanaBorrarLayout = new javax.swing.GroupLayout(VentanaBorrar.getContentPane());
        VentanaBorrar.getContentPane().setLayout(VentanaBorrarLayout);
        VentanaBorrarLayout.setHorizontalGroup(
            VentanaBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );
        VentanaBorrarLayout.setVerticalGroup(
            VentanaBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(916, 284));

        PanelPrincipal.setBackground(new java.awt.Color(34, 40, 49));
        PanelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(916, 293));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSelect.setBackground(new java.awt.Color(57, 62, 70));
        BotonSelect.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        BotonSelect.setForeground(new java.awt.Color(238, 238, 238));
        BotonSelect.setText("Ver Facturas");
        BotonSelect.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        BotonSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSelect.setPreferredSize(new java.awt.Dimension(240, 40));
        BotonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSelectActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 240, 40));

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 173, 181));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Gestionar facturas");
        PanelPrincipal.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 310, 50));

        BotonInsert.setBackground(new java.awt.Color(57, 62, 70));
        BotonInsert.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        BotonInsert.setForeground(new java.awt.Color(238, 238, 238));
        BotonInsert.setText("Añadir Factura");
        BotonInsert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        BotonInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInsert.setPreferredSize(new java.awt.Dimension(240, 40));
        BotonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInsertActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 240, 40));

        BotonModificar.setBackground(new java.awt.Color(57, 62, 70));
        BotonModificar.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        BotonModificar.setForeground(new java.awt.Color(238, 238, 238));
        BotonModificar.setText("Modificar Facturas");
        BotonModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        BotonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonModificar.setPreferredSize(new java.awt.Dimension(240, 40));
        BotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 240, 40));

        BotonBorrar.setBackground(new java.awt.Color(57, 62, 70));
        BotonBorrar.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        BotonBorrar.setForeground(new java.awt.Color(238, 238, 238));
        BotonBorrar.setText("Borrar Factura");
        BotonBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 173, 181)));
        BotonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonBorrar.setPreferredSize(new java.awt.Dimension(240, 40));
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });
        PanelPrincipal.add(BotonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSelectActionPerformed
        // TODO add your handling code here:
        this.VentanaSelect.setVisible(true);
        this.VentanaSelect.setSize(854, 666);
        this.VentanaSelect.setResizable(false);
        this.VentanaSelect.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotonSelectActionPerformed

    private void BotonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInsertActionPerformed
        // TODO add your handling code here:
        this.VentanaInsert.setVisible(true);
        this.VentanaInsert.setSize(854, 666);
        this.VentanaInsert.setResizable(false);
        this.VentanaInsert.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotonInsertActionPerformed

    private void BotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificarActionPerformed
        // TODO add your handling code here:
        this.VentanaModificar.setVisible(true);
        this.VentanaModificar.setSize(854, 666);
        this.VentanaModificar.setResizable(false);
        this.VentanaModificar.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotonModificarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonInsert;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonSelect;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloInsert;
    private javax.swing.JDialog VentanaBorrar;
    private javax.swing.JDialog VentanaInsert;
    private javax.swing.JDialog VentanaModificar;
    private javax.swing.JDialog VentanaSelect;
    private javax.swing.JButton botonDelete;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JTextField deleteId;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField insertDescripcion;
    private javax.swing.JTextField insertFecha;
    private javax.swing.JTextField insertId;
    private javax.swing.JTextField insertImporte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBorrar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelImporte;
    private javax.swing.JSeparator separadorBorrar;
    private javax.swing.JSeparator separadorInsertar;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel tituloBorrar;
    private javax.swing.JLabel tituloInsertar;
    // End of variables declaration//GEN-END:variables
}
