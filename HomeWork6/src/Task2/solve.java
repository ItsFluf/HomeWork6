package Task2;

import java.util.*;

public class solve {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        char ascii_value_of_zero = '0',tav;
        int mispar;
        mispar = 0;
        tav = reader.next().charAt(0);
        while(((tav >= '0' && tav <= '9') || tav == ',') && tav != '*') {
            if(tav != ',') {
                mispar = 10 * mispar + (tav-ascii_value_of_zero);
            }
                tav = reader.next().charAt(0);
        }
        System.out.println("The number is: " + mispar);
        System.out.println("The root is: " + Math.sqrt((double) mispar));
    }
}