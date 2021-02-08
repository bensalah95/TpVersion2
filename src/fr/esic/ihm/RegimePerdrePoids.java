
package fr.esic.ihm;

import de.esic.dao.ConnexionBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegimePerdrePoids extends javax.swing.JFrame {

   
    public RegimePerdrePoids() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        type_activite = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nbre_kg = new javax.swing.JTextField();
        lb_date_start_regime = new javax.swing.JLabel();
        txt_periode_regime = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_poids_actuel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_poids_souhaité = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combox_cadence = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nbre_heure = new javax.swing.JTextField();
        btn_valider_regime = new javax.swing.JButton();
        btn_commencer_regime = new javax.swing.JButton();
        btn_acceeuil = new javax.swing.JButton();
        btn_quitter = new javax.swing.JButton();
        com_box_type = new javax.swing.JComboBox();
        btn_commencer_regime1 = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 58, 111));
        jLabel2.setText("Nombre de  Kilogramme a perdre :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 50));

        txt_nbre_kg.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_nbre_kg.setForeground(new java.awt.Color(0, 58, 111));
        jPanel1.add(txt_nbre_kg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 80, 50));

        lb_date_start_regime.setBackground(new java.awt.Color(255, 168, 138));
        jPanel1.add(lb_date_start_regime, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 280, 40));

        txt_periode_regime.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_periode_regime.setForeground(new java.awt.Color(0, 58, 111));
        jPanel1.add(txt_periode_regime, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 80, 50));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 58, 111));
        jLabel1.setText("Periode de régime (en mois) :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 220, 50));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 58, 111));
        jLabel3.setText("Poids actuel :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 50));

        txt_poids_actuel.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_poids_actuel.setForeground(new java.awt.Color(0, 58, 111));
        jPanel1.add(txt_poids_actuel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 100, 50));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 58, 111));
        jLabel4.setText("Poids souhaité:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 50));

        txt_poids_souhaité.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_poids_souhaité.setForeground(new java.awt.Color(0, 58, 111));
        jPanel1.add(txt_poids_souhaité, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 100, 50));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 58, 111));
        jLabel5.setText("Cadence de régime :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 140, 40));

        combox_cadence.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        combox_cadence.setForeground(new java.awt.Color(0, 58, 111));
        combox_cadence.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Journaliére", "Hebdomadaire" }));
        combox_cadence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_cadenceActionPerformed(evt);
            }
        });
        jPanel1.add(combox_cadence, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, 140, 40));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 58, 111));
        jLabel6.setText("Type d'activité : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 140, 40));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 58, 111));
        jLabel7.setText("Nombre d'Heures :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 150, 40));

        txt_nbre_heure.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_nbre_heure.setForeground(new java.awt.Color(0, 58, 111));
        jPanel1.add(txt_nbre_heure, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 140, 40));

        btn_valider_regime.setBackground(new java.awt.Color(0, 58, 111));
        btn_valider_regime.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_valider_regime.setForeground(new java.awt.Color(255, 255, 255));
        btn_valider_regime.setText("Valider Régime");
        btn_valider_regime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_valider_regimeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_valider_regime, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 220, 40));

        btn_commencer_regime.setBackground(new java.awt.Color(0, 153, 0));
        btn_commencer_regime.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_commencer_regime.setText("Commencer");
        btn_commencer_regime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_commencer_regimeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_commencer_regime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 150, 40));

        btn_acceeuil.setBackground(new java.awt.Color(255, 168, 138));
        btn_acceeuil.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_acceeuil.setForeground(new java.awt.Color(255, 255, 255));
        btn_acceeuil.setText("Acceuil");
        btn_acceeuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_acceeuilActionPerformed(evt);
            }
        });
        jPanel1.add(btn_acceeuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 40));

        btn_quitter.setBackground(new java.awt.Color(255, 0, 0));
        btn_quitter.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_quitter.setForeground(new java.awt.Color(255, 255, 255));
        btn_quitter.setText("Deconnexion");
        btn_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 150, 40));

        com_box_type.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        com_box_type.setForeground(new java.awt.Color(0, 58, 111));
        com_box_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marche", "Course" }));
        com_box_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_box_typeActionPerformed(evt);
            }
        });
        jPanel1.add(com_box_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 140, 40));

        btn_commencer_regime1.setBackground(new java.awt.Color(255, 198, 147));
        btn_commencer_regime1.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_commencer_regime1.setText("Ajouter un autre objectif");
        btn_commencer_regime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_commencer_regime1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_commencer_regime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 220, 40));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/esic/img/perdre poids.jpg"))); // NOI18N
        jPanel1.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 560));

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

    private void combox_cadenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_cadenceActionPerformed
    }//GEN-LAST:event_combox_cadenceActionPerformed
    private void btn_valider_regimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_valider_regimeActionPerformed
  
        int nbre_kilo=Integer.parseInt(txt_nbre_kg.getText());
        int periode=Integer.parseInt(txt_periode_regime.getText());
        double poids_initial=Double.parseDouble(txt_poids_actuel.getText());
        double poids_souhaite=Double.parseDouble(txt_poids_souhaité.getText());
        String cadence=combox_cadence.  getSelectedItem().toString();  
        int nbre_heure=Integer.parseInt(txt_nbre_heure.getText());
        String type_activité=com_box_type.  getSelectedItem().toString();  
            
        
    
  btn_commencer_regime.setEnabled(true);
          btn_commencer_regime1.setEnabled(true);
        String sql ="insert into regime_perdre_poids (Nombre_kilo,periode_regime,poids_actuel,poids_final,cadence,nbre_heure,type_activité) values(?,?,?,?,?,?,?)";
   
   
        try {
            Connection connexion = ConnexionBd.getConnection();
            PreparedStatement prepare;
            prepare = connexion.prepareStatement(sql);
            prepare.setInt(1, nbre_kilo);
            prepare.setInt(2, periode);
            prepare.setDouble(3, poids_initial);
            prepare.setDouble(4, poids_souhaite);
            prepare.setString(5, cadence);
            prepare.setInt(6, nbre_heure);
            prepare.setString(7, type_activité);
            prepare.execute();
            JOptionPane.showMessageDialog(rootPane, "Régime Ajouté avec succés!!");

             
        } catch (SQLException ex) {
            Logger.getLogger(Fenetre_IMC.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_valider_regimeActionPerformed

    private void com_box_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_box_typeActionPerformed
    }//GEN-LAST:event_com_box_typeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        btn_commencer_regime.setEnabled(false);
        btn_commencer_regime1.setEnabled(false);
        /*
     btn_valider_regime.setEnabled(false);*/
    }//GEN-LAST:event_formWindowOpened

    private void btn_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitterActionPerformed
        Connexion cnx = new Connexion();
        cnx.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_quitterActionPerformed

    private void btn_acceeuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acceeuilActionPerformed
        Fenetre_de_demarage fn = new Fenetre_de_demarage();
        fn.setVisible(true);
        this.hide();

    }//GEN-LAST:event_btn_acceeuilActionPerformed

    private void btn_commencer_regimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_commencer_regimeActionPerformed
 Commencer_Sport sport= new Commencer_Sport();
        sport.setVisible(true);
        this.hide();


    }//GEN-LAST:event_btn_commencer_regimeActionPerformed

    private void btn_commencer_regime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_commencer_regime1ActionPerformed
      Ajouter_nv_objectif nv=new Ajouter_nv_objectif();
      nv.setVisible(true);
      this.hide();
    }//GEN-LAST:event_btn_commencer_regime1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(RegimePerdrePoids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegimePerdrePoids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegimePerdrePoids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegimePerdrePoids.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegimePerdrePoids().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acceeuil;
    private javax.swing.JButton btn_commencer_regime;
    private javax.swing.JButton btn_commencer_regime1;
    private javax.swing.JButton btn_quitter;
    private javax.swing.JButton btn_valider_regime;
    private javax.swing.JComboBox com_box_type;
    private javax.swing.JComboBox combox_cadence;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_date_start_regime;
    private javax.swing.JTextField txt_nbre_heure;
    private javax.swing.JTextField txt_nbre_kg;
    private javax.swing.JTextField txt_periode_regime;
    private javax.swing.JTextField txt_poids_actuel;
    private javax.swing.JTextField txt_poids_souhaité;
    private javax.swing.ButtonGroup type_activite;
    // End of variables declaration//GEN-END:variables


}
