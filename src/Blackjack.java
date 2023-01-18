public class Blackjack {

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
    }

}
