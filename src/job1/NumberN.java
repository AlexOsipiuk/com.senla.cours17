package job1;

import java.util.Scanner;

public class NumberN {
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter a Prime number");
     if (!scan.hasNextInt()) {
    	 scan.nextLine();
         System.err.println("not a number");
     } else {
         Integer numb = scan.nextInt();
         scan.close();
         boolean flag = true;
         for (int i = 2; i <= numb; i++) {
             for (int j = 2; j < i; j++) {
                 if (i % j == 0) {
                     flag = false;
                     break;
                 }
             }
             if (flag) System.out.print(i+" ");
             flag=true;
         }
     }
 }
}
