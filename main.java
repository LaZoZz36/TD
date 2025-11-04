import java.util.ArrayList;
// Ensure the 'projet' package exists and contains the required classes.
// If your classes are in the same directory as main.java, remove the 'projet.' prefix:
import Playlist;
import Utilisateur;
import Album;
import Titre;
import Artiste;

public class Main {
    public static void main(String[] args) {
        Utilisateur user1 = new Utilisateur("Doe", "John", "05/03/2005", "123 Main St", "Anytown", "12345", "reyenzo.36@gmail.com", "555-1234", "password123");
        Artiste artist1 = new Artiste("The Beatles", "Rock");
        Album album1 = new Album("Abbey Road", artist1, 1969);
        Titre titre1 = new Titre("Come Together", artist1, 259);
        Titre titre2 = new Titre("Something", artist1, 182);
        album1.ajouterTitre(titre1);
        album1.ajouterTitre(titre2);
        Playlist playlist1 = new Playlist("My Favorites");
        playlist1.ajouterTitre(titre1);
        playlist1.ajouterTitre(titre2);
        user1.ajouterPlaylist(playlist1);
        System.out.println("User: " + user1.getPrenom() + " " + user1.getNom());
        System.out.println("Playlist: " + playlist1.getNom());
        for (Titre titre : playlist1.getTitres()) {
            System.out.println(" - " + titre.getNom() + " by " + titre.getArtiste().getNom());
        }
    }
}
