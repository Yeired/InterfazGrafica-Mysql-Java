
package softinsurance;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class consultasUsuario extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection conexion = con.conectar();
    String base;
    public consultasUsuario() {
        initComponents();
        setTitle("Consultas");
        setResizable(false);
        setLocationRelativeTo(null);
                Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        opcion_tabla = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_bases = new javax.swing.JTable();
        Consultar_tablas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Login_regreso = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("CONSULTAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 21, -1, -1));

        jLabel3.setText("Escoge una base de datos:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 76, -1, -1));

        opcion_tabla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cliente", "detalle_orden", "det_ventas", "factura", "orden_compra", "producto", "proveedor", "ventas" }));
        jPanel1.add(opcion_tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 71, -1, -1));

        tabla_bases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_bases);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 970, 570));

        Consultar_tablas.setText("CONSULTAR");
        Consultar_tablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar_tablasActionPerformed(evt);
            }
        });
        jPanel1.add(Consultar_tablas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, -1, -1));

        jLabel4.setText("Iniciar sesion con otro usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, -1, -1));

        Login_regreso.setText("REGRESAR");
        Login_regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_regresoActionPerformed(evt);
            }
        });
        jPanel1.add(Login_regreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Consultar_tablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar_tablasActionPerformed

        base=opcion_tabla.getSelectedItem().toString();
        try{
            if("cliente".equals(base)){
                        bd_clientes();
            }else if("detalle_orden".equals(base)){
                bd_detalle_orden();
            }else if("det_ventas".equals(base)){
                bd_det_ventas();
            }else if("factura".equals(base)){
                bd_factura();
            }
            else if("orden_compra".equals(base)){
                bd_orde_compra();
            }else if("producto".equals(base)){
                bd_producto();
            }
            else if("proveedor".equals(base)){
                bd_proveedor();
            }
            else if("ventas".equals(base)){
                bd_ventas();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        } 
    }//GEN-LAST:event_Consultar_tablasActionPerformed

    private void Login_regresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_regresoActionPerformed
        Login Login = new Login();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Login_regresoActionPerformed
public void bd_clientes(){
    DefaultTableModel tabla=new DefaultTableModel();
    tabla.addColumn("ID_Cliente");
    tabla.addColumn("Nombre_cliente");
    tabla.addColumn("Razon_social");
    tabla.addColumn("Direccion");
    tabla.addColumn("Telefono");
    tabla.addColumn("Email");
    tabla_bases.setModel(tabla);
    String[] datos=new String[10];
            try{
                Statement leer= conexion.createStatement();
                ResultSet resultado=leer.executeQuery("SELECT * FROM cliente");
                while(resultado.next()){
                    datos[0]=resultado.getString(1);
                    datos[1]=resultado.getString(2);
                    datos[2]=resultado.getString(3);
                    datos[3]=resultado.getString(4);
                    datos[4]=resultado.getString(5);
                    datos[5]=resultado.getString(6);
                    tabla.addRow(datos);
                }
                tabla_bases.setModel(tabla);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
}
public void bd_detalle_orden(){
    DefaultTableModel tabla=new DefaultTableModel();
    tabla.addColumn("ID_OrdenCompra");
    tabla.addColumn("ID_Producto");
    tabla.addColumn("Cantidad");
    tabla_bases.setModel(tabla);
    String[] datos=new String[10];
    try{
        Statement leer= conexion.createStatement();
        ResultSet resultado=leer.executeQuery("SELECT * FROM detalle_orden");
        while(resultado.next()){
            datos[0]=resultado.getString(1);
            datos[1]=resultado.getString(2);
            datos[2]=resultado.getString(3);


            tabla.addRow(datos);
        }
        tabla_bases.setModel(tabla);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error: "+ e);
    }
}
public void bd_det_ventas(){
    DefaultTableModel tabla=new DefaultTableModel();
    tabla.addColumn("ID_Venta");
    tabla.addColumn("ID_Produto");
    tabla.addColumn("Cantidad comprada");
    tabla_bases.setModel(tabla);
    String[] datos=new String[10];
    try{
        Statement leer= conexion.createStatement();
        ResultSet resultado=leer.executeQuery("SELECT * FROM det_ventas");
        while(resultado.next()){
            datos[0]=resultado.getString(1);
            datos[1]=resultado.getString(2);
            datos[2]=resultado.getString(3);


            tabla.addRow(datos);
        }
        tabla_bases.setModel(tabla);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error: "+ e);
    }   
}
public void bd_factura(){
        DefaultTableModel tabla=new DefaultTableModel();
        tabla.addColumn("ID_Facturacion");
        tabla.addColumn("Fecha de facturacion");
        tabla.addColumn("ID_Cliente");
        
        tabla_bases.setModel(tabla);
        String[] datos=new String[10];
        try{
            Statement leer= conexion.createStatement();
            ResultSet resultado=leer.executeQuery("SELECT * FROM factura");
            while(resultado.next()){
                datos[0]=resultado.getString(1);
                datos[1]=resultado.getString(2);
                datos[2]=resultado.getString(3);
                tabla.addRow(datos);
            }
            tabla_bases.setModel(tabla);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
}
public void bd_orde_compra(){
        DefaultTableModel tabla=new DefaultTableModel();
        tabla.addColumn("ID_OrdenCompra");
        tabla.addColumn("Fecha_OrdCompra");
        tabla.addColumn("ID_Proveedor");
        tabla_bases.setModel(tabla);
        String[] datos=new String[10];
        try{
            Statement leer= conexion.createStatement();
            ResultSet resultado=leer.executeQuery("SELECT * FROM orden_compra");
            while(resultado.next()){
                datos[0]=resultado.getString(1);
                datos[1]=resultado.getString(2);
                datos[2]=resultado.getString(3);

                
                tabla.addRow(datos);
            }
            tabla_bases.setModel(tabla);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        } 
}
public void bd_producto(){
DefaultTableModel tabla=new DefaultTableModel();
    tabla.addColumn("ID_Producto");
    tabla.addColumn("Descripcion");
    tabla.addColumn("Precio");
    tabla.addColumn("Linea");
    tabla.addColumn("Stock Actual");
    tabla.addColumn("Stock Minimo");
    tabla_bases.setModel(tabla);
    String[] datos=new String[10];
            try{
                Statement leer= conexion.createStatement();
                ResultSet resultado=leer.executeQuery("SELECT * FROM producto");
                while(resultado.next()){
                    datos[0]=resultado.getString(1);
                    datos[1]=resultado.getString(2);
                    datos[2]=resultado.getString(3);
                    datos[3]=resultado.getString(4);
                    datos[4]=resultado.getString(5);
                    datos[5]=resultado.getString(6);

                    tabla.addRow(datos);
                }
                tabla_bases.setModel(tabla);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }      
}
public void bd_proveedor(){
DefaultTableModel tabla=new DefaultTableModel();
        tabla.addColumn("ID_Proveedor");
        tabla.addColumn("Nombre_Proveedor");
        tabla.addColumn("Direccion");
        tabla.addColumn("Email");
        tabla.addColumn("Producto");
        tabla_bases.setModel(tabla);
        String[] datos=new String[10];
        try{
            Statement leer= conexion.createStatement();
            ResultSet resultado=leer.executeQuery("SELECT * FROM proveedor");
            while(resultado.next()){
                datos[0]=resultado.getString(1);
                datos[1]=resultado.getString(2);
                datos[2]=resultado.getString(3);
                datos[3]=resultado.getString(4);
                datos[4]=resultado.getString(5);
                tabla.addRow(datos);
            }
            tabla_bases.setModel(tabla);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }    
}
public void bd_ventas(){
        DefaultTableModel tabla=new DefaultTableModel();
    tabla.addColumn("ID_Venta");
    tabla.addColumn("ID_Usuario");
    tabla.addColumn("ID_Cliente");
    tabla.addColumn("Fecha");
   tabla_bases.setModel(tabla);
    String[] datos=new String[10];
            try{
                Statement leer= conexion.createStatement();
                ResultSet resultado=leer.executeQuery("SELECT * FROM ventas");
                while(resultado.next()){
                    datos[0]=resultado.getString(1);
                    datos[1]=resultado.getString(2);
                    datos[2]=resultado.getString(3);
                    datos[3]=resultado.getString(4);
                    tabla.addRow(datos);
                }
                tabla_bases.setModel(tabla);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        } 
}
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
            java.util.logging.Logger.getLogger(consultasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultasUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar_tablas;
    private javax.swing.JButton Login_regreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> opcion_tabla;
    private javax.swing.JTable tabla_bases;
    // End of variables declaration//GEN-END:variables
}
