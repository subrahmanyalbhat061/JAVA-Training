import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoFileTest {
	public static void main(String[] args) {
		FileHandling ftr=new FileHandling();
		ftr.write("write1", "Hello java how are you?");
		System.out.println("--------------------");
		ftr.read("write1");
		System.out.println("--------------------");
		ftr.write("write1", "Hello java");
		
}
}

class FileHandling{
	void read(String path) {
		try {
			FileInputStream ftr= new FileInputStream(path);
			System.out.println("File "+path+" is Opened");
			byte  b=(byte)ftr.read();
			  while(b!=-1) {
				  System.out.print((char)b);
				  b=(byte)ftr.read();
				  Thread.sleep(3);
			  }
			     System.out.println("\nReading Done");
				 System.out.println("Closing File : "+path);
				  ftr.close();
		} 
		catch (FileNotFoundException e) {
			System.out.println(e);
			}
		catch (IOException | InterruptedException e) {
			System.out.println(e);
		}
		
	}
	void write(String path, String data ) {
		try {
			FileOutputStream file1 = new FileOutputStream(path,true);
			System.out.println("\nFile "+path+" is Opened");
			String s=data;
			byte b[]=s.getBytes();
			file1.write(b);
			
			System.out.println("Writing Done");
			System.out.println("Closing File : "+path);
			file1.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch (IOException e) {
			System.out.println(e);
	}
	}
}
