import java.util.Calendar;

abstract class discount implements TypeOfTicket{
	int basePrice;
	public abstract void setBasePrice();
	private int price;
	
	public int applyDiscount() {
		this.setBasePrice();
		Calendar today = Calendar.getInstance();
		int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek==4) {
			price = basePrice-2;
		}
		else {
			price = basePrice;
		}
		return price;
		
	}
}