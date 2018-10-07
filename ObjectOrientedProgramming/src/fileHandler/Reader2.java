package fileHandler;
import java.io.*;
public class Reader2 {

	public static void main(String[] args) {

	BufferedReader br = null;
	String line;
	try {
		br = new BufferedReader (new FileReader("C:\\Users\\mb\\Desktop\\china\\readFile.txt"));
		 
		while ((line = br.readLine()) !=null) { 
		System.out.println(line);
		}
	
	} 
	
	catch (IOException e) {
		e.printStackTrace();
	}finally{
   	 try {
		 if (br != null)
			 br.close();
	 }  catch (IOException e) {
		 System.out.println(e.getMessage());
	 }
	}

	}
}
