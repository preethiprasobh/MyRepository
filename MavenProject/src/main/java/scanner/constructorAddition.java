package scanner;

import java.util.Scanner;

public class constructorAddition {
	static int a,b,c;     //static variable
	public constructorAddition(int a,int b)
	
	{
		c=a+b;
		System.out.println("The addition result is:"+c);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
		@SuppressWarnings("unused")
		constructorAddition cc=new constructorAddition(a,b);
		
		
		

	}

}
