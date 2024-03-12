package scanner;

import java.util.Scanner;

public class InstanceVar {
int a,b,c;     //instance variable
	public void Addition(int a,int b)
	
	{
		c=a+b;
		System.out.println("The addition result is:"+c);
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a and b:");
		int i=sc.nextInt();
		int j=sc.nextInt();
		InstanceVar v=new InstanceVar();
		v.Addition(i,j);

	}

}
