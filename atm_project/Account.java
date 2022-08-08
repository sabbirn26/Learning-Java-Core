package atm_project;

import java.text.DecimalFormat;
import java.util.*;


public class Account {

	private int customerNumber;
	private int pinNumber;
	private double checkingBlance = 0;
	private double savingBalance = 0;

	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public double getCheckingBlance() {
		return checkingBlance;
	}

	public void setCheckingBlance(double checkingBlance) {
		this.checkingBlance = checkingBlance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	public double calCheckingWithdraw(double amount) {
		checkingBlance = (checkingBlance - amount);

		return checkingBlance;
	}

	public double calSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);

		return savingBalance;
	}

	public double calCheckingDeposit(double amount) {
		checkingBlance = (checkingBlance + amount);

		return checkingBlance;
	}

	public double calSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);

		return savingBalance;
	}

	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance is: " + moneyFormat.format(checkingBlance));
		System.out.println("Amount you want to withdraw from cheking account: ");

		double amount = input.nextDouble();

		if ((checkingBlance - amount) >= 0) {
			calCheckingWithdraw(amount);
			System.out.println("New checking account blance: " + moneyFormat.format(checkingBlance));
		} else {
			System.out.println("Balance cannot be negative!" + "\n");
		}

	}

	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBlance));
		System.out.println("Amount you want to deposite from checking Account: ");

		double amount = input.nextDouble();

		if ((checkingBlance + amount) >= 0) {
			calCheckingDeposit(amount);
			System.out.println("New checking account balance: " + moneyFormat.format(checkingBlance));

		} else {
			System.out.println("Balance cannot be negative!" + "\n");
		}
	}

}
