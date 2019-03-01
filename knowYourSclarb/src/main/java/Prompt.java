import java.util.Scanner;

public class Prompt {
    public static void requestName(String[] params){
        Scanner sc = new Scanner(System.in);
        String firstName ="";
        String lastName ="";

        if (params==null){
            while(firstName.equals("")){
                System.out.print("\nFirst name: ");
                firstName = sc.nextLine();
            }
            while(lastName.equals("")){
                System.out.print("\nLast name: ");
                lastName = sc.nextLine();
            }
        } else {
            firstName = params[0];
            lastName = params[1];
        }

        System.out.println("Welcome, "
                + firstName + " " + "(" + firstName.length() + ")" + " "
                + lastName + " " + "(" + lastName.length() + ").");

    }

    public static boolean requestAge(String[] params){
        Scanner sc = new Scanner(System.in);
        int age = 0;

        if (params==null){
            while(age<=0){
                System.out.print("\nYour age: ");
                age = sc.nextInt();
            }
        } else {
            age = Integer.parseInt(params[0]);
        }

        if (age>=18){
            System.out.print("\nOld boi...");
            return true;
        } else {
            System.out.print("\nYoungster, huh...");
            return false;
        }

    }

    public static int requestMagiIdentity(String[] params){

    }

    public static int requestBestAsianActress(String[] params){

    }
}
