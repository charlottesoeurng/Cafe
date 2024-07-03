
public class Mug implements Buyable {

	public Money getCost() {
		Money nineDollars = new Money (900);
		Money totalCost = Money.ONE_DOLLAR.add(nineDollars);
		return totalCost;
	}

	public String toString() {
		return "Classy Mug";
	}
}

