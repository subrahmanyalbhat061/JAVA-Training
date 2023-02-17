
public class MultilevelInheritenceLionTest {
      public static void main(String[] args) {
	 Mammal m=new Mammal("Sheru", 5.6f, 45, "black", "dog", "warmblooded");
	 LandMammal l=new LandMammal("billi", 2.5f, 15, "orange", "Cat", "warm", "Land");
	 Pride l1=new Pride("Bhairava", 6.0f, 134, "Yellow", "leo", "WarmBlood", "Land", 23, "yellow", "black");
	 System.out.println(m);
	 System.out.println("---------------------");
	 System.out.println(l);
	 System.out.println("---------------------");
	 System.out.println(l1);
}
}
class Mammal{
	String name;
	float height;
	float weight;
	String color;
	String type;
	String bloodtype;
	int noOfLegs;
	String foodType;
	public Mammal(String name, float height, float weight, String color, String type, String bloodtype) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.type = type;
		this.bloodtype = bloodtype;
	}
	@Override
	public String toString() {
		return "Mammal [name=" + name + ", height=" + height + ", weight=" + weight + ", color=" + color + ", type="
				+ type + ", bloodtype=" + bloodtype + "]";
	}
	
}
class LandMammal extends Mammal{
	
	String habitat;

	public LandMammal(String name, float height, float weight, String color, String type, String bloodtype,
			String habitat) {
		super(name, height, weight, color, type, bloodtype);
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "LandMammal [toString()=" + super.toString() + ", habitat=" + habitat + "]";
	}
	
	
}

class Pride extends LandMammal{
	int noOfTeeth;
	String furColor;
	String tailColor;
	public Pride(String name, float height, float weight, String color, String type, String bloodtype, String habitat,
			int noOfTeeth, String furColor, String tailColor) {
		super(name, height, weight, color, type, bloodtype, habitat);
		this.noOfTeeth = noOfTeeth;
		this.furColor = furColor;
		this.tailColor = tailColor;
	}
	@Override
	public String toString() {
		return "leo [toString()=" + super.toString() + ", noOfTeeth=" + noOfTeeth + ", furColor=" + furColor
				+ ", tailColor=" + tailColor + "]";
	}
	
}


	
	


