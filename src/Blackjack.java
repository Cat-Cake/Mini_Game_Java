import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Blackjack {

    static int sold;
    static int miseplayer;

    static String handplayer;

    static String handBot;

    static int scoreplayer;
    static int scorebot;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static String[][] array = {{"2","2♠"}, {"3","3♠"}, {"4","4♠"}, {"5","5♠"}, {"6","6♠"}, {"7","7♠"}, {"8","8♠"}, {"9","9♠"}, {"10","10♠"}, {"1", "11" ,"as♠"}, {"10","vallet♠"}, {"10","dame♠"}, {"10","roi♠"},
            {"2","2♣"}, {"3","3♣"}, {"4","4♣"}, {"5","5♣"}, {"6","6♣"}, {"7","7♣"}, {"8","8♣"}, {"9","9♣"}, {"10","10♣"}, {"1", "11" ,"as♣"}, {"10","vallet♣"}, {"10","dame♣"}, {"10","roi♣"},
            {"2","2♦"}, {"3","3♦"}, {"4","4♦"}, {"5","5♦"}, {"6","6♦"}, {"7","7♦"}, {"8","8♦"}, {"9","9♦"}, {"10","10♦"}, {"1", "11" ,"as♦"}, {"10","vallet♦"}, {"10","dame♦"}, {"10","roi♦"},
            {"2","2♥"}, {"3","3♥"}, {"4","4♥"}, {"5","5♥"}, {"6","6♥"}, {"7","7♥"}, {"8","8♥"}, {"9","9♥"}, {"10","10♥"}, {"1", "11" ,"as♥"}, {"10","vallet♥"}, {"10","dame♥"}, {"10","roi♥"}};

    public static void main(String[] args) {
        welcome();
    }

    public static void welcome() {
        Collections.shuffle(Arrays.asList(array));
        System.out.println("Bienvenue sur le jeux du BlackJack !");
        System.out.println("Voici les règles du jeux :");
        System.out.println("- Au départ vous devrez miser un partie de votre argent !\n" +
                "- Le croupier donneras deux cartes au joueur, et ensuite se\n" +
                "distribueras 2 cartes\n" +
                "- Chaque cartes valent le prix de la valeur cette dernière\n" +
                "- Les têtes valent 10\n" +
                "- L'As vaut 11 ou 1 :\n" +
                "- Le joueur choisi\n" +
                "- Le croupier n’a qu’un seul As qui vaut 11.\n" +
                "- Si le joueur atteint 21 sans le dépasser il fait BlackJack,\n" +
                "dans ce cas si le croupier dépasse ou n'atteint pas 21, il\n" +
                "multiplie sa mise par 3\n" +
                "- Dans les autres cas le joueur doit dépasser dépasser le score\n" +
                "du croupier sans dépasser 21, Si il y arrive il multiplie sa mise\n" +
                "par 2\n" +
                "- Le croupier continuera de tirer des cartes tant qu'il n'aura" +
                "pas atteint 17 \n");
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

    public static void Gamdfdfdsfe() {
        Collections.shuffle(Arrays.asList(array));
        System.out.print(Arrays.deepToString(array));

    }

    public static void presentation() {
        System.out.println("C'est parti je précise que le jeux de carte est mélangé.");
        System.out.println("le croupier distribue...");
        System.out.println("le croupier recoit :");
        Game();
    }

    public static void asktopi() {
        if (scorebot < 21 || scoreplayer < 21) {
            System.out.println("1 - Piocher" +
                    "2 - Rester" +
                    "3 - Abandonner(récupérer la moitier de la mise)");

            Scanner input = new Scanner(System.in);
            int playerinput = input.nextInt();

            if (playerinput == 1) {

                for( String j : new String[]{array[3][0]}) {
                    scoreplayer = Integer.parseInt(String.valueOf(scoreplayer + Integer.parseInt(j)));
                    scorebot = Integer.parseInt(String.valueOf(scorebot + Integer.parseInt(j)));
                }
//                handBot = handBot + Arrays.toString(new String[]{array[5][1]});
//                handplayer = handplayer + Arrays.toString(new String[]{array[6][1]});
                Game();

            } else if (playerinput == 2) {

            } else if (playerinput == 3) {

            } else {
                System.out.println("Fin de programme");
            }

        } else if (scoreplayer > 21 || scorebot > 21) {
            System.out.println("TOUSSE");

        } else if (scorebot == 21) {
            System.out.println("Le croupier a gagner !");
            System.out.println("Voulez-vous re-jouer ? (" + ANSI_GREEN + "1 - oui" + ANSI_RESET +  "/" + ANSI_RED + "2 - non)" + ANSI_RESET);
            Scanner input = new Scanner(System.in);
            int playerinput = input.nextInt();

            if (playerinput == 1) {
                mise();

            } else if (playerinput == 2) {
                System.out.println("Fin de programme");
            } else {
                System.out.println("Veuillez entrer une réponse valable");
            }

        } else if (scoreplayer == 21) {
            System.out.println("Vous avez gagner !");
            System.out.println("Voulez-vous re-jouer ? (" + ANSI_GREEN + "1 - oui" + ANSI_RESET +  "/" + ANSI_RED + "2 - non)" + ANSI_RESET);
            Scanner input = new Scanner(System.in);
            int playerinput = input.nextInt();

            if (playerinput == 1) {
                mise();

            } else if (playerinput == 2) {
                System.out.println("Fin de programme");
            } else {
                System.out.println("Veuillez entrer une réponse valable");
            }

        }
    }

    public static void Game() {
//        System.out.print(Arrays.deepToString(array[0]));
//        System.out.print(Arrays.deepToString(array[1]));
//        handplayer = Arrays.toString(new String[]{array[0][1]});
//        System.out.println(handplayer);

        for (int i = 0; i < 2; i++) {
            handBot = handBot + Arrays.toString(new String[]{array[i][1]});
//            scorebot = scorebot + Arrays.toString(new String[]{array[i][0]});
            for( String j : new String[]{array[i][0]}) {
                scorebot = Integer.parseInt(String.valueOf(scorebot + Integer.parseInt(j)));
            }
            System.out.print(ANSI_BLUE + handBot + ANSI_RESET);
        }
        System.out.println("\n Score croupier :" + scorebot);
        System.out.println("Vous recevez :");
        for (int i = 2; i < 4; i++) {
            handplayer = handplayer + Arrays.toString(new String[]{array[i][1]});
            for( String j : new String[]{array[i][0]}) {
                scoreplayer = Integer.parseInt(String.valueOf(scoreplayer + Integer.parseInt(j)));
            }
            System.out.print(ANSI_RED + handplayer + ANSI_RESET);
        }
        System.out.println("\n Votre score :" + scoreplayer);
        asktopi();


    }



}
