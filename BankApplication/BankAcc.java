package MiniProject.Encapsulation.BankApplication;

import  java.util.Scanner;
public class BankAcc {
    private final String Username;
    private final int accountNumber;
    private String UserAddress;
    private float balance;
    static int constValue=9876556;

    Scanner SC=new Scanner(System.in);
    public BankAcc(String customerName, float initialDeposit, String customerAddress)
    {
        this.Username=customerName;

        if(initialDeposit<0)
        {
            this.balance=0;
        }
        else {
            this.balance=initialDeposit;
        }
        if(customerAddress!=null && !customerAddress.trim().isEmpty())
        {
            this.UserAddress=customerAddress;
        }
        Bank.totalAccount++;
        System.out.println("Total account:"+Bank.totalAccount);

        this.accountNumber=constValue+Bank.totalAccount;
        System.out.println("Your Account Number:"+this.accountNumber);
    }

    //deposit
    public void Deposit(){
        System.out.print("Enter the Account number:");
        int accNum= SC.nextInt();
        if(this.accountNumber==accNum)
        {
            System.out.print("Enter the amount:");
            float depositAmount= SC.nextFloat();
            if(depositAmount<0)
            {
                System.out.println("please give a valid balance");
            }
            else {
                this.balance+=depositAmount;
                System.out.print("Your current balance:"+this.balance);
                System.out.println("Successfully deposit balance");
            }
        }
       else {
            System.out.println("Enter the correct account number!");
        }
        System.out.println("======================================");
    }

    //withdraw
    public void withdraw()
    {
        System.out.println("Enter the Account number:");
        int accNum= SC.nextInt();
        if(this.accountNumber==accNum) {
            System.out.println("Enter the amount:");
            float withdrawBalance = SC.nextFloat();
            if (withdrawBalance > 0 && withdrawBalance <= this.balance) {
                this.balance -= withdrawBalance;
                System.out.println("Your current balance:" + this.balance);
                System.out.println("Successfully withdraw balance");
            } else {
                System.out.println("Your current balance:" + this.balance);
                System.out.println("Please give withdraw <=Balance");
            }
        }
        else {
            System.out.println("Enter the correct account number!");
        }
        System.out.println("======================================");
    }

    //Account Details
    public void showAccountDetails(){
        System.out.print("Enter the Account number:");
        int accNum= SC.nextInt();
        if(this.accountNumber==accNum) {
            System.out.println("Detail Information");
            System.out.println("================================================");
            System.out.println("Your name:"+this.Username);
            System.out.println("Your Account number:"+this.accountNumber);
            System.out.println("Your address:"+this.UserAddress);
            System.out.println("Your Current Balance:"+this.balance);
        }else
        {
            System.out.println("Enter the correct account number!");
        }
        System.out.println("==================================");
    }

    // Check Balance
    public void getBalance() {
        System.out.print("Enter the Account number:");
        int accNum= SC.nextInt();
        if(this.accountNumber==accNum) {
            System.out.println("Your current balance:"+balance);
            System.out.println("Thank you!");
        }
        else
        {
            System.out.println("Enter the correct account number!");
        }
        System.out.println("======================================");
    }
}

