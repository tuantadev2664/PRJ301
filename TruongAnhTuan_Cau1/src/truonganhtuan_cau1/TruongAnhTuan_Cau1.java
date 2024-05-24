/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package truonganhtuan_cau1;

import java.util.Scanner;

/**
 *
 * @author FPTSHOP
 */
public class TruongAnhTuan_Cau1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       int numOfNumeral = 0;
       int numOfVowel = 0;
       int numOfConsonant = 0;
       int numOfSpecial = 0;
       for (int  i = 0; i < str.length(); i++) {
           if(Character.isDigit(str.charAt(i)))
               numOfNumeral++;
           else if(Character.isAlphabetic(str.charAt(i))) {
               if(str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u' || str.charAt(i) == 'e')
                   numOfVowel++;
               else 
                   numOfConsonant++;
           }
           else
               numOfSpecial++;
       }
       System.out.println("numOfNumeral = " + numOfNumeral);
       System.out.println("numOfVowel = " + numOfVowel);
       System.out.println("numOfConsonant = " + numOfConsonant);
       System.out.println("numOfSpecial = " + numOfSpecial);
    }
    
}
