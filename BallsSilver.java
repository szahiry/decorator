package holiday_decorations;

public class BallsSilver extends TreeDecorator {
private HolidayItem base;
	
	public BallsSilver(HolidayItem base) {
		this.base = base;
	}
	
	@Override
	public String getDescription() {
		return base.getDescription() + ", Balls Silver";
	}
	
	public int price() {
		return 3 + base.price();
	}

}
