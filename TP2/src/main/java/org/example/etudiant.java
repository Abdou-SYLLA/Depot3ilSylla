package org.example;

public class etudiant {
    private String nom;


    public etudiant(String nom) {
        this.nom = nom;
    }

    public void travailler(){
        System.out.println( this.nom + ": " + this.nom + " se met au travail");
    }

    public void seReposer(){
        System.out.println( this.nom + ": " + this.nom + " se repose" );

    }
}
