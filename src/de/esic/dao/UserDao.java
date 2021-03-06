

package de.esic.dao;

import fr.esic.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDao {
   
     public static User getByLoginAndPassword(String login,String password) throws SQLException{
   User u=null;
   String sql="select * from sportif where login=? and mdp=?";
        Connection connexion=ConnexionBd.getConnection();
   
        PreparedStatement prepare=connexion.prepareStatement(sql);
        prepare.setString(1,login);
        prepare.setString(2,password);
        ResultSet rs=prepare.executeQuery();
   
        
        if (rs.next()){
        u =new User();
        u.setId(rs.getInt("id"));
        u.setPrenom(rs.getString("prenom"));
        u.setNom(rs.getString("nom"));
        u.setLogin(rs.getString("login"));
        u.setPassword(rs.getString("mdp"));
        
        
        }
        
        
   return u;
    }
  /*String nom, String prenom, String sex, String login, String password, String password2, double poids, int age*/
    
    public static void insertPerson(User u)throws SQLException{
           /*Date thisDate=new Date();
 SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss ");
        */
        String sql ="insert into sportif(nom,prenom,sex,login,mdp,mdp2,poids,age,taille) values(?,?,?,?,?,?,?,?,?)";
   
    Connection connexion=ConnexionBd.getConnection();
    PreparedStatement prepare =connexion.prepareStatement(sql);
    
    
    
    prepare.setString(1, u.getNom());
    prepare.setString(2, u.getPrenom()); 
    prepare.setString(3,u.getSex());
    prepare.setString(4, u.getLogin());
    prepare.setString(5, u.getPassword());
    prepare.setString(6, u.getPassword2());
    prepare.setDouble(7,u.getPoids());
    prepare.setInt(8,u.getAge());
    prepare.setInt(9,u.getTaille());

   
         //prepare.setString(9, date.getText());


    
    
    
    prepare.execute();


    }

      public static List<User> getAll() throws SQLException{
    
     List <User> users=new ArrayList<>();
     String sql="select * from sportif ";
        Connection connexion=ConnexionBd.getConnection();
   
        Statement requete=connexion.createStatement();
      
        ResultSet rs=requete.executeQuery(sql);
   
        
        while(rs.next()){
       User  u =new User();
        u.setId(rs.getInt("id"));
        u.setPrenom(rs.getString("nom"));
        u.setNom(rs.getString("prenom"));
        u.setLogin(rs.getString("login"));
        
        users.add(u);
        }
        return users ;
        }

      public static List<User> getHistorique() throws SQLException{
        List<User> users = new ArrayList<>();
        
        String sql = "SELECT date_cnx FROM historique_cnx_dec";
        Connection connexion = ConnexionBd.getConnection();

        Statement requete=connexion.createStatement();
      
        ResultSet rs=requete.executeQuery(sql);
        while (rs.next()) {
            User u = new User();
            u.setDate_cnx(rs.getString("date_cnx"));
            

            users.add(u);

        }
        return users;
    }
      public static List<User> getHistSport() throws SQLException{
        List<User> users = new ArrayList<>();
        
        String sql = "SELECT * FROM regime_perdre_poids";
        Connection connexion = ConnexionBd.getConnection();

 

        Statement requete=connexion.createStatement();
      
        ResultSet rs=requete.executeQuery(sql);
        while (rs.next()) {
            User u = new User();
            u.setCadence(rs.getString("cadence"));
            u.setNbre_heure(rs.getInt("nbre_heure"));
            u.setNombre_kilo(rs.getInt("nombre_kilo"));
            u.setPoids_final(rs.getInt("poids_final"));
            u.setPeriode_regime(rs.getInt("periode_regime"));
            u.setPoids_actuel(rs.getInt("poids_actuel"));
            u.setType_activité(rs.getString("type_activité"));
            users.add(u);

 

        }
        return users;
    }

      public static void getInfo(String info) throws SQLException{
        
        String sql = "SELECT * FROM sportif";
        Connection connexion = ConnexionBd.getConnection();

 

        Statement requete=connexion.createStatement();
      
        ResultSet rs=requete.executeQuery(sql);
        while (rs.next()) {
            User u = new User();
           
            if(info.equals("age")){
                u.setAge(rs.getInt("age"));
            }
            if(info.equals("taille")){
                u.setAge(rs.getInt("taille"));
            }
            
            if(info.equals("poids")){
                u.setPoids(rs.getDouble("poids"));
            }
            
            /*
            
            
            u.setCadence(rs.getString("cadence"));
            u.setNbre_heure(rs.getInt("nbre_heure"));
            u.setNombre_kilo(rs.getInt("nombre_kilo"));
            u.setPoids_final(rs.getInt("poids_final"));
            u.setPeriode_regime(rs.getInt("periode_regime"));
            u.setPoids_actuel(rs.getInt("poids_actuel"));
            u.setType_activité(rs.getString("type_activité"));
            users.add(u);
*/
 

        }
    }


    
}