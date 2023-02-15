public class Compte {

    //Attributs d'instance
    private int numero;
    private double solde;

    //Attribut de classe
    private static double decouvertMax=-1000;

    private static int cpt=0;

    //Méthode de classe
    public static void setDecouvertMax(double d) {
        assert(d<=0);
        decouvertMax = d;
    }

    public static double getDecouvertMax() {
        return decouvertMax;
    }

    public boolean estRetirable(double d){
        return d>0.0 && solde-d >= decouvertMax;
    }
    public void retrait(double montant) {
        assert(estRetirable(montant));
        solde-=montant;
    }

    public void depot(double montant) {
        assert(montant > 0.);
        this.solde+=montant;
    }

    public Compte(double solde) {
        assert(solde>=0.0);
        this.solde = solde;
        this.numero=++cpt;
    }

    public void transfert(Compte c, double montant) {
        assert(this.estRetirable(montant));
        this.retrait(montant);
        c.depot(montant);
    }

    public Compte() {
        this(0.); //invoque le constructeur prenant un double en paramètre
    }

    @Override
    public String toString() {
        if (solde<0.) {
            return "le compte n°"+numero+" est à découvert de "+(solde*-1)+"€";
        } else {
            return "le compte n°"+numero+" est crédité de "+(solde)+"€";
        }
    }
}
