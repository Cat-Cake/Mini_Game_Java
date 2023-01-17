import java.util.Scanner;

public class Som {
    public static void main(String[] args) {
        System.out.println("Entrer un nombre entier");
        Scanner firstNumber = new Scanner(System.in);
        int numberOne = Integer.parseInt(firstNumber.nextLine());

        System.out.println("Entrer un deuxième nombre entier");
        Scanner secondNumber = new Scanner(System.in);
        int numberTwo = Integer.parseInt(secondNumber.nextLine());

        int number = numberOne + numberTwo;
        System.out.println("La somme des nombres est : " + number);
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
