package softinsurance;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Opcion extends javax.swing.JFrame {
    String OpenBD;
    public Opcion() {
        initComponents();
        setResizable(false);
        setTitle("MENU");
        setLocationRelativeTo(null);
                Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Boton_Registrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Abrir_Bases = new javax.swing.JComboBox<>();
        Boton_Abrir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos/icons8_Menu_32px.png"))); // NOI18N
        jLabel1.setText("MENU PRINCIPAL");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("ESCOGE UNA BASE DE DATOS PARA CONTINUAR:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("REGISTRAR UN NUEVO USUARIO:");

        Boton_Registrar.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Registrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Registrar.setText("REGISTRAR");
        Boton_Registrar.setBorder(null);
        Boton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RegistrarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator2.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        Abrir_Bases.setBackground(new java.awt.Color(255, 255, 255));
        Abrir_Bases.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Abrir_Bases.setForeground(new java.awt.Color(255, 102, 0));
        Abrir_Bases.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CLIENTE", "PROVEEDOR", "PRODUCTOS", "FACTURA", "VENTAS", "ORDEN DE COMPRA", "REPORTE" }));
        Abrir_Bases.setBorder(null);
        Abrir_Bases.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Abrir_Bases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Abrir_BasesActionPerformed(evt);
            }
        });

        Boton_Abrir.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Abrir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Abrir.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Abrir.setText("ABRIR");
        Boton_Abrir.setBorder(null);
        Boton_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AbrirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(297, 297, 297))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(Boton_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Abrir_Bases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Abrir_Bases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Boton_Abrir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(Boton_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Boton Registro
    private void Boton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RegistrarActionPerformed
        Registrar Registro = new Registrar();
        Registro.setVisible(true);
        Registro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Boton_RegistrarActionPerformed

    private void Abrir_BasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Abrir_BasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Abrir_BasesActionPerformed
//ABRI BASES DE DATOS
    private void Boton_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AbrirActionPerformed
        OpenBD =Abrir_Bases.getSelectedItem().toString();
        try{
            if("CLIENTE".equals(OpenBD)){
                ClienteBD BD_Cliente = new ClienteBD();
                BD_Cliente.setVisible(true);
                BD_Cliente.setLocationRelativeTo(null);
                this.dispose();
            }else if("PROVEEDOR".equals(OpenBD)){
                Proveedor BD_Proveedor = new Proveedor();
                BD_Proveedor.setVisible(true);
                BD_Proveedor.setLocationRelativeTo(null);
                this.dispose();
            }else if("PRODUCTOS".equals(OpenBD)){
                Producto BD_Producto = new Producto();
                BD_Producto.setVisible(true);
                BD_Producto.setLocationRelativeTo(null);
                this.dispose();
            }else if("FACTURA".equals(OpenBD)){
                Factura BD_Factura = new Factura();
                BD_Factura.setVisible(true);
                BD_Factura.setLocationRelativeTo(null);
                this.dispose();
            }
            else if("VENTAS".equals(OpenBD)){
                Ventas BD_Ventas = new Ventas();
                BD_Ventas.setVisible(true);
                BD_Ventas.setLocationRelativeTo(null);
                this.dispose();
            }else if("ORDEN DE COMPRA".equals(OpenBD)){
                OrdenCompra BD_OrdenCompra= new OrdenCompra();
                BD_OrdenCompra.setVisible(true);
                BD_OrdenCompra.setLocationRelativeTo(null);
                this.dispose();
            }
            else if("REPORTE".equals(OpenBD)){
                Reporte Reporte = new Reporte();
                Reporte.setVisible(true);
                Reporte.setLocationRelativeTo(null);
        this.dispose();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
    }//GEN-LAST:event_Boton_AbrirActionPerformed

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
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Opcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Abrir_Bases;
    private javax.swing.JButton Boton_Abrir;
    private javax.swing.JButton Boton_Registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
