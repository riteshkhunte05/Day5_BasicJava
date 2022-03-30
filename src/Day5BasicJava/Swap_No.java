package Day5BasicJava;

import java.util.Scanner;

public class Swap_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, t; 
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the value of X and Y");  
	       x = sc.nextInt();  
	       y = sc.nextInt();    
	       t = x;  
	       x = y;  
	       y = t;  
	       System.out.println("After swapping: "+x +"   " + y);  
	       System.out.println( );  
	}

}
