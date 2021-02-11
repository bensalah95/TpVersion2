package fr.esic.ihm;

import de.esic.dao.ConnexionBd;
import de.esic.dao.UserDao;
import fr.esic.model.User;
import fr.esic.proprities.PropriGlobal;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.security.util.Password;

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

        Date actuelle = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss ");
        lb_date_inscription.setText("" + dateFormat.format(actuelle));
        String date = dateFormat.format(actuelle);
        String date_cnx;
        date_cnx = date;

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
        bt_help = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_age = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rb_f = new javax.swing.JRadioButton();
        rb_m = new javax.swing.JRadioButton();
        txt_mdp1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txt_mdp = new javax.swing.JPasswordField();
        lb_date_inscription = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbMsgErrI = new javax.swing.JLabel();
        lb_msg_confiarmation_mdp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 168, 237));
        jLabel1.setText("INSC ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 70, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("Nom* :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("Prenom* :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Login* :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 160, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("Confirmation Mot de passe* :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 260, 30));

        bt_valider.setBackground(new java.awt.Color(0, 153, 51));
        bt_valider.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        bt_valider.setForeground(new java.awt.Color(255, 255, 255));
        bt_valider.setText("Valider");
        bt_valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_validerActionPerformed(evt);
            }
        });
        getContentPane().add(bt_valider, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 550, 120, -1));

        bt_annuler.setBackground(new java.awt.Color(255, 0, 0));
        bt_annuler.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        bt_annuler.setForeground(new java.awt.Color(255, 255, 255));
        bt_annuler.setText("Retour");
        bt_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_annulerActionPerformed(evt);
            }
        });
        getContentPane().add(bt_annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 120, -1));

        bt_connexion.setBackground(new java.awt.Color(102, 102, 255));
        bt_connexion.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        bt_connexion.setForeground(new java.awt.Color(255, 255, 255));
        bt_connexion.setText("Se Connecter");
        bt_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_connexionActionPerformed(evt);
            }
        });
        getContentPane().add(bt_connexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, -1, -1));
        getContentPane().add(txt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 158, 30));
        getContentPane().add(txt_prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 158, 30));

        txt_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, 30));

        bt_help.setBackground(new java.awt.Color(102, 102, 102));
        bt_help.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        bt_help.setForeground(new java.awt.Color(255, 255, 255));
        bt_help.setText("Help");
        bt_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_helpActionPerformed(evt);
            }
        });
        getContentPane().add(bt_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 51));
        jLabel6.setText("Age :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 30));
        getContentPane().add(txt_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 158, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 51));
        jLabel9.setText("Sexe :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, 30));

        rb_f.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(rb_f);
        rb_f.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        rb_f.setForeground(new java.awt.Color(102, 0, 51));
        rb_f.setText("Féminin");
        rb_f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_fActionPerformed(evt);
            }
        });
        getContentPane().add(rb_f, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        rb_m.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(rb_m);
        rb_m.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        rb_m.setForeground(new java.awt.Color(102, 0, 51));
        rb_m.setText("Masculin");
        rb_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_mActionPerformed(evt);
            }
        });
        getContentPane().add(rb_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));
        getContentPane().add(txt_mdp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 160, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 51));
        jLabel8.setText("Mot de passe* :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 160, 30));

        txt_mdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mdpActionPerformed(evt);
            }
        });
        getContentPane().add(txt_mdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 160, 30));

        lb_date_inscription.setBackground(new java.awt.Color(255, 255, 255));
        lb_date_inscription.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        getContentPane().add(lb_date_inscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 180, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 133, 205));
        jLabel10.setText("RIP");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 60, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(172, 113, 193));
        jLabel11.setText("TION");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 10, 70, 30));

        lbMsgErrI.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        lbMsgErrI.setForeground(new java.awt.Color(255, 0, 0));
        lbMsgErrI.setText(" * Champs Obligatoire");
        getContentPane().add(lbMsgErrI, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 260, 20));

        lb_msg_confiarmation_mdp.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        lb_msg_confiarmation_mdp.setForeground(new java.awt.Color(255, 0, 0));
        lb_msg_confiarmation_mdp.setText("Mot de Passe non identique !");
        getContentPane().add(lb_msg_confiarmation_mdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 230, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean CheckEmptyField(String field) {
        if (!field.isEmpty()) {
            System.out.println("ok");
            return false;
        } else {
            javax.swing.JOptionPane.showMessageDialog(null,
                    "Entrer tous les champs !");
            return true;
        }
    }

    private void bt_validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_validerActionPerformed

        int id = 0;
        String nom = txt_nom.getText();
        String prenom = txt_prenom.getText();
        String login = txt_login.getText();
        String mdp = txt_mdp.getText();
        String mdp2 = txt_mdp1.getText();
        //double poids=Double.parseDouble(txt_poids.getText());
        int age = Integer.parseInt(txt_age.getText());
        //int taille=Integer.parseInt(txt_taille.getText());

        if (mdp.equals(mdp2)) {
            lb_msg_confiarmation_mdp.setVisible(false);

            bt_valider.setEnabled(true);

            try {
                /* 
                 Connection connexion=ConnexionBd.getConnection();
            PreparedStatement prepare;
        
                 String sql ="insert into historique_cnx_dec(login,date_cnx,nbre_cnx) values(?,?,?)";
                      prepare = connexion.prepareStatement(sql);
          prepare.setString(1,login);
          prepare.setString(2,date);
          prepare.setInt(3,nbre_cnx);
          prepare.execute();
                
                 *//*
                if (CheckEmptyField(nom) || CheckEmptyField(prenom) || CheckEmptyField(login) || CheckEmptyField(mdp) || CheckEmptyField(mdp2)) {
                
                lbMsgErrI.setVisible(true);
                lbMsgErrI.setText("Entrer tous les champs !");
                
                if(mdp != mdp2){
                   lb_msg_confiarmation_mdp.setVisible(true);
              
                }
                else{
                     User u=new User(nom,prenom,sex,login,mdp,mdp2,poids,age,taille);
            UserDao.insertPerson(u);
            JOptionPane.showMessageDialog(rootPane, "inscription avec succées ");
                }


            }
                 */


                User u = new User(id, nom, prenom, sex, login, mdp, mdp2, age);
                UserDao.insertPerson(u);
                JOptionPane.showMessageDialog(rootPane, "inscription avec succées ");
                //System.out.println(u);

            } catch (SQLException ex) {
                Logger.getLogger(Inscription.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            lb_msg_confiarmation_mdp.setVisible(true);
            bt_valider.setEnabled(false);

            txt_mdp.setText("");
            txt_mdp1.setText("");
            bt_valider.setEnabled(true);
        }


    }//GEN-LAST:event_bt_validerActionPerformed

    private void bt_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_annulerActionPerformed
        FitnessTime fit = new FitnessTime();
        fit.setVisible(true);
        this.hide();

    }//GEN-LAST:event_bt_annulerActionPerformed

    private void bt_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_connexionActionPerformed
        Page_Conexion cnx = new Page_Conexion();
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
        sex = "feminin";
    }//GEN-LAST:event_rb_fActionPerformed

    private void rb_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_mActionPerformed
        sex = "masculin";
    }//GEN-LAST:event_rb_mActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //bt_valider.setEnabled(false);
        lb_msg_confiarmation_mdp.hide();
        lbMsgErrI.hide();

    }//GEN-LAST:event_formWindowOpened

    private void bt_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_helpActionPerformed
        HelpInscription help = new HelpInscription();
        help.setVisible(true);
        this.hide();
    }//GEN-LAST:event_bt_helpActionPerformed

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
    private javax.swing.JButton bt_help;
    private javax.swing.JButton bt_valider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbMsgErrI;
    private javax.swing.JLabel lb_date_inscription;
    private javax.swing.JLabel lb_msg_confiarmation_mdp;
    private javax.swing.JRadioButton rb_f;
    private javax.swing.JRadioButton rb_m;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPasswordField txt_mdp;
    private javax.swing.JPasswordField txt_mdp1;
    private javax.swing.JTextField txt_nom;
    private javax.swing.JTextField txt_prenom;
    // End of variables declaration//GEN-END:variables

    private String sex;

}
