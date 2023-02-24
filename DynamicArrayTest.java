import java.util.ArrayList;
import java.util.Iterator;


public class DynamicArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CricketPlayer2 c1=new CricketPlayer2(1, "Sachin Tendulkar", "India", 35000, 200, 42, 120.4f, 189,320);
		CricketPlayer2 c2=new CricketPlayer2(2, "Virat Kholi", "India", 35000, 200, 42, 120.4f, 189,320);
		CricketPlayer2 c3=new CricketPlayer2(3, "Rohit Sharma", "India", 35000, 200, 42, 120.4f, 189,320);
		CricketPlayer2 c4=new CricketPlayer2(4, "M S Dhoni", "India", 35000, 200, 42, 120.4f, 189,320);
		CricketPlayer2 c5=new CricketPlayer2(5, "Rahul Dravid", "India", 35000, 200, 42, 120.4f, 189,320);
		
		ArrayList<CricketPlayer2> teamIndia3= new ArrayList<CricketPlayer2>();
		
		teamIndia3.add(c1);
		teamIndia3.add(c2);
		teamIndia3.add(c3);
		teamIndia3.add(c4);
		teamIndia3.add(c5);
		
		for (Iterator iterator = teamIndia3.iterator(); iterator.hasNext();) {
			CricketPlayer2 cricketPlayer2 = (CricketPlayer2) iterator.next();
			cricketPlayer2.printCricketPlayer();
			
		}
	}
}

class CricketPlayer2 {//Every Cricket Player is a Player
	int rank;
	String name;
	String country;
	int totalRunsMadeTillNow;
	int currentRun;
	int age;
	float strikeRate;
	int totalSixes;
	int totalFours;
	public CricketPlayer2(int rank, String name, String country, int totalRunsMadeTillNow, int currentRun, int age,
			float strikeRate, int totalSixes, int totalFours) {
		super();
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.totalRunsMadeTillNow = totalRunsMadeTillNow;
		this.currentRun = currentRun;
		this.age = age;
		this.strikeRate = strikeRate;
		this.totalSixes = totalSixes;
		this.totalFours = totalFours;
	}
	@Override
	public String toString() {
		return "CricketPlayer [rank=" + rank + ", name=" + name + ", country=" + country + ", totalRunsMadeTillNow="
				+ totalRunsMadeTillNow + ", currentRun=" + currentRun + ", age=" + age + ", strikeRate=" + strikeRate
				+ ", totalSixes=" + totalSixes + ", totalFours=" + totalFours + "]";
	}
	
	void printCricketPlayer() {
		System.out.println("rank=" + rank);
		System.out.println("name=" + name);
		System.out.println("country=" + country);
		System.out.println("totalRunsMadeTillNow="+ totalRunsMadeTillNow);
		System.out.println("currentRun=" + currentRun);
		System.out.println("age=" + age);
		System.out.println("strikeRate=" + strikeRate);
		System.out.println("totalSixes=" + totalSixes );
		System.out.println("totalFours=" + totalFours);
	}
}
