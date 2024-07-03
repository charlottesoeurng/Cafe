import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Buyable> items;

	public ShoppingCart() {
		items = new ArrayList<Buyable>();
	}

	public void addItem(Buyable item) {
		items.add(item);
	}

	public Money getTotal() {
		Money totalCost = Money.ZERO;
		for (int i = 0; i < items.size(); i ++) {
			Buyable thisItem = items.get(i);
			totalCost = totalCost.add(thisItem.getCost());
		}
		Money afterTax = Money.computeMNSalesTax(totalCost);
		return totalCost.add(afterTax);
	}

	public String toString() {
		String showCart = "";
		if (items.size() == 0) {
			showCart = showCart + "Cart is empty";
		} else {
			for (int i = 0; i < items.size(); i++) {
				showCart  = showCart + (i + 1) + ". ) " + items.get(i) + ": " + items.get(i).getCost() + "\n";
			}
			showCart = showCart + "Total: " + getTotal();
		}
		return showCart;
	}
}