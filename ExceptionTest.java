import java.lang.reflect.Array;
import java.util.Arrays;

public class ExceptionTest {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		 c1.divide(4, 0);
		 c1.divide("2a", "3b");
		
		 try {
			 String str="Dassault Systems, 7th Block, Jayanagar, Banglore";
			 System.out.println("Str       :"+str);
			 System.out.println("Str cap   :"+str.toUpperCase());
			 System.out.println("Str low   :"+str.toLowerCase());
			 System.out.println("Str charat:"+str.charAt(100));
			 System.out.println("str substr:"+str.substring(9,15));
			 
			 int scores[]= {23,24,24,24,25,27};
			 System.out.println(Arrays.toString(scores));
			 System.out.println("1st element"+scores[0]);
			 System.out.println("2nd element"+scores[1]);
			 System.out.println("3rd element"+scores[2]);
			 System.out.println("4th element"+scores[3]);
			 System.out.println("5th element"+scores[10]);
			 System.out.println("6th element"+scores[5]);
			 
		 }
		 catch(NullPointerException e) {
			System.out.println("String is null");
		 }
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index out of bound");
		}
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("Array index out of bound");
		 }
	}
}

class Calculator {
void  divide(int num, int deno) {
		try {
		double div = num / deno;
		System.out.println(div);
	}
		catch(ArithmeticException e){
			System.out.println("cannot divide a number by zero");
		}
}
void divide(String num,String deno) {
	try {
		int num1=Integer.parseInt(num);
		int deno1=Integer.parseInt(deno);
		double div=num1/deno1;
	}
	catch(RuntimeException a){
		System.out.println("Run time exception");
	}
}
}


