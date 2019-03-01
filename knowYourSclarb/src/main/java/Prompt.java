import java.util.Scanner;

public class Prompt {
    public static void requestName(String[] params){
        Scanner sc = new Scanner(System.in);
        String firstName ="";
        String lastName ="";

        while(firstName.equals("")){
            System.out.print("\nFirst name: ");
            firstName = sc.nextLine();
        }
        while(lastName.equals("")){
            System.out.print("\nLast name: ");
            lastName = sc.nextLine();
        }

        System.out.println("Welcome, "
                + firstName + " " + "(" + firstName.length() + ")" + " "
                + lastName + " " + "(" + lastName.length() + ").");

    }

    public static void requestAge(String[] params){

    }

    public static int requestMagiIdentity(String[] params){

    }

    public static int requestBestAsianActress(String[] params){

    }
}
