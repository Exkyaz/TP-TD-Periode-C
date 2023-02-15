import java.util.Random;

public class Athlete {

    public static final double MIN_TEMPS = 9.0;
    public static final double MAX_TEMPS = 14.0;
    int nbDossard;
    boolean temoin;
    double dernierTemps;
    Athlete suivant;
    public Athlete() {
        nbDossard = new Random().nextInt(1,9999);
        temoin=false;
        dernierTemps=0;
    }

    public Athlete(Athlete suivant) {
        nbDossard = new Random().nextInt(1,9999);
        temoin=false;
        dernierTemps=0;
        this.suivant = suivant;
    }

    public void prendLeTemoin() {
        temoin=true;
    }

    public void rendLeTemoin() {
        temoin=false;
    }

    public boolean aLeTemoin() {
        return temoin;
    }

    public void passeLeTemoin(Athlete a) {
        assert this.aLeTemoin() && !a.aLeTemoin();
        this.rendLeTemoin();
        a.prendLeTemoin();
    }

    public void court(){
        assert this.aLeTemoin();
        dernierTemps = new Random().nextDouble(MIN_TEMPS,MAX_TEMPS+1);
    }

    public double getDernierTemps() {
        return dernierTemps;
    }

    @Override
    public String toString() {
        return "Coureur dossard : " + nbDossard;
    }
}
