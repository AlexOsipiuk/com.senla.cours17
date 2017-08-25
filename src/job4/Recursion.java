package job4;

import java.util.Scanner;

public class Recursion {
	static int gcd(int x, int y) { 
	int r=0, a, b; 
	a = (x > y) ? x : y;
	b = (x < y) ? x : y; 
	r = b; 
	while(a % b != 0) 
	{ 
	r = a % b; 
	a = b; 
	b = r; 
	} 
	return r;
	} 
	static int lcm(int x, int y) 
	{ 
	int a; 
	a = (x > y) ? x : y;
	while(true) 
	{ 
	if(a % x == 0 && a % y == 0) 
	return a; 
	++a; 
	} 
	} 

	public static void main(String args[]) 
	{ 
	Scanner scan = new Scanner(System.in); 
	System.out.println("Enter the first number: "); 
	int x = scan.nextInt(); 
	System.out.println("Enter the second number: ");
	int y = scan.nextInt(); 

	System.out.println("The GCD of two numbers is: " + gcd(x, y)); 
	System.out.println("The LCM of two numbers is: " + lcm(x, y)); 
	scan.close(); 
	} 
	}