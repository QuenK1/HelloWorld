package fr.github.quenk.helloworld;

public class Main {

    public static void main(String[] args) {
        //Cette ligne permet d'afficher: Hello World!
        System.out.println("Hello World!");

        //Dollars américain: 1.22 // don: 1500€

        double dollarsame = 1.22;
        int somme= 1500;
        float resultat = (float) (dollarsame * somme);
        System.out.println(resultat);

        //Exo 3: Pluton V3

        String phrase="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de :";
        int nbPlanetes=8;
        System.out.println(phrase+nbPlanetes);
        phrase="Il y a quelques années cependant, elles étaient au nombre de :";
        nbPlanetes++;
        System.out.println(phrase+nbPlanetes);

        //exo de codage 6 | Affichage conditionnel

        String phraseIntro ="En %d, les planètes du système solaire était au nombre de : %d";

        int planete=0;
        short annee = 2018;

        if(annee<2006){
            planete = 9;
        }
        if(annee >=2006){
            planete = 8;
        }

        System.out.printf(phraseIntro,annee,planete);
    }
}
