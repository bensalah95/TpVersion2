/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.ihm;

import de.esic.dao.ConnexionBd;
import de.esic.dao.UserDao;
import fr.esic.model.User;
import fr.esic.proprities.PropriGlobal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import javax.swing.JOptionPane;

public class Fenetre_de_demarage extends javax.swing.JFrame {

    public Fenetre_de_demarage() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ajouter_objectif = new javax.swing.JButton();
        btn_poids_mise_ajour = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        lbBienvenue = new javax.swing.JLabel();
        btn_help = new javax.swing.JButton();
        btn_quitter = new javax.swing.JButton();
        btVoirProfil = new javax.swing.JButton();
        btn_historique1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ajouter_objectif.setBackground(new java.awt.Color(255, 255, 255));
        btn_ajouter_objectif.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_ajouter_objectif.setForeground(new java.awt.Color(176, 151, 178));
        btn_ajouter_objectif.setText("Ajouter un objectif");
        btn_ajouter_objectif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajouter_objectifActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ajouter_objectif, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 170, 40));

        btn_poids_mise_ajour.setBackground(new java.awt.Color(255, 255, 255));
        btn_poids_mise_ajour.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_poids_mise_ajour.setForeground(new java.awt.Color(176, 151, 178));
        btn_poids_mise_ajour.setText("Poids du Jour");
        btn_poids_mise_ajour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_poids_mise_ajourActionPerformed(evt);
            }
        });
        getContentPane().add(btn_poids_mise_ajour, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 170, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(176, 151, 178));
        jButton4.setText("Récapitulatif Global");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 170, 40));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 90, 24));

        lbBienvenue.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        lbBienvenue.setForeground(new java.awt.Color(176, 151, 178));
        getContentPane().add(lbBienvenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 400, 30));

        btn_help.setBackground(new java.awt.Color(102, 102, 102));
        btn_help.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_help.setForeground(new java.awt.Color(255, 255, 255));
        btn_help.setText("Help");
        btn_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_helpActionPerformed(evt);
            }
        });
        getContentPane().add(btn_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 150, 40));

        btn_quitter.setBackground(new java.awt.Color(255, 0, 0));
        btn_quitter.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_quitter.setForeground(new java.awt.Color(255, 255, 255));
        btn_quitter.setText("Deconnexion");
        btn_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 150, 40));

        btVoirProfil.setBackground(new java.awt.Color(255, 255, 255));
        btVoirProfil.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btVoirProfil.setForeground(new java.awt.Color(176, 151, 178));
        btVoirProfil.setText("Mon profil");
        btVoirProfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoirProfilActionPerformed(evt);
            }
        });
        getContentPane().add(btVoirProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 300, 170, 40));

        btn_historique1.setBackground(new java.awt.Color(255, 255, 255));
        btn_historique1.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_historique1.setForeground(new java.awt.Color(176, 151, 178));
        btn_historique1.setText("Historique objectif");
        btn_historique1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historique1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_historique1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/esic/img/inscription.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -120, 1210, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_poids_mise_ajourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_poids_mise_ajourActionPerformed
        Mise_a_jour_de_poids poids = new Mise_a_jour_de_poids();
        poids.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_poids_mise_ajourActionPerformed

    private void btn_ajouter_objectifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajouter_objectifActionPerformed
        Fenetre_IMC imc = new Fenetre_IMC();
        imc.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_ajouter_objectifActionPerformed

    private void btn_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_helpActionPerformed
        HelpAccueil help = new HelpAccueil();
        help.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_helpActionPerformed

    private void btn_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitterActionPerformed

        PropriGlobal.user_Connect=null;
        Page_Conexion cnx = new Page_Conexion();
        cnx.setVisible(true);
        this.hide();
        /*Date actuel = new Date();
        DateFormat dateFormat = new SimpleDateFormat();
        String log;
        String date = dateFormat.format(actuel);

        try {
            Connection connexion = ConnexionBd.getConnection();
            PreparedStatement prepare;
            Statement st;
            ResultSet rst;
            st = connexion.createStatement();
            rst = st.executeQuery("select * from  historique_cnx_dec");
            String sql = "insert into historique_cnx_dec(login,date_cnx,nb_cnx,date_decnx) values(?)";

            prepare = connexion.prepareStatement(sql);
            prepare.setString(1, date);
                        prepare.setString(2, date);
            prepare.setInt(3,4);

            prepare.setString(4, date);
            prepare.execute();

            Connexion cnx = new Connexion();
            cnx.setVisible(true);
            this.hide();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, "exception!" + e.getMessage());
        }

         */
    }//GEN-LAST:event_btn_quitterActionPerformed

    private void btn_historique1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historique1ActionPerformed
        Historique his = new Historique();
        his.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_historique1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lbBienvenue.setText("Bonjour " + PropriGlobal.user_Connect.getPrenom() + " "+ PropriGlobal.user_Connect.getNom().toUpperCase());    }//GEN-LAST:event_formWindowOpened

    private void btVoirProfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoirProfilActionPerformed
        // TODO add your handling code here:
        VoirMonProfil maj = new VoirMonProfil();
        maj.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_btVoirProfilActionPerformed

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
            java.util.logging.Logger.getLogger(Fenetre_de_demarage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre_de_demarage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre_de_demarage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre_de_demarage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre_de_demarage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoirProfil;
    private javax.swing.JButton btn_ajouter_objectif;
    private javax.swing.JButton btn_help;
    private javax.swing.JButton btn_historique1;
    private javax.swing.JButton btn_poids_mise_ajour;
    private javax.swing.JButton btn_quitter;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbBienvenue;
    // End of variables declaration//GEN-END:variables
}
