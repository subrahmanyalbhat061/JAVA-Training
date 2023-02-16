
public class LionTest {

	public static void main(String[] args) {
	 Lion l1=new Lion(); 
	 l1.roar();
	 l1.hunt();
	 l1.sleep();
	 l1.height(6.0f);
	 l1.weight(120);
	 
	 Lion l2 = new Lion();
	 l2.height(6.3f);
	 l2.hunt();
	 
	 Lion l3=new Lion();
	 l3.sleep();
	 l3.hunt();

	}

}
class Lion{
	void roar() {
		System.out.println("Lion is Roaring");
	}
	void sleep() {
		System.out.println("Lion is Sleeping");
	}
	void hunt() {
		System.out.println("Lion is Hunting");
	}
	void height(float h1) {
		System.out.println("Lion's height is"+h1+"feet");
	}
	void weight(int w1) {
		System.out.println("Lion's weight is ="+w1);
	}
}
