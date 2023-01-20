
package softinsurance;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.security.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Factura extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection conexion = con.conectar();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public Factura() {
        initComponents();
        setTitle("Factura");
        setResizable(false);
        setLocationRelativeTo(null);
        Altas_FechaFacturacion.setText(dtf.format(LocalDateTime.now()));
                Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Altas_FechaFacturacion = new javax.swing.JTextField();
        Altas_IDCliente = new javax.swing.JTextField();
        Altas_Registrar = new javax.swing.JButton();
        Boton_Regreso = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Modificar_ID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Modificar_Fecha = new javax.swing.JTextField();
        Modificar_Editar = new javax.swing.JButton();
        Boton_Regreso1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Consultar_Boton = new javax.swing.JButton();
        Boton_Regreso2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Borrar_ID = new javax.swing.JTextField();
        Borrar_Fecha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Boton_Regreso3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("FECHA DE FACTURACION:");

        Altas_FechaFacturacion.setBorder(null);

        Altas_IDCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Altas_Registrar.setBackground(new java.awt.Color(255, 102, 0));
        Altas_Registrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Altas_Registrar.setText("AGREGAR");
        Altas_Registrar.setBorder(null);
        Altas_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altas_RegistrarActionPerformed(evt);
            }
        });

        Boton_Regreso.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Regreso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Regreso.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Regreso.setText("REGRESAR");
        Boton_Regreso.setBorder(null);
        Boton_Regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RegresoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("BASE DE DATOS -  FACTURA");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("MENU PRINCIPAL");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("ID CLIENTE:");

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Regreso)
                .addGap(163, 163, 163))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(Altas_Registrar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Altas_FechaFacturacion, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(Altas_IDCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                    .addComponent(jSeparator1))
                .addGap(0, 141, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Altas_FechaFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Altas_IDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172)
                .addComponent(Altas_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Altas", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("ID FACTURA:");

        jLabel7.setText("FECHA DE FACTURACION:");

        Modificar_Editar.setBackground(new java.awt.Color(255, 102, 51));
        Modificar_Editar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Modificar_Editar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar_Editar.setText("EDITAR");
        Modificar_Editar.setBorder(null);
        Modificar_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_EditarActionPerformed(evt);
            }
        });

        Boton_Regreso1.setText("REGRESAR");
        Boton_Regreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Regreso1ActionPerformed(evt);
            }
        });

        jLabel15.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Modificar_ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                            .addComponent(Modificar_Fecha, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(107, 107, 107))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton_Regreso1))
                            .addComponent(Modificar_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Modificar_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Modificar_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(209, 209, 209)
                .addComponent(Modificar_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Boton_Regreso1))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Consultar_Boton.setText("CONSULTAR");
        Consultar_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar_BotonActionPerformed(evt);
            }
        });

        Boton_Regreso2.setText("REGRESAR");
        Boton_Regreso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Regreso2ActionPerformed(evt);
            }
        });

        jLabel16.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Consultar_Boton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Regreso2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(Boton_Regreso2))
                    .addComponent(Consultar_Boton))
                .addGap(40, 40, 40))
        );

        jTabbedPane1.addTab("Consultar", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("ID FACTURACION:");

        jLabel10.setText("FECHA DE FACTURACION");

        jButton1.setText("BORRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Boton_Regreso3.setText("REGRESAR");
        Boton_Regreso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Regreso3ActionPerformed(evt);
            }
        });

        jLabel17.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jButton1))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton_Regreso3))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Borrar_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(Borrar_Fecha)))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Borrar_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Borrar_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(Boton_Regreso3))
                    .addComponent(jButton1))
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Borrar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//REGRESO
    private void Boton_RegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RegresoActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_RegresoActionPerformed
// BOTON Altas_Guardar
    private void Altas_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altas_RegistrarActionPerformed
        try{
            String query="Insert INTO factura (Fecha_facturacion,ID_Cliente)values(?,?)";
            System.out.println(query);
            PreparedStatement
            guardar= conexion.prepareStatement(query);
            guardar.setString(1,Altas_FechaFacturacion.getText());
            guardar.setString(2,Altas_IDCliente.getText());
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Factura: "+Altas_FechaFacturacion.getText()+ " Agregada");
            Altas_FechaFacturacion.requestFocus();
            Altas_FechaFacturacion.setText("");
            Altas_IDCliente.setText("");
        }
        catch(Exception e)
        {
            System.out.println("Error"+ e);
        }
    }//GEN-LAST:event_Altas_RegistrarActionPerformed
//BOTON Modificar-Editar
    private void Modificar_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_EditarActionPerformed
        try{
            String query="UPDATE factura SET Fecha_facturacion=?   WHERE ID_Factura=?";
            PreparedStatement guardar=conexion.prepareStatement(query);
            guardar.setString(1,Modificar_Fecha.getText());
            guardar.setInt(3,Integer.parseInt(Modificar_ID.getText()));
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cliente con la ID: "+Modificar_ID.getText()+ " Fue modificado");
            Modificar_Fecha.requestFocus();
            Modificar_Fecha.setText("");
            Modificar_ID.setText("");
        }
        catch(Exception e){
            System.out.println("Error"+ e);
        }
    }//GEN-LAST:event_Modificar_EditarActionPerformed
//BOTON REGRESO
    private void Boton_Regreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Regreso1ActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Regreso1ActionPerformed
//BOTON CONSULTAS_Consultar
    private void Consultar_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar_BotonActionPerformed
        DefaultTableModel tabla=new DefaultTableModel();
        tabla.addColumn("ID_Facturacion");
        tabla.addColumn("Fecha de facturacion");
        tabla.addColumn("ID_Cliente");
        
        jTable1.setModel(tabla);
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
            jTable1.setModel(tabla);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
    }//GEN-LAST:event_Consultar_BotonActionPerformed
//REGRESO
    private void Boton_Regreso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Regreso2ActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Regreso2ActionPerformed
//Boton Borrar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 int opcion = -1;
        opcion = JOptionPane.showConfirmDialog(null, "¿Realmente desea borrar el producto?","Confirmar borrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            try {
                String query = "DELETE from factura WHERE ID_Factura=?";
                PreparedStatement guardar = conexion.prepareStatement(query);
                guardar.setInt(1, Integer.parseInt(Borrar_ID.getText()));
                guardar.executeUpdate();
                JOptionPane.showMessageDialog(null, "Factura con la ID: " + Borrar_ID.getText() + " Eliminada");
                Borrar_ID.setText("");
                Borrar_Fecha.setText("");
            }
            catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//REGRESO
    private void Boton_Regreso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Regreso3ActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Regreso3ActionPerformed

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
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altas_FechaFacturacion;
    private javax.swing.JTextField Altas_IDCliente;
    private javax.swing.JButton Altas_Registrar;
    private javax.swing.JTextField Borrar_Fecha;
    private javax.swing.JTextField Borrar_ID;
    private javax.swing.JButton Boton_Regreso;
    private javax.swing.JButton Boton_Regreso1;
    private javax.swing.JButton Boton_Regreso2;
    private javax.swing.JButton Boton_Regreso3;
    private javax.swing.JButton Consultar_Boton;
    private javax.swing.JButton Modificar_Editar;
    private javax.swing.JTextField Modificar_Fecha;
    private javax.swing.JTextField Modificar_ID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
