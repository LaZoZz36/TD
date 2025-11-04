import java.util.ArrayList;

public class Playlist {
    private String nom;
    private ArrayList<Titre> titres = new ArrayList<>();

    public Playlist(String nom) {
        this.nom = nom;
    }

    public void ajouterTitre(Titre titre) {
        titres.add(titre);
    }

    public void retirerTitre(Titre titre) {
        titres.remove(titre);
    }

    public ArrayList<Titre> getTitres() {
        return titres;
    }

    public String getNom() {
        return nom;
    }
}