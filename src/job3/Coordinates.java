package job3;
import java.awt.Point; 
import java.util.Scanner; 

public class Coordinates {
	public static int orientation(Point p, Point q, Point r) { 
		double val = (q.getY() - p.getY()) * (r.getX() - q.getX()) 
		- (q.getX() - p.getX()) * (r.getY() - q.getY()); 
		if (val == 0.0) 
		return 0; 
		return (val > 0) ? 1 : 2; 
		} 

		public static boolean intersect(Point p1, Point q1, Point p2, Point q2) { 
		int o1 = orientation(p1, q1, p2); 
		int o2 = orientation(p1, q1, q2); 
		int o3 = orientation(p2, q2, p1); 
		int o4 = orientation(p2, q2, q1); 
		if (o1 != o2 && o3 != o4) 
		return true; 
		return false; 
		} 
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number x1 for the line 1"); 
		Integer x1 = sc.nextInt(); 
		System.out.println("Enter the number y1 for the line 1");
		Integer y1 = sc.nextInt();
		System.out.println("Enter the number x2 for the line 1"); 
		Integer x2 = sc.nextInt(); 
		System.out.println("Enter the number y2 for the line 1");
		Integer y2 = sc.nextInt();
		
		System.out.println("Enter the number x3 for the line 2"); 
		Integer x3 = sc.nextInt(); 
		System.out.println("Enter the number y3 for the line 2");
		Integer y3 = sc.nextInt();
		System.out.println("Enter the number x4 for the line 2"); 
		Integer x4 = sc.nextInt(); 
		System.out.println("Enter the number y4 for the line 2");
		Integer y4 = sc.nextInt();
		
		Point p1 = new Point(x1,y1); 
		Point q1 = new Point(x2,y2); 
		Point p2 = new Point(x3,y3); 
		Point q2 = new Point(x4,y4); 
		
		System.out.println("intersect: "+intersect(p1, q1, p2, q2));  
		} 
}