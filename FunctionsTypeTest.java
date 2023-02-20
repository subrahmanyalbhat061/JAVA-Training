
public class FunctionsTypeTest {
public static void main(String[] args) {
	Area rectangleObjRef1= new Area();
	rectangleObjRef1.areaOfRectangle(20, 30);
}
}

class Area{
	
	void areaOfRectangle(int x , int y) {
		System.out.println("Area of rectangle :"+x*y);
	}
	double areaOfCircle(double x) {
		return 3.142*x*x;
	}
	String areaOfSquare() {
		return "Data not found";
		}
	
	void formulForAreaofCylinder() {
		System.out.println("A=2πrh+2πr*r");
	}
		
	}

