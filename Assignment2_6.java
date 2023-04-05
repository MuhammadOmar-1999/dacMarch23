import java.util.Scanner;
class BankAccount{
    private String accountHolderName;
    private long accountNumber;
    private double accountBalance;
    private static long accNum = 1;

    BankAccount(String accountHolderName, long accountNumber, double accountBalance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    private void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    private String getAccountHolderName(){
        return this.accountHolderName;
    }
    private long getAccountNumber(){
        return this.accountNumber;
    }
    private void setAccountBalance(double accountBalance){
        this.accountBalance = accountBalance;
    }
    private double getAccountBalance(){
        return this.accountBalance;
    }

    public static BankAccount createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        BankAccount newac = new BankAccount(name,(1000+accNum),0.0);
        accNum += 1;
        System.out.println("New account created: ");
        System.out.println("Name of account holder: "+newac.getAccountHolderName());
        System.out.println("Account number: "+newac.getAccountNumber());
        System.out.println("Account balance: "+newac.getAccountBalance());
        return newac;
    }
    public void deposit(long accountNumber, double amount){
        if(this.accountNumber == accountNumber){
            this.accountBalance = this.accountBalance + amount;
            System.out.println("Account number "+this.accountNumber+" credited with "+amount);
        }
        else{
            System.out.println("Wrong account number!");
        }
    }
    public void withdraw(long accountNumber, double amount){
        if(this.accountNumber == accountNumber && this.accountBalance >= amount){
            this.accountBalance = this.accountBalance - amount;
            System.out.println("Account number "+this.accountNumber+" debited with "+amount);
        }
        else{
            if(this.accountBalance < amount){
                System.out.println("Insufficient Balance!");
            }
            else{
                System.out.println("Wrong account number!");
            }
            
        }
    }
    public void displayAccountBalance(long accountNumber){
        if(this.accountNumber == accountNumber){
            System.out.println("Account balance: "+this.getAccountBalance());
        }
        else{
            System.out.println("Wrong account number!");
        }
    }
    public void displayInformation(long accountNumber){
        if(this.accountNumber == accountNumber){
            System.out.println("Name of account holder: "+this.getAccountHolderName());
            System.out.println("Account balance: "+this.getAccountBalance());
        }
    }
}
    

public class Assignment2_6 {
    public static void main(String[] args){
        BankAccount b1 = BankAccount.createAccount();
        BankAccount b2 = BankAccount.createAccount();
        BankAccount b3 = BankAccount.createAccount();
        b1.deposit(1001, 500);
        b2.deposit(1002, 1000);
        b3.deposit(1003,1500);
        b1.displayInformation(1001);
        b2.displayInformation(1002);
        b3.displayInformation(1003);;
    }
}

