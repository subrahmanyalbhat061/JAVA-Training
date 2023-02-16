
public class BankTest {
         public static void main(String[] args) {
			BankAccount b1=new BankAccount();
			BankAccount b2=new BankAccount();
			BankAccount b3=new BankAccount();
			b1.deposite(200);
			b1.transferFunds();
			b2.withdraw();
			b3.deposite(200);
			b3.transferFunds();
			b2.withdraw();
			
			
		}
}
class BankAccount{
	int accountNumber;
	
	void deposite(float amount) {
		System.out.println("deposite"+"="+amount);
	}
	void withdraw() {
		System.out.println("Withdraw");
	}
	void transferFunds() {
		System.out.println("Transfer Funds");
	}
}
