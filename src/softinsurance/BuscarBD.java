package softinsurance;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BuscarBD extends javax.swing.JFrame {
    String bd=" softinsurance";
    public BuscarBD() {
        initComponents();
        setTitle("AVISO");
        setResizable(false);
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Boton_Si = new javax.swing.JButton();
        Boton_No = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Boton_Si.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Si.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Si.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Si.setText("SI, CUENTO CON ELLA");
        Boton_Si.setBorder(null);
        Boton_Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SiActionPerformed(evt);
            }
        });

        Boton_No.setBackground(new java.awt.Color(255, 102, 0));
        Boton_No.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_No.setForeground(new java.awt.Color(255, 255, 255));
        Boton_No.setText("NO, DESEO CLEARLA");
        Boton_No.setBorder(null);
        Boton_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_NoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 0));
        jLabel22.setText("¿Cuentas con la base de datos Soft-Insurance?");

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 102, 0));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos/icons8_Idea_96px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Boton_Si, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(Boton_No, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Si, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_No, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Boton SI
    private void Boton_SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SiActionPerformed
                    //JOptionPane.showMessageDialog(null, "Ingrese su usuario");
                    Login login = new Login();
                    login.setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_Boton_SiActionPerformed
//Boton no
    private void Boton_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_NoActionPerformed
        Connection con = null;
        String sFichero = "conecjson.txt";
        String servidor ="", usuario="", passwd="", puerto ="";
        File fichero = new File(sFichero);
        //generaxml xml = new generaxml();
        ConexionJson gjson = new ConexionJson();
        if (fichero.exists())
        {
            try {
                String[] retorna = new String[5];
                retorna = gjson.leejson();
                servidor=retorna[0];
                usuario=retorna[1];
                passwd=retorna[2];
                puerto=retorna[3];
            } catch (Exception ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String sURL = "jdbc:mysql://localhost:3306/";
        try{
            con = DriverManager.getConnection(sURL,usuario,passwd);
            Statement stmt = con.createStatement();
            /*stmt.execute("create user 'Admin'@'localhost' identified by 'Admin123@';");
            stmt.execute("create user 'User1'@'localhost' identified by 'User143@';");
            stmt.execute("GRANT ALL PRIVILEGES ON softinsurance . * TO 'User1'@'localhost';");
            stmt.execute("GRANT SELECT ON softinsurance . * TO 'Admin'@'localhost';");
            stmt.execute("flush privileges;");*/
            stmt.execute("create database" + bd + ";");
            JOptionPane.showMessageDialog(null,"Base datos creada correctamente");
            CreacionTablas();
            CreacionConsultas();
            Login Login= new Login();
            Login.setVisible(true);
            Login.setLocationRelativeTo(null);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error" + e);
        } finally {
            try {
                 
            } catch (Exception e) {
                System.out.println("Ocurrio este error: "+e);
                JOptionPane.showMessageDialog(null,"Error de conexiones:"+e);
            } 
        }
    }//GEN-LAST:event_Boton_NoActionPerformed
    //Crea las tablas
    public void CreacionTablas(){
    Statement stmt,stmt1,stmt2,stmt3,stmt4,stmt5,stmt6,stmt7,stmt8,stmt9,stmt10,stmt11;
        Conexion con = new Conexion();
    Connection conexion = con.conectar();
   
    //Connection conexion = con.comprueba(server, usuario, pass, puerto)
        try{
            String ejecuta = "use"+ bd + ";";
            String ejecuta1="CREATE TABLE cliente (ID_Cliente int NOT NULL AUTO_INCREMENT,Nombre_cliente varchar(40) NOT NULL,Razon_social varchar(20) NOT NULL,Direccion varchar(30) NOT NULL,Telefono varchar(16) NOT NULL,Email varchar(30) DEFAULT NULL,S_Telefono int,PRIMARY KEY(ID_Cliente));";
            String ejecuta2="CREATE TABLE producto (ID_Producto int NOT NULL AUTO_INCREMENT,Descripcion varchar(100),Precio int NOT NULL,Linea varchar(20) NOT NULL,Stock_Actual int NOT NULL,Stock_Minimo int NOT NULL,PRIMARY KEY (ID_Producto));";
            String ejecuta3="CREATE TABLE factura (ID_Factura int NOT NULL AUTO_INCREMENT,Fecha_facturacion date NOT NULL,ID_Cliente int NOT NULL,PRIMARY KEY (ID_Factura),FOREIGN KEY (ID_Cliente) REFERENCES cliente (ID_Cliente) ON DELETE CASCADE ON UPDATE CASCADE);";
            String ejecuta4="CREATE TABLE proveedor (ID_Proveedor int NOT NULL AUTO_INCREMENT,Nombre_Proveedor varchar(30) NOT NULL,Direccion varchar(30) NOT NULL,Email varchar(30) NOT NULL,producto varchar(30) NOT NULL,PRIMARY KEY (ID_Proveedor));";
            String ejecuta5="CREATE TABLE orden_compra (ID_OrdenCompra int NOT NULL AUTO_INCREMENT,Fecha_OrdCompra date NOT NULL,ID_Proveedor int,PRIMARY KEY (ID_OrdenCompra),FOREIGN KEY (ID_Proveedor) REFERENCES proveedor (ID_Proveedor) ON DELETE CASCADE ON UPDATE CASCADE);";
            String ejecuta6="CREATE TABLE detalle_orden (ID_OrdenCompra int NOT NULL,ID_Producto int NOT NULL,Cantidad int NOT NULL, FOREIGN KEY (ID_OrdenCompra) REFERENCES orden_compra (ID_OrdenCompra) ON DELETE CASCADE ON UPDATE CASCADE,FOREIGN KEY (ID_Producto) REFERENCES producto (ID_Producto) ON DELETE CASCADE ON UPDATE CASCADE);";
            String ejecuta7="CREATE TABLE usuarios (ID int NOT NULL AUTO_INCREMENT,Usuario varchar(30) NOT NULL,Password varchar(32) NOT NULL,Rango VARCHAR(15) NOT NULL,PRIMARY KEY (ID));";
            String ejecuta8="CREATE TABLE ventas (ID_Venta int NOT NULL AUTO_INCREMENT,ID_Usuario int NOT NULL,ID_Cliente int NOT NULL,Fecha date NOT NULL, PRIMARY KEY(ID_Venta), FOREIGN KEY(ID_Cliente) REFERENCES cliente(ID_Cliente) ON DELETE CASCADE ON UPDATE CASCADE,FOREIGN KEY(ID_Usuario) REFERENCES usuarios(ID) ON DELETE CASCADE ON UPDATE CASCADE);";
            String ejecuta9="CREATE TABLE det_ventas(ID_Venta int NOT NULL,ID_Producto int NOT NULL,Cant_Comprada int not null,FOREIGN KEY (ID_Producto) REFERENCES producto(ID_Producto) ON DELETE CASCADE ON UPDATE CASCADE,FOREIGN KEY (ID_Venta) REFERENCES ventas(ID_Venta) ON DELETE CASCADE ON UPDATE CASCADE);";
            String ejecuta10="CREATE TRIGGER actualizar_stockMenos AFTER INSERT ON det_ventas FOR EACH ROW UPDATE producto SET Stock_Minimo=Stock_Minimo-new.Cant_Comprada WHERE ID_Producto=new.ID_Producto;";
            String ejecuta11="CREATE TRIGGER actualizar_stockMas AFTER INSERT ON detalle_orden FOR EACH ROW UPDATE producto SET Stock_Minimo=Stock_Minimo+new.Cantidad WHERE ID_Producto=new.ID_Producto;";
            
            stmt  = conexion.prepareStatement(ejecuta);
            stmt.executeUpdate(ejecuta);
            stmt1  = conexion.prepareStatement(ejecuta1);
            stmt1.executeUpdate(ejecuta1);
            stmt2  = conexion.prepareStatement(ejecuta2);
            stmt2.executeUpdate(ejecuta2);
            stmt3  = conexion.prepareStatement(ejecuta3);
            stmt3.executeUpdate(ejecuta3);
            stmt4  = conexion.prepareStatement(ejecuta4);
            stmt4.executeUpdate(ejecuta4);
            stmt5  = conexion.prepareStatement(ejecuta5);
            stmt5.executeUpdate(ejecuta5);
            stmt6  = conexion.prepareStatement(ejecuta6);
            stmt6.executeUpdate(ejecuta6);
            stmt7  = conexion.prepareStatement(ejecuta7);
            stmt7.executeUpdate(ejecuta7);
            stmt8  = conexion.prepareStatement(ejecuta8);
            stmt8.executeUpdate(ejecuta8);
            stmt9  = conexion.prepareStatement(ejecuta9);
            stmt9.executeUpdate(ejecuta9);
            stmt10  = conexion.prepareStatement(ejecuta10);
            stmt10.executeUpdate(ejecuta10);
            stmt11  = conexion.prepareStatement(ejecuta11);
            stmt11.executeUpdate(ejecuta11);              
            
            JOptionPane.showMessageDialog(null,"Tablas creadas correctamente");
        }catch(SQLException e){
            System.out.println("Ocurrio este en la creacion de tablas error: "+e);
            JOptionPane.showMessageDialog(null,"Ocurrio este en la creacion de tablas error: "+e);
    } 
}
        //Crea las tablas
public void CreacionConsultas(){
    Statement stmt;
        Conexion con = new Conexion();
    Connection conexion = con.conectar();
        try{
            String ejecuta = "use "+ bd + ";";
            String datos = "INSERT INTO cliente (Nombre_cliente, Razon_social, Direccion, Telefono, Email, S_Telefono) VALUES ( 'Juan Carlos', 'Ninguna', 'Chimalhuacan Edo Mex', 555478564, 'lugocarlos@hotmail.com', NULL), ( 'Juan Hernandez', 'Ninguno', 'Calle independencia', 1547893621, 'juan23@gmail.com', 1578239168), ( 'Jorge Perez', 'Ninguno', 'Calle Hidalgo', 1548796435, 'Jorge376@gmail.com', 1477645239)";
            String datos2 = "insert into usuarios(Usuario,Password,Rango) values ('Eric','202cb962ac59075b964b07152d234b70','Administrador'),('DanteGA','6a972a2173dc1aa69f4d0291006d0e1d','Administrador'),('Juan','2586debc9d03ed65a24810a4b64e6feb','Usuario');";
            String datos3 = "INSERT INTO factura (Fecha_facturacion,ID_Cliente) VALUES('2021-05-21',1),('2022-11-30',2), ('2022-07-13',3);";
            String datos4 = "INSERT INTO producto (Descripcion, Precio, Linea, Stock_Actual, Stock_Minimo) VALUES ('Auto', 22000, 'Automoviles', 20, 10), ('Moto', 20000, 'Motocicleta', 25, 16), ('Camioneta', 450000, 'Camion', 15, 7);";
            String datos5 = "INSERT INTO proveedor (Nombre_Proveedor, Direccion, Email,producto) VALUES ('Roberto Salazar Martinez', 'Texcoco Edo Mex', 'jeifhern-6472@hotmail.com','autos'),('Eduardo Salazar', 'av chapultepec, cdmx', 'Edward57@gmail.com','leche'), ('Bryan Tinoco', 'Calle benito juarez', 'Bryan84@gmail.com','galletas');";
            String datos6 = "INSERT INTO orden_compra (Fecha_OrdCompra,ID_Proveedor) VALUES ('2021-06-21',1), ('2023-03-08',2), ('2023-02-10',3);";
            String datos7 = "INSERT INTO detalle_orden (ID_OrdenCompra,ID_Producto,Cantidad) VALUES(1,1,7),(2,2,9), (3,3,4);";
            String datos8 = "INSERT INTO ventas (ID_Usuario,ID_Cliente,Fecha) VALUES(1,2,'2022-07-12'),(1,3,'2022-08-21'),(1,1,'2022-10-30');";
            String datos9 = "INSERT INTO det_ventas (ID_Venta,ID_Producto,Cant_Comprada) VALUES(1,1,1),(2,2,2),(3,3,3);";
            stmt  = conexion.prepareStatement(ejecuta);
            stmt.executeUpdate(ejecuta);            
            stmt  = conexion.prepareStatement(datos);
            stmt.executeUpdate(datos);
            stmt  = conexion.prepareStatement(datos2);
            stmt.executeUpdate(datos2);
            stmt  = conexion.prepareStatement(datos3);
            stmt.executeUpdate(datos3);
            stmt  = conexion.prepareStatement(datos4);
            stmt.executeUpdate(datos4);
            stmt  = conexion.prepareStatement(datos5);
            stmt.executeUpdate(datos5);
            stmt  = conexion.prepareStatement(datos6);
            stmt.executeUpdate(datos6);
            stmt  = conexion.prepareStatement(datos7);
            stmt.executeUpdate(datos7);
            stmt  = conexion.prepareStatement(datos8);
            stmt.executeUpdate(datos8);
            stmt  = conexion.prepareStatement(datos9);
            stmt.executeUpdate(datos9);


            JOptionPane.showMessageDialog(null,"Consultas creadas correctamente");
        }catch(SQLException e){
            System.out.println("Ocurrio este en la creacion de consultas error: "+e);
            JOptionPane.showMessageDialog(null,"Ocurrio este en la creacion de consultas error: "+e);
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
            java.util.logging.Logger.getLogger(BuscarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_No;
    private javax.swing.JButton Boton_Si;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
