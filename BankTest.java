
public class BankTest {
         public static void main(String[] args) {
			BankAccount b1=new BankAccount();
			BankAccount b2=new BankAccount();
			BankAccount b3=new BankAccount();
			b1.Deposit(200);
			b1.TransferFunds();
			b2.Withdraw();
			b3.Deposit(200);
			b3.TransferFunds();
			b2.Withdraw();
			
			
		}
}
class BankAccount{
	int accountNumber;
	
	void Deposit(float amount) {
		System.out.println("deposit"+"="+amount);
	}
	void Withdraw() {
		System.out.println("Withdraw");
	}
	void TransferFunds() {
		System.out.println("Transfer Funds");
	}
}
