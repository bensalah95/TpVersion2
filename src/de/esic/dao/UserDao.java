
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
        String sql ="insert into sportif(nom,prenom,sex,login,mdp,mdp2,poids,age) values(?,?,?,?,?,?,?,?)";
   
    Connection connexion=ConnexionBd.getConnection();
    PreparedStatement prepare =connexion.prepareCall(sql);
    
    
    
    prepare.setString(1, u.getNom());
    prepare.setString(2, u.getPrenom()); 
    prepare.setString(3,u.getSex());
    prepare.setString(4, u.getLogin());
    prepare.setString(5, u.getPassword());
    prepare.setString(6, u.getPassword2());
    prepare.setDouble(7,u.getPoids());
    prepare.setInt(8,u.getAge());
   
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



    
    
}
