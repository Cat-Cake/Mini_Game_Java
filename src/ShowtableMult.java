import java.util.Scanner;

public class ShowtableMult {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int number = input.nextInt();


        for (int i = 0; i < 11; i++) {
            int numbertotal = number * i;
            System.out.println(numbertotal);
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
