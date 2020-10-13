package holiday_decorations;

public class BallsBlue extends TreeDecorator {
	private HolidayItem base;
	
	public BallsBlue(HolidayItem base) {
		this.base = base;
	}
	
	@Override
	public String getDescription() {
		return base.getDescription() + ", Blue Bslls";
	}
	
	public int price() {
		return 2 + base.price();
	}
}