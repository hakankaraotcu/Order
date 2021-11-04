public class OrderItem {
	private int amount;
	Beverage beverage;
	
	public OrderItem(Beverage beverage, int amount) {
		this.amount = amount;
		this.beverage = beverage;
	}

	public OrderItem(TeaBeverage beverage, int amount) {
		this.amount = amount;
		this.beverage = beverage;
	}
	
	public int getAmount() {
		return amount;
	}

	public int cost() {
		return beverage.cost()*amount;
	}
	
}
