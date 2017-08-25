package job2;

import java.util.Scanner;

public class NumberFib {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Prime number");
        if (!scan.hasNextInt()) {
        	scan.nextLine();
            System.err.println("not a number");
        } else {
        	Integer y = scan.nextInt(); 
        	int a = 1, b = 1; 
        	System.out.print(a + " " + b); 
        	int fib = 2, i = 2; 
        	while (i < y) { 
        	fib = a + b; 
        	a = b; 
        	b = fib; 
        	System.out.print(" "+fib); 
        	i++; 
        	{ 
        		if(fib>y-fib) break; 
        	} 
           }
        }
    }
}

