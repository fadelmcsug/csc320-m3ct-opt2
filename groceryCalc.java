import java.util.Scanner;

public class groceryCalc {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the coupon value as a decimal number");
		double couponValue = scnr.nextDouble();
		
		if (couponValue > 100 || couponValue <= 0) {
			couponValue = 0.10;
		}
		
		System.out.println("Enter the grocery bill for week 1");
		double week1Bill = scnr.nextDouble();
		
		System.out.println("Enter the grocery bill for week 2");
		double week2Bill = scnr.nextDouble();
		
		System.out.println("Enter the grocery bill for week 3");
		double week3Bill = scnr.nextDouble();
		
		System.out.println("Enter the grocery bill for week 4");
		double week4Bill = scnr.nextDouble();
		
		double monthlyTotal = week1Bill + week2Bill + week3Bill + week4Bill;
		double weeklyAverage = monthlyTotal / 4;
		
		double monthlyTotalWithCoupon = monthlyTotal * (1 - couponValue);
		double weeklyAverageWithCoupon = monthlyTotalWithCoupon / 4;
		
		System.out.println("Without the coupon, your total monthly bill is " + monthlyTotal + " and your weekly average bill is " + weeklyAverage + ".");
		System.out.println("With the coupon, your total monthly bill becomes " + monthlyTotalWithCoupon + " and your weekly average bill becomes " + weeklyAverageWithCoupon + ".");

		scnr.close();
	}

}
