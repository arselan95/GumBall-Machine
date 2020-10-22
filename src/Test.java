import java.util.Scanner;

/*
 * Test driver for the application
 * 
 * inserted amount is: 
 * 
 * 50 cents in fifty cent machine
 * 60 cents in fifty cent all coin machine
 * 29 cents in twenty five cent machine
 * 
 * total number of gum balls in machine is set to 7
 */
public class Test {

	public static void main(String[] args) {

		// total number of gum balls in machine
		int fgmsize = 7;
		int fagmsize = 7;
		int tgmsize = 7;


		Scanner sc = new Scanner(System.in);
		System.out.print("press Enter to buy OR press 'q' to quit");
		String q = sc.nextLine();
		String check = q;

		while (!q.equals("q")) {
			switch (check) {

			case "":
				GumballMachine fgm = new FiftyCentMachine(fgmsize);
				GumballMachine fagm = new FiftyCentAllCoinMachine(fagmsize);
				GumballMachine tgm = new TwentyFiveCentGumballMachine(tgmsize);

				System.out.print("fifty cent machine\n");
				fgm.insertMoney(50);
				fgm.turnCrank();
				fgmsize = fgm.num_gumballs;
				System.out.print("\n");

				System.out.print("fifty cent all coin machine\n");
				fagm.insertMoney(10);
				fagm.turnCrank();
				fagmsize = fagm.num_gumballs;
				System.out.print("\n");

				System.out.print("twenty five cent machine\n");
				tgm.insertMoney(29);
				tgm.turnCrank();
				tgmsize = tgm.num_gumballs;
				System.out.print("\n");
				
				System.out.print("----------------------------------------------------------------------");
				
				System.out.print("\n");

				System.out.print("press Enter to buy OR press 'q' to quit");
				String q1 = sc.nextLine();
				check = q1;
				break;

			case "q":
				System.out.println("Bye. Come Again! :)");
				System.exit(0);
			}
		}

	}
}
