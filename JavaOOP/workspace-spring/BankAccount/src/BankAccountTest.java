
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount first = new BankAccount();
		first.depositMoney("savings",3923.20);
		first.depositMoney("ch`eese",934.45);
		BankAccount second = new BankAccount();
		System.out.println("1st SAVINGS BAL: $"+first.getSavingsBal());
		System.out.println("1st CHECKING BAL: $"+first.getCheckingBal());
		first.withdrawMoney("savings", 100.00);
		System.out.println("1st SAVINGS BAL: $"+first.getSavingsBal());
		first.withdrawMoney("ch", 57.65);
		System.out.println("1st SAVINGS BAL: $"+first.getSavingsBal());
		first.withdrawMoney("sasdd", 3000);
	}

}

