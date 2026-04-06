public class Etudiant {

    private String nom;
    private String prenom;
    private int age;
    private String filiere;
    private int id ;

    // Constructeur
    public Etudiant(String nom, String prenom, int age, String filiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.filiere = filiere;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getFiliere() {
        return filiere;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    // Méthode d'affichage
    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Age: " + age);
        System.out.println("Filiere: " + filiere);
    }
}
