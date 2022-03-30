package Day5BasicJava;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 
		System.out.print("Enter Number: ");
		 
        int num = in.nextInt();
        double result = 0.0; 
        System.out.println("The harmonic series is: ");
      
        for (int i = num; i > 0; i--) {
 
            result = result + (double)1 / i;
 
            System.out.print(result + ", ");
        }
	}

}
