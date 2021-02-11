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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Page_Conexion extends javax.swing.JFrame {
int nbre_cnx;
String log;
   
    public Page_Conexion() {
        initComponents();
        showDate();
        
    }
 public  void showDate(){
        
        Date actuelle = new Date();
       DateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss ");
       lb_date.setText(" "+dateFormat.format(actuelle));
     
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        page_cnx = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        bt_connexion = new javax.swing.JButton();
        bt_retour = new javax.swing.JButton();
        lb_msg = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_pwd = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        page_cnx.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 58, 111));
        jLabel1.setText("LOGIN");
        page_cnx.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 58, 111));
        jLabel2.setText("PASSWORD");
        page_cnx.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, -1));

        txt_login.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        page_cnx.add(txt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 280, -1));

        bt_connexion.setBackground(new java.awt.Color(255, 255, 255));
        bt_connexion.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt_connexion.setForeground(new java.awt.Color(0, 102, 0));
        bt_connexion.setText("Connexion");
        bt_connexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_connexionActionPerformed(evt);
            }
        });
        page_cnx.add(bt_connexion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 240, -1));

        bt_retour.setBackground(new java.awt.Color(255, 255, 255));
        bt_retour.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        bt_retour.setForeground(new java.awt.Color(0, 51, 255));
        bt_retour.setText("Retour");
        bt_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_retourActionPerformed(evt);
            }
        });
        page_cnx.add(bt_retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 120, -1));

        lb_msg.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lb_msg.setForeground(new java.awt.Color(255, 0, 0));
        page_cnx.add(lb_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 470, 30));

        lb_date.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        lb_date.setForeground(new java.awt.Color(153, 0, 255));
        page_cnx.add(lb_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 200, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 3, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 133, 205));
        jLabel10.setText("Conn");
        page_cnx.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 110, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(172, 113, 193));
        jLabel11.setText("exion");
        page_cnx.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 100, 30));

        txt_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwdActionPerformed(evt);
            }
        });
        page_cnx.add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 280, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fr/esic/img/cnx_img.jpg"))); // NOI18N
        page_cnx.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -150, 740, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(page_cnx, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(page_cnx, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_connexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_connexionActionPerformed
        Date actuelle = new Date();
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss ");
        lb_date.setText(""+dateFormat.format(actuelle));
        String date=dateFormat.format(actuelle);
        String date_cnx;
        date_cnx = date;

        String login=txt_login.getText();
        String password=txt_pwd.getText();

        try{
            Connection connexion=ConnexionBd.getConnection();
            PreparedStatement prepare;
            Statement st;
            ResultSet rst;
            st=connexion.createStatement();
            rst=st.executeQuery("select * from  historique_cnx_dec");
            String sql ="insert into historique_cnx_dec(login,date_cnx,nb_cnx) values(?,?,?)";
            while(rst.next()){
                log=rst.getString("login");
                if(log.equals(login)){
                    nbre_cnx++;

                }}

                prepare = connexion.prepareStatement(sql);
                prepare.setString(1,login);
                prepare.setString(2,date);
                prepare.setInt(3,nbre_cnx);

                prepare.execute();

                User u = UserDao.getByLoginAndPassword(login, password);

                if(u!=null){
                    PropriGlobal.user_Connect=u;
                    if(nbre_cnx<1){
                        HelpConnexion helpConnexion = new HelpConnexion();
                        helpConnexion.setVisible(true);

                        this.setVisible(false);
                    }
                    else if(u.getPoids() < 1 || u.getTaille() < 1){
                        RappelMessageCo rapl = new RappelMessageCo();
                        rapl.setVisible(true);
                        this.setVisible(false);
                    }
                    else{
                        Fenetre_de_demarage demarage= new Fenetre_de_demarage();
                        demarage.setVisible(true);
                        this.hide();
                    }

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
                prepare = connexion.prepareStatement(sql);
                prepare.setInt(1, nbre_kilo);*/
    }//GEN-LAST:event_bt_connexionActionPerformed

    private void bt_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_retourActionPerformed

        FitnessTime fit =new FitnessTime();
        fit.setVisible(true);
        this.hide();
        /*String nom, String prenom, String sex, String login, String password, String password2, float poids, int age*/
        /* try{
            UserDao.insertPerson(new User ("manel","bensalah","féminin","manel","bbbb","bbbb",65,25));

        }catch(Exception e){

            JOptionPane.showMessageDialog(rootPane, "excception"+e.getMessage());}  */
    }//GEN-LAST:event_bt_retourActionPerformed

    private void txt_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwdActionPerformed

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
            java.util.logging.Logger.getLogger(Page_Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page_Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page_Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page_Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page_Conexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_connexion;
    private javax.swing.JButton bt_retour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_date;
    private javax.swing.JLabel lb_msg;
    private javax.swing.JPanel page_cnx;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPasswordField txt_pwd;
    // End of variables declaration//GEN-END:variables
}
