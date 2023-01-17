import java.util.Scanner;

public class Som {
    public static void main(String[] args) {
        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Entrer un nombre entier");
        Scanner secondNumber = new Scanner(System.in);
        System.out.println("Entrer un deuxième nombre entier");

        int numberOne = Integer.parseInt(firstNumber.nextLine());
        int numberTwo = Integer.parseInt(secondNumber.nextLine());
        int number = numberOne + numberTwo;
        System.out.println("La somme des nombres est : " + number);
    }
}
