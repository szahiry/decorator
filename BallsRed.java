package holiday_decorations;

public class BallsRed extends TreeDecorator {
	private HolidayItem base;
	
	public BallsRed(HolidayItem base) {
		this.base = base;
	}
	
	@Override
	public String getDescription() {
		return base.getDescription() + ", Balls Red";
	}
	
	public int price() {
		return 1 + base.price();
	}

}
