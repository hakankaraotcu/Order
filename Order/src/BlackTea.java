public class BlackTea extends TeaBeverage{
	int cost;

	public BlackTea(boolean hasLemon, int size) {
		super(hasLemon,size);
	}

	@Override
	public void setName() {
		this.name = "Black Tea";
	}
	
	@Override
	public String hasMilkOrLemon() {
		if(hasLemon == true) return "with Lemon";
		return "without Lemon";
	}
	
	@Override
	public int cost() {
		if(size == 1) {
			cost = 3;
		} else if(size == 2) {
			cost = 4;
		} else if(size == 3) {
			cost = 5;
		}
		if(hasLemon == true) return cost+1;
		return cost;
	}
}
