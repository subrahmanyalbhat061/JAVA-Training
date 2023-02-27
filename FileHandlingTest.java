import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 System.out.println("Opening File");
		FileInputStream fileObjRef1= new FileInputStream("D:\\FilHandling.txt");
		
		  byte  b=(byte)fileObjRef1.read();
		  while(b!=-1) {
			  System.out.print((char)b);
			  b=(byte)fileObjRef1.read();
			  Thread.sleep(3);}
		
		  System.out.println("Closing File");
		    fileObjRef1.close();
	  }
	
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
     
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
