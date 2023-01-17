import java.util.Scanner;
public class ShowName {

    public static void main(String[] args) {
        Scanner lastName = new Scanner(System.in);
        System.out.println("Enter your lastname");

        String userLastName = lastName.nextLine();
        System.out.println("Your lastname is: " + userLastName);
    }

}