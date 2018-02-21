package h2kjava;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 try {
		            FileReader reader = new FileReader("h2kinfosys");
		            BufferedReader br = new BufferedReader(reader);
		            String str;
		            while ((str = br.readLine()) != null) {
		                System.out.print(str + "\n");
		            }
		            br.close();
		 
		        } catch (IOException e) {
		        	System.out.print("File not found");
		        }
		    }
		 
		
	}


