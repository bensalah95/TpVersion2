/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.esic.ihm;

import de.esic.dao.ConnexionBd;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marye
 */
public class Fenetre_IMC extends javax.swing.JFrame {

    /**
     * Creates new form Fenetre_IMC
     */
    public Fenetre_IMC() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titre = new javax.swing.JLabel();
        poids = new javax.swing.JLabel();
        taille = new javax.swing.JLabel();
        imc = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        conseil = new javax.swing.JLabel();
        btn_maigrir = new javax.swing.JButton();
        btn_getpoids = new javax.swing.JButton();
        btn_help = new javax.swing.JButton();
        lb_conseil = new javax.swing.JLabel();
        lb_statut = new javax.swing.JLabel();
        lb_res_imc = new javax.swing.JLabel();
        txt_taille = new javax.swing.JTextField();
        txt_poids = new javax.swing.JTextField();
        btn_imc = new javax.swing.JButton();
        btn_maintien_poids = new javax.swing.JButton();
        titre1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titre.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(255, 105, 58));
        titre.setText("Gagner ... ");
        jPanel1.add(titre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 90, -1));

        poids.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        poids.setForeground(new java.awt.Color(0, 58, 111));
        poids.setText("POIDS (Kg)");
        jPanel1.add(poids, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 140, 40));

        taille.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        taille.setForeground(new java.awt.Color(0, 58, 111));
        taille.setText("TAILLE(cm)");
        jPanel1.add(taille, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 140, 40));

        imc.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        imc.setForeground(new java.awt.Color(0, 58, 111));
        imc.setText("IMC: ");
        jPanel1.add(imc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 40));

        status.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        status.setForeground(new java.awt.Color(0, 58, 111));
        status.setText("Status :");
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 140, 40));

        conseil.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        conseil.setForeground(new java.awt.Color(0, 58, 111));
        conseil.setText("Conseil");
        jPanel1.add(conseil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 140, 40));

        btn_maigrir.setBackground(new java.awt.Color(255, 0, 0));
        btn_maigrir.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_maigrir.setForeground(new java.awt.Color(255, 255, 255));
        btn_maigrir.setText("Perdre Poids");
        btn_maigrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_maigrirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_maigrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 140, 40));

        btn_getpoids.setBackground(new java.awt.Color(255, 102, 0));
        btn_getpoids.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_getpoids.setForeground(new java.awt.Color(255, 255, 255));
        btn_getpoids.setText("Gagner Poids");
        btn_getpoids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_getpoidsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_getpoids, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 620, 140, 40));

        btn_help.setBackground(new java.awt.Color(102, 102, 102));
        btn_help.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_help.setForeground(new java.awt.Color(255, 255, 255));
        btn_help.setText("Help");
        btn_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_helpActionPerformed(evt);
            }
        });
        jPanel1.add(btn_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 140, 40));

        lb_conseil.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jPanel1.add(lb_conseil, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 670, 40));

        lb_statut.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jPanel1.add(lb_statut, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 670, 40));

        lb_res_imc.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jPanel1.add(lb_res_imc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 530, 40));
        jPanel1.add(txt_taille, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 140, 40));
        jPanel1.add(txt_poids, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 140, 40));

        btn_imc.setBackground(new java.awt.Color(0, 204, 204));
        btn_imc.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_imc.setForeground(new java.awt.Color(0, 58, 111));
        btn_imc.setText("Calculer IMC");
        btn_imc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imcActionPerformed(evt);
            }
        });
        jPanel1.add(btn_imc, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 140, 40));

        btn_maintien_poids.setBackground(new java.awt.Color(0, 153, 0));
        btn_maintien_poids.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_maintien_poids.setForeground(new java.awt.Color(255, 255, 255));
        btn_maintien_poids.setText("Maintien Poids");
        btn_maintien_poids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_maintien_poidsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_maintien_poids, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 140, 40));

        titre1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        titre1.setForeground(new java.awt.Color(153, 170, 247));
        titre1.setText("Maintien ....");
        jPanel1.add(titre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 130, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 156, 83));
        jLabel1.setText("Ou Perdre du Poids!!! ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        img.setBackground(new java.awt.Color(255, 255, 255));
        img.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        img.setForeground(new java.awt.Color(0, 58, 111));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/esic/img/imc.jpg"))); // NOI18N
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 960, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
double res_imc;
    private void btn_imcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imcActionPerformed
   int taille =Integer.parseInt(txt_taille.getText());
   double poids =Double.parseDouble(txt_poids.getText());
        
   res_imc=poids/(taille*taille)*10000;
   
        lb_res_imc.setText(res_imc+"");
        if(res_imc<18.5)
            
        {
        lb_statut.setText("Insuffisance pondérale maigreur");
        lb_statut.setForeground(Color.red );
        btn_getpoids.setEnabled(true);
        btn_maigrir.setEnabled(false);
        btn_maintien_poids.setEnabled(false);
        lb_conseil.setText("Votre poids apparaît trop faible par rapport à votre taille. ");
        }
        
        
         if(res_imc>=18.5&& res_imc<25)
            
        {
        lb_statut.setText("Corpulence normale");
        lb_statut.setForeground(Color.green );
         btn_getpoids.setEnabled(false);
        btn_maigrir.setEnabled(false);
        btn_maintien_poids.setEnabled(true);
        lb_conseil.setText("Votre poids est adapté à votre taille. "
                + "Gardez vos habitudes alimentaires pour conserver");
         
        }
         if(res_imc>=25 && res_imc<30)
            
        {
        lb_statut.setText("Surpoids");
         lb_statut.setForeground(Color.yellow);
             btn_maintien_poids.setEnabled(false);
         btn_getpoids.setEnabled(false);
         btn_maigrir.setEnabled(true);
         lb_conseil.setText("Votre poids commence à devenir élevé par rapport à votre taille. ");
        
        }
         
          if(res_imc>=30 && res_imc<35)   
        {
        lb_statut.setText("Obésité modérée");
         lb_statut.setForeground(Color.red );
           btn_maintien_poids.setEnabled(false);
         btn_getpoids.setEnabled(false);
         btn_maigrir.setEnabled(true);
         lb_conseil.setText("Votre poids est trop élevé par rapport à votre taille. ");
        
        }
           if(res_imc>=35 && res_imc<40)   
        {
        lb_statut.setText("Obésité sévere");
         lb_statut.setForeground(Color.red );
            btn_maintien_poids.setEnabled(false);
         btn_getpoids.setEnabled(false);
         btn_maigrir.setEnabled(true);
         lb_conseil.setText("Votre poids est trop élevé par rapport à votre taille. ");

        
        }
           
            if(res_imc>=45)   
        {
        lb_statut.setText("Obésité morbide");
         lb_statut.setForeground(Color.red );
           btn_maintien_poids.setEnabled(false);
         btn_getpoids.setEnabled(false);
         btn_maigrir.setEnabled(true);
         lb_conseil.setText("Votre poids est trop élevé par rapport à votre taille. ");

        
        }
        
        
        String sql ="insert into imc(poids,taille) values(?,?)";
   
   
        try {
            
            Connection connexion=ConnexionBd.getConnection();
            PreparedStatement prepare;
            prepare = connexion.prepareStatement(sql);
             prepare.setDouble(1, poids);
             prepare.setInt(2, taille);
             prepare.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(Fenetre_IMC.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    /*
    prepare.setString(1, poids);
    prepare.setString(2, u.getPrenom()); */
   
        
        
        
        
        
        
    }//GEN-LAST:event_btn_imcActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       btn_getpoids.setEnabled(false);
       btn_maigrir.setEnabled(false);
        btn_maintien_poids.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn_maigrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_maigrirActionPerformed
RegimePerdrePoids perdre_poids =new RegimePerdrePoids();
perdre_poids.setVisible(true);
this.hide();
        

// TODO add your handling code here:
    }//GEN-LAST:event_btn_maigrirActionPerformed

    private void btn_getpoidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_getpoidsActionPerformed
RegimePerdrePoids perdre_poids =new RegimePerdrePoids();
perdre_poids.setVisible(true);
this.hide();
            }//GEN-LAST:event_btn_getpoidsActionPerformed

    private void btn_maintien_poidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_maintien_poidsActionPerformed

        
        
        
    }//GEN-LAST:event_btn_maintien_poidsActionPerformed

    private void btn_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_helpActionPerformed
        HelpIMC imc = new HelpIMC();
        imc.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_helpActionPerformed

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
            java.util.logging.Logger.getLogger(Fenetre_IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre_IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre_IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre_IMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre_IMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_getpoids;
    private javax.swing.JButton btn_help;
    private javax.swing.JButton btn_imc;
    private javax.swing.JButton btn_maigrir;
    private javax.swing.JButton btn_maintien_poids;
    private javax.swing.JLabel conseil;
    private javax.swing.JLabel imc;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_conseil;
    private javax.swing.JLabel lb_res_imc;
    private javax.swing.JLabel lb_statut;
    private javax.swing.JLabel poids;
    private javax.swing.JLabel status;
    private javax.swing.JLabel taille;
    private javax.swing.JLabel titre;
    private javax.swing.JLabel titre1;
    private javax.swing.JTextField txt_poids;
    private javax.swing.JTextField txt_taille;
    // End of variables declaration//GEN-END:variables
}
