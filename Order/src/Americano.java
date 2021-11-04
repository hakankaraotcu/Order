public class Americano extends CaffeineBeverage{
	int cost;

	public Americano(boolean hasMilk, int size) {
		super(hasMilk,size);
	}
	
	@Override
	public void setName() {
		this.name = "Americano";
	}
	
	@Override
	public String hasMilkOrLemon() {
		if(hasMilk == true) return "with Milk";
		return "without Milk";
	}

	@Override
	public int cost() {
		if(size == 1) {
			cost = 7;
		} else if(size == 2) {
			cost = 8;
		} else if(size == 3) {
			cost = 9;
		}
		if(hasMilk == true) return cost+1;
		return cost;
	}
}
