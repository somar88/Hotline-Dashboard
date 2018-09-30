package sa.application.finance;

import java.time.LocalDateTime;

public class Income {

	public double amount = 0.0;
	public String check_in;
	public LocalDateTime timing = LocalDateTime.now();
	
	public Income(double amount)  {
		this.amount = amount;
		
	}

	public void calculate() {

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
