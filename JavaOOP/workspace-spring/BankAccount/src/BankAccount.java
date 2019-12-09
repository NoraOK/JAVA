import java.util.Random;

public class BankAccount{
	    private String acct_num;
	    private double checking_bal = 0;
	    private double savings_bal = 0;
	    private static int acct_count = 0;
	    private static double total_bal = 0;

	    public BankAccount(){
	        acct_count++;
	        this.acct_num = createAcctNum();
	        System.out.println("Account num:"+this.acct_num+", Current Number of Accounts: "+acct_count);
	    }
	    private String createAcctNum(){
	    	String acct = "";
	    	Random r = new Random();
	    	for(int i = 0; i < 11; i++) {
	    		acct += String.valueOf(r.nextInt(9));
	    	}
	    	return acct;
	    }
	    public double getCheckingBal() {
	    	return this.checking_bal;
	    }
	    public double getSavingsBal() {
	    	return this.savings_bal;
	    }
	    public void depositMoney(String account_type, double amt_deposited) {
	    	if(account_type.startsWith("ch")) {
	    		checking_bal += amt_deposited;
	    		
	    	}else {
	    		savings_bal += amt_deposited;
	    	}
	    	total_bal += amt_deposited;
	    	System.out.println("Current total account balance: $"+this.total_bal);
	    	
	    }
	    public void withdrawMoney(String account_type, double amt_withdrawn) {
	    	if (account_type.startsWith("ch") && checking_bal >= amt_withdrawn) {
	    		checking_bal -= amt_withdrawn;
		    	total_bal -= amt_withdrawn;
	    	}else if (account_type.startsWith("ch") && checking_bal < amt_withdrawn){
	    		System.out.println("INSUFFICIENT FUNDS IN CHECKING ACCOUNT");
	    	}else if(savings_bal >= amt_withdrawn) {
	    		savings_bal -= amt_withdrawn;
		    	total_bal -= amt_withdrawn;
	    	}else {
	    		System.out.println("INSUFFICIENT FUNDS IN SAVINGS ACCOUNT");
	    	}
	    	System.out.println("Current total account balance: $"+this.total_bal);
	    }
	    
	    

}

