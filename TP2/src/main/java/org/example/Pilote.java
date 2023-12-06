package org.example;

public class Pilote {
    private String nom;
    private int age;

    private Pilote chauffeur;


    public void conduire(){
        System.out.println("je conduis");
    }

    public Pilote(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public Pilote(String nom, int age, Pilote chauffeur) {
        this.nom = nom;
        this.age = age;
        this.chauffeur = chauffeur;
    }
}
