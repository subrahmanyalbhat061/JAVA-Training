
public class MakeTeaTest {

	public static void main(String[] args) {
		kitchen objRef1=new kitchen();
		Milk milkObjRef1=new Milk("cow", "Thick", "white", "sligthly sweet", 30);
		Sugar sugarObjRef1=new Sugar("white", "crystaline", 5, "white", "sweet", false);
		TeaPowder teaPowderObjRef1=new TeaPowder(10, "brown");
		Tea teaObjRef2 = objRef1.makeTea(milkObjRef1, sugarObjRef1, teaPowderObjRef1);
		
		System.out.println(teaObjRef2);
		Tea teaObjRef3 = objRef1.makeTea(milkObjRef1, teaPowderObjRef1);
		System.out.println(teaObjRef3);

	}

}
class Tea{
	String color;
	String taste;
	int quatity;
	public Tea() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tea(String color, String taste, int quatity) {
		super();
		this.color = color;
		this.taste = taste;
		this.quatity = quatity;
	}
	@Override
	public String toString() {
		return "Tea [color=" + color + ", taste=" + taste + ", quatity=" + quatity + "]";
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
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	
	
	
}
class Sugar{
	String type;
	String form;
	int quantity;
	String color;
	String taste;
	boolean organic; // false means not organic, true means organic
	public Sugar(String type, String form, int quantity, String color, String taste, boolean organic) {
		super();
		this.type = type;
		this.form = form;
		this.quantity = quantity;
		this.color = color;
		this.taste = taste;
		this.organic = organic;
	}
	@Override
	public String toString() {
		return "Sugar [type=" + type + ", form=" + form + ", quantity=" + quantity + ", color=" + color + ", taste="
				+ taste + ", organic=" + organic + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
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
	public boolean isOrganic() {
		return organic;
	}
	public void setOrganic(boolean organic) {
		this.organic = organic;
	}
	
	
}
class TeaPowder
{
	int quantity;
	String color;
	public TeaPowder(int quantity, String color) {
		super();
		this.quantity = quantity;
		this.color = color;
	}
	@Override
	public String toString() {
		return "TeaPowder [quantity=" + quantity + ", color=" + color + "]";
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
	
	
}
class Milk{
	String type;
	String density;
	String color;
	String taste;
	int quantity;
	public Milk(String type, String density, String color, String taste, int quantity) {
		super();
		this.type = type;
		this.density = density;
		this.color = color;
		this.taste = taste;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Milk [type=" + type + ", density=" + density + ", color=" + color + ", taste=" + taste + ", quantity="
				+ quantity + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
class kitchen{
	Tea makeTea(Milk m,Sugar s,TeaPowder t) {
		Tea t1=new Tea();
		t1.setColor(t.getColor());
		t1.setQuatity(m.getQuantity());
		t1.setTaste(s.getTaste());
		return t1;
	}
	Tea makeTea(Milk m,TeaPowder t) {
		Tea t1=new Tea();
		t1.setColor(t.getColor());
		t1.setQuatity(m.getQuantity());
		t1.setTaste("Bitter");
		return t1;
	}
}