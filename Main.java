package electricity_bill;

import java.util.Scanner;  // Importing java.util package for the use of scanner class.

public class Main {

	// Declaring Variables for calculations of units
	
	long currentUnits;     
	long prevMonthUnits;
	long units;

	// Method to calculate units which takes two parameter.
	
	public long units(long currentUnits, long prevMonthUnits) 
	{
		units = currentUnits - prevMonthUnits;
		return units;

	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("/==== Electricity Bill Program ====/");
		System.out.println();
		System.out.println("Enter Your Name : ");
		String cusName=sc.nextLine();
		System.out.println("Enter Your Address : ");
		String cusAddress=sc.nextLine();
		System.out.println("Enter Your Mobile Number : ");
		long cusMobileNumber=sc.nextLong();
		
		// Start : Code for calculating units consume in this month
		
		Main unit=new Main();
		System.out.println("Enter your Current Units");
		long currentUnits=sc.nextLong();
		System.out.println("Enter your previous Month Units");
		long prevMonthUnits=sc.nextLong();
		System.out.println();
		long u1=unit.units(currentUnits, prevMonthUnits);
		System.out.println("Units Consume this Month is = " + u1);
		System.out.println();
		
		// End : Code for calculating units consume in this month
		
		long units=u1;
		long amountToPay=0;
		System.out.println("Press 1 for Domestic Type Connection ");
		System.out.println("Press 2 For Commercial Type Connection");
		System.out.println("Press 3 for Exit");
		
		System.out.println("Enter Number of your Type of Connection");
		int type = sc.nextInt();  // Creating Object Of Scanner Class.
		while (true)  
		{
			
			if (type == 1) {

				if (units <= 100) {
					amountToPay = units * 1;
				} else if (units > 101 && units <= 200) {
					amountToPay = 100 * 1 + (units - 100) * 2;
				} else if (units > 201 && units <= 500) {
					amountToPay = 100 * 1 + 100 * 2 + (units - 200) * 4;

				} else if (units > 501) {

					amountToPay = 100 * 1 + 100 * 2 + 300 * 4 + (units - 500) * 6;
				}
				double t1=amountToPay;
				//System.out.println(amountToPay);
				break;

			} 
			else if (type == 2) {
				if (units <= 100) {
					amountToPay = units * 2;
				} else if (units > 101 && units <= 200) {
					amountToPay = 100 * 1 + (units - 100) * 4;
				} else if (units > 201 && units <= 500) {
					amountToPay = 100 * 1 + 100 * 2 + (units - 200) * 6;

				} else if (units > 501) {

					amountToPay = 100 * 1 + 100 * 2 + 300 * 4 + (units - 500) * 7;
				}
				double t2=amountToPay;
				//System.out.println(amountToPay);
				break;
			}
			else if (type == 3) {
                break;
			}
			else {
				System.out.println("Inavlid Input");
			}		
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("==== Your Electricity Bill Had Been Generated ====");
		System.out.println();
		System.out.println();
		System.out.println(" Welcome Mr/Ms : "+cusName.toUpperCase());
		System.out.println(" Address : "+cusAddress);
		System.out.println(" Mobile Number : " +cusMobileNumber);
		System.out.println(" Previous Month Reading "+prevMonthUnits);
		System.out.println(" Current Month Reading "+currentUnits);
		System.out.println(" Units You Consumed This Month "+units);
		
		if(type==1) {
			System.out.println(" Your Connection Type is Domestic Type ");
		}
		else if(type == 2) {
			System.out.println(" Your Connection Type is Commercial Type ");
		}
		
		System.out.println(" You Have To Pay : "+amountToPay +"Rs");
		System.out.println();
		System.out.println(" Thanks For Visiting");
		
		

	}

}

