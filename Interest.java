package com.prodapt.Interest;

public class Interest {
	static double principle;
	static double time;
	static double rateOfInterest;

	void calculateSI() {
	double si=principle*time*rateOfInterest/100;
	si=si+principle;
	System.out.println("Total amount to be paid after Loan duration is : "+si);
	}

}
