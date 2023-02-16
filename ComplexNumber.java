
public class ComplexNumber {
      public static void main(String[] args) {
    	  Addition a= new Addition();
    	  Addition a1= new Addition();
    	  a.setValue(2, 3, 1, 10);
    	  a1.setValue(7, 3, 2, 10);
    	  a.getSum();
    	  a1.getMultiplication();
	}
}
class Addition{
	int real1;
	int imaginary1;
	int real2;
	int imaginary2;
	void setValue(int c,int d,int e, int f) {
		real1=c;
		real2=d;
		imaginary1=e;
		imaginary2=f;
	}
	void getSum() {
		System.out.print("Sum of"+real1+"+"+imaginary1+"i");
		System.out.println("and"+real2+"+"+imaginary2+"i"+"is");
		int real=real1+real2;
		int imaginary=imaginary1+imaginary2;
		System.out.println(real+"+"+imaginary+"i");
	}
	void getMultiplication() {
		int result=(real1*real2)-(imaginary1*imaginary2);
		int result2=(real1*imaginary2)+(real2*imaginary1);	
		System.out.print("Multiplication of"+real1+"+"+imaginary1+"i");
		System.out.println("and"+real2+"+"+imaginary2+"i"+"is");
		System.out.println(result+"+"+result2+"i");
	}
}