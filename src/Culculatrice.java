import java.util.Scanner;

public class Culculatrice {
    public static void main(String[] args) {
        startingclalc();
    }

    public static void startingclalc() {
        Scanner inputEch = new Scanner(System.in);
        System.out.println("Que souhaitez-vous faire ? : \n" +
                "1 - Addition \n" +
                "2 - Multiplication \n" +
                "3 - Division \n" +
                "4 - Soustraction \n" +
                "5 - Factorisation \n");
        int numberPlt = inputEch.nextInt();

        if (numberPlt == 1) {

            System.out.println("Vous avez choisi : Addition \n");
            Scanner input = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int firstNumber = input.nextInt();

            Scanner secondInput = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int secondNumber = secondInput.nextInt();
            sum(firstNumber, secondNumber);

        } else if (numberPlt == 2) {

            System.out.println("Vous avez choisi : Multiplication \n");
            Scanner input = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int firstNumber = input.nextInt();

            Scanner secondInput = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int secondNumber = secondInput.nextInt();
            multiply(firstNumber, secondNumber);

        } else if (numberPlt == 3) {

            System.out.println("Vous avez choisi : Division \n");
            Scanner input = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int firstNumber = input.nextInt();

            Scanner secondInput = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int secondNumber = secondInput.nextInt();
            divide(firstNumber, secondNumber);

        } else if (numberPlt == 4) {

            System.out.println("Vous avez choisi : Soustraction \n");
            Scanner input = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int firstNumber = input.nextInt();

            Scanner secondInput = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int secondNumber = secondInput.nextInt();
            substract(firstNumber, secondNumber);

        } else if (numberPlt == 5) {

            System.out.println("Vous avez choisi : Factorisation \n");
            Scanner secondInput = new Scanner(System.in);
            System.out.println("Entrer un nombre");
            int oneNumber = secondInput.nextInt();
            factorial(oneNumber);
        }

    }

    public static void sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println("Le résultat est : " + result);
        askingNewCalc();
    }
    public static void multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        System.out.println("Le résultat est : " + result);
        askingNewCalc();
    }
    public static void divide(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        System.out.println("Le résultat est : " + result);
        askingNewCalc();
    }
    public static void substract(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        System.out.println("Le résultat est : " + result);
        askingNewCalc();
    }
    public static void factorial(int onlyNumber) {
        int i,fact=1;
        int number=onlyNumber;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("La factorielle de " + number + " est : " + fact);
        askingNewCalc();
    }

    public static void askingNewCalc() {
        System.out.println("\nVoulez faire un nouveau calcul ? \n" +
                "1 - Oui \n" +
                "2 - Non \n");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (answer == 1) {
            startingclalc();
        } else if (answer == 2) {
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
}