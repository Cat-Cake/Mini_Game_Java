import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Roulette {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static int sold;
    static int miseplayer;
    static String miseplayercolor;
    static String miseplayerpair;
    static String miseplayerimpair;
    static int miseplayermanque;
    static int miseplayerpasse;
    static int miseplayersimplenumber;

    static String[][] array = {{"1","rouge"},{"2","noir"},{"3","rouge"},{"4","noir"},{"5","rouge"},
            {"6","noir"},{"7","rouge"},{"8","noir"},{"9","rouge"},{"10","noir"},
            {"11","noir"},{"12","rouge"},{"13","noir"},{"14","rouge"},
            {"15","noir"},{"16","rouge"},{"17","noir"},{"18","rouge"},
            {"19","rouge"},{"20","noir"},{"21","rouge"},{"22","noir"},
            {"23","rouge"},{"24","noir"},{"25","rouge"},{"26","noir"},
            {"27","rouge"},{"28","noir"},{"29","noir"},{"30","rouge"},
            {"31","noir"},{"32","rouge"},{"33","noir"},{"34","rouge"},
            {"35","noir"},{"36","rouge"}};

    static Random rand = new Random();
    static String[] randOne = array[rand.nextInt(array.length)];

    public static void main(String[] args) {

    startingRules();
    }

    public static void startingRules() {
        System.out.println("Bienvenue sur le jeux de la Roulette ! \n" +
                "Voici les règles : \n" +
                "- Au départ vous devrez miser une partie de votre argent ! \n" +
                "- Vous pouvez misez sur : \n" +
                ANSI_BLUE +"- Couleur \n" +
                "- Pair \n" +
                "- Impair \n" +
                "- Manque (numéro de 0 à 18) \n" +
                "- Passe (numéro de 19 à 36) \n" + ANSI_RESET +
                ANSI_GREEN +"- Numéro simple \n" + ANSI_RESET);
        System.out.println(ANSI_BLUE +"(Gain * 2" + ANSI_RESET + " / "+ ANSI_GREEN + "Gain * 36) \n" + ANSI_RESET);
        askingMise();
    }

    public static void askingMise() {
        System.out.println("Souhaitez vous essayer ? (" + ANSI_GREEN + "1 - oui" + ANSI_RESET +  "/" + ANSI_RED + "2 - non)" + ANSI_RESET);
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
            if (playermise > sold || sold == 0) {
                System.out.println("Veuillez choisir une quantité valide");
                chooseSoldeOrMise();
            } else {
                miseplayer = playermise;
                System.out.println("Vous avez décider de miser : " + playermise);
                Game();
            }
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
                ANSI_BLUE + "1 - Couleur \n" +
                "2 - Pair \n" +
                "3 - Impair \n" +
                "4 - Manque (numéro de 1 à 18) \n" +
                "5 - Passe (numéro de 19 à 36) \n" + ANSI_RESET +
                ANSI_GREEN + "6 - Numéro simple \n" + ANSI_RESET);
        System.out.println(ANSI_BLUE +"(Gain * 2" + ANSI_RESET + " / "+ ANSI_GREEN + "Gain * 36) \n" + ANSI_RESET);
        Scanner input = new Scanner(System.in);
        int playermise = input.nextInt();

        if (playermise == 1) {

//            COULEUR

            System.out.println("Vous avez choisi de miser sur la couleur \n");
            System.out.println("Quel est la couleur choisie (1 - rouge / 2 noir) \n");

            Scanner input2 = new Scanner(System.in);
            int playermise2 = input2.nextInt();

            if (playermise2 == 1) {
                miseplayercolor = "rouge";

                System.out.println("Vous confirmez ? (" + ANSI_GREEN + "1 - oui" + ANSI_RESET +  "/" + ANSI_RED + "2 - non) \n"+ ANSI_RESET);
                Scanner inputconf = new Scanner(System.in);
                int playerconf = inputconf.nextInt();

                if (playerconf == 1) {
                    colorGame();
                }else {
                    askingBet();
                }

            } else if (playermise2 == 2) {
                miseplayercolor = "noir";

                System.out.println("Vous confirmez ? (" + ANSI_GREEN + "1 - oui" + ANSI_RESET +  "/" + ANSI_RED + "2 - non) \n"+ ANSI_RESET);
                Scanner inputconf = new Scanner(System.in);
                int playerconf = inputconf.nextInt();

                if (playerconf == 1) {
                    colorGame();
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



                System.out.println("Vous confirmez ? (" + ANSI_GREEN + "1 - oui" + ANSI_RESET +  "/" + ANSI_RED + "2 - non) \n"+ ANSI_RESET);
                Scanner inputconf = new Scanner(System.in);
                int playerconf = inputconf.nextInt();

                if (playerconf == 1) {
                    pairGame();
                }else {
                    askingBet();
                }


        } else if (playermise == 3) {

//            IMPAIR

            System.out.println("Vous avez choisi de miser sur Impair \n");


                System.out.println("Vous confirmez ? (" + ANSI_GREEN + "1 - oui" + ANSI_RESET +  "/" + ANSI_RED + "2 - non) \n"+ ANSI_RESET);
                Scanner inputconf = new Scanner(System.in);
                int playerconf = inputconf.nextInt();

                if (playerconf == 1) {
                    impairGame();
                }else {
                    askingBet();
                }

        } else if (playermise == 4) {

//            MANQUE

            System.out.println("Vous avez choisi de miser sur les munéro de 0 à 18 \n");

            System.out.println("Vous confirmer ? (" + ANSI_GREEN + "1 - oui" + ANSI_RESET +  "/" + ANSI_RED + "2 - non) \n"+ ANSI_RESET);
            Scanner inputconf = new Scanner(System.in);
            int playerconf = inputconf.nextInt();

            if (playerconf == 1) {
                manqueGame();
            } else {
                askingBet();
            }

        } else if (playermise == 5) {

//            PASSE

            System.out.println("Vous avez choisi de miser sur les munéro de 19 à 36 \n");


            System.out.println("Vous confirmez ? (" + ANSI_GREEN + "1 - oui" + ANSI_RESET +  "/" + ANSI_RED + "2 - non) \n"+ ANSI_RESET);
            Scanner inputconf = new Scanner(System.in);
            int playerconf = inputconf.nextInt();

            if (playerconf == 1) {
                passeGame();
            } else {
                askingBet();
            }



        } else if (playermise == 6) {

            // NUMERO SIMPLE

            System.out.println("Vous avez choisi de miser sur les munéro de 1 à 36 \n");


            System.out.println("Vous confirmez ? (" + ANSI_GREEN + "1 - oui" + ANSI_RESET +  "/" + ANSI_RED + "2 - non) \n"+ ANSI_RESET);
            Scanner inputconf = new Scanner(System.in);
            int playerconf = inputconf.nextInt();

            if (playerconf == 1) {
                simpleNumberGame();
            } else {
                askingBet();
            }


        } else {
            System.out.println("Veuillez entrer un numéro valide \n");
            askingBet();
        }
    }

    public static void retry() {
        System.out.println("Faire une nouvelle parti ? (1 - oui / 2 - non) \n");

        Scanner input = new Scanner(System.in);
        int inputRetry = input.nextInt();

        if (inputRetry == 1) {
            askingBet();
        } else {
            System.out.println("Fin du programme \n");
        }
    }

    public static void colorGame() {
        System.out.println("Vous avez choisi " + miseplayercolor + " ! \n");
        System.out.println("Les jeux sont fait !! \n");
        System.out.println("LE RESULTAT EST " + randOne[1] + " \n");

        if (Objects.equals(miseplayercolor, randOne[1])) {
            System.out.println( randOne[1] + " VOUS AVEZ GAGNER \n");
            miseplayer = miseplayer * 2;
            System.out.println("Vous gagner le double de votre mise , vous êtes donc à :" + miseplayer + "\n");
            retry();
        } else {
            System.out.println("Vous avez perdu , votre mise est à" + miseplayer + "\n");
            retry();
        }
    }

    public static void pairGame() {
        System.out.println("Vous avez choisi Pair ! \n");
        System.out.println("Les jeux sont fait !! \n");
        System.out.println("LE RESULTAT EST " + randOne[0] + " \n");

        if (Integer.parseInt(randOne[0]) % 2 == 0) {
            System.out.println(randOne[0] + " VOUS AVEZ GAGNER \n");
            miseplayer = miseplayer * 2;
            System.out.println("Vous gagner le double de votre mise , vous êtes donc à :" + miseplayer + "\n");
        } else {
            sold = sold - miseplayer;
            miseplayer = 0;
            System.out.println("Vous avez perdu , votre mise est à" + miseplayer + "\n");
            System.out.println("Re-essayer ? (1 - oui / 2 - non) \n");
            Scanner input = new Scanner(System.in);
            int inputRetry = input.nextInt();

            if (inputRetry == 1) {
                startingRules();
            } else {
                System.out.println("Fin du programme \n");
            }
        }
    }

    public static void impairGame() {
        System.out.println("Vous avez choisi Imair ! \n");
        System.out.println("Les jeux sont fait !! \n");
        System.out.println("LE RESULTAT EST " + randOne[0] + " \n");

        if (Integer.parseInt(randOne[0]) % 2 != 0) {
            System.out.println(randOne[0] + " VOUS AVEZ GAGNER \n");
            miseplayer = miseplayer * 2;
            System.out.println("Vous gagner le double de votre mise , vous êtes donc à :" + miseplayer + "\n");
            retry();
        } else {
            sold = sold - miseplayer;
            miseplayer = 0;
            System.out.println("Vous avez perdu , votre mise est à" + miseplayer + "\n");
            retry();
        }
    }

    public static void manqueGame() {
        System.out.println("Quel numéro souhaitez-vous choisir ?");

        Scanner input = new Scanner(System.in);
        int chooseNumber = input.nextInt();

        if (chooseNumber < 1 || chooseNumber > 18) {
            System.out.println("Veuillez choisir un numéro valide");
        } else {
            if (Integer.parseInt(randOne[0]) == chooseNumber) {
                System.out.println(randOne[0] + " VOUS AVEZ GAGNER \n");
                miseplayer = miseplayer * 2;
                System.out.println("Vous gagner le double de votre mise , vous êtes donc à :" + miseplayer + "\n");
                retry();
            } else {
                sold = sold - miseplayer;
                miseplayer = 0;
                System.out.println("Vous avez perdu , votre mise est à" + miseplayer + "\n");
                retry();
            }
        }
    }

    public static void passeGame() {
        System.out.println("Quel numéro souhaitez-vous choisir ?");

        Scanner input = new Scanner(System.in);
        int chooseNumber = input.nextInt();

        if (chooseNumber < 19 || chooseNumber > 36) {
            System.out.println("Veuillez choisir un numéro valide");
        } else {
            if (Integer.parseInt(randOne[0]) == chooseNumber) {
                System.out.println(randOne[0] + " VOUS AVEZ GAGNER \n");
                miseplayer = miseplayer * 2;
                System.out.println("Vous gagner le double de votre mise , vous êtes donc à :" + miseplayer + "\n");
                retry();
            } else {
                sold = sold - miseplayer;
                miseplayer = 0;
                System.out.println("Vous avez perdu , votre mise est à" + miseplayer + "\n");
                retry();
            }
        }
    }

    public static void simpleNumberGame() {
        System.out.println("Quel numéro souhaitez-vous choisir ?");

        Scanner input = new Scanner(System.in);
        int chooseNumber = input.nextInt();

        if (chooseNumber < 1 || chooseNumber > 36) {
            System.out.println("Veuillez choisir un numéro valide");
        } else {
            if (Integer.parseInt(randOne[0]) == chooseNumber) {
                System.out.println(randOne[0] + " VOUS AVEZ GAGNER \n");
                miseplayer = miseplayer * 36;
                System.out.println("Vous gagner votre mise x 36 , vous êtes donc à :" + miseplayer + "\n");
                retry();
            } else {
                sold = sold - miseplayer;
                miseplayer = 0;
                System.out.println("Vous avez perdu le numéro étais " + randOne[0] + ", votre mise est à" + miseplayer + "\n");
                retry();
            }
        }
    }

}
