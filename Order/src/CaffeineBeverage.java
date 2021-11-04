public abstract class CaffeineBeverage extends Beverage {
	protected boolean hasMilk;
	
	public CaffeineBeverage(boolean hasMilk,int size) {
		this.hasMilk = hasMilk;
		this.size = size;
	}

	public abstract int cost();
}
