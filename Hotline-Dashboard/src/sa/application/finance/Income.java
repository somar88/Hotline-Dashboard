package sa.application.finance;

import java.time.LocalDateTime;

public class Income {

	public double amount = 0.0;
	public LocalDateTime timing;

	public Income(double amount) {
		this.amount = amount;
		this.timing = LocalDateTime.now();
	}

	public double calc_MonthlyAccount(double amount) {
		return amount - calc_BizExp(amount);
	}

	public double calc_BizExp(double amount) {
		return amount * 0.10;
	}

	public double calc_HomeExpances(double amount) {

		amount -= 410;
		System.out.println("amount");

		return 0;
	}

	public double calc_(double amount) {
		return amount * 0.10;
	}
}
