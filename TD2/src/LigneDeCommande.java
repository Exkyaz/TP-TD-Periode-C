public class LigneDeCommande {
    Produit p;
    int quantite;

    public static void toString(LigneDeCommande l) {
        System.out.println(l.quantite+" "+l.p.libelle+" ("+l.p.prix+"€)");
    }

    public LigneDeCommande(Produit p, int quantite) {
        this.p = p;
        this.quantite = quantite;
    }
}
