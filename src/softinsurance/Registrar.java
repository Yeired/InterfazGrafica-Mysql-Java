
package softinsurance;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Registrar extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection conexion = con.conectar();
    public Registrar() {
        
        initComponents();
        setTitle("Registrar Usuario");
        setResizable(false);
        setLocationRelativeTo(null);
                Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icono.png"));
        setIconImage(icon);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Registrar_Usuario = new javax.swing.JTextField();
        Boton_Registrar = new javax.swing.JButton();
        Registrar_Pass = new javax.swing.JPasswordField();
        Boton_Regresar = new javax.swing.JButton();
        Boton_Requisitos = new javax.swing.JButton();
        Rango = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("REGISTRA UN USUARIO");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("ESCRIBE UN USUARIO:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("ESCRIBE UNA CONTRASEÑA:");

        Registrar_Usuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Boton_Registrar.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Registrar.setText("REGISTRAR");
        Boton_Registrar.setBorder(null);
        Boton_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RegistrarActionPerformed(evt);
            }
        });

        Registrar_Pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Boton_Regresar.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Regresar.setText("REGRESAR");
        Boton_Regresar.setBorder(null);
        Boton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RegresarActionPerformed(evt);
            }
        });

        Boton_Requisitos.setBackground(new java.awt.Color(255, 102, 0));
        Boton_Requisitos.setForeground(new java.awt.Color(255, 255, 255));
        Boton_Requisitos.setText("?");
        Boton_Requisitos.setBorder(null);
        Boton_Requisitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_RequisitosActionPerformed(evt);
            }
        });

        Rango.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        Rango.setBorder(null);
        Rango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("ESCOGE SU ROL:");

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(Registrar_Pass, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(Registrar_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_Requisitos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(Boton_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Rango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Registrar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Boton_Requisitos))
                .addGap(18, 18, 18)
                .addComponent(Registrar_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Boton Registrar
    private void Boton_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RegistrarActionPerformed
        String validar = Registrar_Pass.getText();
        if(PASSWORD_PATTERN.matcher(validar).matches()){
            
            try{
               String query;
                query = "Insert INTO usuarios(Usuario,Password,Rango)values(?,?,?)";
               PreparedStatement
               guardar=conexion.prepareStatement(query);
               guardar.setString(1,Registrar_Usuario.getText());
               guardar.setString(2,Registrar_Pass.getText());
               guardar.setString(3,Rango.getSelectedItem().toString());
               String contra = Registrar_Pass.getText();
               Encriptar proy= new Encriptar();
               String pass= proy.obtienemd5(contra);
               guardar.setString(2,pass);
               guardar.executeUpdate();
               JOptionPane.showMessageDialog(null,"Usuario: "+Registrar_Usuario.getText()+ " Registrado");
               Registrar_Usuario.requestFocus();
            
           }
           catch(Exception e)
           {
               System.out.println("Error"+ e);
           }
        }
        else{
        JOptionPane.showMessageDialog(null, """
                                            !ERROR!
                                            La contrase\u00f1a debe contener:
                                            \u2022 De 8 a 32 caracteres
                                            \u2022 Una minuscula y una mayuscula
                                            \u2022 Un numero
                                            \u2022 Sin espacios en blanco
                                            """);
        }
    }//GEN-LAST:event_Boton_RegistrarActionPerformed
    //Validar contraseña
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,16}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
// BOTON REGRESAR
    private void Boton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RegresarActionPerformed
        Opcion regreso = new Opcion();
        regreso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Boton_RegresarActionPerformed
//Requisitos
    private void Boton_RequisitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RequisitosActionPerformed
        JOptionPane.showMessageDialog(null, """
                                            La contrase\u00f1a debe contener: 
                                            \u2022 De 8 a 32 caracteres
                                            \u2022 Una minuscula y una mayuscula
                                            \u2022 Un numero
                                            \u2022 Sin espacios en blanco
                                            """);
    }//GEN-LAST:event_Boton_RequisitosActionPerformed

    private void RangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RangoActionPerformed

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Registrar;
    private javax.swing.JButton Boton_Regresar;
    private javax.swing.JButton Boton_Requisitos;
    private javax.swing.JComboBox<String> Rango;
    private javax.swing.JPasswordField Registrar_Pass;
    private javax.swing.JTextField Registrar_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
