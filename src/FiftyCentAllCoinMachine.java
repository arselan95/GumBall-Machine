
/*
 * This class extends GumballMachine class
 * 
 * Takes all coins
 * 
 * Total amount is 50 cents
 */
public class FiftyCentAllCoinMachine extends GumballMachine {

	public FiftyCentAllCoinMachine(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	/*
	 * override inserMoney as per this Gumball Machine amount requirements
	 */
	public void insertMoney(int coin) {
		if (coin < 50) {
			System.out.print("Amount enters is =$." + coin + "\nthis is a $.50 cent machine. Any coins work\n");
			super.has_quarter = false;
		}
		super.amount = 50;
		super.insertMoney(coin);

	}

}
