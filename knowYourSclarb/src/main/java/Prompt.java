import java.util.Scanner;

public class Prompt {
    public static String[] requestName(String[] params){
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

        String[] arr = {firstName, lastName};
        return arr;

    }

    public static boolean requestAge(int param){
        Scanner sc = new Scanner(System.in);
        int age = 0;

        if (param==0){
            while(age<=0){
                System.out.print("\nYour age: ");
                age = sc.nextInt();
            }
        } else {
            age = param;
        }

        if (age>=18){
            System.out.print("\nOld boi...");
            return true;
        } else {
            System.out.print("\nYoungster, huh...");
            return false;
        }

    }

    public static int requestMagiIdentity(int param){
        Scanner sc = new Scanner(System.in);
        int magiIdentity = 0;

        if (param==0){
            while(magiIdentity!=1 || magiIdentity!=2 || magiIdentity!=3){
                System.out.print("\nWhich 7th gen organic supercomputer implanted personality role are you? Enter 1-3.");
                System.out.print("\n(1) Scientist --> Melchior-Magi");
                System.out.print("\n(2) Mother --> Balthasar-Magi");
                System.out.print("\n(3) Woman --> Casper-Magi");
                magiIdentity = sc.nextInt();
            }
        } else {
            magiIdentity = 1;
        }

        System.out.print("\nSuperb, Dr. Naoko Akagi...");
        return magiIdentity;


    }

    public static int requestBestAsianActress(int param){
        Scanner sc = new Scanner(System.in);
        int bestScarlett = 0;

        if (param==0){
            while(bestScarlett!=1 || bestScarlett!=2 || bestScarlett!=3 || bestScarlett!=4){
                System.out.print("\nWhich Sclarb Jorb do you prefer? Enter 1-4.");
                System.out.print("\n(1) Her");
                System.out.print("\n(2) Avengers");
                System.out.print("\n(3) Lucy ");
                System.out.print("\n(4) Ghost in the Shell");
                bestScarlett = sc.nextInt();
            }
        } else {
            bestScarlett = 2;
        }

        System.out.print("\nBest asian actress nomination.");
        return bestScarlett;

    }
}
