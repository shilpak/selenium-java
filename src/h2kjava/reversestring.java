package h2kjava;



public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s = "Selenium";
      //using for loop
      int len = s.length();
      String reverse = "";
      
      for(int i = len-1; i>=0; i--) {
    	  reverse = reverse+s.charAt(i);
      }
		
		System.out.println(reverse);
		
      //using StringBuffer
      StringBuffer sb = new StringBuffer(s);
      System.out.println(sb.reverse());
      
	}

}
