package sa.application.time.Enums;

public enum Days {

	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

	private int week_number;

	private Days(int i) {
		this.week_number = i;
	}

	public int getWNumber() {
		return this.week_number;
	}
}
