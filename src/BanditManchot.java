import java.util.Random;
import java.util.Scanner;
public class BanditManchot {
    static int sold;
    static int miseplayer;
    public static void main(String[] args) {
        startingRules();
    }

    public static void startingRules() {
        System.out.println("                 _.._                   \n" +
                "              .-'    `-.                \n" +
                "             :          ;               \n" +
                "             ; ,_    _, ;               \n" +
                "             : \\{\"  \"}/ :               \n" +
                "            ,'.'\"=..=''.'.              \n" +
                "           ; / \\      / \\ ;             \n" +
                "         .' ;   '.__.'   ; '.           \n" +
                "      .-' .'              '. '-.        \n" +
                "    .'   ;                  ;   '.      \n" +
                "   /    /                    \\    \\     \n" +
                "  ;    ;                      ;    ;    \n" +
                "  ;   `-._                  _.-'   ;    \n" +
                "   ;      \"\"--.        .--\"\"      ;     \n" +
                "    '.    _    ;      ;    _    .'      \n" +
                "    {\"\"..' '._.-.    .-._.' '..\"\"}      \n" +
                "     \\           ;  ;           /       \n" +
                "      :         :    :         :        \n" +
                "      :         :.__.:         :        \n" +
                "       \\       /\"-..-\"\\       /      \n" +
                "        '-.__.'        '.__.-'          ");
        System.out.println("Bienvenue sur le jeux du Bandit Manchot ! \n" +
                "Voici les règles : \n" +
                "- Au départ vous devrez miser une partie de votre argent ! \n" +
                "- Si vous n'avez aucun symbole en commun vous perdrez votre mise \n" +
                "- Si vous tombez sur 2 fois le même symbole, vous re-gagner la moitié de votre mise \n" +
                "- Si vous tombez sur 3 fois le même symbole, vous gagner motre mise + 200% !! \n");
        startingGame();
    }

    public static void startingGame() {
        System.out.println("Souhaitez vous essayer ? (1 = oui / 2 = non)");
        Scanner input = new Scanner(System.in);
        int playingOrNot = input.nextInt();

        if (playingOrNot == 1) {
            chooseSoldeOrMise();
        } else if (playingOrNot == 2) {
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
            game();
        }
    }
    public static void game() {
        System.out.println("- Pour commencer taper 1 \n" +
                "- Pour annuler taper 2 \n");
        Scanner input3 = new Scanner(System.in);
        int playerStartingGame = input3.nextInt();
        if (playerStartingGame == 1) {
//            STARTING GAME
            String heart = "♥";
            String tile = "♦";
            String clover = "♣";
            String pic = "♠";
            String[] array = {heart, tile, clover, pic};
            Random rand = new Random();
            String randOne = array[rand.nextInt(array.length)];
            String randTwo = array[rand.nextInt(array.length)];
            String randThree = array[rand.nextInt(array.length)];
            System.out.print(randOne);
            System.out.print(randTwo);
            System.out.print(randThree);

            if (randOne == randTwo || randOne == randThree || randTwo == randThree) {
                System.out.println("Bravo vous avez gagner la moitier de votre mise !");
                miseplayer = miseplayer + miseplayer / 2;
                System.out.println("Votre mise est désormer à : " + miseplayer);
                askingStartingAgain();
            } else if (randOne == randTwo && randTwo == randThree && randOne == randThree) {
                System.out.println("Bravo vous avez gagner votre mise + 200% !");
                miseplayer = miseplayer + miseplayer * 2;
                System.out.println("Votre mise est désormer à : " + miseplayer);
                askingStartingAgain();
            } else {
                System.out.println("\n OOoh non ...:'( !");
                System.out.println("Vous avez perdu ...");
                sold = sold - miseplayer;
                System.out.println(miseplayer + " on été retiré de votre solde");
                System.out.println("Votre nouveau solde est de " + sold);
                askingStartingAgain();
            }

        } else if (playerStartingGame == 2) {
            System.out.println("Le jeux est terminé");
        }
    }

    public static void askingStartingAgain() {
        System.out.println("Voulez-vous rejouer ? (1 = oui / 2 = non)");
        Scanner input = new Scanner(System.in);
        int playercChoose = input.nextInt();

        if (playercChoose == 1) {
            game();
        } else if (sold == 0) {
            System.out.println("Vous n'avez plus de solde, le jeux est terminé");
        }else {
            System.out.println("Le jeux est terminé");
            sold = sold + miseplayer;
            System.out.println("Votre solde est maintenant à " + sold);
            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                        @Override
                        public void run() {
                            Main a = new Main();
                            Main.main(null);
                        }
                    },
                    2000
            );
        }
    }
}
