import java.util.Scanner;

public class Calculator{    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Bitbleed's Bad Calculator");

        //MENU
        String menu =   "[0] - Addition\n" +
                        "[1] - Subtraction\n" +
                        "[2] - Multiplication\n" +
                        "[3] - Division\n\n" +
                        "Your Choice?: "
                        ;

        System.out.print(menu);

        int choice = 0;
        choice = checkValidChoice(sc, choice, menu);

        switch(choice) {
            case 0:

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

