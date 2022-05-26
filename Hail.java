/*
 *  This is default license text.
 */
package week02;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author james
 */
public class Hail
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        //Take in a number.
        System.out.print("Enter a whole number.");
        int number=scan.nextInt();
        ArrayList<Integer> output=new ArrayList<>();
        output.add(number);
        int highest=number;
        //Repeat until the number equals 1:
        while(number!=1)
        {
        //  If the number is even,
            if(number%2==0)
            {
        //      halve it.
                number=number/2;
            }
        //  Otherwise,
            else
            {
        //      triple it and add 1.
                number=number*3+1;
            }
        //  Add the number to the output list.
            output.add(number);
        //  Keep a running track of the highest number.
        //  >If the number is higher than the current highest,
            if(number>highest)
            {
        //  >   it is the new highest.
                highest=number;
            }
        }
        System.out.println(output);
        System.out.println("First number: "+output.get(0));
        System.out.println("Terms: "+output.size());
        System.out.println("Highest number: "+highest);
    }
}
