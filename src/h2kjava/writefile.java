package h2kjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writefile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            FileWriter fw = new FileWriter("h2kinfosys");
	            PrintWriter pw = new PrintWriter(fw);
	            
	            pw.println("Please complete the challenges");
	            pw.close();
	 
	        } catch (IOException e) {
	        	System.out.print("Error!!!");
	        }
	    }
	 
	}


