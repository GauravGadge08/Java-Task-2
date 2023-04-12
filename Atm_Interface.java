import java.util.Scanner;
//Public Class 
public class Atm_Interface {

    public static int takeIntegerInput(int limit) {
        int input = 0;
        boolean flag = false;


        while (!flag) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                flag = true;
                
                if ( flag && input > limit || input < 1 ) {
                    System.out.println("choose the number between 1 to " + limit);
                    flag = false;
                }

            }
            catch ( Exception e) {
                System.out.println("Enter only integer value");
                flag = false;
            }

            
        };
        return input ;


    } 
    
// Main Method
    public static void main(String[]args) {

        System.out.println("\n****WELCOME TO ICICI ATM SYSTEM****\n");
        System.out.println("1.Register \n2.Exit");
        System.out.println("Enter your choice - ");
        int choice = takeIntegerInput(2);

        if ( choice == 1 ) {
            BankAccount b = new BankAccount();
            b.register();
            while(true) {
                System.out.println("\n1.login \n2.Exit");
                System.out.println("Enter your choice - ");
                int ch = takeIntegerInput(2);
                if (ch ==1 ) {
                    if (b.login()) {
                        System.out.println("\n\n*****Welcome back" + b.name + "*****\n");
                        boolean isFinished = true;
                        while (isFinished) {
                            System.out.println("\n1.withdraw \n2.Deposit \n3. Transfer \n4. Check balance \n5.Transaction History \n6.Exit");
                            System.out.print("\nEnter your Choice - ");
                            int c = takeIntegerInput(6);
                            switch(c) {
                                case 1:
                                b.withdraw();
                                break;
                                case 2:
                                b.deposit();
                                break;
                                case 3:
                                b.transfer();
                                break;
                                case 4:
                                b.checkBalance();
                                break;
                                case 5:
                                b.transHistory();
                                break;
                                case 6:
                                isFinished = true;
                                break;
        
                            }
                            
                        }
                    }
                }
                else {
                    System.exit(0);
                }

            }
        }
        else {
            System.exit(0);
        }
        
    }
    
}