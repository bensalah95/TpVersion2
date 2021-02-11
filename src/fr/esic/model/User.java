package fr.esic.model;


public class User {
    private int id;
    private String nom;
    private  String prenom;
    private  String sex;
    private String login;
    private String password;
    private String password2;
    private double poids;
    private int age;
    private int taille;
    private String date_cnx;
    private int poids_actuel;
    private int poids_final;
    private int Nombre_kilo;
    private int periode_regime;
    private String cadence;
    private String type_activité;
    private int nbre_heure;

    public int getPoids_actuel() {
        return poids_actuel;
    }

    public void setPoids_actuel(int poids_actuel) {
        this.poids_actuel = poids_actuel;
    }

    public int getPoids_final() {
        return poids_final;
    }

    public void setPoids_final(int poids_final) {
        this.poids_final = poids_final;
    }

    public int getNombre_kilo() {
        return Nombre_kilo;
    }

    public void setNombre_kilo(int Nombre_kilo) {
        this.Nombre_kilo = Nombre_kilo;
    }

    public int getPeriode_regime() {
        return periode_regime;
    }

    public void setPeriode_regime(int periode_regime) {
        this.periode_regime = periode_regime;
    }

    public String getCadence() {
        return cadence;
    }

    public void setCadence(String cadence) {
        this.cadence = cadence;
    }

    public String getType_activité() {
        return type_activité;
    }

    public void setType_activité(String type_activité) {
        this.type_activité = type_activité;
    }

    public int getNbre_heure() {
        return nbre_heure;
    }

    public void setNbre_heure(int nbre_heure) {
        this.nbre_heure = nbre_heure;
    }

    public User(String nom, String prenom, String login, String password, String password2) {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.password2 = password2;
    }
    
    
     public User(String nom, String prenom, String sex, String login, String password, String password2, double poids, int age, int taille) {
     
        this.nom = nom;
        this.prenom = prenom;
        this.sex = sex;
        this.login = login;
        this.password = password;
        this.password2 = password2;
        this.poids = poids;
        this.age = age;
        this.taille = taille;
     }

    public User(String nom, String prenom, String sex, String login, String password, String password2, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.sex = sex;
        this.login = login;
        this.password = password;
        this.password2 = password2;
        this.age = age;
    }
     
     
     

    public String getDate_cnx() {
        return date_cnx;
    }

    public void setDate_cnx(String date_cnx) {
        this.date_cnx = date_cnx;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
      public User() {
       
    }


    public String getSex() {
        return sex;
    }

    public String getPassword2() {
        return password2;
    }

    public double getPoids() {
        return poids;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
   
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    
    
 
    
}