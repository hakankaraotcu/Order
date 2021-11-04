public class Order {
	int totalCost;
	OrderItem[] orderItem = new OrderItem[6];
	Beverage[] beverage = new Beverage[6];
	int num;
	
	public void add(OrderItem orderItem) {
		this.orderItem[num] = orderItem;
		beverage[num] = orderItem.beverage;
		beverage[num].setName();
		totalCost += orderItem.cost();
		num++;
	}
	public int totalCost() {
		return totalCost;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < beverage.length; i++) {
			sb.append(orderItem[i].getAmount() + " " + beverage[i].getSize() + " " + beverage[i].getName() + " " + beverage[i].hasMilkOrLemon() + " " + orderItem[i].cost() + " TL\n");
		}
		return sb + "\nTOTAL : " + totalCost + " TL";
	}

}
