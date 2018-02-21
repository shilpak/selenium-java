package h2kjava;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remainder,rev_num = 0;
	    Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
	    int temp=number;
	  while (temp!= 0) {
		  remainder = temp % 10;
		  rev_num = rev_num * 10 + remainder;
		  temp = temp/10;
	  }
	  if (rev_num==number) {
		 System.out.print("Palidrome"); 
	  }else {
		  System.out.print("not palidrome");
		  }
	  }
  }


