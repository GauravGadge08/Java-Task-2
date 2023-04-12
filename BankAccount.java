import java.util.Scanner;

public class BankAccount {
    
    String name;
    String userName;
    String password;
    String accountNo;
    float balance = 300000f;
    int transactions = 0;
    String transactionHistory = "";

    // BankAccount 
    //string name 
    //String username
    //String password 
    //String accountNo
    
       
     //program for registration  
    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter your name - ");
        this.name = sc.nextLine();
        System.out.print("\nEnter your username - ");
        this.userName = sc.nextLine();
        System.out.print("\nEnter your Password - ");
        this.password = sc.nextLine();
        System.out.print("\nEnter your Acoount number - ");
        this.accountNo = sc.nextLine();
        System.out.println("\nRegistration completed");

    } 
     
      //program for login 

    public boolean login() {
        boolean isLogin = false;
        Scanner sc = new Scanner(System.in);
        while (!isLogin){
            System.out.print("\nEnter Your Username - ");
            String Username = sc.nextLine();
            if ( Username.equals(userName)){
                while ( !isLogin ) {
                    System.out.print("\nEnter your Password - ");
                    String Password = sc.nextLine();
                    if ( Password.equals(Password)) {
                        System.out.print("\nLogin successful!");
                        isLogin = true;
                    }
                    else {
                        System.out.println("\nincorrect password");

                    }
                }  


            }
            else {
                System.out.println("\nUsername not found");

            }
        }
        return isLogin;
    }
     //program for withdraw

    public void withdraw() {

        System.out.print("\nEnter amount to withdraw - ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        try {

            if (balance >= amount ) {
                transactions++ ;
                balance -= amount;
                System.out.println("\nwithdraw successfully");
                String str = amount +  "Rs Withdrawed\n";
                transactionHistory = transactionHistory.concat(str);
            }
            else {
                System.out.println("\nInsufficient Balance");

            }
        }
        catch ( Exception e) {

        }



    }
    //program for deposit
    public void deposit(){

        System.out.print("\nEnter amount to deposit - ");
        Scanner sc = new Scanner (System.in);
        float amount = sc.nextFloat();

        try {
            if  ( amount <= 100000f ) {
                transactions++;
                balance += amount;
                System.out.println("\nsuccessfully Deposited");
                String str = amount + " Rs deposited\n";
                transactionHistory = transactionHistory.concat(str);

            }
            else {
                System.out.println("\nLimit is 100000.00");
                
            }
        }
        catch ( Exception e) {

        }
    } 
 //program for transfer
    public void transfer() {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Receipent's Name - ");
        String receipent = sc.nextLine();
        System.out.print("\nEnter amount to transfer - ");
        float amount = sc.nextFloat();

        try {
            if ( balance >= amount ) {
                if ( amount <= 50000f ) {
                    transactions++;
                    balance -= amount;
                    System.out.println("\nsuccessfully Transfered to "+ receipent );
                    String str = amount + " Rs transfered to " + receipent +"\n";
                    transactionHistory = transactionHistory.concat(str);
                }
                else{
                    System.out.println("\nLimit is 50000.00");
                }
            }
            else {
                System.out.println("\ninsufficient Balance");
            }
        }
        catch (Exception e) {

        }
    }
     //program for check Balance
    public void checkBalance() {
        System.out.println("\n" + balance + "Rs");

    }
     //program for transHistory

    public void transHistory(){
        if ( transactions == 0) {
            System.out.println("\nEmpty");
        }
        else {
            System.out.println("\n" + transactionHistory);
        }
        
    }
     
}