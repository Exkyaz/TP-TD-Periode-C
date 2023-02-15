import Artistes.*;
import java.io.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Personne p = new Personne();
        p.prenom="ArnAud   ";
        p.nom="     DUREPERE";
        System.out.println("Avant normalisation : ");
        System.out.println(p.prenom+" "+p.nom);
        p=Artiste.nomrmaliser(p);
        System.out.println("Après normalisation : ");
        System.out.println(p.prenom+" "+p.nom);
        System.out.println("---------------------------------------------");
        ArrayList<Personne> list = fileToList("./artistes.txt");
    }

    public static ArrayList<Personne> fileToList(String file) {
        ArrayList<Personne> ListePersonnes = new ArrayList<>();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int i=0;
            while ((line = br.readLine()) != null) {
                Personne p = new Personne();
                line = line.trim();
                p.prenom=line.substring(0, line.indexOf(" "));
                p.nom=line.substring(line.indexOf(" "));
                p=Artiste.nomrmaliser(p);
                System.out.println(p.prenom + " " + p.nom);
                ListePersonnes.add(p);
                i++;
            }
            System.out.println("Il y a "+i+" personnes.");
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ListePersonnes;
    }
}