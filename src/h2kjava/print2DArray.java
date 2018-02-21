package h2kjava;

public class print2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int k[][] = {{1, 2, 3} , {4, 5, 6} , {7, 8, 9}};
         
         printarray(k);
         
	}  //End of main.  
	
	public static void printarray(int a[][]) {
	
	for(int i=0; i<a.length; i++) { //start of row for loop
		
       for(int j=0; j<a.length; j++) { //start of column loop
    	   
        	System.out.print(a[i][j]+ "  ");
        	
        	 }//end of column loop
       
        	 System.out.println("");
        	 
         } //End of the row loop
	
	} //End of printarray method

}//End of class
