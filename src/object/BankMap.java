package object;

public final class BankMap {
	public static String toName(int n) {
		String bankname = null;
		switch(n) {
		case 1:
			bankname = "Bank of Communications";
			break;
		case 2:
			bankname = "China Construction Bank";
			break;
		case 3:
			bankname = "Bank of China";
			break;
		}
		return bankname;
	}
	
	public static int toNumber(String name) {
		int bankNumber = 0;
		switch(name) {
		case "Bank of Communications":
			bankNumber = 1;
			break;
		case "China Construction Bank":
			bankNumber = 2;
			break;
		case "Bank of China":
			bankNumber = 3;
			break;
		}
		return bankNumber;
	}
}
