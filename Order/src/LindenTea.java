public class LindenTea extends TeaBeverage{
	int cost;

	public LindenTea(boolean hasLemon, int size) {
		super(hasLemon,size);
	}

	@Override
	public void setName() {
		this.name = "Linden Tea";
	}
	
	@Override
	public String hasMilkOrLemon() {
		if(hasLemon == true) return "with Lemon";
		return "without Lemon";
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
		if(hasLemon == true) return cost+1;
		return cost;
	}
}
