package job5;

import java.util.Scanner;

public class Palindrom {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("checking words in a palindrome");
        String str = scan.nextLine();
        scan.close();
        str = str.replaceAll("[^A-Za-z]", "");
        if (str.toLowerCase().equals((new StringBuilder(str)).reverse().toString().toLowerCase()))
            System.out.println("Palindrome! " + str);
        else
            System.out.println("Not a palindrome :( " + str);
	}
}
