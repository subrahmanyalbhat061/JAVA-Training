/*
                                             Mammal
                                               |has heart
                                         -----------------
                                         |
                                         LandMammal
                                         |
                                         Lion



*/
public class HasRelationshipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal mammalObjRef1 = new Mammal("Human", 5.6f, 60, "Black", "Homo Sapiens", "warm", 2, "omnivorous");
		LandMammal landMammalObjRef1 = new LandMammal("Tiger", 6.0f, 56, "ORANGE", "Tigres", "warm", 4, "carnivorous",
				"Land");
		mammalObjRef1.heart.setHeart(2, 2);
		mammalObjRef1.getMammal();
		System.out.println(landMammalObjRef1);
		landMammalObjRef1.heart.setHeart(2, 2);
		landMammalObjRef1.getLandmamal();
		Lion lionObjRef1 = new Lion("Bhairava", 7.0F, 125, "yellow", "Leo", "Warm Blooded", 4, "carnivorous", "Land",
				21, "yellow", "Black");
		lionObjRef1.heart.setHeart(2, 2);
		lionObjRef1.getLion();

	}

}

class Heart {
	int atria;
	int ventricles;

	public void setHeart(int atria, int ventricles) {
		this.atria = atria;
		this.ventricles = ventricles;
	}

	void getHeart() {
		System.out.println("Number of Atria :" + atria);
		System.out.println("Number of Ventricles :" + ventricles);
	}

}

class Mammal {
	String name;
	float height;
	float weight;
	String color;
	String type;
	String bloodtype;
	int noOfLegs;
	String foodType;
	Heart heart = new Heart();// Has a relationship

	public Mammal(String name, float height, float weight, String color, String type, String bloodtype, int noOfLegs,
			String foodType) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.type = type;
		this.bloodtype = bloodtype;
		this.noOfLegs = noOfLegs;
		this.foodType = foodType;
	}

	void getMammal() {
		System.out.println("Mammal [name=" + name + ", height=" + height + ", weight=" + weight + ", color=" + color
				+ ", type=" + type + ", bloodtype=" + bloodtype + ", noOfLegs=" + noOfLegs + ", foodType=" + foodType
				+ "]");
		System.out.println("number of artia " + heart.atria);
		System.out.println("number of ventricles " + heart.ventricles);
	}

}

class LandMammal extends Mammal { // is a relationship

	String habitat;

	public LandMammal(String name, float height, float weight, String color, String type, String bloodtype,
			int noOfLegs, String foodType, String habitat) {
		super(name, height, weight, color, type, bloodtype, noOfLegs, foodType);
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "LandMammal [ habitat=" + habitat + "]";

	}

	void getLandmamal() {
		super.getMammal();

	}

}

class Lion extends LandMammal {// is a realtionship

	int noOfTeeth;
	String furColor;
	String tailColor;

	public Lion(String name, float height, float weight, String color, String type, String bloodtype, int noOfLegs,
			String foodType, String habitat, int noOfTeeth, String furColor, String tailColor) {
		super(name, height, weight, color, type, bloodtype, noOfLegs, foodType, habitat);
		this.noOfTeeth = noOfTeeth;
		this.furColor = furColor;
		this.tailColor = tailColor;
	}

	@Override
	public String toString() {
		return "Lion [toString()=" + super.toString() + ", noOfTeeth=" + noOfTeeth + ", furColor=" + furColor
				+ ", tailColor=" + tailColor + "]";
	}

	void getLion() {
		super.getLandmamal();
	}

}
