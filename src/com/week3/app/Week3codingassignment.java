package com.week3.app;

public class Week3codingassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//		double numberOfLetters=0;
//		for (String name : names) {
//			numberOfLetters += name.length();
//		}
////		System.out.println(numberOfLetters/names.length);
//		String concatenationString = "";
//		for (int i = 0; i < names.length; i++) {
//			concatenationString += names[i] + " ";
//		} 
////		System.out.println(concatenationString);
////		
//		int[] nameLengths = new int[6];
//				for (int i = 0; i < names.length; i++) {
//					nameLengths[i] += names[i].length();	
//				}
//				int sum = 0;
//				for (int num : nameLengths) {
//					sum += num;
//				}
//					System.out.println(sum);
//		String coding = "C		
//		System.out.println(repeatWord("coding", 5));
//		System.out.println(fullName("Rowan", "Bear"));
//		double[] array = {1, 2, 3, 4, 500};
//		double[] array2= {1, 1, 1, 1, 1, 1};
////		System.out.println(allIntsOver100(array));
//		System.out.println(isArrayAverageGreater(array, array2));
//		boolean isHotOutside = true;
//		double moneyInPocket = 200;
//		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		boolean fingernailsClipped = true;
		int minutesBeforeBedTime = 35;
		System.out.println(canPlayGuitar(fingernailsClipped, minutesBeforeBedTime));
	}
	
	public static boolean canPlayGuitar(boolean fingernailsClipped, int minutesBeforeBedTime) {
		return fingernailsClipped && minutesBeforeBedTime >= 30;
	}
	
	// This method allows the user to quickly figure out whether or not they have enough time to get lost
	// in the magical world of guitar playing before it is time to go to bed. I chose this because
	// sometimes I end up playing for too long past my bed time if I don't plan accordingly!
	
//	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
//		return isHotOutside && moneyInPocket > 10.50;
//	}
//	public static String repeatWord(String word, int n ) {
//		String concatenatedString = "";
//		for (int i = 1; i <= n; i++) {
//			concatenatedString += word;
//		}
//		return concatenatedString;
//	}
	
//	public static String fullName(String firstName, String lastName) {
//		return firstName + " " + lastName;
//				
//	}
	
//	public static boolean allIntsOver100(int[] array) {
//		int totalSum = 0;
//		for (int number : array) {
//			totalSum += number;
//		}
//		return totalSum > 100;
//	}
//public static double averageOfElements(double[] array) {
//	double total = 0;
//	for (double number : array) {
//	total += number;	
//	} return total/array.length;
////}
//	public static boolean isArrayAverageGreater(double[] arr1, double[] arr2) {
//		double total1 = 0;
//		double total2 = 0;
//		for (double number : arr1) {
//		total1 += number;
//		
//	}	
//		for (double number2 : arr2) {
//		total2 += number2;
//	}	
//		return total1/arr1.length > total2/arr2.length;
//	}
	
}
