
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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
public class OrdenCompra extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection conexion = con.conectar();
    Statement stmt = con.sen;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public OrdenCompra() {
                Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);

        try {
            initComponents();
            setTitle("Orden de compra");
            setResizable(false);
            setLocationRelativeTo(null);
            Altas_FechaOrden.setText(dtf.format(LocalDateTime.now()));
            PreparedStatement ps = null;
            ResultSet rs = null;
            String query2="Select ID_Proveedor from proveedor";
            ps = conexion.prepareStatement(query2);
            rs=ps.executeQuery();
            while(rs.next()){
                Altas_IDProveedor.addItem(rs.getString("ID_Proveedor"));
            }
            rs.close();
            String query3="Select ID_Producto from producto";
            ps = conexion.prepareStatement(query3);
            rs=ps.executeQuery();
            while(rs.next()){
                Altas_Productos.addItem(rs.getString("ID_Producto"));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(OrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Altas_FechaOrden = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Detalles = new javax.swing.JButton();
        Altas_IDProveedor = new javax.swing.JComboBox<>();
        Comprar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ID_OrdenCompra = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Altas_Productos = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Altas_Comprar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        Boton_Regreso1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        Borrar_IDOrden1 = new javax.swing.JTextField();
        Boton_Borrar1 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        Altas_Registrar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Modificar_IDOrdenCompra = new javax.swing.JTextField();
        Modificar_FechaOrden = new javax.swing.JTextField();
        Modificar_Editar = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        Boton_Regreso3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(710, 442));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("ORDEN DE COMPRAS");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("PROVEEDOR");

        Altas_FechaOrden.setBackground(new java.awt.Color(255, 255, 255));
        Altas_FechaOrden.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_FechaOrden.setBorder(null);
        Altas_FechaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altas_FechaOrdenActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("FECHA DE ORDEN");

        Detalles.setBackground(new java.awt.Color(255, 102, 0));
        Detalles.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Detalles.setForeground(new java.awt.Color(255, 255, 255));
        Detalles.setText("MOSTRAR DETALLES");
        Detalles.setBorder(null);
        Detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetallesActionPerformed(evt);
            }
        });

        Altas_IDProveedor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_IDProveedor.setForeground(new java.awt.Color(255, 102, 0));
        Altas_IDProveedor.setBorder(null);
        Altas_IDProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altas_IDProveedorActionPerformed(evt);
            }
        });
        Altas_IDProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Altas_IDProveedorKeyPressed(evt);
            }
        });

        Comprar.setBackground(new java.awt.Color(255, 102, 0));
        Comprar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Comprar.setForeground(new java.awt.Color(255, 255, 255));
        Comprar.setText("Guardar");
        Comprar.setBorder(null);
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("FOLIO");

        ID_OrdenCompra.setBackground(new java.awt.Color(255, 255, 255));
        ID_OrdenCompra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ID_OrdenCompra.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("PRODUCTO");

        Altas_Productos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_Productos.setForeground(new java.awt.Color(255, 102, 0));
        Altas_Productos.setBorder(null);
        Altas_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altas_ProductosActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("CANTIDAD:");

        Altas_Comprar.setBackground(new java.awt.Color(255, 255, 255));
        Altas_Comprar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_Comprar.setBorder(null);
        Altas_Comprar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Altas_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altas_ComprarActionPerformed(evt);
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

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("MENU PRINCIPAL");
        jLabel14.setToolTipText("");

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

        jLabel5.setText("proveedor");

        jLabel8.setText("producto");

        jSeparator5.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator5.setForeground(new java.awt.Color(255, 102, 0));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setText("ID ORDEN DE COMPRA");

        Borrar_IDOrden1.setBackground(new java.awt.Color(255, 255, 255));
        Borrar_IDOrden1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Borrar_IDOrden1.setBorder(null);

        Boton_Borrar1.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Borrar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Borrar1.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Borrar1.setText(" BORRAR");
        Boton_Borrar1.setBorder(null);
        Boton_Borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Borrar1ActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator6.setForeground(new java.awt.Color(255, 102, 0));

        Altas_Registrar1.setBackground(new java.awt.Color(255, 102, 0));
        Altas_Registrar1.setForeground(new java.awt.Color(255, 255, 255));
        Altas_Registrar1.setText(">>");
        Altas_Registrar1.setBorder(null);
        Altas_Registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Altas_Registrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Borrar_IDOrden1)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton_Regreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(Boton_Borrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Altas_IDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Altas_FechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator2))
                            .addComponent(Altas_Registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ID_OrdenCompra))
                            .addComponent(jSeparator4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(35, 35, 35)
                                        .addComponent(Altas_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Altas_Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator3))))
                .addGap(129, 129, 129))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator5)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Altas_FechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(ID_OrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Altas_IDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Altas_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Altas_Registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Altas_Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Borrar_IDOrden1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Borrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Detalles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Boton_Regreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Alta", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("ID ORDEN COMPRA");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("FECHA DE ORDEN");

        Modificar_IDOrdenCompra.setBackground(new java.awt.Color(255, 255, 255));
        Modificar_IDOrdenCompra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Modificar_IDOrdenCompra.setForeground(new java.awt.Color(255, 102, 0));
        Modificar_IDOrdenCompra.setBorder(null);

        Modificar_FechaOrden.setBackground(new java.awt.Color(255, 255, 255));
        Modificar_FechaOrden.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Modificar_FechaOrden.setBorder(null);
        Modificar_FechaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_FechaOrdenActionPerformed(evt);
            }
        });

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

        jSeparator7.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator7.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator8.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator8.setForeground(new java.awt.Color(255, 102, 0));

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

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setText("MENU PRINCIPAL");
        jLabel15.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(Modificar_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Modificar_IDOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Modificar_FechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(330, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton_Regreso3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Modificar_IDOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Modificar_FechaOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(Boton_Regreso3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Boton Modificar
    private void Modificar_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_EditarActionPerformed
        try{
            String query="UPDATE orden_compra SET Fecha_OrdCompra=?,Estado=?,Fecha_Estado=? WHERE ID_OrdenCompra=?";
            PreparedStatement guardar=conexion.prepareStatement(query);
            guardar.setString(1,Modificar_FechaOrden.getText());

            guardar.setInt(4,Integer.parseInt(Modificar_IDOrdenCompra.getText()));
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null,"La orden con la ID: "+ Modificar_IDOrdenCompra.getText()+ " Fue modificado");
            Modificar_IDOrdenCompra.requestFocus();
            Modificar_IDOrdenCompra.setText("");
            Modificar_FechaOrden.setText("");

        }
        catch(Exception e){
            System.out.println("Error"+ e);
        }
    }//GEN-LAST:event_Modificar_EditarActionPerformed

    private void Modificar_FechaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_FechaOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modificar_FechaOrdenActionPerformed

    private void Boton_Borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Borrar1ActionPerformed
        int opcion = -1;
        opcion = JOptionPane.showConfirmDialog(null, "¿Realmente desea borrar el producto?","Confirmar borrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            try {
                String query = "DELETE from orden_compra WHERE ID_OrdenCompra=?";
                PreparedStatement guardar = conexion.prepareStatement(query);
                guardar.setInt(1, Integer.parseInt(Borrar_IDOrden1.getText()));
                guardar.executeUpdate();
                JOptionPane.showMessageDialog(null, "La orden con la ID: " + Borrar_IDOrden1.getText() + "Fue eliminado");
                Borrar_IDOrden1.setText("");
            }
            catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
    }//GEN-LAST:event_Boton_Borrar1ActionPerformed

    private void Boton_Regreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Regreso1ActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Regreso1ActionPerformed

    private void Altas_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altas_ComprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Altas_ComprarActionPerformed

    private void Altas_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altas_ProductosActionPerformed
        // TODO add your handling code here:
        buscarprod(Altas_Productos.getSelectedItem().toString());
    }//GEN-LAST:event_Altas_ProductosActionPerformed

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        try{
            String query="INSERT INTO detalle_orden (ID_OrdenCompra,ID_Producto,Cantidad) VALUES (?,?,?)";
            PreparedStatement guardar = null;
            guardar=conexion.prepareStatement(query);

            guardar.setInt(1,Integer.parseInt(ID_OrdenCompra.getText()));
            guardar.setInt(2,Integer.parseInt(Altas_Productos.getSelectedItem().toString()));
            guardar.setInt(3,Integer.parseInt(Altas_Comprar.getText()));
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Compra exitosa");
            ID_OrdenCompra.setText("");
            Altas_Comprar.setText("");

        }
        catch(Exception e)
        {
            System.out.println("Error"+ e);
        }
    }//GEN-LAST:event_ComprarActionPerformed

    private void Altas_IDProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Altas_IDProveedorKeyPressed

    }//GEN-LAST:event_Altas_IDProveedorKeyPressed

    private void Altas_IDProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altas_IDProveedorActionPerformed
        // TODO add your handling code here:
        //jLabel5.setText(Altas_IDProveedor.getSelectedItem().toString());
        buscarprov(Altas_IDProveedor.getSelectedItem().toString());
    }//GEN-LAST:event_Altas_IDProveedorActionPerformed

    private void DetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetallesActionPerformed
        Detalle detalles = new Detalle();
        detalles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DetallesActionPerformed

    private void Altas_FechaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altas_FechaOrdenActionPerformed

        Altas_FechaOrden.setText(dtf.format(LocalDateTime.now()));
    }//GEN-LAST:event_Altas_FechaOrdenActionPerformed

    private void Boton_Regreso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Regreso3ActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Regreso3ActionPerformed

    private void Altas_Registrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altas_Registrar1ActionPerformed
        try{
            //String query="INSERT INTO orden_compra (Fecha_OrdCompra,ID_Proveedor) VALUES (?,?)";
            String fecha=Altas_FechaOrden.getText();
            String prove=Altas_IDProveedor.getSelectedItem().toString();
            PreparedStatement guardar = null;
            int id=0;
            String query="INSERT INTO orden_compra (Fecha_OrdCompra,ID_Proveedor)values('" +fecha + "','" + prove + "')";
            stmt = con.conectar().prepareStatement(query); 
            Altas_FechaOrden.setText("");
            stmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
                JOptionPane.showMessageDialog(null,"Venta agregada");
                id=rs.getInt(1);               
                ID_OrdenCompra.setText(String.valueOf(id));
            }
        }
        catch(Exception e)
        {
            System.out.println("Error"+ e);
        }
    }//GEN-LAST:event_Altas_Registrar1ActionPerformed
    public void buscarprov(String idprov){
        
        try {
            String sql1 ="select * from proveedor where ID_Proveedor='"+idprov+"'";
            stmt = con.conectar().prepareStatement(sql1);
            ResultSet rs = stmt.executeQuery(sql1);
            if(rs!=null && rs.next())
            {
                jLabel5.setText(rs.getString("Nombre_Proveedor"));  
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void buscarprod(String idprod){
        
        try {
            String sql1 ="select * from producto where ID_Producto='"+idprod+"'";
            stmt = con.conectar().prepareStatement(sql1);
            ResultSet rs = stmt.executeQuery(sql1);
            if(rs!=null && rs.next())
            {
                jLabel8.setText(rs.getString("Descripcion")); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdenCompra.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(OrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdenCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdenCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altas_Comprar;
    private javax.swing.JTextField Altas_FechaOrden;
    private javax.swing.JComboBox<String> Altas_IDProveedor;
    private javax.swing.JComboBox<String> Altas_Productos;
    private javax.swing.JButton Altas_Registrar1;
    private javax.swing.JTextField Borrar_IDOrden1;
    private javax.swing.JButton Boton_Borrar1;
    private javax.swing.JButton Boton_Regreso1;
    private javax.swing.JButton Boton_Regreso3;
    private javax.swing.JButton Comprar;
    private javax.swing.JButton Detalles;
    private javax.swing.JTextField ID_OrdenCompra;
    private javax.swing.JButton Modificar_Editar;
    private javax.swing.JTextField Modificar_FechaOrden;
    private javax.swing.JTextField Modificar_IDOrdenCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
