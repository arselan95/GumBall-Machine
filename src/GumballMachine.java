
/*
 * This class explains general behavior of a gum ball machine
 * any gum ball machine which will inherit this class will have same size, and same turnCrank() operation. 
 * only the insertMoney() will differ as per the gum ball machine amount requirements 
 */
public class GumballMachine {

	int num_gumballs;
	boolean has_quarter;
	int amount;

	public GumballMachine(int size) {
		// initialize instance variables
		this.num_gumballs = size;
		this.has_quarter = false;
	}

	public void insertMoney(int coin) {
		if (coin >= amount)
			this.has_quarter = true;
		else
			this.has_quarter = false;
	}

	public void turnCrank() {
		if (this.has_quarter) {
			if (num_gumballs > 0) {
				num_gumballs = num_gumballs - 1;
				this.has_quarter = false;
				System.out.println("Thanks for your money.  Gumball Ejected!");
				System.out.println("remaining gumballs: " + num_gumballs);

			} else {
				System.out.println("remaining gumballs: " + num_gumballs);
				System.out.println("No More Gumballs!  Sorry, can't return your money.");
				
			}
		} else {
			System.out.println("Please insert remaining amount");
			System.out.println("remaining gumballs: " + num_gumballs);

		}
	}

}
