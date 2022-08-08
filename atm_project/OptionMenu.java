package atm_project;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	// TODO Auto-generated method stub
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	public void getLogin() throws IOException {
		int x = 1;

		do {
			try {
				data.put(783467, 123456);
				data.put(877623, 65431);

				System.out.println("Welcome to the ATM!");
				System.out.println("Enter your customer Number: "+"\n");
				setCustomerNumber(menuInput.nextInt());

				System.out.println("Enter you PIN number: "+"\n");

				setPinNumber(menuInput.nextInt());

			} catch (Exception e) {
				System.out.println("\n");
				x = 2;
			}

			int cn = getCustomerNumber();
			int pn = getPinNumber();

			if (data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			} else {
				System.out.println("Wrong Customer number or Pin number! Try Again!" + "\n");
			}
		} while (x == 1);
	}

	public void getAccountType() {
		System.out.println("Select the account you want to access: ");
		System.out.println("Type - 1 : Checking Account");
		System.out.println("Type - 2 : Saving Account");
		System.out.println("Type - 3 : Exit" + "\n");

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:
			getChecking();
			break;

		case 2:
			// getSaving();
			System.out.println("Working on it later!");
			break;

		case 3:
			System.out.println("Thank you for using this ATM, bye" + "\n");
			break;

		}
	}

	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Type - 1 : View Balance");
		System.out.println("Type - 2 : Withdraw Funds");
		System.out.println("Type - 3 : Deposite Funds");
		System.out.println("Type - 4 : Exit Checking Account");
		System.out.println("Choice: "+"\n");

		int selection = menuInput.nextInt();

		switch (selection) {
		case 1:

			/// problem
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBlance()));
			getAccountType();
			break;

		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;

		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;

		case 4:
			System.out.println("Thank you for using the ATM, bye");
			break;
		default:
			System.out.println("\n" + "Invalid Choice." + "\n");
			getChecking();
		}
	}
}
