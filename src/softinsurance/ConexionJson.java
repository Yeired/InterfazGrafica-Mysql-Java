
package softinsurance;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import org.json.*;
//import java.util.*;
import java.sql.*;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConexionJson extends javax.swing.JFrame {
    String servidor;
    String usuario;
    String pass;
    String puerto;
    Connection con;
    Statement sen;
    ResultSet res;
    @SuppressWarnings("LeakingThisInConstructor")
           //Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        //setIconImage(icon);
        //setVisible(true);
    public ConexionJson() {
 
        initComponents();
        setTitle("SERVIDOR");
        setResizable(false);
        setLocationRelativeTo(null);
        Ingresar.setEnabled(false);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        server = new javax.swing.JTextField();
        Ingresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Port = new javax.swing.JTextField();
        Comprobar = new javax.swing.JToggleButton();
        Pass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("USUARIO");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("SERVIDOR");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("CONTRASEÑA");

        Usuario.setBackground(new java.awt.Color(255, 255, 255));
        Usuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Usuario.setForeground(new java.awt.Color(0, 0, 0));
        Usuario.setBorder(null);

        server.setBackground(new java.awt.Color(255, 255, 255));
        server.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        server.setForeground(new java.awt.Color(0, 0, 0));
        server.setBorder(null);

        Ingresar.setBackground(new java.awt.Color(255, 102, 0));
        Ingresar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setText("INGRESAR");
        Ingresar.setBorder(null);
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("PORT");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos/icons8_Maintenance_96px.png"))); // NOI18N
        jLabel5.setText("INGRESA UN SERVIDOR");

        Port.setBackground(new java.awt.Color(255, 255, 255));
        Port.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Port.setForeground(new java.awt.Color(0, 0, 0));
        Port.setText("3306");
        Port.setBorder(null);

        Comprobar.setBackground(new java.awt.Color(255, 102, 0));
        Comprobar.setForeground(new java.awt.Color(255, 255, 255));
        Comprobar.setText("COMPROBAR");
        Comprobar.setBorder(null);
        Comprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobarActionPerformed(evt);
            }
        });

        Pass.setBackground(new java.awt.Color(255, 255, 255));
        Pass.setForeground(new java.awt.Color(0, 0, 0));
        Pass.setBorder(null);

        jLabel6.setText("Default: 3306");

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator2.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator3.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator3.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator4.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator4.setForeground(new java.awt.Color(255, 102, 0));

        jSeparator5.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator5.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(server, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Port, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(server, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Port, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Comprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Boton Ingresar
    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
            servidor=server.getText();
            usuario=Usuario.getText();
            pass=Pass.getText();
            puerto=Port.getText();
            try {
                genera(servidor, usuario, pass, puerto);
                
            } catch (Exception ex) {
                Logger.getLogger(ConexionJson.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_IngresarActionPerformed
//Boton comprobar
    private void ComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobarActionPerformed
            servidor=server.getText();
            usuario=Usuario.getText();
            pass=Pass.getText();
            puerto=Port.getText();
            //System.out.println("Voy a mandar "+ " servidor: " + servidor + " usuario: "+ usuario + " contrasena: " +pass + " puerto: " +puerto);
            comprueba(servidor, usuario, pass, puerto);
    }//GEN-LAST:event_ComprobarActionPerformed
// Generar Json
    public void genera(String server, String usuario, String pass, String puerto) throws Exception
    {
        if(server.isEmpty() || usuario.isEmpty() || puerto.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Te falta algún dato importante");
        }
        else
        {
            try{
                if(puerto.isEmpty())
                    puerto="3306";
                JSONObject mijson = new JSONObject();
                mijson.put("servidor", server);
                mijson.put("usuario", usuario);
                mijson.put("password", pass);
                mijson.put("puerto", puerto);
                System.out.println("Objeto creado: " + mijson);
                File archivo = new File("conecjson.txt");
                // Si el archivo no existe es creado
                if (archivo.exists()){
                  archivo.createNewFile();
                }
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(mijson.toString());
                bw.close();
                JOptionPane.showMessageDialog(null, "JSON para conexión creado correctamente", "Debes reiniciar la aplicación", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                BuscarBD BuscarBD= new BuscarBD();
                BuscarBD.setVisible(true);
                BuscarBD.setLocationRelativeTo(null);          
            //System.exit(0);
        }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error: "+ e);
            }
        }
    }
// Leer Json    
        public String[] leejson()
    {
        //String server="", us="", pass="", puerto="";
        String[] variable = new String[4];
        try {
            File archivo = new File ("conecjson.txt");
            FileReader fr = new FileReader (archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            JSONObject miJson = new JSONObject(linea);
            variable[0] = miJson.getString("servidor");
            variable[1] = miJson.getString("usuario");
            variable[2] = miJson.getString("password");
            variable[3] = miJson.getString("puerto");
           
            System.out.println("El archivo JSON contiene: " + miJson);
        }
        catch(IOException | JSONException e){
            System.out.println("Error al leer el archivo "+e);
      }
    return variable;
    }
// Comprueba Json        
           public void comprueba(String server, String usuario, String pass, String puerto)
    {
        Connection con;
        try
            {
                if(puerto.isEmpty())
                    puerto="3306";
                String cadconecta="jdbc:mysql://"+ server +":" + puerto + "?&useSSL=false&user="+ usuario +"&password="+ pass;
                System.out.println(cadconecta);
                con = DriverManager.getConnection(cadconecta);
                sen = con.createStatement();
                JOptionPane.showMessageDialog(null,"Conexión valida");
                Ingresar.setEnabled(true);
               
            }
        catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Conexión no valida: " + e );
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
            java.util.logging.Logger.getLogger(ConexionJson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConexionJson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConexionJson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConexionJson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConexionJson().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Comprobar;
    private javax.swing.JButton Ingresar;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Port;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField server;
    // End of variables declaration//GEN-END:variables
}
