package holiday_decorations;

public abstract class HolidayItem {
	private String description = "Unknown Holiday Itemn";
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}
	
	public abstract int price();

}
