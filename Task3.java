// ATM Interface

import java.util.*;

class UserAccount
{
    public float Balance;
    public int PIN;

    public UserAccount()
    {
        Balance = 0;
        PIN = 4567;
    }
}

class ATMMachine
{
    UserAccount obj = new UserAccount();

    public void checkpin()
    {
        System.out.println("---------------ATM USER INTERFACE---------------");
        System.out.println("Enter your PIN : ");
        Scanner sobj = new Scanner(System.in);

        int enteredpin = sobj.nextInt();

        if(enteredpin == obj.PIN)
        {
            menu();
        }
        else
        {
            System.out.println("Enter a Valid PIN");
            System.out.println("");
            checkpin();
        }
    }

    public void menu()
    {
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");
        System.out.println("-------------------------");
        System.out.println("Enter your choice : ");

        Scanner sobj = new Scanner(System.in);
        int option = sobj.nextInt();

        if(option == 1)
        {
            System.out.println("");
            checkBalance();
        }
        else if(option == 2)
        {
            System.out.println("");
            withdrawMoney();
        }
        else if(option == 3)
        {
            System.out.println("");
            depositMoney();
        }
        else if(option == 4)
        {
            System.out.println("");
            System.out.println("Exiting......");
            return;
        }
        else
        {
            System.out.println("Please Enter a Valid Choice");
        }
    }

    public void checkBalance()
    {
        System.out.println("-------------------------");
        System.out.println("A/C Balance is : "+obj.Balance);
        System.out.println("-------------------------");
        menu();
    }

    public void withdrawMoney()
    {
        System.out.println("Enter the Amount to Withdraw");
        Scanner sobj = new Scanner(System.in);
        float amount = sobj.nextFloat();

        if(amount > obj.Balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            obj.Balance = obj.Balance - amount;
            System.out.println("Money Withdrawal Successfully!!");
        }

        System.out.println("Do You Want To Display the Account Balance ? Y or N");
        Scanner sobj1 = new Scanner(System.in);
        char opt = sobj1.next().charAt(0);

        if(opt == 'Y' || opt == 'y')
        {
            System.out.println("Current Account Balance is : "+obj.Balance);
            menu();
        }
        else
        {
            menu();
        }
    }

    public void depositMoney()
    {
        System.out.println("Enter the Amount to Deposit : ");
        Scanner sobj = new Scanner(System.in);
        float amount = sobj.nextFloat();
        obj.Balance = obj.Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }

}

public class Task3
{
    public static void main(String Arg[])
    {
        ATMMachine aobj = new ATMMachine();
        aobj.checkpin();
    }
}