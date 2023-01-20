
package softinsurance;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Ventas extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection conexion = con.conectar();
    Statement stmt = con.sen;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public Ventas() {
                Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);
     
        try {
            initComponents();
            setTitle("Ventas");
            setResizable(false);
            setLocationRelativeTo(null);
            Altas_Fecha.setText(dtf.format(LocalDateTime.now()));
            PreparedStatement ps = null;
            ResultSet rs = null;
            String query3="Select ID_Producto from producto";
            ps = conexion.prepareStatement(query3);
            rs=ps.executeQuery();
            while(rs.next()){
                ID_Producto.addItem(rs.getString("ID_Producto"));
            }
            rs.close();
            String query2="Select ID from usuarios";
            ps = conexion.prepareStatement(query2);
            rs=ps.executeQuery();
            while(rs.next()){
                ID_User.addItem(rs.getString("ID"));
            }
            rs.close();
            String query4="Select ID_Cliente from cliente";
            ps = conexion.prepareStatement(query4);
            rs=ps.executeQuery();
            while(rs.next()){
                ID_Cliente.addItem(rs.getString("ID_Cliente"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Consultar_Ventas = new javax.swing.JButton();
        Boton_Regreso = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        ID_Venta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ID_Producto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ID_User = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ID_Cliente = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Altas_Fecha = new javax.swing.JTextField();
        Agregar_Ventas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(691, 500));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 102, 0));
        jLabel18.setText("BASE DE DATOS - VENTAS");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("CANTIDAD");

        Cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });

        Agregar.setBackground(new java.awt.Color(255, 102, 0));
        Agregar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("AGREGAR");
        Agregar.setBorder(null);
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Consultar_Ventas.setBackground(new java.awt.Color(255, 102, 0));
        Consultar_Ventas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Consultar_Ventas.setForeground(new java.awt.Color(255, 255, 255));
        Consultar_Ventas.setText("CONSULTAR VENTAS");
        Consultar_Ventas.setBorder(null);
        Consultar_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar_VentasActionPerformed(evt);
            }
        });

        Boton_Regreso.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Regreso.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Boton_Regreso.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Regreso.setText("REGRESAR");
        Boton_Regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RegresoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("MENU PRINCIPAL");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Tabla);

        ID_Venta.setBorder(null);
        ID_Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_VentaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("FOLIO");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("ID PRODUCTO");

        ID_Producto.setBorder(null);
        ID_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_ProductoActionPerformed(evt);
            }
        });

        jLabel2.setText("Producto");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("USUARIO");

        ID_User.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ID_User.setBorder(null);
        ID_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_UserActionPerformed(evt);
            }
        });

        jLabel7.setText("User");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("CLIENTE");

        ID_Cliente.setBorder(null);
        ID_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ID_ClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("Cliente");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("FECHA");

        Altas_Fecha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_Fecha.setBorder(null);

        Agregar_Ventas.setBackground(new java.awt.Color(255, 102, 0));
        Agregar_Ventas.setForeground(new java.awt.Color(255, 255, 255));
        Agregar_Ventas.setText(">>");
        Agregar_Ventas.setBorder(null);
        Agregar_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_VentasActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator2.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator3.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator4.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Consultar_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36)
                        .addComponent(Boton_Regreso)))
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel18)
                        .addComponent(Agregar_Ventas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(ID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(ID_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(102, 102, 102)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(Altas_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Cantidad))
                    .addComponent(jSeparator3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(ID_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ID_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(135, 135, 135))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ID_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(ID_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(ID_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Agregar_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Altas_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Consultar_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane2.addTab("Ventas", jPanel3);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void buscarprod(String idprod){
        
        try {
            String sql1 ="select * from producto where ID_Producto='"+idprod+"'";
            stmt = con.conectar().prepareStatement(sql1);
            ResultSet rs = stmt.executeQuery(sql1);
            if(rs!=null && rs.next())
            {
                jLabel2.setText(rs.getString("Descripcion")); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscaruser(String iduser){
        
        try {
            String sql1 ="select * from usuarios where ID='"+iduser+"'";
            stmt = con.conectar().prepareStatement(sql1);
            ResultSet rs = stmt.executeQuery(sql1);
            if(rs!=null && rs.next())
            {
                jLabel7.setText(rs.getString("Usuario")); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarcliente(String idcliente){
        
        try {
            String sql1 ="select * from cliente where ID_Cliente='"+idcliente+"'";
            stmt = con.conectar().prepareStatement(sql1);
            ResultSet rs = stmt.executeQuery(sql1);
            if(rs!=null && rs.next())
            {
                jLabel9.setText(rs.getString("Nombre_cliente")); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        try{
            String query="Insert INTO det_ventas(ID_Venta,ID_Producto,Cant_Comprada)values(?,?,?)";
            PreparedStatement
            guardar=conexion.prepareStatement(query);
            guardar.setInt(1,Integer.parseInt(ID_Venta.getText()));
            //guardar.setString(1,ID_Proveedor.getText());
            //guardar.setString(2,Cantidad.getText());
            guardar.setInt(2,Integer.parseInt(ID_Producto.getSelectedItem().toString()));
            guardar.setDouble(3,Double.parseDouble(Cantidad.getText()));
            //guardar.setInt(2,Integer.parseInt(Cantidad.getText()));
            
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Venta Realizada");
            Cantidad.requestFocus();
            Cantidad.setText("");
            ID_Venta.setText("");
        }
        catch(Exception e)
        {
            System.out.println("Error"+ e);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

    private void Consultar_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar_VentasActionPerformed
    DefaultTableModel tabla=new DefaultTableModel();
    tabla.addColumn("ID_Venta");
    tabla.addColumn("ID_Usuario");
    tabla.addColumn("ID_Cliente");
    tabla.addColumn("Fecha");
   Tabla.setModel(tabla);
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
                Tabla.setModel(tabla);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Consultar_VentasActionPerformed

    private void Boton_RegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RegresoActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_RegresoActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void ID_VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_VentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ID_VentaActionPerformed

    private void ID_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_ProductoActionPerformed
        // TODO add your handling code here:
        buscarprod(ID_Producto.getSelectedItem().toString());
    }//GEN-LAST:event_ID_ProductoActionPerformed

    private void ID_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_UserActionPerformed
        // TODO add your handling code here:
        buscaruser(ID_User.getSelectedItem().toString());
    }//GEN-LAST:event_ID_UserActionPerformed

    private void ID_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ID_ClienteActionPerformed
        // TODO add your handling code here:
        buscarcliente(ID_Cliente.getSelectedItem().toString());
    }//GEN-LAST:event_ID_ClienteActionPerformed

    private void Agregar_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_VentasActionPerformed
        try{
            //String query="Insert INTO ventas(ID_Usuario,ID_Cliente,Fecha)values(?,?,?)";
            String user=ID_User.getSelectedItem().toString();
            String cliente=ID_Cliente.getSelectedItem().toString();
            String fecha=Altas_Fecha.getText();
            PreparedStatement guardar = null;
            int id=0;
            String query="Insert INTO ventas(ID_Usuario,ID_Cliente,Fecha)values('" +user + "','" + cliente + "','" + fecha + "')";
            stmt = con.conectar().prepareStatement(query); 
            Altas_Fecha.setText("");
            stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
                JOptionPane.showMessageDialog(null,"Venta agregada");
                id=rs.getInt(1);               
                ID_Venta.setText(String.valueOf(id));
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+ e);
        }
    }//GEN-LAST:event_Agregar_VentasActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Agregar_Ventas;
    private javax.swing.JTextField Altas_Fecha;
    private javax.swing.JButton Boton_Regreso;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JButton Consultar_Ventas;
    private javax.swing.JComboBox<String> ID_Cliente;
    private javax.swing.JComboBox<String> ID_Producto;
    private javax.swing.JComboBox<String> ID_User;
    private javax.swing.JTextField ID_Venta;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
