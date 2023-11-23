package org.example;

public class Chien {
    private String race;
    private int age;
    private String couleur;

    public Chien(){
        this.race = "chiwawa";
        this.age = 1;
        this.couleur = "blanche";
    }


    public Chien(int age, String race, String couleur){

        this.age = age;
        this.couleur = couleur;
        this.race = race;
    }

    public void aboyer(){
        System.out.println("WOUh WOUH ");
    }

    public void dormir(){
        System.out.println(" chien dors");
    }
}
