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
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Clock;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Historique extends javax.swing.JFrame {
    /*
Statement st;
ResultSet rs;
    String login;
String date_cnx;
int nb_cnx;

    DefaultTableModel model=new DefaultTableModel();
  */
    public Historique() {
        initComponents();

        
    
               
               
       
       
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        t_historique = new javax.swing.JTable();
        lb_bnj = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_historique.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(t_historique);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, -1, 100));
        getContentPane().add(lb_bnj, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 79, 141, 34));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/esic/img/historique de cnx.jpg"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//lb_bnj.setText("Bonjour "+" "+ PropriGlobal.user_Connect.getNom().toUpperCase()+" "+PropriGlobal.user_Connect.getPrenom()); 
                 /*
          
       model.addColumn("Login");
       model.addColumn("Date De Connexion");
       model.addColumn("Nombre de  fois de connexion");
       
        try {
            Connection connexion = ConnexionBd.getConnection();
             st=connexion.createStatement();  
             String sql="select * from historique_cnx_dec";
             rs=st.executeQuery(sql);
             
                   
           login= rs.getString("login");
           date_cnx= rs.getString("date_cnx");
           nb_cnx= rs.getInt(nb_cnx);
           
             while(rs.next()){
            model.addRow(new Object[]
                    
            {
                
          rs.getString(login),
          rs.getString(date_cnx),
          rs.getInt(nb_cnx)
                    
            });
                    
}
             
        } catch (Exception e) {
        }
        t_historique.setModel(model);
        */
   
    }//GEN-LAST:event_formWindowOpened


    
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
            java.util.logging.Logger.getLogger(Historique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_bnj;
    private javax.swing.JTable t_historique;
    // End of variables declaration//GEN-END:variables
}
