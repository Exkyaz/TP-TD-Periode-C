public class Main {
    public static void main(String[] args) {
        Produit a=new Produit("Banane", 0.53);
        Produit b=new Produit("Pomme", 0.42);
        Produit c=new Produit("Poire", 0.67);
        Commande cmd=new Commande();
        Commande.ajouter(cmd, new LigneDeCommande(a, 45));
        Commande.ajouter(cmd, new LigneDeCommande(b, 160));
        Commande.ajouter(cmd, new LigneDeCommande(c, 300000));
        Commande.toString(cmd);
        System.out.println(Commande.total(cmd)+"€");
    }
}