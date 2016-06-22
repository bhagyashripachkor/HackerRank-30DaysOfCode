import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
         /* Declare second integer, double, and String variables. */
        int i2 ;
        i2 = Integer.parseInt(scan.nextLine());
        double d2;
        d2 = Double.parseDouble(scan.nextLine());
        String s2;
        s2 = scan.nextLine();
        /* Read and save an integer, double, and String to your variables.*/
        System.out.println(i+i2);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(d+d2);
        /* Print the sum of the double variables on a new line. */
		System.out.println(s+s2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        scan.close();
    }
}
