import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("\n .:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:. \n");
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer un exercice \n" +
                "1 - Pair \n" +
                "2 - Calculatrice \n" +
                "3 - Echiquier \n" +
                "4 - Afficher le prénom \n" +
                "5 - Table de multiplication \n" +
                "6 - Somme \n" +
                "7 - Bandit Manchot \n" +
                "8 - La roulette \n" +
                "Autre nombre - Quitter");
        int userChoose = input.nextInt();

        if (userChoose == 1) {
            NumberPair a = new NumberPair();
            NumberPair.pairexo();
        } else if (userChoose == 2) {
            Culculatrice a = new Culculatrice();
            Culculatrice.main(args);

        } else if (userChoose == 3) {
            Echiquier a = new Echiquier();
            Echiquier.main(args);

        } else if (userChoose == 4) {
            ShowName a = new ShowName();
            ShowName.main(args);

        } else if (userChoose == 5) {
            ShowtableMult a = new ShowtableMult();
            ShowtableMult.main(args);

        } else if (userChoose == 6) {
            Som a = new Som();
            Som.main(args);

        } else if (userChoose == 7) {
            BanditManchot a = new BanditManchot();
            BanditManchot.main(args);

        }
        else if (userChoose == 8) {
            Roulette a = new Roulette();
            Roulette.main(args);

        }else {
            System.out.println("Vous quittez l'exercice");
            return;
        }

    }

}
