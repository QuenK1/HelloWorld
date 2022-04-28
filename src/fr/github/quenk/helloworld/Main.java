package fr.github.quenk.helloworld;

public class Main {

    public static void main(String[] args) {
        //Cette ligne permet d'afficher: Hello World!
      //  System.out.println("Hello World!");

        //Dollars américain: 1.22 // don: 1500€

  /*      double dollarsame = 1.22;
        int somme= 1500;
        float resultat = (float) (dollarsame * somme);
        System.out.println(resultat);
        */
/*
        //Exo 3: Pluton V3

        String phrase="Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de :";
        int nbPlanetes=8;
        System.out.println(phrase+nbPlanetes);
        phrase="Il y a quelques années cependant, elles étaient au nombre de :";
        nbPlanetes++;
        System.out.println(phrase+nbPlanetes);
*/
        //exo de codage 6 | Affichage conditionnel
/*
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
*/

/*
        //Exo 8 | Utiliser if, else if et else

        String phraseIntroduction="En %d, les planètes du système solaire étaient au nombre de : %d";
        String erreur = "Le programme ne peut pas fournir de résultat pour l'année %d";
        int nbPlanete=0;
        short annees=1801;
        if (annees<1700){
            nbPlanete=7;
            System.out.printf(phraseIntroduction,annees,nbPlanete);
        }
        else if(annees < 1800){
            nbPlanete=8;
            System.out.printf(phraseIntroduction,annees,nbPlanete);
        }else{
            System.out.printf(erreur,annees);
        }*/

        //exemple switch
        /*
        int mois = 30;
        switch(mois) {
            case 1 :
                System.out.println("C'est janvier");
                break;
            case 2 :
                System.out.println("C'est février");
                break;
            case 3 :
                System.out.println("C'est mars");
                break;
            default :
                System.out.println("Ceci n'est pas un mois");
        }*/

        //Exo de codage 9 | Switch case et default

        String phraseIntroduction="En %d, les planètes du système solaire étaient au nombre de : %d";
        int nbPlanetes=5;
        short annee=2120;

        switch(nbPlanetes){
            case 7 :
                System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                break;
            case 8 :
                System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                break;
            case 9 :
                System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                break;
            default :
                System.out.printf("Le programme ne peut fournir de résultat pour %d",nbPlanetes);
        }

    }
}
