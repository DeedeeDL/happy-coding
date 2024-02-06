package org.example;
import java.util.Scanner;

public class P09_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // I created the scanner object for the user input of the letter.
        System.out.println("Enter a letter: ");
        char letter = scanner.next().charAt(0); // I declared a char variable for initializing the letter.
        //I used switch to select from a multiple of cases.
  switch (letter){
      case 'A':
          System.out.println(letter + " is a vowel");
          break;
      case 'E':
          System.out.println(letter + " is a vowel");
          break;
      case 'I':
          System.out.println(letter + " is a vowel");
          break;
      case 'O':
          System.out.println(letter + " is a vowel");
          break;
      case 'U':
          System.out.println(letter + " is a vowel");
          break;
      case 'a':
          System.out.println(letter + " is a vowel");
          break;
      case 'e':
          System.out.println(letter + " is a vowel");
          break;
      case 'i':
          System.out.println(letter + " is a vowel");
          break;
      case 'o':
          System.out.println(letter + " is a vowel");
          break;
      case 'u':
          System.out.println(letter + " is a vowel");
          break;
      default:
          System.out.println(letter + " is a consonant");
        }
    }
}
