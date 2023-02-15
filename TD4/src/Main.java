public class Main {
    public static void main(String[] args) {
        Compte.setDecouvertMax(-1500.);
        Compte c = new Compte(1);
        c.retrait(10);
        System.out.println(c);
        c.depot(1500);
        System.out.println(c);
    }
}