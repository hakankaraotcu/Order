public class Latte extends CaffeineBeverage{
	int cost;
	
	public Latte(boolean hasMilk, int size) {
		super(hasMilk,size);
	}

	@Override
	public void setName() {
		this.name = "Latte";
	}
	
	@Override
	public String hasMilkOrLemon() {
		if(hasMilk == true) return "with Milk";
		return "without Milk";
	}

	@Override
	public int cost() {
		if(size == 1) {
			cost = 5;
		} else if(size == 2) {
			cost = 6;
		} else if(size == 3) {
			cost = 7;
		}
		if(hasMilk == true) return cost+1;
		return cost;
	}
}
