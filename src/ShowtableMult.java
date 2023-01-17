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

    }
}
