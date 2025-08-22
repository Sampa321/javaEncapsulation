package MiniProject.Encapsulation.BankApplication;

import java.util.Scanner;

public class Bank {
    static int totalAccount;
    static {
        System.out.println("Welcome in SBI bank");
        totalAccount=0;
    }

    public static void main(String[] args) {
        String input="";
        Scanner SC=new Scanner(System.in);
//      ArrayList <BankAcc> accounts=new ArrayList<>();
        BankAcc account=null;
        do{
            System.out.println("----------Option------------");
            System.out.println("1.Create Account");
            System.out.println("2.Deposit money in account");
            System.out.println("3.Withdraw money from account");
            System.out.println("4.check Balance");
            System.out.println("5.show Account Details");
            System.out.println("6.exit!");
            System.out.println("********************************************************");
            System.out.print("Choose an option:");
            input= SC.next();
            SC.nextLine();


            switch (input) {
                case "1":
                    if(account!=null)
                    {
                        System.out.println("Account already exists!");
                    }
                    else {
                        System.out.print("Customer Name:");
                        String CustomerName=SC.nextLine();

                        System.out.print("Initial deposit:");
                        float amountDeposit=SC.nextFloat();
                        SC.nextLine();
                        System.out.print("Customer Address:");
                        String CusAdd=SC.nextLine();

                        System.out.println("Successfully create account");
                        account=new BankAcc(CustomerName,amountDeposit,CusAdd);
//                        accounts.add(new BankAcc(CustomerName,amountDeposit,CusAdd));
                    }
                    break;

                case "2":
                    if(account==null)
                    {
                        System.out.println("First create account!");
                    }
                    else{
                        account.Deposit();
                    }
                    break;
                case "3":
                    if(account==null)
                    {
                        System.out.println("First create account!");
                    }
                    else{
                        account.withdraw();
                    }
                    break;
                case "4":
                    if(account==null)
                    {
                        System.out.println("First create account!");
                    }
                    else{
                        account.getBalance();
                    }
                    break;
                case "5":
                    if(account==null)
                    {
                        System.out.println("First create account!");
                    }
                    else {
                        account.showAccountDetails();
                    }
                    break;
                case "6":
                    System.exit(0);
                    break;
               default:
                   System.out.println("please enter the valid input");

            }
        }while(!input.equalsIgnoreCase("stop"));
    }
}
