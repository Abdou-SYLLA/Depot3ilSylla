package org.example;

public class Voiture {
    private String modele;
    private float prix;

    public Voiture(String modele, float prix) {
        this.modele = modele;
        this.prix = prix;
    }

    public Voiture() {
        this.modele = "Tesla";
        this.prix = 45000;
    }

    public void arreter(){
        System.out.println("la voiture s'arrete");
    }

    public void deplacer(){
        System.out.println("la voiture se deplace");
    }

    public void demarrer() {
        System.out.println("la voiture demarre");

    }

}
