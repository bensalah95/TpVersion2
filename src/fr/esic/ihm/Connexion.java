
package fr.esic.ihm;

import de.esic.dao.ConnexionBd;
import de.esic.dao.UserDao;
import fr.esic.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class Connexion extends javax.swing.JFrame {


   
    
    public Connexion() {
        initComponents();
       showDate();
   
    }
   void showDate(){
        
        Date actuelle = new Date();
       DateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY ");
       lb_date.setText(" "+dateFormat.format(actuelle));
     
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
        lb_date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 58, 111));
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 140, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 58, 111));
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 140, -1));

        txt_login.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(txt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 320, -1));

        txt_pwd.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 320, -1));

        bt_connexion.setBackground(new java.awt.Color(255, 255, 255));
        bt_connexion.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt_connexion.setForeground(new java.awt.Color(0, 102, 0));
        bt_connexion.setText("Connexion");
        bt_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_connexionActionPerformed(evt);
            }
        });
        getContentPane().add(bt_connexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 240, -1));

        bt_inscription.setBackground(new java.awt.Color(255, 255, 255));
        bt_inscription.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt_inscription.setForeground(new java.awt.Color(0, 51, 255));
        bt_inscription.setText("inscription ?");
        bt_inscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inscriptionActionPerformed(evt);
            }
        });
        getContentPane().add(bt_inscription, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 630, 310, -1));

        lb_msg.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lb_msg.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lb_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 470, 80));

        lb_date.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        lb_date.setForeground(new java.awt.Color(153, 0, 255));
        getContentPane().add(lb_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 220, 30));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 168, 237));
        jLabel3.setText("Se");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 40, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 133, 205));
        jLabel10.setText("Conn");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 60, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(172, 113, 193));
        jLabel11.setText("ecter");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 30, 70, 30));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/esic/img/cnx_img.jpg"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 970, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_connexionActionPerformed
         Date actuelle = new Date();
       DateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY ");
       lb_date.setText(" "+dateFormat.format(actuelle));  
      String date=dateFormat.format(actuelle);
        String date_cnx; 
        date_cnx = date;
        
        String login=txt_login.getText();
        String password=txt_pwd.getText();
        String sql ="insert into historique_cnx_dec(login,date_cnx) values(?,date_cnx)";
        try{
            
          Connection connexion=ConnexionBd.getConnection();
          PreparedStatement prepare;
          prepare = connexion.prepareCall(sql);
          prepare.setString(1,login);
         // prepare.setString(2,date);
          prepare.execute();

            
            User u =UserDao.getByLoginAndPassword(login, password);

            if(u!=null){
                JOptionPane.showMessageDialog(rootPane,"connexion reussi!");
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
        
        /*
        String sql ="insert into regime_perdre_poids (nbre_kilo,periode,poids_initial,poids_souhaite,cadence,nbre_heure,type_activité) values(?,?,?,?,?,?,?)";
   
   
        try {
            Connection connexion=ConnexionBd.getConnection();
            PreparedStatement prepare;
            prepare = connexion.prepareCall(sql);
            prepare.setInt(1, nbre_kilo);*/
        
        
        
        
        
        
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
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb_date;
    private javax.swing.JLabel lb_msg;
    private javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_pwd;
    // End of variables declaration//GEN-END:variables
}
