
public class UserDefinedException {

	public static void main(String[] args) {
      
		SavingsAccount s=new SavingsAccount("Subrahmanya L Bhat", 34333.8,12334132, "SBI",true);
		try {
		s.Deposite(60000);
		}
		catch(RuntimeException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Process is Completed");
		}
}
}

class BankAccount{
	private String name;
	private Double bal;
	private long bankAccount;
	private String bankName;
	private boolean type;
	
	
	public BankAccount(String name, Double bal, long bankAccount, String bankName, boolean type) {
		super();
		this.name = name;
		this.bal = bal;
		this.bankAccount = bankAccount;
		this.bankName = bankName;
		this.type = type;
	}


	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", bal=" + bal + ", bankAccount=" + bankAccount + ", bankName=" + bankName
				+ ", type=" + type + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getBal() {
		return bal;
	}


	public void setBal(Double bal) {
		this.bal = bal;
	}


	public long getBankAccount() {
		return bankAccount;
	}


	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public boolean getType() {
		return type;
	}


	public void setType(boolean type) {
		this.type = type;
	}

	
}
class DeactiveAccount extends Exception{
	public DeactiveAccount() {
		System.out.println("No active account");
	}
}
class LowBalanceException extends RuntimeException{

	public LowBalanceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
class AmountExcedingLimitException extends RuntimeException{

	public AmountExcedingLimitException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class SavingsAccount extends BankAccount{

	
	public SavingsAccount(String name, Double bal, long bankAccount, String bankName, boolean type) {
		super(name, bal, bankAccount, bankName, type);
		// TODO Auto-generated constructor stub
	}
	void Deposite(double amount) throws DeactiveAccount {
		if(getType()!=true){
			DeactiveAccount d=new DeactiveAccount();
			throw d;
		}
		else {
		if(amount>50000) {
			AmountExcedingLimitException a=new AmountExcedingLimitException("Cannot deposite amount as it is excceding the limit");
			throw a;
		}
		else {
			System.out.println("Total Balance Before Transaction:"+getBal());
			double bal1=getBal();
		bal1=bal1+amount;
		setBal(bal1);
		System.out.println("Total Balance After Transaction:"+getBal());
		}
	}
	}
	void Withdraw(double amount) throws DeactiveAccount {
		if(getType()!=true){
			DeactiveAccount d=new DeactiveAccount();
			throw d;
		}
		else {
	   if(getBal()<amount) {
		   LowBalanceException l=new LowBalanceException("Low Balance");
		   throw l;
	   }
	   else {
		   System.out.println("Total Balance Before Transaction:"+getBal());
		   System.out.println("Withdrawal Succesful");
		   double bal1=getBal()-amount;
		   setBal(bal1);
		   System.out.println("Total Balance After Transaction:"+getBal());
	   }
	}
}
}


	

