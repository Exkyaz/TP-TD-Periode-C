import java.util.LinkedList;

public class Terrain {
    private int largeur, hauteur;
    private LinkedList<Robot> robots;

    //contruit un terrain vide
    public Terrain(int largeur, int hauteur) {
        assert(hauteur > 0 && largeur > 0);
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.robots = new LinkedList<>();
    }

    //ajoute un élement au terrain
    public void ajoute(Robot r) { //complete
        robots.add(r);
    }

    //simule des déplacements des éléments du terrain
    public void simule (int d) {
        //complete

    }

    public String toString() {
        //complete
    }
}