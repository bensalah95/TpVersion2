
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


/**
 *
 * @author marye
 */
public class Ajouter_nv_objectif extends javax.swing.JFrame {

    /**
     * Creates new form Ajouter_nv_objectif
     */
    public Ajouter_nv_objectif() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_commencer_regime1 = new javax.swing.JButton();
        lb_date_start_regime = new javax.swing.JLabel();
        btn_help = new javax.swing.JButton();
        btn_acceeuil = new javax.swing.JButton();
        com_box_type = new javax.swing.JComboBox();
        txt_nbre_heure = new javax.swing.JTextField();
        btn_valider_regime = new javax.swing.JButton();
        btn_quitter = new javax.swing.JButton();
        btn_commencer_regime = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_commencer_regime1.setBackground(new java.awt.Color(255, 198, 147));
        btn_commencer_regime1.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_commencer_regime1.setForeground(new java.awt.Color(255, 255, 255));
        btn_commencer_regime1.setText("Ajouter un autre objectif");
        jPanel1.add(btn_commencer_regime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 220, 40));

        lb_date_start_regime.setBackground(new java.awt.Color(255, 168, 138));
        jPanel1.add(lb_date_start_regime, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 280, 40));

        btn_help.setBackground(new java.awt.Color(102, 102, 102));
        btn_help.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_help.setForeground(new java.awt.Color(255, 255, 255));
        btn_help.setText("Help");
        btn_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_helpActionPerformed(evt);
            }
        });
        jPanel1.add(btn_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 140, 40));

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

        com_box_type.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        com_box_type.setForeground(new java.awt.Color(0, 58, 111));
        com_box_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marche", "Course" }));
        com_box_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_box_typeActionPerformed(evt);
            }
        });
        jPanel1.add(com_box_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 140, 40));

        txt_nbre_heure.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        txt_nbre_heure.setForeground(new java.awt.Color(0, 58, 111));
        jPanel1.add(txt_nbre_heure, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 190, 140, 40));

        btn_valider_regime.setBackground(new java.awt.Color(0, 58, 111));
        btn_valider_regime.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_valider_regime.setForeground(new java.awt.Color(255, 255, 255));
        btn_valider_regime.setText("Valider");
        btn_valider_regime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_valider_regimeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_valider_regime, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 220, 40));

        btn_quitter.setBackground(new java.awt.Color(255, 0, 0));
        btn_quitter.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_quitter.setForeground(new java.awt.Color(255, 255, 255));
        btn_quitter.setText("Deconnexion");
        btn_quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitterActionPerformed(evt);
            }
        });
        jPanel1.add(btn_quitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 150, 40));

        btn_commencer_regime.setBackground(new java.awt.Color(0, 153, 0));
        btn_commencer_regime.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        btn_commencer_regime.setText("Commencer");
        btn_commencer_regime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_commencer_regimeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_commencer_regime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 150, 40));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 58, 111));
        jLabel6.setText("Type d'activité : ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 40));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 58, 111));
        jLabel7.setText("Nombre des Heures :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/esic/img/perdre poids.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 610));

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

    private void btn_acceeuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_acceeuilActionPerformed
        Fenetre_de_demarage fn =new Fenetre_de_demarage();
        fn.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_acceeuilActionPerformed

    private void com_box_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_box_typeActionPerformed

    }//GEN-LAST:event_com_box_typeActionPerformed
    int Nombre_kilo;
    int periode_regime;
    double poids_actuel;
    double poids_final;
    String cadence ;
    private void btn_valider_regimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_valider_regimeActionPerformed

        int nbre_heure=Integer.parseInt(txt_nbre_heure.getText());
        String type_activité=com_box_type.  getSelectedItem().toString();

        btn_commencer_regime.setEnabled(true);
   
      
        try {
            Connection connexion=ConnexionBd.getConnection();
            PreparedStatement prepare;
            Statement st;
            ResultSet rst;
            st=connexion.createStatement();
            rst=st.executeQuery("select * from  regime_perdre_poids");
          
            if(rst.next()){
         Nombre_kilo=rst.getInt("Nombre_kilo");
         periode_regime=rst.getInt("periode_regime");
         poids_actuel=rst.getDouble("poids_actuel");
         poids_final=rst.getDouble("poids_final");
         cadence=rst.getString("cadence");  
              // System.out.println("bnj"+Nombre_kilo);
             String sql = "insert into regime_perdre_poids (Nombre_kilo,periode_regime,poids_actuel,poids_final,cadence,nbre_heure,type_activité) values(?,?,?,?,?,?,?)";
            prepare = connexion.prepareCall(sql);
            prepare.setInt(1, Nombre_kilo);
            prepare.setInt(2, periode_regime);
            prepare.setDouble(3, poids_actuel);
            prepare.setDouble(4, poids_final);
            prepare.setString(5, cadence);
           
            prepare.setInt(6, nbre_heure);
            prepare.setString(7, type_activité);
            
           
            prepare.execute(); 
            }
       
            
            
            JOptionPane.showMessageDialog(rootPane, "Régime Ajouté avec succés!!");

        } catch (SQLException ex) {
            Logger.getLogger(Fenetre_IMC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_valider_regimeActionPerformed

    private void btn_quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitterActionPerformed
   Page_Conexion cnx= new Page_Conexion();
      cnx.setVisible(true);
      this.hide();
    }//GEN-LAST:event_btn_quitterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
btn_commencer_regime.setEnabled(false);
btn_commencer_regime1.setEnabled(false);

    }//GEN-LAST:event_formWindowOpened

    private void btn_commencer_regimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_commencer_regimeActionPerformed
        Commencer_Sport sport= new Commencer_Sport();
        sport.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_commencer_regimeActionPerformed

    private void btn_helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_helpActionPerformed
        HelpObjectif imc = new HelpObjectif();
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
            java.util.logging.Logger.getLogger(Ajouter_nv_objectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajouter_nv_objectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajouter_nv_objectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajouter_nv_objectif.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajouter_nv_objectif().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acceeuil;
    private javax.swing.JButton btn_commencer_regime;
    private javax.swing.JButton btn_commencer_regime1;
    private javax.swing.JButton btn_help;
    private javax.swing.JButton btn_quitter;
    private javax.swing.JButton btn_valider_regime;
    private javax.swing.JComboBox com_box_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_date_start_regime;
    private javax.swing.JTextField txt_nbre_heure;
    // End of variables declaration//GEN-END:variables
}
