import java.util.Random;
import java.util.Scanner;

class PierreFeuilleCisseaux {

    static String[] array = {"Pierre", "Papier", "Ciseaux"};
    static Random rand = new Random();
    static String randOne = array[rand.nextInt(array.length)];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Pierre \n" +
                "2 - Papier \n" +
                "3 - Ciseaux \n" +
                "Autre nombre - Quitter");
        String player = input.nextLine();
        game(Integer.valueOf(player));
    }

   public static void game(Integer player) {
        if (player == 1 && randOne == "Pierre") {
            System.out.println("Vous avez choisi Pierre et l'ordinateur a choisi " + randOne);
            System.out.println("Egalité");
            askRetry();
        } else if (player == 1 && randOne == "Ciseaux") {
            System.out.println("Vous avez choisi Pierre et l'ordinateur a choisi " + randOne);
            System.out.println("Vous avez gagner");
            askRetry();


        } else if (player == 2 && randOne == "Pierre") {
            System.out.println("Vous avez choisi Papier et l'ordinateur a choisi " + randOne);
            System.out.println("Vous avez gagner");
            askRetry();

        } else if (player == 2 && randOne == "Papier") {
            System.out.println("Vous avez choisi Papier et l'ordinateur a choisi " + randOne);
            System.out.println("Egalité");
            askRetry();

        } else if (player == 3 && randOne == "Papier") {
            System.out.println("Vous avez choisi Ciseaux et l'ordinateur a choisi " + randOne);
            System.out.println("Vous avez gagner");
            askRetry();

        } else if (player == 3 && randOne == "Ciseaux") {
            System.out.println("Vous avez choisi Ciseaux et l'ordinateur a choisi " + randOne);
            System.out.println("Egalité");
            askRetry();

        } else {
            System.out.println("Vous avez perdu");
            askRetry();
        }
   }
   public static void askRetry() {
       Scanner input = new Scanner(System.in);
       System.out.println("Re jouer ? \n" +
               "1 - Oui \n" +
               "2 - Non \n");
       int player = Integer.parseInt(input.nextLine());

       if (player == 1) {
           main(null);
       } else {
           System.out.println("Fin du programme");
       }
   }
}
