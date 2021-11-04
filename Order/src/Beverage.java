public abstract class Beverage {
	public static final int SMALL = 1;
	public static final int MEDIUM = 2;
	public static final int LARGE = 3;

	protected int size;
	protected String name;
	
	public String getSize() {
		if(size == 1) return "Small";
		else if(size == 2) return "Medium";
		return "Large";
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void setName();
	
	public abstract String hasMilkOrLemon();
	
	public abstract int cost();
	
}
