package Level2_Question;


public class Account {
	private String name;
	private int bankBalance =0;
	private long accountNumber;
	
	
	Account(String name, int bal){
		this.name = name;
		this.bankBalance = bal;
		
		
	}
	
	
	
	void getAccountNumber(){
		System.out.println(this.name +" account number: "+ this.accountNumber);
	}
	
	void getBalance() {
		System.out.println(this.bankBalance);
	}
	void getName() {
		System.out.println(this.name);
	}
	
	void deposit(int val) {
		if(val>0) {
			this.bankBalance += val;
			System.out.println("deposit "+ val + " is successfull" );
			this.getBalance();
			//this.statement.put("Deposit", val);
			
		}else {
			System.out.println("amount is in valid");
		}
	}
	
	void withdrawl(int val) {
	
		if(val > this.bankBalance) {
			System.out.println("insufficant balance");
			this.getBalance();
		}else {
			this.bankBalance -= val;
			System.out.println("withdrawl "+ val + " is successfull\n your balance" );
			this.getBalance();
			
		}
	}
	

	

	public static void main(String[] args) {
		
		Account a1 = new Account("Deepak",100);
		a1.getBalance();
		a1.getAccountNumber();
		a1.deposit(1000);
		a1.deposit(1000);
		a1.deposit(1000);
		a1.withdrawl(5000);

	}

}

