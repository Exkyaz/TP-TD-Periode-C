import java.util.ArrayList;
import java.util.Objects;

public class Commande {
    ArrayList<LigneDeCommande> commande = new ArrayList<LigneDeCommande>();

    public static double total(Commande c) {
        double somme=0.0;
        for (LigneDeCommande l:c.commande){
            somme += l.p.prix * l.quantite;
        }
        return somme;
    }

    public static void toString(Commande c) {
        for (LigneDeCommande l:c.commande) {
            LigneDeCommande.toString(l);
        }
    }

    public static void ajouter(Commande c, LigneDeCommande l) {
        for (LigneDeCommande ligne:c.commande) {
            if (Objects.equals(ligne.p,l.p)) {
                ligne.quantite++;
                return;
            }
        }
        c.commande.add(l);
        return;
    }
}
