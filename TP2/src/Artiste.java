import Artistes.*;

import static java.lang.Character.*;

public class Artiste {
    public static Personne nomrmaliser(Personne p) {
        p.prenom=Artiste.nomrmaliser(p.prenom);
        p.nom=Artiste.nomrmaliser(p.nom);
        return p;
    }

    public static String nomrmaliser(String mot) {
        if (mot != null && !mot.isEmpty()) {
            mot = mot.trim();
            mot = mot.substring(0, 1).toUpperCase() + mot.substring(1).toLowerCase();
        }
        return mot;
    }
}
