
public class Tea extends Beverage {

	public Money getCost() {
		Money baseCost;
		Money totalCost = Money.ZERO;
		if (size == LARGE) {
			baseCost = Money.TWO_DOLLAR;
			totalCost = baseCost.add(new Money(50));
		} else if (size == SMALL) {
			baseCost = Money.ONE_DOLLAR;
			totalCost = baseCost.add(new Money(50));
		} else {
			baseCost = Money.ZERO;
		}
		for (int i = 0; i < addOns.size(); i++) {
			totalCost = totalCost.add(addOns.get(i).getCost());
		}
		return totalCost;
	}

	public int getCalories() {
		int calories = 5;
		for (int i = 0; i < addOns.size(); i++) {
			calories = calories + addOns.get(i).getCalories();
		}
		return calories;
	}

	public String toString() {
		String tea = "";
		String letter = "";
		if (size == LARGE) {
			letter = "L";
		} else if (size == SMALL) {
			letter = "S";
		}
		tea= tea + "Tea ";
		if (addOns.size() > 0) {
			for (int i = 0; i < addOns.size(); i++) {
				tea = tea + "+ " + addOns.get(i) + " ";
			}
		}
		tea = tea + "(" + letter + ")" + " - " + getCalories() + " calories";
		return tea;
	}
}
