package com.prodapt.Assignment;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment sr = new Assignment();
		sr.addRecords("Sai Aditya", 123, "77 near santhi towers");
		sr.addRecords("Chaitanya", 456, "58 gandi nagar");
		System.out.println("Display all school records");
		sr.displayRecords();

	}

}
