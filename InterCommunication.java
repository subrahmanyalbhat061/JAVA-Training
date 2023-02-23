
public class InterCommunication {
	
	public static void main(String[] args) {
		  FoodItem f=new FoodItem("Samosa");
		  FoodItem f1=new FoodItem("pizza");
		  Producer p=new Producer(f);
		  Consumer c=new Consumer(f);
		  
		  Producer p1=new Producer(f1);
		  Consumer c1=new Consumer(f1);
		  p.start();
		  c.start();
		  
		  p1.start();
		  c1.start();
		  
		
	}

}
class Producer extends Thread{
	FoodItem f;
	
	public Producer(FoodItem f) {
		super();
		this.f = f;
	}
	void produce(){
		f.serve();
	}
	public void run() {
		produce();
	}
}
class Consumer extends Thread{
	FoodItem f;

	public Consumer(FoodItem f) {
		super();
		this.f = f;
	}
	void eat() {
		f.consume();
	}
	public void run() {
		eat();
	}
}
class FoodItem{
	String name;
	boolean isServed;

	public FoodItem(String name) {
		super();
		this.name = name;
	}
	synchronized void consume() {
		if(isServed==false) {
			try {
				wait();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Waiting for the food");
		}
		System.out.println("Consuming "+name);
	}
	synchronized void serve() {
		if(isServed==false) {
			System.out.println("Preparing"+name);
			 isServed = true;
			 notify();
		}
	}
	
}
