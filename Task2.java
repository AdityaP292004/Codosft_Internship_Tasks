// Number Guessing Game

import java.lang.Math;
import java.util.*;

public class Task2
{
    public static void main(String Arg[])
    {
        boolean bFlag = false;
        int Guess = 0;
        int AttemptNo = 0;
        int Limit = 0;
        int RandomNum = 0;
        RandomNum = (int)(Math.random() * 101);

        System.out.println("------------------------Number Guessing Game------------------------");
        System.out.println("Random Number is Generated");

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number of attempts you want in which guess the Number : ");
        Limit = sobj.nextInt();

        while(AttemptNo != Limit)
        {
            System.out.println("Enter the Guess Number : ");
            Guess = sobj.nextInt();
    
            if(Guess > RandomNum)
            {
                System.out.println("Too High Guess!");
            }
            else if(Guess < RandomNum)
            {
                System.out.println("Too Low Guess!");
            }
            else
            {
                System.out.println("Correct Guess!");
                bFlag = true;
                break;
            }
            AttemptNo++;
            bFlag = false;
        }

        if(bFlag == true)
        {
            System.out.println("You Guessed it Correct and under the limit");
            if(AttemptNo < 5)
            {
                System.out.println("You Scored 10 on 10");
            }
            else if(AttemptNo >= 5 && AttemptNo < 10)
            {
                System.out.println("You Scored 7 on 10");
            }
            else if(AttemptNo >= 10 && AttemptNo < 15)
            {
                System.out.println("You Scored 5 on 10");
            }
            else if(AttemptNo >= 15 && AttemptNo < 20)
            {
                System.out.println("You Scored 2 on 10");
            }
            else
            {
                System.out.println("You Scored 0 on 10");
            }
        }
        else
        {
            System.out.println("Your Limit of Guessing the Number is Over");
        }

        System.out.println("End of Program");
        System.out.println("--------------------------------------------------------------------");

    }
}