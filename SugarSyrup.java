
public class SugarSyrup extends Addition {

	public Money getCost() {
		Money fiftyCents = new Money(50);
		Money syrupCost = Money.ZERO.add(fiftyCents);
		return syrupCost;
	}

	public int getCalories() {
		int calories;
		calories = 60;
		return calories;
	}

	public String toString() {
		return "Sugar Syrup";
	}
}
