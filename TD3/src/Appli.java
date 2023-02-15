public class Appli {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        int p1,p2;
        p1=p2=0;
        final int MAX = 5;
        while (p1<MAX && p2<MAX) {
            d1.lancer();
            d2.lancer();
            if (d1.isBroke() || d2.isBroke()) {
                System.out.println("Manche annulée");
            } else {
                if (d1.estPlusFortQue(d2)) {
                    ++p1;
                } else if (d2.estPlusFortQue(d1)) {
                    ++p2;
                }
            }
            System.out.println("Valeur des dés : "+d1.toString()+" "+d2.toString());
            System.out.println("Points des joueurs : "+p1+" "+p2);
            System.out.println("---------------------------------------------------");
        }
        System.out.println("Le joueur "+(p1==MAX?1:2)+" a gagné.");
    }
}
