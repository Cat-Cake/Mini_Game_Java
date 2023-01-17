import java.util.Scanner;

public class NumberPair {

    public static void main(String[] args) {

    }

    public static void pairexo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " est pair");
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
        } else {
            System.out.println(number + " est impair");
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
