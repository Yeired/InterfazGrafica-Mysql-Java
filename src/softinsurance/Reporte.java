
package softinsurance;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.*;
import java.awt.Component;
import javax.swing.JFileChooser;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;

public class Reporte extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection conexion = con.conectar();
    public Reporte() {
        initComponents();
        setTitle("Reporte");
        setResizable(false);
        setLocationRelativeTo(null);
                Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaReporte = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        Boton_Regreso3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Crear_PDF = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Escoger_Reporte = new javax.swing.JComboBox<>();
        EscogerReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("REPORTE");

        TablaReporte.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        TablaReporte.setForeground(new java.awt.Color(255, 102, 0));
        TablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaReporte);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("MENU PRINCIPAL");

        Boton_Regreso3.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Regreso3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Regreso3.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Regreso3.setText("REGRESAR");
        Boton_Regreso3.setBorder(null);
        Boton_Regreso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Regreso3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Escoga una reporte:");

        Crear_PDF.setBackground(new java.awt.Color(255, 102, 0));
        Crear_PDF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Crear_PDF.setForeground(new java.awt.Color(255, 255, 255));
        Crear_PDF.setText("CREAR PDF");
        Crear_PDF.setBorder(null);
        Crear_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crear_PDFActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        Escoger_Reporte.setBackground(new java.awt.Color(255, 102, 51));
        Escoger_Reporte.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Escoger_Reporte.setForeground(new java.awt.Color(255, 255, 255));
        Escoger_Reporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reporte No.1", "Reporte No.2", "Reporte No.3", "Reporte No.4" }));

        EscogerReport.setBackground(new java.awt.Color(255, 102, 51));
        EscogerReport.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EscogerReport.setForeground(new java.awt.Color(255, 255, 255));
        EscogerReport.setText("ABRIR");
        EscogerReport.setBorder(null);
        EscogerReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscogerReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Crear_PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton_Regreso3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Escoger_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(EscogerReport, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Escoger_Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EscogerReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Crear_PDF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Boton_Regreso3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Regresar
    private void Boton_Regreso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Regreso3ActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Regreso3ActionPerformed
//CrearPDF
    private void Crear_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crear_PDFActionPerformed
        Conexion con = new Conexion();
        Connection conexion = con.conectar();
        String reporte = Escoger_Reporte.getSelectedItem().toString();
        String text1,text2,text3,text4,text5;
        JOptionPane.showMessageDialog(null,"Escoge una ruta para guardar el PDF");
            JFileChooser escoger = new JFileChooser();
        escoger.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        Component parent = null;
            int returnVal = escoger.showSaveDialog(parent);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
        String Ruta = escoger.getSelectedFile().getPath();
         System.out.println ("El directorio que elija es:" + Ruta);
         
         JOptionPane.showMessageDialog(null,"Creando PDF...");
        if("Reporte No.1".equals(reporte)){         
        try{
            PDDocument documento = new PDDocument();
            PDPage pagina = new PDPage(PDRectangle.LETTER);
            documento.addPage(pagina);
            PDPageContentStream contiene =new PDPageContentStream(documento, pagina);
            contiene.beginText(); //LINEA 1
            contiene.setFont(PDType1Font.TIMES_ROMAN, 24);
            contiene.newLineAtOffset(160, 700);
            contiene.showText("Reporte: Cantidad de un producto");
            contiene.endText();
            try{
            Statement stmt=conexion.createStatement();
            ResultSet resultado=stmt.executeQuery("select c.ID_Producto, c.Descripcion, d.Cantidad from producto c, detalle_orden d where c.ID_Producto =1 and c.ID_Producto = d.ID_Producto");
            while(resultado.next())
                {
                    text1 = resultado.getString("ID_Producto");
                    text2 = resultado.getString("Descripcion");
                    text3 = resultado.getString("Cantidad");
                    contiene.beginText(); //Texto 1
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 670);
                    contiene.showText("ID Producto: " + resultado.getString("ID_Producto"));
                    contiene.endText();
                    contiene.beginText(); //Texto 2
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 650);
                    contiene.showText("Descripcion: " + resultado.getString("Descripcion"));
                    contiene.endText();
                    contiene.beginText(); //Texto 3
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 630);
                    contiene.showText("Cantidad: " + resultado.getString("Cantidad"));
                    contiene.endText();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: " + e);
            }
            contiene.close();
            documento.save(Ruta + "\\reporteNo1.PDF");
            documento.close();
            JOptionPane.showMessageDialog(null,"PDF Creado con exito");
    }
            catch(IOException x){
                JOptionPane.showMessageDialog(null,"Error: " + x);
            }
        }else if("Reporte No.2".equals(reporte)){         
        try{
            PDDocument documento = new PDDocument();
            PDPage pagina = new PDPage(PDRectangle.LETTER);
            documento.addPage(pagina);
            PDPageContentStream contiene =new PDPageContentStream(documento, pagina);
            contiene.beginText(); //LINEA 1
            contiene.setFont(PDType1Font.TIMES_ROMAN, 24);
            contiene.newLineAtOffset(160, 700);
            contiene.showText("Reporte: Fecha de facturacion de un cliente");
            contiene.endText();
            try{
            Statement stmt=conexion.createStatement();
            ResultSet resultado=stmt.executeQuery("select c.ID_Cliente, c.Nombre_cliente, d.ID_Factura, d.Fecha_facturacion from cliente c, factura d where c.ID_Cliente =1 and c.ID_Cliente = d.ID_Cliente;");
            while(resultado.next())
                {
                    text1 = resultado.getString("ID_Cliente");
                    text2 = resultado.getString("Nombre_cliente");
                    text3 = resultado.getString("ID_Factura");
                    text4 = resultado.getString("Fecha_facturacion");
                    contiene.beginText(); //Texto 1
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 670);
                    contiene.showText("ID Cliente: " + resultado.getString("ID_Cliente"));
                    contiene.endText();
                    contiene.beginText(); //Texto 2
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 650);
                    contiene.showText("Nombre del cliente: " + resultado.getString("Nombre_cliente"));
                    contiene.endText();
                    contiene.beginText(); //Texto 3
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 630);
                    contiene.showText("ID Factura: " + resultado.getString("ID_Factura"));
                    contiene.endText();
                                        contiene.beginText(); //Texto 4
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 610);
                    contiene.showText("Fecha de facturacion: " + resultado.getString("Fecha_facturacion"));
                    contiene.endText();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: " + e);
            }
            contiene.close();
            documento.save(Ruta + "\\reporteNo2.PDF");
            documento.close();
            JOptionPane.showMessageDialog(null,"PDF Creado con exito");
    }
            catch(IOException x){
                JOptionPane.showMessageDialog(null,"Error: " + x);
            }
        }else if("Reporte No.3".equals(reporte)){
         try{
            PDDocument documento = new PDDocument();
            PDPage pagina = new PDPage(PDRectangle.LETTER);
            documento.addPage(pagina);
            PDPageContentStream contiene =new PDPageContentStream(documento, pagina);
            contiene.beginText(); //LINEA 1
            contiene.setFont(PDType1Font.TIMES_ROMAN, 24);
            contiene.newLineAtOffset(160, 700);
            contiene.showText("Reporte: Proveedor y orden de compra");
            contiene.endText();
            try{
            Statement stmt=conexion.createStatement();
            ResultSet resultado=stmt.executeQuery("select c.ID_Proveedor, c.Nombre_Proveedor, c.Direccion, d.Fecha_OrdCompra, d.ID_OrdenCompra from proveedor c, orden_compra d where c.ID_Proveedor =1 and c.ID_Proveedor = d.ID_Proveedor");
            while(resultado.next())
                {
                    text1 = resultado.getString("ID_Proveedor");
                    text2 = resultado.getString("Nombre_Proveedor");
                    text3 = resultado.getString("Direccion");
                    text4 = resultado.getString("Fecha_OrdCompra");
                    text5 = resultado.getString("ID_OrdenCompra");
                    contiene.beginText(); //Texto 1
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 670);
                    contiene.showText("ID Proveedor: " + resultado.getString("ID_Proveedor"));
                    contiene.endText();
                    contiene.beginText(); //Texto 2
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 650);
                    contiene.showText("Nombre del proveedor: " + resultado.getString("Nombre_Proveedor"));
                    contiene.endText();
                    contiene.beginText(); //Texto 3
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 630);
                    contiene.showText("Direccion: " + resultado.getString("Direccion"));
                    contiene.endText();
                    contiene.beginText(); //Texto 4
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 610);
                    contiene.showText("Fecha orden de compra: " + resultado.getString("Fecha_OrdCompra"));
                    contiene.endText();
                    contiene.beginText(); //Texto 4
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 590);
                    contiene.showText("ID OrdenCompra: " + resultado.getString("ID_OrdenCompra"));
                    contiene.endText();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: " + e);
            }
            contiene.close();
            documento.save(Ruta + "\\reporteNo3.PDF");
            documento.close();
            JOptionPane.showMessageDialog(null,"PDF Creado con exito");
    }
            catch(IOException x){
                JOptionPane.showMessageDialog(null,"Error: " + x);
            }           
        }else if("Reporte No.4".equals(reporte)){
                   try{
            PDDocument documento = new PDDocument();
            PDPage pagina = new PDPage(PDRectangle.LETTER);
            documento.addPage(pagina);
            PDPageContentStream contiene =new PDPageContentStream(documento, pagina);
            contiene.beginText(); //LINEA 1
            contiene.setFont(PDType1Font.TIMES_ROMAN, 24);
            contiene.newLineAtOffset(160, 700);
            contiene.showText("Reporte: Cliente y fecha de venta");
            contiene.endText();
            try{
            Statement stmt=conexion.createStatement();
            ResultSet resultado=stmt.executeQuery("select c.ID_Cliente, c.Nombre_Cliente, d.ID_Venta, d.Fecha from cliente c, ventas d where c.ID_Cliente =1 and c.ID_Cliente = d.ID_Cliente");
            while(resultado.next())
                {
                    text1 = resultado.getString("ID_Cliente");
                    text2 = resultado.getString("Nombre_Cliente");
                    text3 = resultado.getString("ID_Venta");
                    text4 = resultado.getString("Fecha");
                    contiene.beginText(); //Texto 1
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 670);
                    contiene.showText("ID Cliente: " + resultado.getString("ID_Cliente"));
                    contiene.endText();
                    contiene.beginText(); //Texto 2
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 650);
                    contiene.showText("Nombre del cliente: " + resultado.getString("Nombre_Cliente"));
                    contiene.endText();
                    contiene.beginText(); //Texto 3
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 630);
                    contiene.showText("ID Venta: " + resultado.getString("ID_Venta"));
                    contiene.endText();
                    contiene.beginText(); //Texto 4
                    contiene.setFont(PDType1Font.COURIER, 12);
                    contiene.newLineAtOffset(100, 610);
                    contiene.showText("Fecha de venta: " + resultado.getString("Fecha"));
                    contiene.endText();
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error: " + e);
            }
            contiene.close();
            documento.save(Ruta + "\\reporteNo4.PDF");
            documento.close();
            JOptionPane.showMessageDialog(null,"PDF Creado con exito");
    }
            catch(IOException x){
                JOptionPane.showMessageDialog(null,"Error: " + x);
            }           
        }         
    }//GEN-LAST:event_Crear_PDFActionPerformed
    }
    private void EscogerReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscogerReportActionPerformed
                String reporte = Escoger_Reporte.getSelectedItem().toString();
        if("Reporte No.1".equals(reporte)){
            ReporteNo1();
        }else if("Reporte No.2".equals(reporte)){
            ReporteNo2();
        }
        else if("Reporte No.3".equals(reporte)){
            ReporteNo3();
        }
        else if("Reporte No.4".equals(reporte)){
            ReporteNo4();
        }
    }//GEN-LAST:event_EscogerReportActionPerformed

    public void ReporteNo1()
   {
               DefaultTableModel tabla=new DefaultTableModel();
        tabla.addColumn("ID_Producto");
        tabla.addColumn("Descripcion");
        tabla.addColumn("Cantidad");
        TablaReporte.setModel(tabla);
        String[] datos=new String[10];
            try{
                Statement leer= conexion.createStatement();
                ResultSet resultado=leer.executeQuery("select c.ID_Producto, c.Descripcion, d.Cantidad from producto c, detalle_orden d where c.ID_Producto =1 and c.ID_Producto = d.ID_Producto");
                while(resultado.next()){
                    datos[0]=resultado.getString(1);
                    datos[1]=resultado.getString(2);
                    datos[2]=resultado.getString(3);
                    tabla.addRow(datos);
                }
                TablaReporte.setModel(tabla);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
   }
    public void ReporteNo2()
   {
        DefaultTableModel tabla=new DefaultTableModel();
        tabla.addColumn("ID_Cliente");
        tabla.addColumn("Nombre_cliente");
        tabla.addColumn("ID_Factura");
        tabla.addColumn("Fecha_facturacion");
        TablaReporte.setModel(tabla);
        String[] datos=new String[10];
            try{
                Statement leer= conexion.createStatement();
                ResultSet resultado=leer.executeQuery("select c.ID_Cliente, c.Nombre_cliente, d.ID_Factura, d.Fecha_facturacion from cliente c, factura d where c.ID_Cliente =1 and c.ID_Cliente = d.ID_Cliente");
                while(resultado.next()){
                    datos[0]=resultado.getString(1);
                    datos[1]=resultado.getString(2);
                    datos[2]=resultado.getString(3);
                    datos[3]=resultado.getString(4);
                    tabla.addRow(datos);
                }
                TablaReporte.setModel(tabla);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
   }
    public void ReporteNo3(){
        DefaultTableModel tabla=new DefaultTableModel();
        tabla.addColumn("ID_Proveedor");
        tabla.addColumn("Nombre_Proveedor");
        tabla.addColumn("Direccion");
        tabla.addColumn("Fecha_OrdCompra");
        tabla.addColumn("ID_OrdenCompra");
        TablaReporte.setModel(tabla);
        String[] datos=new String[10];
            try{
                Statement leer= conexion.createStatement();
                ResultSet resultado=leer.executeQuery("select c.ID_Proveedor, c.Nombre_Proveedor, c.Direccion, d.Fecha_OrdCompra, d.ID_OrdenCompra from proveedor c, orden_compra d where c.ID_Proveedor =1 and c.ID_Proveedor = d.ID_Proveedor");
                while(resultado.next()){
                    datos[0]=resultado.getString(1);
                    datos[1]=resultado.getString(2);
                    datos[2]=resultado.getString(3);
                    datos[3]=resultado.getString(4);
                    datos[4]=resultado.getString(5);
                    tabla.addRow(datos);
                }
                TablaReporte.setModel(tabla);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }        
    }
    public void ReporteNo4(){
        DefaultTableModel tabla=new DefaultTableModel();
        tabla.addColumn("ID_Cliente");
        tabla.addColumn("Nombre_Cliente");
        tabla.addColumn("ID_Venta");
        tabla.addColumn("Fecha");
        TablaReporte.setModel(tabla);
        String[] datos=new String[10];
            try{
                Statement leer= conexion.createStatement();
                ResultSet resultado=leer.executeQuery("select c.ID_Cliente, c.Nombre_Cliente, d.ID_Venta, d.Fecha from cliente c, ventas d where c.ID_Cliente =1 and c.ID_Cliente = d.ID_Cliente;");
                while(resultado.next()){
                    datos[0]=resultado.getString(1);
                    datos[1]=resultado.getString(2);
                    datos[2]=resultado.getString(3);
                    datos[3]=resultado.getString(4);
                    tabla.addRow(datos);
                }
                TablaReporte.setModel(tabla);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }          
    }
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
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Regreso3;
    private javax.swing.JButton Crear_PDF;
    private javax.swing.JButton EscogerReport;
    private javax.swing.JComboBox<String> Escoger_Reporte;
    private javax.swing.JTable TablaReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
