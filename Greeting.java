/*
public class Greeting {
	void hi()
	{
		System.out.println("hello hi");
	}
	public static void main(String[] args) {
		System.out.println("Hello Real World!, Welcome to Java world!");
		System.out.println("Features of Java :  ");
		System.out.println("1.Simple - As there is no pointers");
		System.out.println("2.Java is WORA");
		System.out.println("3.No memory Management");
		System.out.println("4.No need to give H/W details");
		System.out.println("5.Object Oriented");
		System.out.println("6.Bottom to top approach");
		joker j=new joker();
		j.giggling();
	}
  
}
class joker{
	void giggling() {
		System.out.println("joker is giggling");
	}
	public static void main(String[] args) {
		Greeting g=new Greeting();
		
	}
}
class gift{
	void accept() {
		System.out.println("accept the gift");
	}
}
*/
public class Greeting {
	public static void main(String[] args) {	
		System.out.println("Hello Java How Are You?");
		System.out.println("1. Java WORA");
		System.out.println("2. Java is Simple");
		System.out.println("   no pointers, no memory management");
		System.out.println("   no need to know h/w details");
		System.out.println("3. Java is object oriented, OOPS");
		
		Joker j = new Joker();//object 
		j.gigling();
		j.makingJoke();
		j.makingJoke();
		j.uniCycling();
		
		Joker j2 = new Joker();
		j2.gigling();
		j2.gigling();
		j2.gigling();
	}

}
class Joker
{
	void gigling() {
		System.out.println("Joker is gigling...");
	}
	void uniCycling() {
		System.out.println("Joker is unicyling...");
	}
	void makingJoke() {
		System.out.println("Joker is joking...");
	}
}

class Elephant
{
	void swimming() {
		System.out.println("Elephant is swimming...");
	}
}
class RingMaster
{
	void instruct() {
		System.out.println("Ring master is instructing....");
	}
}
class Gift
{
	void accept() {
		System.out.println("acceping the gift...");
	}
	void reject() {
		System.out.println("Never reject it...");
	}
	void forward() {
		System.out.println("Forwarding the gift....");
	}
}