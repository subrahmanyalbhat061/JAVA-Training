package player.cricket;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList playerList = new LinkedList();
		Scanner scan1 = new Scanner(System.in);
		int choice=0;
       do{ 
              System.out.println("Enter the rank :");
          	   Scanner scan2=new Scanner(System.in);
          	   int rank=scan2.nextInt();
          	   String name1=scan2.nextLine();
          	   
          	   System.out.println("Enter the name :");
        	   Scanner scan3=new Scanner(System.in);
        	   String name=scan3.nextLine();
        	   
        	   
        	   System.out.println("Enter the jersyNumber :");
          	   Scanner scan4=new Scanner(System.in);
          	   int jersyNumber=scan4.nextInt();
          	   
          	    System.out.println("Enter the Strike rate :");
        	   Scanner scan5=new Scanner(System.in);
        	   float strikerate=scan5.nextFloat();
        	   
        	   
        	  CricketPlayer cricketPlayer=new CricketPlayer(rank, name, jersyNumber, strikerate);
        
        	   
        	  playerList.add(cricketPlayer);
             
             Scanner scan6 = new Scanner(System.in);
 			 System.out.println("PRESS 0 TO CONTINUE ADDING OR 1 TO QUIT)  : ");
 			 choice  = scan6.nextInt();
          	
				
			
       }while(choice!=1);
       System.out.println("--------iterable------------");
       Iterator iterator = playerList.iterator();
       while (iterator.hasNext()){ 
		  CricketPlayer x= (CricketPlayer)iterator.next();
		  System.out.println(x);
			
		}
       System.out.println("----------for each-----------");
       for(Object object: playerList) {
    	   CricketPlayer c=(CricketPlayer) object;
    	   System.out.println(c);
       }
	}

			
}
class CricketPlayer{
	int rank;
	String name;
	int jersyNumber;
	float strikerate;
	public CricketPlayer(int rank, String name,int  jersyNumber, float strikerate) {
		super();
		this.rank = rank;
		this.name = name;
		this.jersyNumber = jersyNumber;
		this.strikerate = strikerate;
	}
	@Override
	public String toString() {
		return "CricketPlayer [rank=" + rank + ", name=" + name + ", jersyNumber=" + jersyNumber + ", strikerate="
				+ strikerate + "]";
	}
	
	
}

	

