public class Titre {
    private String nom;
    private int duree;
    private String style;
    private Artiste artiste;


    public Titre(String nom, int duree, String style, Artiste artiste) {
        this.nom = nom;
        this.duree = duree;
        this.style = style;
        this.artiste = artiste;
    }


    public int getDuree() { return duree; }
    public String getNom() { return nom; }
    public Artiste getArtiste() { return artiste; }
    public String getStyle() { return style; }

  
    public Ecoute ecoute(int temps, double cout) {
        return new Ecoute(this, temps, cout);
    }
}

class Ecoute {
    private Titre titre;
    private int temps;
    private double cout;

    public Ecoute(Titre titre, int temps, double cout) {
        this.titre = titre;
        this.temps = temps;
        this.cout = cout;
    }

    public Titre getTitre() { return titre; }
    public int getTemps() { return temps; }
    public double getCout() { return cout; }
}