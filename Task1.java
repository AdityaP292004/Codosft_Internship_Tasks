// Student Grade Calculator

import java.util.*;

public class Task1
{
    public static void main(String Arg[]) throws Exception
    {
        int Arr[] = {0,0,0,0,0};
        int TotalMarks = 0;
        int TotalSubject = 0;
        float percentage = 0.0f;
        String subject = "\0";

        
        Scanner sobj = new Scanner(System.in);

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println("Enter the Subject : ");
            subject = sobj.nextLine();

            System.out.println("Enter the Marks of "+subject+" out of 100 : " );
            Arr[i] = sobj.nextInt();

            sobj.nextLine();

            TotalSubject++;
        }

        System.out.println("Total Subject are : "+TotalSubject);

        for(int i = 0; i < Arr.length; i++)
        {
            TotalMarks = TotalMarks + Arr[i];
        }

        System.out.println("Total Obtained Marks are : "+TotalMarks);

        percentage = ((float)TotalMarks/(float)(TotalSubject));

        System.out.println("Percentage obtained are : "+percentage);


        if(percentage <= 100 && percentage >= 85)
        {
            System.out.println("You Secured 'A' Grade");
        }
        else if(percentage < 85 && percentage >= 70)
        {
            System.out.println("You Secured 'B' Grade");
        }
        else if(percentage < 70 && percentage >= 55)
        {
            System.out.println("You Secured 'C' Grade");
        }
        else if(percentage < 55 && percentage >= 40)
        {
            System.out.println("You Secured 'D' Grade");
        }
        else if(percentage < 40 && percentage >= 35)
        {
            System.out.println("You Secured 'E' Grade");
        }
        else if(percentage < 35 && percentage >= 0)
        {
            System.out.println("You Secured 'F' Grade");
        }
        else
        {
            System.out.println("Enter Valid Marks");
        }
    }
}