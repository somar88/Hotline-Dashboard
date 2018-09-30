package sa.application.main;

import java.util.Scanner;

import sa.application.finance.Income;

public class Main {

	static Scanner scan = new Scanner(System.in);
	public static Income inc;

	public static void main(String[] args) {

		System.out.println("Please enter your income this month: ");
		inc = new Income(scan.nextDouble());
		System.out.println("Income: " + inc.amount);
		System.out.println("Monthly Account: " + inc.calc_MonthlyAccount(inc.amount));
		System.out.println("");
	}

}
