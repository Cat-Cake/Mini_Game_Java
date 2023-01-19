import java.util.Scanner;

public class Blackjack {

    static int sold;
    static int miseplayer;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static String[][] array = {{"2","2♠"}, {"3","3♠"}, {"4","4♠"}, {"5","5♠"}, {"6","6♠"}, {"7","7♠"}, {"8","8♠"}, {"9","9♠"}, {"10","10♠"}, {"1", "11" ,"as♠"}, {"vallet♠"}, {"dame♠"}, {"roi♠"},
            {"2","2♣"}, {"3","3♣"}, {"4","4♣"}, {"5","5♣"}, {"6","6♣"}, {"7","7♣"}, {"8","8♣"}, {"9","9♣"}, {"10","10♣"}, {"1", "11" ,"as♣"}, {"10","vallet♣"}, {"10","dame♣"}, {"10","roi♣"},
            {"2","2♦"}, {"3","3♦"}, {"4","4♦"}, {"5","5♦"}, {"6","6♦"}, {"7","7♦"}, {"8","8♦"}, {"9","9♦"}, {"10","10♦"}, {"1", "11" ,"as♦"}, {"10","vallet♦"}, {"10","dame♦"}, {"10","roi♦"},
            {"2","2♥"}, {"3","3♥"}, {"4","4♥"}, {"5","5♥"}, {"6","6♥"}, {"7","7♥"}, {"8","8♥"}, {"9","9♥"}, {"10","10♥"}, {"1", "11" ,"as♥"}, {"10","vallet♥"}, {"10","dame♥"}, {"10","roi♥"}};

    public static void main(String[] args) {
        welcome();
    }

    public static void welcome() {
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

    public static void Game() {

    }

}
