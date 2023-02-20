
public class CurdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curd curdObjRef1=new Curd("cow","Thin", 123, "white", "sweet");
		System.out.println(curdObjRef1);
		Curd curdObjRef2=curdObjRef1;
		Curd curdObjRef3=curdObjRef2;
		curdObjRef2.setColor("yellow");
		System.out.println(curdObjRef3.getColor());
		

	}

}
class Curd{
	String type;
	String Density; 
	int quantity;
	String color;
	String taste;
	public Curd(String type, String density, int quantity, String color, String taste) {
		super();
		this.type = type;
		Density = density;
		this.quantity = quantity;
		this.color = color;
		this.taste = taste;
	}
	@Override
	public String toString() {
		return "Curd [type=" + type + ", Density=" + Density + ", quantity=" + quantity + ", color=" + color
				+ ", taste=" + taste + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDensity() {
		return Density;
	}
	public void setDensity(String density) {
		Density = density;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
}