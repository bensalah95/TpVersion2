/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.ihm;

import de.esic.dao.ConnexionBd;
import de.esic.dao.UserDao;
import fr.esic.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author marye
 */
public class Inscription extends javax.swing.JFrame {

    /**
     * Creates new form Inscription
     */
    public Inscription() {
        initComponents();
           Date thisDate=new Date();
 SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss ");
 
 date.setText(f.format(thisDate));
 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt_valider = new javax.swing.JButton();
        bt_annuler = new javax.swing.JButton();
        bt_connexion = new javax.swing.JButton();
        txt_login = new javax.swing.JTextField();
        txt_prenom = new javax.swing.JTextField();
        txt_nom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_poids = new javax.swing.JTextField();
        rb_f = new javax.swing.JRadioButton();
        rb_m = new javax.swing.JRadioButton();
        txt_mdp1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txt_mdp = new javax.swing.JPasswordField();
        date = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INSCRIPTION ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 240, 25));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 58, 111));
        jLabel2.setText("Nom");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 58, 111));
        jLabel3.setText("Prenom");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 58, 111));
        jLabel4.setText("Login");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 80, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 58, 111));
        jLabel5.setText("Mot de passe");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        bt_valider.setBackground(new java.awt.Color(0, 153, 51));
        bt_valider.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        bt_valider.setForeground(new java.awt.Color(255, 255, 255));
        bt_valider.setText("Valider");
        bt_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_validerActionPerformed(evt);
            }
        });
        getContentPane().add(bt_valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 120, -1));

        bt_annuler.setBackground(new java.awt.Color(255, 0, 0));
        bt_annuler.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        bt_annuler.setForeground(new java.awt.Color(255, 255, 255));
        bt_annuler.setText("Annuler");
        bt_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_annulerActionPerformed(evt);
            }
        });
        getContentPane().add(bt_annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 120, -1));

        bt_connexion.setBackground(new java.awt.Color(102, 102, 255));
        bt_connexion.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        bt_connexion.setForeground(new java.awt.Color(255, 255, 255));
        bt_connexion.setText("Se Connecter");
        bt_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_connexionActionPerformed(evt);
            }
        });
        getContentPane().add(bt_connexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, -1, -1));
        getContentPane().add(txt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 158, -1));
        getContentPane().add(txt_prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 158, -1));

        txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 158, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 58, 111));
        jLabel6.setText("Age");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 170, 60, -1));
        getContentPane().add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 150, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 58, 111));
        jLabel7.setText("Poids");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 58, 111));
        jLabel9.setText("Sex");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 60, -1));
        getContentPane().add(txt_poids, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, -1));

        rb_f.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(rb_f);
        rb_f.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        rb_f.setForeground(new java.awt.Color(0, 0, 153));
        rb_f.setText("Féminin");
        rb_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_fActionPerformed(evt);
            }
        });
        getContentPane().add(rb_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        rb_m.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(rb_m);
        rb_m.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        rb_m.setForeground(new java.awt.Color(0, 0, 153));
        rb_m.setText("Masculin");
        rb_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_mActionPerformed(evt);
            }
        });
        getContentPane().add(rb_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));
        getContentPane().add(txt_mdp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 160, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 58, 111));
        jLabel8.setText("Mot de passe");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        txt_mdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mdpActionPerformed(evt);
            }
        });
        getContentPane().add(txt_mdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 160, -1));

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 180, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/esic/img/inscri.jpg"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_validerActionPerformed

        String nom=txt_nom.getText();
        String prenom=txt_prenom.getText();
        String login=txt_login.getText();
        String mdp=txt_mdp.getText();
        String mdp2=txt_mdp1.getText();
        double poids=Double.parseDouble(txt_poids.getText());
        int age=Integer.parseInt(txt_age.getText());
/*String nom, String prenom, String sex, String login, String password, String password2, float poids, int age*/
        try {
            User u=new User(nom,prenom,sex,login,mdp,mdp2,poids,age);
            UserDao.insertPerson(u);

            JOptionPane.showMessageDialog(rootPane, "inscription avec succées ");

    
        }
        catch (SQLException ex) {
            //Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_bt_validerActionPerformed

    private void bt_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_annulerActionPerformed
        this.dispose();

    }//GEN-LAST:event_bt_annulerActionPerformed

    private void bt_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_connexionActionPerformed
        Connexion cnx =new Connexion();
        cnx.setVisible(true);
        this.hide();
    }//GEN-LAST:event_bt_connexionActionPerformed

    private void txt_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomActionPerformed

    private void txt_mdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mdpActionPerformed

    private void rb_fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_fActionPerformed
        sex="feminin";
    }//GEN-LAST:event_rb_fActionPerformed

    private void rb_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_mActionPerformed
        sex="masculin";
    }//GEN-LAST:event_rb_mActionPerformed

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
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_annuler;
    private javax.swing.JButton bt_connexion;
    private javax.swing.JButton bt_valider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel date;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rb_f;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPasswordField txt_mdp;
    private javax.swing.JPasswordField txt_mdp1;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_poids;
    private javax.swing.JTextField txt_prenom;
    // End of variables declaration//GEN-END:variables

private String sex;

}
