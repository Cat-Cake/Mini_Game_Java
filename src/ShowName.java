import java.util.Scanner;
public class ShowName {

    public static void main(String[] args) {
        Scanner lastName = new Scanner(System.in);
        System.out.println("Enter your lastname");

        String userLastName = lastName.nextLine();
        System.out.println("Your lastname is: " + userLastName);
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