package fr.github.quenk.helloworld;
/*
Project: HelloWorld By: QuenK
Class created: 01/05/2022 | 14:35
*/

public class Planete {

    String nom;
    long diametre;
    String matiere;

    void revolution(){
        System.out.println("Je suis la planète "+nom+" et je tourne autour de mon étoile.");
    }
    void rotation(){
        System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même.");
    }

}
