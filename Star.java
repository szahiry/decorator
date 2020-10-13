
package holiday_decorations;

public class Star extends TreeDecorator{
	private HolidayItem base;
	
	public Star(HolidayItem base) {
		this.base = base;
	}
	
	@Override
	public String getDescription() {
		return base.getDescription() + ", Blue Bslls";
	}
	
	public int price() {
		return 4 + base.price();
}
	}