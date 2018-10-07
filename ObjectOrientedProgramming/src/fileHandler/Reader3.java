package fileHandler;
import java.io.*;
public class Reader3 {

	public static void main(String[] args) {

      String line;
      
      BufferedReader  br = null;
      try {
    	  br = new BufferedReader(new FileReader("C:\\Users\\mb\\Desktop\\china\\you.txt")) ;
    	 line = br.readLine();
    	 
     while (line != null){
    	 System.out.println(line);
    	 line = br.readLine();
    	 
     }
    	  
      } catch(IOException e) {
    	  System.out.println(e.getMessage());
      } finally {
    	  try {
    	  if (br != null)  
              br.close();
    		  
    	  }  catch (IOException e) {
    		  System.out.println(e.getMessage());
      }
      }
	}

}
