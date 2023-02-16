import java.time.*;
public class LionKing {
   public static void main(String[] args) {
	   Lions L=new Lions();
	   L.setValues("Bhairava", "Yello", "African", 5.9f, 125,LocalDate.of(2003, 7, 23));
	   L.getValue();
	   System.out.println(L);
}
}

class Lions{
	String name;
	String color;
	String breed;
	float height;
	float weight;
	LocalDate dateOfBirth;
	
	void setValues(String n,String c,String b,float h,float w,LocalDate d) {
		System.out.println("Set the Values");
		name=n;
		color=c;
		breed=b;
		height=h;
		weight=w;
		dateOfBirth=d;
	}
	void getValue() {
		System.out.println("Lion's Name :"+name);
		System.out.println("Lion's Color:"+color);
		System.out.println("Lion's Breed :"+breed);
		System.out.println("Lion's Height :"+height+"feet");
		System.out.println("Lion's Weight :"+weight+"Kg");
		System.out.println("Lion's Date of Birth :"+dateOfBirth);
	}
	
}