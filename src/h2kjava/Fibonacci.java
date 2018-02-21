package h2kjava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k,a=0,b=1;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		k=0;
		int num = sc.nextInt();
		
		while(k<=num)
		{
			a=b;
			b=k;
			k=a+b;
			if(k>=num)
				break;
			System.out.print(k + " ");
			a=b;
			b=k;
		}
		
	}

}
