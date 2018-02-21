package h2kjava;

public class equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="shilpa";  
		String s2="kothari";  
		String s3="H@KINFOSYS";  
		String s4="shilpa";  
		System.out.println(s1.equals(s2));//true because content and case is same  
		System.out.println(s1.equals(s3));//false because case is not same  
		System.out.println(s1.equals(s4));//false because content is not same  
		}
	}


