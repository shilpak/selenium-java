package h2kjava;

public class printnumber {
	
	public static void printNum(int num) {
		
		//num is less than or equal to 10
		if (num <= 10) {
			System.out.print(num + " ");
			
			printNum(num+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n = 1;
          
          printNum(n);
	}

}
