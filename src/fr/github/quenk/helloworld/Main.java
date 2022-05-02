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
/*
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
        }*/

        /*
        boolean jeContnue = true;
        int i;
        for(i =0;i<3;i++){
            System.out.println("Je continue");
        }*/


        //Exo de codage 10 | Structure itérative | for
/*
        String phraseIntroduction = "En %d, les planètes du système solaire étaient au nombre de : %d";
        int nbPlanetes;
        short annee = 2120;

        for (nbPlanetes = 7; nbPlanetes < 10; nbPlanetes++) {
            switch (nbPlanetes) {
                case 7:
                    System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                    break;
                case 8:
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                    break;
                case 9:
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                    break;
                default:
                    System.out.printf("Le programme ne peut fournir de résultat pour %d", nbPlanetes);
            }

        }*/

        //Exo de codage 11 | Structure itérative | while
        /*
        String phraseIntroduction = "En %d, les planètes du système solaire étaient au nombre de : %d";
        int nbPlanetes = 6;
        short annee = 2120;
        boolean planete = true;

        while (planete) {
            nbPlanetes++;
            switch (nbPlanetes) {
                case 7:
                    System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                    break;
                case 8:
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                    break;
                case 9:
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                    planete = false;
                    break;
                default:
                    System.out.printf("Le programme ne peut fournir de résultat pour %d", nbPlanetes);
            }

        }*/

        //Exo de codage 16 | Galilé ou la réalité des planete
        /*
        Planete mercure=new Planete();
        mercure.nom="Mercure";
        mercure.matiere="Tellurique";
        mercure.diametre=4880;
        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";
        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";
        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";
        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";
        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";
        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";
        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        Planete planeteX = new Planete();

        //System.out.println(planeteX.nom+" est une planète "+planeteX.matiere+" avec un diamètre de "+planeteX.diametre+" kilomètres.");

        neptune.revolution();
        mars.rotation();*/

        //Exo Question pour un champion (Travaux pratique JAVA)
       /* String reponse;
        System.out.println("Quel était le métier de Roland Garros ?");
        reponse = "Aviateur";
        System.out.println(reponse);
        System.out.println("Comment se nommaient les missions américaine qui ont mené le 1er homme sur la lune ?");
        reponse = "Apollo 11";
        System.out.println(reponse);
        System.out.println("A quoi correspond le symbole chimique N ?");
        reponse = "Azote";
        System.out.println(reponse);
        System.out.println("Qui a écrit le Rouge et le Noir");
        reponse = "Stendhal";
        System.out.println(reponse);
        System.out.println("Quelle pays trouve t-on entre l'Italie et le Liechtenshtein ?");
        reponse = "Suisse";
        System.out.println(reponse);*/



    }
}
