package Task3;

import java.util.Scanner;

public class solve {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int primeNumbers = 0;
        System.out.print("Please give me a number: ");
        int num = reader.nextInt();
        for (int j = 2; j <= num; j++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(j);
                primeNumbers++;
            }
        }
        System.out.println("There are " + primeNumbers + " prime numbers until " + num);
    }
}
