import java.util.ArrayList;

public class Artiste {
    private String nom;
    private ArrayList<String> titres;  
    private double solde;

    public Artiste(String nom) {
        this.nom = nom;
        this.titres = new ArrayList<>(); 
        this.solde = 0.0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<String> getTitres() { 
        return titres;
    }

    public void setTitres(ArrayList<String> titres) { 
        this.titres = titres;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void ajouterTitre(String titre) {
        titres.add(titre); 
    }

    public void afficherTitres() { 
        System.out.println("Titres de " + nom + " :");
        for (String titre : titres) { 
            System.out.println("- " + titre);
        }
    }

    @Override
    public String toString() {
        return "Artiste{" +
                "nom='" + nom + '\'' +
                ", titres=" + titres + 
                ", solde=" + solde +
                '}';
    }
}