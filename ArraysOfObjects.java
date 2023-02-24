
public class ArraysOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CricketPlayer c1=new CricketPlayer(1, "Sachin Tendulkar", "India", 35000, 200, 42, 120.4f, 189,320);
		CricketPlayer c2=new CricketPlayer(2, "Virat Kholi", "India", 35000, 200, 42, 120.4f, 189,320);
		CricketPlayer c3=new CricketPlayer(3, "Rohit Sharma", "India", 35000, 200, 42, 120.4f, 189,320);
		CricketPlayer c4=new CricketPlayer(4, "M S Dhoni", "India", 35000, 200, 42, 120.4f, 189,320);
		CricketPlayer c5=new CricketPlayer(5, "Rahul Dravid", "India", 35000, 200, 42, 120.4f, 189,320);
		CricketPlayer teamIndia2[]=new CricketPlayer[11];
		teamIndia2[0]=c1;
		teamIndia2[1]=c2;
		teamIndia2[2]=c3;
		teamIndia2[3]=c4;
		teamIndia2[4]=c5;
		teamIndia2[5]=new CricketPlayer(6, "Yuvraj Singh", "India", 14000, 215, 38, 140.4f, 200, 140);
		try {
		for(int i=0;i<teamIndia2.length;i++) {
			teamIndia2[i].printCricketPlayer();
			System.out.println("--------------");
		}
	}
	 catch(NullPointerException e) {
		 System.out.println(e);
	 }
	}
}
class Player{
	
}

class CricketPlayer extends Player{//Every Cricket Player is a Player
	int rank;
	String name;
	String country;
	int totalRunsMadeTillNow;
	int currentRun;
	int age;
	float strikeRate;
	int totalSixes;
	int totalFours;
	public CricketPlayer(int rank, String name, String country, int totalRunsMadeTillNow, int currentRun, int age,
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