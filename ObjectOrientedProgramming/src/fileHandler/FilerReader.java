package fileHandler;
import java.io.*;
public class FilerReader {

	public static void main(String[] args) {
		 String line;
		BufferedReader reader = null;
		try { reader = new BufferedReader (new FileReader ("C:\\Users\\mb\\Desktop\\brief report about E.T\\last\\after change\\5.20\\5.21\\no copy\\terjime.txt"));
		line = reader.readLine();
		
		while (line !=null) {
			System.out.println(line);
			line = reader.readLine();
		}
		}
         catch (IOException e) {
        	 System.out.println(e.getMessage());
         }
         finally{
        	 try {
        		 if (reader != null)
        			 reader.close();
        	 }  catch (IOException e) {
        		 System.out.println(e.getMessage());
        	 }
         
		}
		
	}

	}


