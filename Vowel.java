package com.company;
import java.util.Scanner;
public class Vowel {

    String userName;
    public  void takeInput( ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name: " );
        userName = input.next();
    }
    public int countVowel(){
        int count = 0;
        for (int i = 0; i < userName.length(); i++ ){
            if (userName.charAt(i) == 'a' || userName.charAt(i) == 'e' ||userName.charAt(i) == 'i'||
             userName.charAt(i) == 'o' || userName.charAt(i) == 'u' ||
             userName.charAt(i) == 'A' || userName.charAt(i) == 'E' ||
             userName.charAt(i) == 'I'|| userName.charAt(i) == 'O' || userName.charAt(i) == 'U'){
                count++;
            } //if
        } //for
        return count;
    }//string method

    public static void main(String[] args) {
       Vowel Vowel = new Vowel();
        System.out.println("MUZAMIL JAMIL CHANNA\n");

        Vowel.takeInput();
        System.out.println("\nNumber Of Vowel In UserName is: " + Vowel.countVowel());
    }
}
