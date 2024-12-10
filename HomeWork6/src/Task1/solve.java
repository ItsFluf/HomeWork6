package Task1;

import java.util.Scanner;

public class solve {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int wrongInputs = 0;
        for(int i = 1 ; i <= 35; i++) {
               System.out.println("Enter character number " + i + ": ");
               char tav = reader.next().charAt(0);
               if(!((tav >= 'a' && tav <= 'z') || (tav >= 'A' && tav <= 'Z'))){
                   System.out.println("You've entered a wrong character! please enter a letter, capital or regular!");
                   i--;
                   wrongInputs++;
               }
           }
        System.out.println("You've entered the system " + wrongInputs + " times the wrong character!");
    }
}
