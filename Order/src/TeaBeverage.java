public abstract class TeaBeverage extends Beverage {
	protected boolean hasLemon;
	
	public TeaBeverage(boolean hasLemon, int size) {
		this.hasLemon = hasLemon;
		this.size = size;
	}

	public abstract int cost();
}
