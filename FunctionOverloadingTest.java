
public class FunctionOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone();
		p.dial();// compile time binding
		byte intercomm = 120;
		byte countryCode = 91;
		p.dial(intercomm);
		p.dial("SLB");
		p.dial("9611234434L");
		p.dial(countryCode, 963126132903L);
		p.dial(132656112323L, countryCode);
       
		
		
	}

}

class Phone {
	void dial() {
		System.out.println("dial() nowhere");
	}

	void dial(byte b) {
		System.out.println("dial(byte): dialing intercomm : " + b);
	}

	void dial(String name) {
		System.out.println("dial(String): dialing by name : " + name);
	}

	void dial(long mobileNumber) {
		System.out.println("dial(long): dialing by mobile number : " + mobileNumber);
	}

	void dial(byte countryCode, long mobileNumber) {
		System.out.println(
				"dial(byte,long):dialing by country code +" + countryCode + " and mobile number" + mobileNumber);
	}

	void dial(long mobileNumber, byte countryCode) {
		System.out
				.println("dial(long,byte):dialing by mobile number " + mobileNumber + " country code +" + countryCode);
	}
}
