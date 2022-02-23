package week1;

public class Week1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double jeepSoftTopPrice = 2000.00;
		//can use float or short type
		//double not good for money
		//if you put 2000.00 java will create a double type
		double debitCardBalance = 3000.00;
		int tireSize = 35;
		int jeepWeight = 3970;
		char directionIAmGettingLOstIn = 'W';
		String lastKnownLocation = "Moab, UT";
		float engineSize = 2.0f;
		
		debitCardBalance -= jeepSoftTopPrice;
		String price = String.format("%.2f",  jeepSoftTopPrice);
		String balance = String.format("%.2f",  debitCardBalance);
		//for rounding in java
		
		
		System.out.println("After buying a soft top for $" + price + ", my balance is $" + balance);
		
		double tireWeight = jeepWeight / 4.0;
		System.out.println("Tire weight=" + tireWeight);
		
		System.out.println("I am heading " + directionIAmGettingLOstIn + " from " + lastKnownLocation);
		
	}

}
