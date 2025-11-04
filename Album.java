public class Album {
    private String titre;
    private String artiste;
    private int annee;
    private java.util.List<String> chansons;

    public Album(String titre, String artiste, int annee) {
        this.titre = titre;
        this.artiste = artiste;
        this.annee = annee;
        this.chansons = new java.util.ArrayList<>();
    }

    public void ajouterChanson(String chanson) {
        chansons.add(chanson);
    }

    public void afficherInfos() {
        System.out.println("Album: " + titre);
        System.out.println("Artiste: " + artiste);
        System.out.println("Année de sortie: " + annee);
        System.out.println("Chansons:");
        for (String chanson : chansons) {
            System.out.println(" - " + chanson);
        }
    }
}
