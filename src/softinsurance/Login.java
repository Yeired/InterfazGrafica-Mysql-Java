
package softinsurance;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.regex.*;
 import java.awt.Image;
import java.awt.Toolkit;
public class Login extends javax.swing.JFrame{

    public Login() {
        initComponents();
        setTitle("LOGIN");
        setResizable(false);
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Boton_Entrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Login_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Login_rango = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Login_Password = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Boton_Entrar.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Entrar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Boton_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Entrar.setText("INGRESAR");
        Boton_Entrar.setToolTipText("");
        Boton_Entrar.setBorder(null);
        Boton_Entrar.setBorderPainted(false);
        Boton_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EntrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("CONTRASEÑA");

        Login_Usuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Login_Usuario.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Overpass Light", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("USUARIO");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos/icons8_User_96px_2.png"))); // NOI18N

        Login_rango.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Login_rango.setForeground(new java.awt.Color(255, 102, 0));
        Login_rango.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        Login_rango.setBorder(null);
        Login_rango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_rangoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("RANGO:");

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator2.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos/icons8_customer_32px_1.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos/icons8_Key_32px.png"))); // NOI18N

        Login_Password.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Login_Password.setBorder(null);
        Login_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_PasswordActionPerformed(evt);
            }
        });
        Login_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Login_PasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Login_Password))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.CENTER)
                                .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Login_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Login_rango, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Boton_Entrar, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Login_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(Login_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Login_rango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Boton_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos/pexels-ulucas-dubécantin-10325707.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 370, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Login_rangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_rangoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Login_rangoActionPerformed

//Boton Entrar
    private void Boton_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EntrarActionPerformed
        try{

            Conexion con = new Conexion();
            Encriptar pan = new Encriptar();
            String usuario = Login_Usuario.getText();
            String contra= Login_Password.getText();
            String psw = pan.obtienemd5(contra);
            String rango = Login_rango.getSelectedItem().toString();
            con.conectar();
            //System.out.println(contra);
            String SQL = "SELECT Usuario,Password,Rango FROM usuarios " + "WHERE Usuario='"+usuario+"' AND Password ='"+psw+"'AND Rango ='"+rango+"'";
            System.out.println(SQL);
            //System.out.println(SQL);
            con.res = con.sen.executeQuery(SQL);
            System.out.println(con.res);
            if(usuario.isEmpty() || psw.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Ups, Te falta completar campos");
            }

            else
            {
                if(con.res.next())
                {
                    if("Administrador".equals(rango)){
                        JOptionPane.showMessageDialog(null, "BIENVENIDO ADMINISTRADOR");
                        Opcion menu = new Opcion();
                        menu.setVisible(true);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "BIENVENIDO USUARIO");
                        consultasUsuario menuUsuario = new consultasUsuario();
                        menuUsuario.setVisible(true);
                        this.dispose();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Datos incorrectos");
                }
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_Boton_EntrarActionPerformed

    private void Login_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_PasswordActionPerformed
        
    }//GEN-LAST:event_Login_PasswordActionPerformed

    private void Login_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Login_PasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            try{

            Conexion con = new Conexion();
            Encriptar pan = new Encriptar();
            String usuario = Login_Usuario.getText();
            String contra= Login_Password.getText();
            String psw = pan.obtienemd5(contra);
            String rango = Login_rango.getSelectedItem().toString();
            con.conectar();
            //System.out.println(contra);
            String SQL = "SELECT Usuario,Password,Rango FROM usuarios " + "WHERE Usuario='"+usuario+"' AND Password ='"+psw+"'AND Rango ='"+rango+"'";
            System.out.println(SQL);
            //System.out.println(SQL);
            con.res = con.sen.executeQuery(SQL);
            System.out.println(con.res);
            if(usuario.isEmpty() || psw.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Ups, Te falta completar campos");
            }

            else
            {
                if(con.res.next())
                {
                    if("Administrador".equals(rango)){
                        JOptionPane.showMessageDialog(null, "BIENVENIDO ADMINISTRADOR");
                        Opcion menu = new Opcion();
                        menu.setVisible(true);
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "BIENVENIDO USUARIO");
                        consultasUsuario menuUsuario = new consultasUsuario();
                        menuUsuario.setVisible(true);
                        this.dispose();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Datos incorrectos");
                }
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        }
    }//GEN-LAST:event_Login_PasswordKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Entrar;
    private javax.swing.JPasswordField Login_Password;
    private javax.swing.JTextField Login_Usuario;
    private javax.swing.JComboBox<String> Login_rango;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

   
}
