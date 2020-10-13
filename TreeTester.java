package holiday_decorations;

public class TreeTester {
	public static void main(String[] args) {
		System.out.println("This Tree alredy has a star.");
		HolidayItem mytree1 = new FraserFir(); //HolidayItem is super type for Decorator scenario
		mytree1 = new Star(mytree1);
		mytree1 = new Ruffles(mytree1);
		mytree1 = new Ruffles(mytree1);
		mytree1 = new Lights(mytree1);
		System.out.print("Tree1: " + mytree1.getDescription());

		System.out.println(" costs $" + mytree1.price());
		
		HolidayItem mytree2 = new ColoradoBlueSpruce(); //HolidayItem is super type for Decorator scenario
		mytree2 = new Star(mytree2);
		mytree2 = new Ruffles(mytree2);
		mytree2 = new BallsRed(mytree2);
		mytree2 = new BallsSilver(mytree2);
		mytree2 = new Ruffles(mytree2);
		mytree2 = new Lights(mytree2);
		mytree2 = new LEDs(mytree2);
		
		System.out.print("Tree2: " + mytree2.getDescription());

		System.out.println(" costs $" + mytree2.price());
		
		HolidayItem mytree3 = new BalsamFir(); //HolidayItem is super type for Decorator scenario
		mytree3 = new Ribbons(mytree3);
		mytree3 = new Star(mytree3);
		mytree3 = new BallsBlue(mytree3);
		mytree3 = new Ruffles(mytree3);
		mytree3 = new LEDs(mytree3);
		
		System.out.print("Tree3: " + mytree3.getDescription());

		System.out.println(" costs $" + mytree3.price());
		
		HolidayItem mytree4 = new DouglasFir(); //HolidayItem is super type for Decorator scenario
		mytree4 = new Ruffles(mytree4);
		mytree4 = new Star(mytree4);
		mytree4 = new LEDs(mytree4);
		mytree4 = new BallsRed(mytree4);
		System.out.print("Tree4: " + mytree4.getDescription());

		System.out.println(" costs $" + mytree4.price());
		
		
		
	}

}
