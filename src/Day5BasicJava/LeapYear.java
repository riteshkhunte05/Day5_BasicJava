package Day5BasicJava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year: ");
		num=sc.nextInt();
		if(num%4==0)
		{
			System.out.print("leap year");
		}
			else
			{
				System.out.print("not leap year");
		}
	}

}
