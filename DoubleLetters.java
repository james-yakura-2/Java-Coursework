/*
 *  This is default license text.
 */
package week02;

import java.util.Scanner;

/**
 *
 * @author james
 */
public class DoubleLetters
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter text.");
        String input=scan.nextLine();
        String output="";
        for(int i=0;i<input.length();i++)
        {
            char this_char=input.charAt(i);
            if(this_char=='!')
            {
                output+="!!!";
            }
            else if (Character.isAlphabetic(this_char))
            {
                output+=this_char+""+this_char;
                
            }
            else
            {
                output+=this_char;
                
            }
        }
        System.out.print(output);
    }
}