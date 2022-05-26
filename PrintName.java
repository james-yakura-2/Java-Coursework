/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week02;

/**
 *
 * @author james
 */
public class PrintName {
    
   public static void main(String[] args)
   {
      
      String[] letter_j=
      {
          "JJJJJ ",
          "  J   ",
          "J J   ",
          "J J   ",
          "JJJ   "
      };
      String[] letter_a=
      {
          "  A   ",
          " A A  ",
          " AAA  ",
          "A   A ",
          "A   A "
      };
      String[] letter_m=
      {
          "M   M ",
          "MM MM ",
          "M M M ",
          "M   M ",
          "M   M "
      };
      String[] letter_e=
      {
        "EEEEE ",
        "E     ",
        "EEE   ",
        "E     ",
        "EEEEE "
      };
      String[] letter_s=
      {
          "SSSSS ",
          "S     ",
          "SSSSS ",
          "    S ",
          "SSSSS "
      };
      
      for(int i=0; i<5; i++)
      {
          System.out.println(letter_j[i]+letter_a[i]+letter_m[i]+letter_e[i]+letter_s[i]);
      }
   }
    
}
