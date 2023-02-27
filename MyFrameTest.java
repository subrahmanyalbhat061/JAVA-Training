import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrameTest {
	public static void main(String[] args) {

		MyFrame m1=new MyFrame();
		m1.setVisible(true);
		
	
}
}



class MyFrame extends JFrame implements ActionListener{
	JLabel label1 = new JLabel("Enter Fiename");
	JTextField filename = new JTextField(20);
	
	JLabel label2 = new JLabel("Enter data");
	JTextArea dataArea=new JTextArea(15,30) ;
	
	JButton save =new JButton("Save");
	JButton clear = new JButton("Clear");
	JButton read =new JButton("read");
	
	MyFrame(){
		 setLayout(new FlowLayout());
		 setSize(400,500);
		 setLocation(100,100);
		 setTitle("My Notepad");
		 add(label1);
		 add(filename);
		 add(label2);
		 add(dataArea);
		 add(save);
		 add(clear);
		 add(read);
		 save.addActionListener(this);
		 clear.addActionListener(this);
		 read.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == save) {
			System.out.println("Save Button is clicked");
			try {
				FileOutputStream file1 = new FileOutputStream(filename.getText());
				System.out.println("\nFile " + filename.getText() + " is Opened");
				String s = dataArea.getText();
				byte b[] = s.getBytes();
				file1.write(b);

				System.out.println("Writing Done");
				 JOptionPane.showMessageDialog(this,"File is Saved");
				System.out.println("Closing File : " + filename.getText());
				file1.close();

			}
			catch (FileNotFoundException f) {
				System.out.println(f);
				 JOptionPane.showMessageDialog(this,f);
			} catch (IOException f) {
				System.out.println(f);
			}
		} 
		else if(e.getSource()==read) {
			try {
				StringBuilder str=new StringBuilder();
				FileInputStream ftr= new FileInputStream(filename.getText());
				System.out.println("File "+filename.getText()+" is Opened");
				byte  b=(byte)ftr.read();
				  while(b!=-1) {
					  System.out.print((char)b);
					  b=(byte)ftr.read();
					  str.append((char)b);
					  Thread.sleep(3);
				  }
				  dataArea.setText(str.toString());
				     System.out.println("\nReading Done");
					 System.out.println("Closing File : "+filename.getText());
					  ftr.close();
			} 
			catch (FileNotFoundException ae) {
				System.out.println(ae);
				}
			catch (IOException | InterruptedException ae) {
				System.out.println(ae);
			}
		}
		else {
			System.out.println("Clear Button clicked");
			dataArea.setText("");
			
		}
	}
	
	
}
