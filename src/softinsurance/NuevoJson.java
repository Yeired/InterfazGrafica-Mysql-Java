
package softinsurance;
 import java.awt.Image;
import java.awt.Toolkit;
public class NuevoJson extends javax.swing.JFrame {


    public NuevoJson() {

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

        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        JSON_Si = new javax.swing.JButton();
        JSON_No = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 0));
        jLabel22.setText("Ya existe una conexion Json, ¿Deseas crear otra conexion?");

        JSON_Si.setBackground(new java.awt.Color(255, 102, 0));
        JSON_Si.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JSON_Si.setForeground(new java.awt.Color(255, 255, 255));
        JSON_Si.setText(" SI ");
        JSON_Si.setBorder(null);
        JSON_Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSON_SiActionPerformed(evt);
            }
        });

        JSON_No.setBackground(new java.awt.Color(255, 102, 0));
        JSON_No.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JSON_No.setForeground(new java.awt.Color(255, 255, 255));
        JSON_No.setText("NO");
        JSON_No.setBorder(null);
        JSON_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSON_NoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 102, 0));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Iconos/icons8_Idea_96px.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(255, 102, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JSON_Si, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(JSON_No, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23))
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JSON_Si, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JSON_No, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Boton SI
    private void JSON_SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSON_SiActionPerformed
            this.dispose();
        ConexionJson ConexionJson= new ConexionJson();
            ConexionJson.setVisible(true);
            ConexionJson.setLocationRelativeTo(null);
    }//GEN-LAST:event_JSON_SiActionPerformed


//Boton No
    private void JSON_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSON_NoActionPerformed
        this.dispose();
        BuscarBD BuscarBD= new BuscarBD();
        BuscarBD.setVisible(true);
        BuscarBD.setLocationRelativeTo(null); 
    }//GEN-LAST:event_JSON_NoActionPerformed

static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(NuevoJson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoJson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoJson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoJson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoJson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JSON_No;
    private javax.swing.JButton JSON_Si;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
