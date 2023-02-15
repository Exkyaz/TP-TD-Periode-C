public class Main {
    public static void main(String[] args) {
        Dice d1,d2;
        d1=new Dice();
        d2=new Dice();
        d1.lancer();
        d2.lancer();
        if (d1.estPlusFortQue(d2)) {
            System.out.println(d1);
        } else if (d2.estPlusFortQue(d1)) {
            System.out.println(d2);
        } else {
            System.out.println("égalité");
        }
    }
}