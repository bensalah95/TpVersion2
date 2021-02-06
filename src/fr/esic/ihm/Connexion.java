
package fr.esic.ihm;

import de.esic.dao.UserDao;
import fr.esic.model.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Connexion extends javax.swing.JFrame {

   
    public Connexion() {
        initComponents();
        showDate();
        
    }
    void showDate(){
        
         Date thisDate=new Date();
 SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss ");
 
// date.setText(f.format(thisDate));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        txt_pwd = new javax.swing.JTextField();
        bt_connexion = new javax.swing.JButton();
        bt_inscription = new javax.swing.JButton();
        lb_msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 58, 111));
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 58, 111));
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, -1));

        txt_login.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(txt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 110, -1));

        txt_pwd.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 110, -1));

        bt_connexion.setBackground(new java.awt.Color(255, 255, 255));
        bt_connexion.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt_connexion.setForeground(new java.awt.Color(0, 102, 0));
        bt_connexion.setText("Connexion");
        bt_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_connexionActionPerformed(evt);
            }
        });
        getContentPane().add(bt_connexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 190, -1));

        bt_inscription.setBackground(new java.awt.Color(255, 255, 255));
        bt_inscription.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt_inscription.setForeground(new java.awt.Color(0, 51, 255));
        bt_inscription.setText("inscription ?");
        bt_inscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inscriptionActionPerformed(evt);
            }
        });
        getContentPane().add(bt_inscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 190, -1));

        lb_msg.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        lb_msg.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lb_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 232, 38));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_connexionActionPerformed

        /*Date de systeme
         Date thisDate=new Date();
 SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss ");
 
date.setText(f.format(thisDate));
        
        */
        
        String login=txt_login.getText();
        String password=txt_pwd.getText();
        try{
            User u =UserDao.getByLoginAndPassword(login, password);

            if(u!=null){
                JOptionPane.showMessageDialog(rootPane,"connexion reussi!");
                /*Home home=new Home();
                home.setVisible(true);
                this.hide();*/
                Fenetre_de_demarage demarage= new Fenetre_de_demarage();
                demarage.setVisible(true);
                this.hide();
            }
            else
            {
                lb_msg.setVisible(true);
                lb_msg.setText("idenifiant ou mot de passe incorrecte!! ");}

        }catch(Exception e){

            JOptionPane.showMessageDialog(rootPane,"exception!"+e.getMessage());
        }
    }//GEN-LAST:event_bt_connexionActionPerformed

    private void bt_inscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inscriptionActionPerformed

       Inscription inscri =new Inscription();
        inscri.setVisible(true);
        this.hide();
/*String nom, String prenom, String sex, String login, String password, String password2, float poids, int age*/
        try{
            UserDao.insertPerson(new User ("manel","bensalah","féminin","manel","bbbb","bbbb",65,25));

        }catch(Exception e){

            JOptionPane.showMessageDialog(rootPane, "excception"+e.getMessage());}
    }//GEN-LAST:event_bt_inscriptionActionPerformed

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
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_connexion;
    private javax.swing.JButton bt_inscription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_msg;
    private javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_pwd;
    // End of variables declaration//GEN-END:variables
}
