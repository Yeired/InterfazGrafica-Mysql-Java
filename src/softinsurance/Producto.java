package softinsurance;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.security.*;
import java.math.BigInteger;
public class Producto extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection conexion = con.conectar();
public Producto() {
        initComponents();
        setTitle("Productos");
        setResizable(false);
        setLocationRelativeTo(null);
                Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Altas_Descripcion = new javax.swing.JTextField();
        Altas_Precio = new javax.swing.JTextField();
        Altas_Linea = new javax.swing.JTextField();
        Altas_Agregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Boton_Regreso = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaT = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Altas_StockActual = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Altas_Minimo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Modificar_ID = new javax.swing.JTextField();
        Modificar_Precio = new javax.swing.JTextField();
        Modificar_Actual = new javax.swing.JTextField();
        Boton_Modificar = new javax.swing.JButton();
        Boton_Regreso1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Boton_Borrar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Borrar_ID = new javax.swing.JTextField();
        Boton_Regreso3 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("DESCRIPCION:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("PRECIO:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("BASE DE DATOS - PRODUCTOS");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("LINEA:");

        Altas_Descripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Altas_Precio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Altas_Linea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Altas_Agregar.setBackground(new java.awt.Color(255, 102, 0));
        Altas_Agregar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Altas_Agregar.setText("AGREGAR");
        Altas_Agregar.setBorder(null);
        Altas_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altas_AgregarActionPerformed(evt);
            }
        });

        Boton_Regreso.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Regreso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Regreso.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Regreso.setText("REGRESAR");
        Boton_Regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RegresoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 0));
        jLabel17.setText("MENU PRINCIPAL");

        TablaT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaT);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("STOCK ACTUAL");

        Altas_StockActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("STOCK MINIMO");

        Altas_Minimo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CONSULTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(67, 67, 67)
                                .addComponent(Altas_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Altas_Linea, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Altas_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(Altas_StockActual, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Altas_Minimo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Altas_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(Boton_Regreso)
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton1))))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Altas_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Altas_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(Altas_StockActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(Altas_Minimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Altas_Linea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Altas_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(Boton_Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Altas", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("CODIGO ID:");

        jLabel8.setText("PRECIO:");

        jLabel11.setText("STOCK MINIMO:");

        Modificar_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_PrecioActionPerformed(evt);
            }
        });

        Modificar_Actual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_ActualActionPerformed(evt);
            }
        });

        Boton_Modificar.setText("MODIFICAR");
        Boton_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ModificarActionPerformed(evt);
            }
        });

        Boton_Regreso1.setText("REGRESAR");
        Boton_Regreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Regreso1ActionPerformed(evt);
            }
        });

        jLabel18.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(Boton_Modificar))
                .addGap(118, 118, 118)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_Regreso1))
                    .addComponent(Modificar_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(Modificar_Precio)
                    .addComponent(Modificar_Actual))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modificar_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Modificar_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Modificar_Actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(Boton_Regreso1))
                    .addComponent(Boton_Modificar))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        Boton_Borrar.setText(" BORRAR");
        Boton_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_BorrarActionPerformed(evt);
            }
        });

        jLabel13.setText("CODIGO ID:");

        Boton_Regreso3.setText("REGRESAR");
        Boton_Regreso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Regreso3ActionPerformed(evt);
            }
        });

        jLabel20.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(Boton_Borrar))
                .addGap(139, 139, 139)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_Regreso3))
                    .addComponent(Borrar_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(Borrar_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(Boton_Regreso3))
                    .addComponent(Boton_Borrar))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Borrar", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Modificar_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificar_PrecioActionPerformed

    private void Modificar_ActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_ActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificar_ActualActionPerformed
// BOTON ALTAS_AGREGAR 
    private void Altas_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altas_AgregarActionPerformed
        
        try{
           String query="Insert INTO producto (Descripcion,Precio,Linea,Stock_Actual,Stock_Minimo)values(?,?,?,?,?)";
           PreparedStatement
           guardar=conexion.prepareStatement(query);
           guardar.setString(1,Altas_Descripcion.getText());
           guardar.setDouble(2,Double.parseDouble(Altas_Precio.getText()));
           guardar.setString(3,Altas_Linea.getText());
           guardar.setString(4,Altas_StockActual.getText());
           guardar.setString(5,Altas_Minimo.getText());
           guardar.executeUpdate();
           JOptionPane.showMessageDialog(null,"Producto "+Altas_Descripcion.getText()+ " Registrado");
           Altas_Descripcion.requestFocus();
           Altas_Descripcion.setText("");
           Altas_Precio.setText("");
           Altas_Linea.setText("");
           Altas_Minimo.setText("");
           Altas_StockActual.setText("");
           
           
       }
       catch(Exception e)
       {
           System.out.println("Error"+ e);
       }
    }//GEN-LAST:event_Altas_AgregarActionPerformed
// Modificar-Modificar
    private void Boton_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ModificarActionPerformed
    try{
        String query="UPDATE producto SET Precio=? , Stock_Minimo=? WHERE ID_Producto=?";
        PreparedStatement guardar=conexion.prepareStatement(query);
        //guardar.setString(1,Modificar_Descripcion.getText());
        guardar.setDouble(1,Double.parseDouble(Modificar_Precio.getText()));
        //guardar.setString(3,Modificar_Linea.getText());
        guardar.setString(2,Modificar_Actual.getText());
        //guardar.setString(5,Modificar_Minimo.getText());
        guardar.setInt(3,Integer.parseInt(Modificar_ID.getText()));
        guardar.executeUpdate();
        JOptionPane.showMessageDialog(null,"Producto con la ID: "+Modificar_ID.getText()+ " fue modificado");
        //Modificar_Descripcion.requestFocus();
        //Modificar_Descripcion.setText("");
        Modificar_ID.setText("");
        Modificar_Precio.setText("");
        //Modificar_Linea.setText("");
        Modificar_Actual.setText("");
    }
    catch(Exception e){
        System.out.println("Error"+ e);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_ModificarActionPerformed
//borrar
    private void Boton_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_BorrarActionPerformed
        int opcion = -1;
        opcion = JOptionPane.showConfirmDialog(null, "¿Realmente desea borrar el producto?","Confirmar borrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            try {
                String query = "DELETE from producto WHERE ID_Producto=?";
                PreparedStatement guardar = conexion.prepareStatement(query);
                guardar.setInt(1, Integer.parseInt(Borrar_ID.getText()));
                guardar.executeUpdate();
                JOptionPane.showMessageDialog(null, "Producto con la id: " + Borrar_ID.getText() + " Eliminado");
                Borrar_ID.setText("");
            }
            catch (Exception e) {
                System.out.println("Error" + e);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_BorrarActionPerformed
//Regreso
    private void Boton_RegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RegresoActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_RegresoActionPerformed
//Regreso
    private void Boton_Regreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Regreso1ActionPerformed
             Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Regreso1ActionPerformed

    private void Boton_Regreso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Regreso3ActionPerformed
           Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Regreso3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         DefaultTableModel tabla=new DefaultTableModel();
            tabla.addColumn("ID Producto");
            tabla.addColumn("Descripcion");
            tabla.addColumn("Precio");
            tabla.addColumn("Linea");
            tabla.addColumn("Stock Minimo");
            tabla.addColumn("Stock Actua");
            TablaT.setModel(tabla);
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
                jTable1.setModel(tabla);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Altas_Agregar;
    private javax.swing.JTextField Altas_Descripcion;
    private javax.swing.JTextField Altas_Linea;
    private javax.swing.JTextField Altas_Minimo;
    private javax.swing.JTextField Altas_Precio;
    private javax.swing.JTextField Altas_StockActual;
    private javax.swing.JTextField Borrar_ID;
    private javax.swing.JButton Boton_Borrar;
    private javax.swing.JButton Boton_Modificar;
    private javax.swing.JButton Boton_Regreso;
    private javax.swing.JButton Boton_Regreso1;
    private javax.swing.JButton Boton_Regreso3;
    private javax.swing.JTextField Modificar_Actual;
    private javax.swing.JTextField Modificar_ID;
    private javax.swing.JTextField Modificar_Precio;
    private javax.swing.JTable TablaT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
