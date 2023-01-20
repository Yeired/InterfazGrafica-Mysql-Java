
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
public class Proveedor extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection conexion = con.conectar();
    public Proveedor() {
        initComponents();
        setTitle("Proveedor");
        setResizable(false);
        setLocationRelativeTo(null);
                Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Altas_Nombre = new javax.swing.JTextField();
        Altas_Direccion = new javax.swing.JTextField();
        Altas_Registrar = new javax.swing.JButton();
        Boton_Regreso = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Altas_Correo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        Altas_Producto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Modificar_ID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Modificar_Nombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Modificar_Direccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Modificar_Correo = new javax.swing.JTextField();
        Modificar_Editar = new javax.swing.JButton();
        Boton_Regreso1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Modificar_Producto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Consultar_Boton = new javax.swing.JButton();
        Boton_Regreso2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("NOMBRE DEL PROVEEDOR");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("DIRECCION");

        Altas_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Altas_Direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Altas_Registrar.setBackground(new java.awt.Color(255, 102, 0));
        Altas_Registrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Altas_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Altas_Registrar.setText("AGREGAR");
        Altas_Registrar.setBorder(null);
        Altas_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altas_RegistrarActionPerformed(evt);
            }
        });

        Boton_Regreso.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Regreso.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
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
        jLabel3.setText("BASE DE DATOS - PROVEEDOR");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("MENU PRINCIPAL");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("CORREO ELECTRONICO");

        Altas_Correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("PRODUCTO");

        Altas_Producto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Altas_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(Altas_Direccion)
                                    .addComponent(Altas_Correo)
                                    .addComponent(Altas_Producto)))
                            .addComponent(jSeparator1)
                            .addComponent(Altas_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton_Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Altas_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Altas_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Altas_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Altas_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(Altas_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Altas", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("CODIGO ID:");

        Modificar_ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("NOMBRE DEL CLIENTE:");

        Modificar_Nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("DIRECCION:");

        Modificar_Direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("CORREO ELECTRONICO:");

        Modificar_Correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Modificar_Editar.setBackground(new java.awt.Color(255, 102, 0));
        Modificar_Editar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Modificar_Editar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar_Editar.setText("EDITAR");
        Modificar_Editar.setBorder(null);
        Modificar_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_EditarActionPerformed(evt);
            }
        });

        Boton_Regreso1.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Regreso1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Regreso1.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Regreso1.setText("REGRESAR");
        Boton_Regreso1.setBorder(null);
        Boton_Regreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Regreso1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setText("MENU PRINCIPAL");

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setText("PRODUCTO");

        Modificar_Producto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                            .addComponent(jLabel7)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Modificar_Producto)
                            .addComponent(Modificar_Direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                            .addComponent(Modificar_ID)
                            .addComponent(Modificar_Nombre)
                            .addComponent(Modificar_Correo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(107, 107, 107))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton_Regreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Modificar_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(Modificar_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Modificar_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Modificar_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Modificar_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(Modificar_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Boton_Regreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
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

        Consultar_Boton.setBackground(new java.awt.Color(255, 102, 0));
        Consultar_Boton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Consultar_Boton.setForeground(new java.awt.Color(255, 255, 255));
        Consultar_Boton.setText("CONSULTAR");
        Consultar_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar_BotonActionPerformed(evt);
            }
        });

        Boton_Regreso2.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Regreso2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Regreso2.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Regreso2.setText("REGRESAR");
        Boton_Regreso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Regreso2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 0));
        jLabel16.setText("MENU PRINCIPAL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Consultar_Boton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Regreso2)
                .addGap(118, 118, 118))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Boton_Regreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Consultar_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        jTabbedPane1.addTab("Consultar", jPanel3);

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
//REGRESP
    private void Boton_RegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RegresoActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_RegresoActionPerformed
// BOTON Altas_Guardar
    private void Altas_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altas_RegistrarActionPerformed
        try{
            String query="Insert INTO proveedor (Nombre_Proveedor,Direccion,Email,producto)values(?,?,?,?)";
            PreparedStatement
            guardar= conexion.prepareStatement(query);
            guardar.setString(1,Altas_Nombre.getText());
            guardar.setString(2,Altas_Direccion.getText());
            guardar.setString(3,Altas_Correo.getText());
            guardar.setString(4,Altas_Producto.getText());
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Proveedor "+Altas_Nombre.getText()+ " Registrado");
            Altas_Nombre.requestFocus();
            Altas_Nombre.setText("");
            Altas_Direccion.setText("");
            Altas_Correo.setText("");
            Altas_Producto.setText("");
        }
        catch(Exception e)
        {
            System.out.println("Error"+ e);
        }
    }//GEN-LAST:event_Altas_RegistrarActionPerformed
//BOTON Modificar-Editar
    private void Modificar_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_EditarActionPerformed
        try{
            String query="UPDATE proveedor SET Nombre_Proveedor=? ,Direccion=? ,Email=?, producto=? WHERE ID_Proveedor=?";
            PreparedStatement guardar=conexion.prepareStatement(query);
            guardar.setString(1,Modificar_Nombre.getText());
            guardar.setString(2,Modificar_Direccion.getText());
            guardar.setString(3,Modificar_Correo.getText());
            guardar.setString(4,Modificar_Producto.getText());
            guardar.setInt(5,Integer.parseInt(Modificar_ID.getText()));
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null,"CLIENTE CON LA ID "+Modificar_ID.getText()+ " FUE MODIFICADO");
            Modificar_Nombre.requestFocus();
            Modificar_Nombre.setText("");
            Modificar_ID.setText("");
            Modificar_Direccion.setText("");
            Modificar_Correo.setText("");
            Modificar_Producto.setText("");
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
        tabla.addColumn("ID_Proveedor");
        tabla.addColumn("Nombre_Proveedor");
        tabla.addColumn("Direccion");
        tabla.addColumn("Email");
        tabla.addColumn("Producto");
        jTable1.setModel(tabla);
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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altas_Correo;
    private javax.swing.JTextField Altas_Direccion;
    private javax.swing.JTextField Altas_Nombre;
    private javax.swing.JTextField Altas_Producto;
    private javax.swing.JButton Altas_Registrar;
    private javax.swing.JButton Boton_Regreso;
    private javax.swing.JButton Boton_Regreso1;
    private javax.swing.JButton Boton_Regreso2;
    private javax.swing.JButton Consultar_Boton;
    private javax.swing.JTextField Modificar_Correo;
    private javax.swing.JTextField Modificar_Direccion;
    private javax.swing.JButton Modificar_Editar;
    private javax.swing.JTextField Modificar_ID;
    private javax.swing.JTextField Modificar_Nombre;
    private javax.swing.JTextField Modificar_Producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
