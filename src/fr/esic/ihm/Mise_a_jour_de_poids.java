
package fr.esic.ihm;

import de.esic.dao.ConnexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Mise_a_jour_de_poids extends javax.swing.JFrame {
 
   
    public Mise_a_jour_de_poids() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_poids_actuel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_poids_initial = new javax.swing.JTextField();
        btn_valider = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        date_de_balnce = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Poids initial");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, 30));

        txt_poids_actuel.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        txt_poids_actuel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_poids_actuelActionPerformed(evt);
            }
        });
        jPanel1.add(txt_poids_actuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 160, 40));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 173, 26));
        jLabel3.setText("Poids actuel");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 160, 30));

        txt_poids_initial.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jPanel1.add(txt_poids_initial, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 160, 40));

        btn_valider.setBackground(new java.awt.Color(0, 102, 102));
        btn_valider.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        btn_valider.setForeground(new java.awt.Color(255, 255, 255));
        btn_valider.setText("Valider");
        btn_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_validerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 210, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Mise a jour poids");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 310, 40));
        jPanel1.add(date_de_balnce, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 190, 30));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setText("Retour");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/esic/img/maintien poids.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
static int total;
    private void txt_poids_actuelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_poids_actuelActionPerformed
    }//GEN-LAST:event_txt_poids_actuelActionPerformed

            PreparedStatement prepare,stmt;
            Statement st;
            ResultSet rst; 
              double poids_initial;
    private void btn_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_validerActionPerformed

        int pdA= Integer.parseInt(txt_poids_initial.getText());
        int pdN = Integer.parseInt(txt_poids_actuel.getText());
        total=pdA-pdN;
        if (pdA > pdN ) {
            Felicitation bravo = new Felicitation();
        bravo.setVisible(true);
        this.setVisible(false);  
        }else{
            JOptionPane.showMessageDialog(rootPane, "vous avez grossi");
        }
                
                
        try {
         Connection connexion=ConnexionBd.getConnection();   
          
       st=connexion.createStatement();
            rst=st.executeQuery("select * from  sportif");
           if (rst.next()){
            poids_initial=rst.getDouble("poids");
           }

          
        
        } catch (Exception e) {
        } 
       
        

    }//GEN-LAST:event_btn_validerActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        txt_poids_initial.setText(""+poids_initial);
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Fenetre_de_demarage profil = new Fenetre_de_demarage();
        profil.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Mise_a_jour_de_poids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mise_a_jour_de_poids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mise_a_jour_de_poids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mise_a_jour_de_poids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mise_a_jour_de_poids().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_valider;
    private javax.swing.JLabel date_de_balnce;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_poids_actuel;
    private javax.swing.JTextField txt_poids_initial;
    // End of variables declaration//GEN-END:variables
}
