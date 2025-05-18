import java.util.Scanner;

class BankAccount {
    public static Scanner input = new Scanner(System.in);
    private int accountNO;
    private String accHolderName;
    private int balance = 0;
    private int options;

    public void menu() {
        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Add Account");
            System.out.println("3. Withdraw cash");
            System.out.println("4. Deposit ");
            System.out.println("5. Exit ");
            System.out.print("Choose options (1-5) : ");

            options = input.nextInt();
            switch (options) {
                case 1:
                    checkbalance();
                    break;
                case 2:
                    AddAccount();
                    break;
                case 3:
                    Withdraw();
                    break;
                case 4:
                    Deposit();
                    break;
                default:
                    break;
            }
        }while (options==5);
    }

    public void checkbalance() {

        System.out.println("Balance = " + balance);

    }

    public void Deposit() {
        int deposit;
        System.out.print("Enter amount to deposit :");
        deposit = input.nextInt();
        if (deposit > 0) {
            balance += deposit;
            System.out.println("Now, Your current balance is :" + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void AddAccount() {
        System.out.println("Please, enter your name: ");
        String name = input.nextLine().trim();
        input.nextLine();
        BankAccount acc = new BankAccount();
        acc.accountNO = 29;
        acc.accHolderName = name;
        acc.balance = 0;
        System.out.println("Account Successfully created!\n Your current balance is "+balance);

    }

    public void Withdraw() {
        int withdraw ;
        System.out.println("Your previous balance is : " + balance);
        System.out.print("Enter amount to withdraw : " );
        withdraw = input.nextInt();
        if(withdraw<balance){
            balance-=withdraw;
            System.out.println("Now, your current balance is "+balance);
        }else{
            System.out.println("Invalid amount");
        }
    }
}
