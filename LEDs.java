package holiday_decorations;

public class LEDs extends TreeDecorator  {
	private HolidayItem base;
	
	public LEDs (HolidayItem base) {
		this.base = base;
	}
	
	@Override
	public String getDescription() {
		return base.getDescription() + ", LEDs";
	}
	public int price() {
		return 10 + base.price();
	}

}
