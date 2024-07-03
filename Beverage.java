import java.util.ArrayList;

public abstract class Beverage implements Buyable {
	public static final int LARGE = 2;
	public static final int SMALL = 0;
	protected ArrayList<Addition> addOns;
	protected int size;

	public Beverage() {
		addOns = new ArrayList<Addition>();		
	}

	public abstract Money getCost();

	public abstract int getCalories();

	public void setSize(int size) {
		this.size = size;	
	}

	public void addToDrink(Addition item) {
		addOns.add(item);
	}
}