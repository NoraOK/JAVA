import util.Random;

public class BankAccount{
    private String acct_num;
    private double checking_bal = 0;
    private double savings_bal = 0;
    private static int acct_count = 0;
    private static double total_bal = 0;

    public BankAccount(){
        acct_count++;
    }
    private int createAcctNum(){
        int x = (Math.random() * ((max - min) + 1)) + min

    }


}