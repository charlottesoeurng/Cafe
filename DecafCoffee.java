
public class DecafCoffee extends Coffee {

	public Money getCost() {
		return super.getCost();
	}

	public int getCalories() {
		return super.getCalories();
	}

	public String toString() {
		String decafCoffee = "";
		String letter = "";
		if (size == LARGE) {
			letter = "L";
		} else if (size == SMALL) {
			letter = "S";
		}
		decafCoffee = decafCoffee + "Decaf Coffee";
		if (addOns.size() > 0) {
			for (int i = 0; i < addOns.size(); i++) {
				decafCoffee = decafCoffee + " + " + addOns.get(i);
			}
		}
		decafCoffee = decafCoffee + " (" + letter + ")" + " - " + getCalories() + " calories";
		return decafCoffee;
	}
}
