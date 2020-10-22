
/*
 * This class extends GumballMachine class
 * 
 * only takes quarters
 * 
 * total amount in 50 cents
 */
public class FiftyCentMachine extends GumballMachine {

	public FiftyCentMachine(int size) {
		super(size);
		// TODO Auto-generated constructor stub
	}

	/*
	 * override inserMoney as per this Gumball Machine amount requirements
	 */
	public void insertMoney(int coin) {
		if (coin != 25 && coin < 50) {
			System.out.print("Please insert a quarter. this machine only takes quarters\n.");
			super.has_quarter = false;
		}
		if (coin == 25 && coin < 50) {
			System.out.print("Please insert one more quarter. gumball is 50 cents. this machine only takes quarters\n");
			super.has_quarter = false;
		}
		super.amount = 50;
		super.insertMoney(coin);
	}

}
