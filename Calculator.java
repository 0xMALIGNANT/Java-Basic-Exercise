import java.util.Scanner;
import java.util.ArrayList;

public class Calculator{    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to OxMALIGNANT's Bad Calculator");

        //MENU
        String menu =   "[0] - Addition\n" +
                        "[1] - Subtraction\n" +
                        "[2] - Multiplication\n" +
                        "[3] - Division\n\n" +
                        "Your Choice?: "
                        ;

        int choice = 0;
        choice = checkValidChoice(sc, choice, menu);

        switch(choice) {
            case 0:
                ArrayList<Integer> numbers = new ArrayList<Integer>();
                
                System.out.println("Can you Input how many numbers you want to add: ");

                int howMany;
                if(sc.hasNextInt()) {
                    howMany = sc.nextInt();
                }

                else {
                    System.out.print("you fucked up");
                }

                for(int i = 0; i < howMany; i++) {
                    numbers.add()
                }

                
            case 1:

            case 2:

            case 3:
        }
        sc.close();

    }

    public static int checkValidChoice(Scanner sc, int x, String menu){
        while(true) {
            System.out.print("\n" + menu);
            if(sc.hasNextInt()) {
                x = sc.nextInt();
                if(x > 3 || x < 0) {
                    System.out.println("You're out of bounds!");
                    continue;
                }

                else{
                    sc.close();
                    return x;
                }
            }

             else{
                sc.next();
                System.out.print("\nInvalid Input!\n");
                continue;
                }
        }
    }
}
