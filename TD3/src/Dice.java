import java.util.Random;

public class Dice {
    private int valeur = 0;

    private boolean broke = false;
    public void lancer() {
        Random r = new Random();
        this.broken();
        this.valeur = r.nextInt(1, 7);
    }

    public boolean estPlusFortQue(Dice d) {
        return this.valeur>d.valeur;
    }

    public String toString() {
        if (this.broke) {
            return "[cassé]";
        }
        return "["+this.valeur+"]";
    }

    public void broken() {
        Random r = new Random();
        this.broke= r.nextInt(1, 101) == 1;
    }

    public boolean isBroke() {
        return this.broke;
    }
}
