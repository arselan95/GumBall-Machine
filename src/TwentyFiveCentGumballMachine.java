
/*
 * This class extends GumballMachine class
 * 
 * Only Takes Quarters 
 * 
 * Total amount in 25 cents
 */

public class TwentyFiveCentGumballMachine extends GumballMachine {

	public TwentyFiveCentGumballMachine(int size) {
		super(size);

		// TODO Auto-generated constructor stub
	}

	/*
	 * override inserMoney as per this Gumball Machine amount requirements
	 */
	public void insertMoney(int coin) {
		super.amount = 25;
		super.insertMoney(coin);
	}

}