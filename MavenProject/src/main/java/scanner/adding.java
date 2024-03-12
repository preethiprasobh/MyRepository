package scanner;

import java.util.Scanner;

public class adding {

	public void addition()
	{
		int a,b,c;
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a and b:");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("The addition result is:"+c);
		
	}
	public static void main(String[] args) {
		
adding ad=new adding();
ad.addition();

	}

}
