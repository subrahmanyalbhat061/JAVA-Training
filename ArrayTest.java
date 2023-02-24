
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int batsman1=89;
        int batsman2=90;
        int batsman3=84;
        int batsman4=55;
        int batsman5=66;
        
        
        int totalScore1=0;
        
        System.out.println("Batsman 1 Scored :"+batsman1);
        System.out.println("Batsman 2 Scored :"+batsman2);
        System.out.println("Batsman 3 Scored :"+batsman3);
        System.out.println("Batsman 4 Scored :"+batsman4);
        System.out.println("Batsman 5 Scored :"+batsman5);
        
        int totalScore=batsman1+batsman2+batsman3+batsman4+batsman5;
        System.out.println("Total Score : "+totalScore);
        
        int teamIndia[]=new int[11];
        try {
        teamIndia[0]=45;
        teamIndia[1]=85;
        teamIndia[2]=95;
        teamIndia[3]=105;
        teamIndia[4]=34;
        teamIndia[12]=45;
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println(e);
        }
        for(int i=0;i<teamIndia.length;i++) {
        	totalScore1=totalScore1+teamIndia[i];
        }
       System.out.println("Total Score of India is : "+totalScore1);
       
      for(int i:teamIndia) {
    	  System.out.println(i);
      }
        
	}

}
