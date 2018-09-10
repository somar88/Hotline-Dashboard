package sa.application.time.Enums;

public enum Months {

	January(1), February(2), March(3), April(4), May(5), June(6), July(7), August(8), September(9), October(10),
	November(11), December(12);

	private int month_number;

	private Months(int i) {
		month_number = i;
	}

	public int getMNumber() {
		return month_number;
	}
}
