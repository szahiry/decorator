package holiday_decorations;

public class Ribbons extends TreeDecorator{
private HolidayItem base;
	
	public Ribbons(HolidayItem base) {
		this.base = base;
	}
	
	@Override
	public String getDescription() {
		return base.getDescription() + ", Ribbon";
	}
	
	public int price() {
		return 2 + base.price();
	}

}
