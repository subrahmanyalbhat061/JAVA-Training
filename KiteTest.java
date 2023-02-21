
public class KiteTest {
  public static void main(String[] args) {
	  Kite k1=new Kite("Red", "Subrahmanya", 40, true);
	  Kite k2 =new Kite("xyz", "ZZZ", 45, true);
	  Kite k3=new Kite("gfg","wqee",34,true);
	  
	Kite.kiteCount();
	k3.kiteFight(k2,k1);
	Kite.kiteCount();
}
}
class Kite{
	private String kiteColor;
	private String kiteOwner;
	private int kiteLength;
	private boolean flying;
	
	private static int kiteCount;
	
	public static void kiteCount() {
		System.out.println(kiteCount);
		
	}
	void kiteFight(Kite x,Kite y) {

		for(int i=1;i<20;i++) {
			double d=Math.random();
			if(d<0.10) {
				System.out.println(x.kiteOwner+"Looses");
				x.setFlying(false);
				kiteCount--;
				break;
			}
			else if(d>0.10 && d<0.50) {
				System.out.println(y.kiteOwner+"Looses");
				y.setFlying(false);
				kiteCount--;
				break;
			}
			else {
				setFlying(false);
				kiteCount--;
				break;
			}
		}
	}
	public Kite(String kiteColor, String kiteOwner, int kiteLength, boolean flying) {
		super();
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.kiteLength = kiteLength;
		this.flying = flying;
		kiteCount++;
	}
	public String getKiteColor() {
		return kiteColor;
	}
	public void setKiteColor(String kiteColor) {
		this.kiteColor = kiteColor;
	}
	public String getKiteOwner() {
		return kiteOwner;
	}
	public void setKiteOwner(String kiteOwner) {
		this.kiteOwner = kiteOwner;
	}
	public int getKiteLength() {
		return kiteLength;
	}
	public void setKiteLength(int kiteLength) {
		this.kiteLength = kiteLength;
	}
	public boolean isFlying() {
		return flying;
	}
	public void setFlying(boolean flying) {
		this.flying = flying;
	}
	

	
	
}