import java.util.Scanner;

public class Echiquier {
    public static int[] array;
    public static void main(String[] args) {
        Scanner inputEch = new Scanner(System.in);
        System.out.println("Voulez vous un plateau de 8 ou de 16 ?");
        int numberPlt = inputEch.nextInt();

        if (numberPlt == 8) {
            Scanner input = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int number = input.nextInt();
            creatingTable8(number);
        } else if (numberPlt == 16) {
            Scanner input = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int number = input.nextInt();
            creatingTable16(number);
        }
    }

    public static void creatingTable8(int e) {
        for (int i = 0; i < e; i++) {
            if (i % 2 == 0) {
                System.out.println("# # # # ");
            } else {
                System.out.println(" # # # #");
            }
        }
        Main a = new Main();
        Main.main(null);
    }

    public static void creatingTable16(int e) {
        for (int i = 0; i < e; i++) {
            if (i % 2 == 0) {
                System.out.println("# # # # # # # # ");
            } else {
                System.out.println(" # # # # # # # #");
            }
        }
        System.out.println("Fin du programme");
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
