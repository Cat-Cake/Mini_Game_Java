import java.util.Scanner;

public class Roulette {

    static int sold;
    static int miseplayer;
    static String miseplayercolor;
    static String miseplayerpair;
    static String miseplayerimpair;
    static int miseplayermanque;
    static int miseplayerpasse;
    static int miseplayersimplenumber;

    public static void main(String[] args) {

    startingRules();
    }

    public static void startingRules() {
        System.out.println("Bienvenue sur le jeux de la Roulette ! \n" +
                "Voici les règles : \n" +
                "- Au départ vous devrez miser une partie de votre argent ! \n" +
                "- Vous pouvez misez sur : \n" +
                "- Couleur \n" +
                "- Pair \n" +
                "- Impair \n" +
                "- Manque (numéro de 0 à 18) \n" +
                "- Passe (numéro de 19 à 36) \n" +
                "- Numéro simple \n");
        System.out.println("(Gain * 2 / Gain * 36) \n");
        askingMise();
    }

    public static void askingMise() {
        System.out.println("Souhaitez vous essayer ? (1 - oui / 2 - non)");
        Scanner input = new Scanner(System.in);
        int playingOrNot = input.nextInt();

        if (playingOrNot == 1) {
            System.out.println("Je suis heureux de vous voir tenter votre chance");
            chooseSoldeOrMise();
        } else {
            System.out.println("Je suis triste de ne pas vous voir tenter votre chance :'(");
        }
    }

    public static void chooseSoldeOrMise() {
        System.out.println("Voulez-vous ajouter a votre solde ou miser ? (1 = solder / 2 = miser) Votre solde actuelle est de : " + sold);
        Scanner input = new Scanner(System.in);
        int playerMiseOrSolde = input.nextInt();

        if (playerMiseOrSolde == 1) {
            solde();
        } else if (playerMiseOrSolde == 2) {
            mise();
        } else {
            System.out.println("Veuillez entrer un nombre valide");
            chooseSoldeOrMise();
        }
    }

    public static void solde() {
        System.out.println("Combien voulez-vous en ajouter ?");
        Scanner input2 = new Scanner(System.in);
        int payersoldchoose = input2.nextInt();
        if (payersoldchoose <= 0) {
            System.out.println("Veuillez choisir une quantité valide");
        } else {
            sold = sold + payersoldchoose;
            mise();
        }
    }

    public static  void mise() {
        System.out.println("Combien voulez-vous miser ? (Votre solde actuelle est de : " + sold + ")");
        Scanner input3 = new Scanner(System.in);
        int playermise = input3.nextInt();
        if (playermise < 0) {
            System.out.println("Veuillez choisir une quantité valide");
        } else {
            miseplayer = playermise;
            System.out.println("Vous avez décider de miser : " + playermise);
            Game();
        }
    }

    public static void Game() {
        System.out.println("- Pour commencer taper 1 \n" +
                "- Pour annuler taper 2 \n");
        Scanner input = new Scanner(System.in);
        int playerStartingGame = input.nextInt();
        if (playerStartingGame == 1) {
            askingBet();
        } else {
            System.out.println("Fin du programme");
        }
    }

    public  static void askingBet() {
        System.out.println("Sur quoi voulez vous pariez \n" +
                "1 - Couleur \n" +
                "2 - Pair \n" +
                "3 - Impair \n" +
                "4 - Manque (numéro de 0 à 18) \n" +
                "5 - Passe (numéro de 19 à 36) \n" +
                "6 - Numéro simple \n");
        System.out.println("(Gain * 2 / Gain * 36) \n");
        Scanner input = new Scanner(System.in);
        int playermise = input.nextInt();

        if (playermise == 1) {

//            COULEUR

            System.out.println("Vous avez choisi de miser sur la couleur \n");
            System.out.println("Quel est la couleur choisie (1 - rouge / 2 vert) \n");

            Scanner input2 = new Scanner(System.in);
            int playermise2 = input2.nextInt();

            if (playermise2 == 1) {
                miseplayercolor = "Rouge";

                System.out.println("Vous confirmer ? (1 - oui / 2 non) \n");
                Scanner inputconf = new Scanner(System.in);
                int playerconf = inputconf.nextInt();

                if (playerconf == 1) {

                }else {
                    askingBet();
                }

            } else if (playermise2 == 2) {
                miseplayercolor = "Vert";

                System.out.println("Vous confirmer ? (1 - oui / 2 non) \n");
                Scanner inputconf = new Scanner(System.in);
                int playerconf = inputconf.nextInt();

                if (playerconf == 1) {

                }else {
                    askingBet();
                }

            } else {
                System.out.println("Veuillez entrer un numéro valide \n");
                askingBet();
            }

        } else if (playermise == 2) {

//            PAIR

            System.out.println("Vous avez choisi de miser sur Pair \n");

            Scanner input3 = new Scanner(System.in);
            int playermise3 = input3.nextInt();

            if (playermise3 == 1) {

                System.out.println("Vous confirmer ? (1 - oui / 2 non) \n");
                Scanner inputconf = new Scanner(System.in);
                int playerconf = inputconf.nextInt();

                if (playerconf == 1) {

                }else {
                    askingBet();
                }
                
            } else {
                askingBet();
            }

        } else if (playermise == 3) {

//            IMPAIR

            System.out.println("Vous avez choisi de miser sur Impair \n");


                System.out.println("Vous confirmer ? (1 - oui / 2 non) \n");
                Scanner inputconf = new Scanner(System.in);
                int playerconf = inputconf.nextInt();

                if (playerconf == 1) {

                }else {
                    askingBet();
                }

        } else if (playermise == 4) {

//            MANQUE

            System.out.println("Vous avez choisi de miser sur les munéro de 0 à 18 \n");
            System.out.println("Vous confirmer ? (1 - oui / 2 non) \n");

            Scanner input5 = new Scanner(System.in);
            int playermise5 = input5.nextInt();

            if (playermise5 == 1) {

            } else {
                askingBet();
            }

        } else if (playermise == 5) {

//            PASSE

            System.out.println("Vous avez choisi de miser sur les munéro de 19 à 36 \n");
            System.out.println("Vous confirmer ? (1 - oui / 2 non) \n");

            Scanner input6 = new Scanner(System.in);
            int playermise6 = input6.nextInt();

            if (playermise6 == 1) {

            } else {
                askingBet();
            }

        } else if (playermise == 6) {

        } else {
            System.out.println("Veuillez entrer un numéro valide \n");
            askingBet();
        }
    }

    public static void colorNumbers() {
        String[][] array = {{"1","rouge"},{"2","noir"},{"3","rouge"},{"4","noir"},{"5","rouge"},
                {"6","noir"},{"7","rouge"},{"8","noir"},{"9","rouge"},{"10","noir"},
                {"11","noir"},{"12","rouge"},{"13","noir"},{"14","rouge"},
                {"15","noir"},{"16","rouge"},{"17","noir"},{"18","rouge"},
                {"19","rouge"},{"20","noir"},{"21","rouge"},{"22","noir"},
                {"23","rouge"},{"24","noir"},{"25","rouge"},{"26","noir"},
                {"27","rouge"},{"28","noir"},{"29","noir"},{"30","rouge"},
                {"31","noir"},{"32","rouge"},{"33","noir"},{"34","rouge"},
                {"35","noir"},{"36","rouge"}};
    }

}
