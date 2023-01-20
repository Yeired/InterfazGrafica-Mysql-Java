package softinsurance;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ClienteBD extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection conexion = con.conectar();
    public ClienteBD() {
        initComponents();
        setTitle("Cliente");
        setResizable(false);
        setLocationRelativeTo(null);
                Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Altas_Nombre = new javax.swing.JTextField();
        Altas_Razon = new javax.swing.JTextField();
        Altas_Direccion = new javax.swing.JTextField();
        Altas_Telefono = new javax.swing.JTextField();
        Altas_Correo = new javax.swing.JTextField();
        Altas_Registrar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Boton_Regreso = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Modificar_ID = new javax.swing.JTextField();
        Modificar_Nombre = new javax.swing.JTextField();
        Modificar_Razon = new javax.swing.JTextField();
        Modificar_Direccion = new javax.swing.JTextField();
        Modificar_Telefono = new javax.swing.JTextField();
        Modificar_Correo = new javax.swing.JTextField();
        Modificar_Editar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Boton_Regreso3 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Consultar_Boton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Boton_Regreso2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Borrar_Boton = new javax.swing.JButton();
        Borrar_ID = new javax.swing.JTextField();
        Borrar_Nombre = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        Boton_Regreso4 = new javax.swing.JButton();

        jSeparator4.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 102, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("NOMBRE DEL CLIENTE");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("RAZON SOCIAL");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("DIRECCION");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("TELEFONO");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("EMAIL");

        Altas_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Altas_Nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Altas_Nombre.setBorder(null);

        Altas_Razon.setBackground(new java.awt.Color(255, 255, 255));
        Altas_Razon.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_Razon.setForeground(new java.awt.Color(0, 0, 0));
        Altas_Razon.setBorder(null);

        Altas_Direccion.setBackground(new java.awt.Color(255, 255, 255));
        Altas_Direccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_Direccion.setForeground(new java.awt.Color(0, 0, 0));
        Altas_Direccion.setBorder(null);

        Altas_Telefono.setBackground(new java.awt.Color(255, 255, 255));
        Altas_Telefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_Telefono.setForeground(new java.awt.Color(0, 0, 0));
        Altas_Telefono.setBorder(null);
        Altas_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Altas_TelefonoKeyTyped(evt);
            }
        });

        Altas_Correo.setBackground(new java.awt.Color(255, 255, 255));
        Altas_Correo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Altas_Correo.setForeground(new java.awt.Color(0, 0, 0));
        Altas_Correo.setBorder(null);

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

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("MENU PRINCIPAL");
        jLabel14.setToolTipText("");

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

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 102, 0));
        jLabel18.setText("CLIENTES");

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator2.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator3.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator5.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator5.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator6.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator6.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator7.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator7.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Altas_Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Altas_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Altas_Razon, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Altas_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Altas_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Altas_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(Altas_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Altas_Razon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Altas_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Altas_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Altas_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Altas_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Boton_Regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        jTabbedPane1.addTab("Altas", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("CODIGO ID:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("NOMBRE DEL CLIENTE:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("RAZON SOCIAL");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("DIRECCION:");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("TELEFONO:");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("CORREO ELECTRONICO:");

        Modificar_ID.setBackground(new java.awt.Color(255, 255, 255));
        Modificar_ID.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Modificar_ID.setForeground(new java.awt.Color(0, 0, 0));
        Modificar_ID.setBorder(null);

        Modificar_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Modificar_Nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Modificar_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Modificar_Nombre.setBorder(null);

        Modificar_Razon.setBackground(new java.awt.Color(255, 255, 255));
        Modificar_Razon.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Modificar_Razon.setForeground(new java.awt.Color(0, 0, 0));
        Modificar_Razon.setBorder(null);

        Modificar_Direccion.setBackground(new java.awt.Color(255, 255, 255));
        Modificar_Direccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Modificar_Direccion.setForeground(new java.awt.Color(0, 0, 0));
        Modificar_Direccion.setBorder(null);

        Modificar_Telefono.setBackground(new java.awt.Color(255, 255, 255));
        Modificar_Telefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Modificar_Telefono.setForeground(new java.awt.Color(0, 0, 0));
        Modificar_Telefono.setBorder(null);
        Modificar_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Modificar_TelefonoKeyTyped(evt);
            }
        });

        Modificar_Correo.setBackground(new java.awt.Color(255, 255, 255));
        Modificar_Correo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Modificar_Correo.setForeground(new java.awt.Color(0, 0, 0));
        Modificar_Correo.setBorder(null);

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

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 102, 0));
        jLabel17.setText("MENU PRINCIPAL");
        jLabel17.setToolTipText("");

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

        jSeparator10.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator10.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator11.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator11.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator12.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator12.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator13.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator13.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator14.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator14.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator15.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator15.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                        .addComponent(Modificar_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(Modificar_Correo))))
                            .addComponent(jSeparator11)
                            .addComponent(jSeparator13)
                            .addComponent(jSeparator15)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(Modificar_ID))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Modificar_Razon))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Modificar_Direccion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(Modificar_Telefono)))
                        .addGap(98, 98, 98))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Modificar_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton_Regreso3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Modificar_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Modificar_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Modificar_Razon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Modificar_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Modificar_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Modificar_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Modificar_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Boton_Regreso3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 102, 0));
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
        Consultar_Boton.setBorder(null);
        Consultar_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar_BotonActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 0));
        jLabel16.setText("MENU PRINCIPAL");
        jLabel16.setToolTipText("");

        Boton_Regreso2.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Regreso2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Regreso2.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Regreso2.setText("REGRESAR");
        Boton_Regreso2.setBorder(null);
        Boton_Regreso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Regreso2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Consultar_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_Regreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(Boton_Regreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Consultar_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Consultar", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setText("CODIGO ID:");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setText("NOMBRE DEL CLIENTE:");

        Borrar_Boton.setBackground(new java.awt.Color(255, 102, 0));
        Borrar_Boton.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Borrar_Boton.setForeground(new java.awt.Color(255, 255, 255));
        Borrar_Boton.setText("BORRAR");
        Borrar_Boton.setBorder(null);
        Borrar_Boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar_BotonActionPerformed(evt);
            }
        });

        Borrar_ID.setBackground(new java.awt.Color(255, 255, 255));
        Borrar_ID.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Borrar_ID.setForeground(new java.awt.Color(0, 0, 0));
        Borrar_ID.setBorder(null);

        Borrar_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Borrar_Nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Borrar_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Borrar_Nombre.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator8.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator9.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator9.setForeground(new java.awt.Color(255, 102, 0));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 0));
        jLabel19.setText("MENU PRINCIPAL");
        jLabel19.setToolTipText("");

        Boton_Regreso4.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Regreso4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Regreso4.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Regreso4.setText("REGRESAR");
        Boton_Regreso4.setBorder(null);
        Boton_Regreso4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Regreso4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_Regreso4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Borrar_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Borrar_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator8)
                        .addComponent(jSeparator9)
                        .addComponent(Borrar_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Borrar_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Borrar_Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(Borrar_Boton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(Boton_Regreso4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Borrar", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Panel Altas_Cliente
    private void Altas_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Altas_RegistrarActionPerformed
        try{
           String query="Insert INTO cliente (Nombre_cliente,Razon_social,Direccion,Telefono,Email)values(?,?,?,?,?)";
           PreparedStatement
           guardar=conexion.prepareStatement(query);
           guardar.setString(1,Altas_Nombre.getText());
           guardar.setString(2,Altas_Razon.getText());
           guardar.setString(3,Altas_Direccion.getText());
           guardar.setDouble(4,Double.parseDouble(Altas_Telefono.getText()));
           guardar.setString(5,Altas_Correo.getText());
           guardar.executeUpdate();
           JOptionPane.showMessageDialog(null,"Cliente "+Altas_Nombre.getText()+ " Registrado");
           Altas_Nombre.requestFocus();
           Altas_Nombre.setText("");
           Altas_Razon.setText("");
           Altas_Direccion.setText("");
           Altas_Telefono.setText("");
           Altas_Correo.setText("");
       }
       catch(Exception e)
       {
           System.out.println("Error"+ e);
       }
    }//GEN-LAST:event_Altas_RegistrarActionPerformed
//Modficar - Editar
    private void Modificar_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_EditarActionPerformed
    try{
        String query="UPDATE cliente SET Nombre_cliente=? , Razon_social=?, Direccion=? , Telefono=? , Email=? WHERE ID_Cliente=?";
        PreparedStatement guardar=conexion.prepareStatement(query);
        guardar.setString(1,Modificar_Nombre.getText());
        guardar.setString(2,Modificar_Razon.getText());
        guardar.setString(3,Modificar_Direccion.getText());
        guardar.setDouble(4,Double.parseDouble(Modificar_Telefono.getText()));
        guardar.setString(5,Modificar_Correo.getText());
        guardar.setInt(6,Integer.parseInt(Modificar_ID.getText()));
        guardar.executeUpdate();
        JOptionPane.showMessageDialog(null,"CLIENTE CON LA ID "+Modificar_ID.getText()+ " FUE MODIFICADO");
        Modificar_Nombre.requestFocus();
        Modificar_Nombre.setText("");
        Modificar_ID.setText("");
        Modificar_Razon.setText("");
        Modificar_Direccion.setText("");
        Modificar_Telefono.setText("");
        Modificar_Correo.setText("");
    }
    catch(Exception e){
        System.out.println("Error"+ e);
    }        
    }//GEN-LAST:event_Modificar_EditarActionPerformed
//CONSULTAR - CONSULTA
    private void Consultar_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar_BotonActionPerformed
    DefaultTableModel tabla=new DefaultTableModel();
    tabla.addColumn("ID_Cliente");
    tabla.addColumn("Nombre_cliente");
    tabla.addColumn("Razon_social");
    tabla.addColumn("Direccion");
    tabla.addColumn("Telefono");
    tabla.addColumn("Email");
    jTable1.setModel(tabla);
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
                jTable1.setModel(tabla);
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
    }//GEN-LAST:event_Consultar_BotonActionPerformed
// BORRAR - BOTON BORRAR
    private void Borrar_BotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar_BotonActionPerformed
        int opcion = -1;
        opcion = JOptionPane.showConfirmDialog(null, "¿Realmente desea borrar el cliente","Confirmar borrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opcion == 0) {
            try {
                String query = "DELETE from cliente WHERE ID_Cliente=?";
                PreparedStatement guardar = conexion.prepareStatement(query);
                guardar.setInt(1, Integer.parseInt(Borrar_ID.getText()));
                guardar.executeUpdate();
                JOptionPane.showMessageDialog(null, "CLIENTE " + Borrar_Nombre.getText() + " ELIMINADO");
                Borrar_ID.setText("");
                Borrar_Nombre.setText("");
            }
            catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
    }//GEN-LAST:event_Borrar_BotonActionPerformed
//Boton Regreso
    private void Boton_RegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RegresoActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_RegresoActionPerformed

    private void Boton_Regreso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Regreso2ActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Regreso2ActionPerformed

    private void Boton_Regreso4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Regreso4ActionPerformed
             Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Regreso4ActionPerformed

    private void Boton_Regreso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Regreso3ActionPerformed
             Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_Regreso3ActionPerformed

    private void Altas_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Altas_TelefonoKeyTyped
    if(Altas_Telefono.getText().length() >= 10)
    {
        evt.consume();
    }
    }//GEN-LAST:event_Altas_TelefonoKeyTyped

    private void Modificar_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Modificar_TelefonoKeyTyped
    if(Modificar_Telefono.getText().length() >= 10)
    {
        evt.consume();
    }
    }//GEN-LAST:event_Modificar_TelefonoKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Altas_Correo;
    private javax.swing.JTextField Altas_Direccion;
    private javax.swing.JTextField Altas_Nombre;
    private javax.swing.JTextField Altas_Razon;
    private javax.swing.JButton Altas_Registrar;
    private javax.swing.JTextField Altas_Telefono;
    private javax.swing.JButton Borrar_Boton;
    private javax.swing.JTextField Borrar_ID;
    private javax.swing.JTextField Borrar_Nombre;
    private javax.swing.JButton Boton_Regreso;
    private javax.swing.JButton Boton_Regreso2;
    private javax.swing.JButton Boton_Regreso3;
    private javax.swing.JButton Boton_Regreso4;
    private javax.swing.JButton Consultar_Boton;
    private javax.swing.JTextField Modificar_Correo;
    private javax.swing.JTextField Modificar_Direccion;
    private javax.swing.JButton Modificar_Editar;
    private javax.swing.JTextField Modificar_ID;
    private javax.swing.JTextField Modificar_Nombre;
    private javax.swing.JTextField Modificar_Razon;
    private javax.swing.JTextField Modificar_Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
