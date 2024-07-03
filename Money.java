
public class Money {
	public static Money ZERO = new Money(0);
	public static Money ONE_DOLLAR = new Money(100);
	public static Money TWO_DOLLAR = new Money(200);
	private int amountInCents;


	public Money(int amountInCents) {
		this.amountInCents = amountInCents;
	} 

	public static Money fromMoneyString(String money) { // not used?
		String moneyString = money;
		Money theMoney;
		if (moneyString.contains("$")) {
			moneyString = moneyString.replace("$", "");
		}
		double stringToDouble = Double.parseDouble(moneyString);
		int intAfterRounding = (int)Math.round(stringToDouble*100.00);
		theMoney = new Money(intAfterRounding);
		return theMoney;
	}

	public static Money computeMNSalesTax(Money beforeTax) { // tax is 6.875%
		Money costBeforeTax = beforeTax;
		Money afterTax;
		double mnTax = 0.06875;
		int withTax = (int)Math.round(costBeforeTax.amountInCents*mnTax);
		afterTax = new Money(withTax);
		return afterTax;
	}

	public Money add(Money other) {
		Money afterAdding;
		int moneySum = this.amountInCents + other.amountInCents;
		afterAdding = new Money(moneySum);
		return afterAdding;
	}

	public Money subtract(Money other) { // also not used
		Money afterSubtracting;
		int moneySub = other.amountInCents - this.amountInCents;
		afterSubtracting = new Money(moneySub);
		return afterSubtracting;
	}

	public String toString() {
		String dollarString = "";
		int separatedDollar = amountInCents/100;
		int separatedCent = amountInCents%100;
		if (separatedCent < 10) {
			dollarString = dollarString + "$" + separatedDollar + ".0" + separatedCent;
		} else {
			dollarString = dollarString + "$" + separatedDollar + "." + separatedCent;
		}
		return dollarString;
	}
}