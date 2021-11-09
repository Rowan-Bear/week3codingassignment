package com.week3.app;

public class LoopsConditionalsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int age = 17;
//		boolean hasLicense = true;
//		
////		System.out.println(age >= 16);
//		if (age>= 16 && hasLicense) {
//			System.out.println("You can drive");
//		} else {
//			System.out.println("You cannot drive");
//		}
		
//		double costOfMilk = 3.00;
//		int thirstLevel = 5;
//		
//		if (costOfMilk < 2.50 || thirstLevel > 6) {
//			System.out.println("Milk Please");
//		} else {
//			System.out.println("No thanks");
//		}
//		int numberOfCookies = 20;
//		int numberOfChildren = 12;	
//		
////		int cookiesLeft = numberOfChildren % numberOfChildren;
//		
//		if (numberOfCookies % numberOfChildren == 0)  {
//			System.out.println("Sad Face");
//		} else if (numberOfCookies % numberOfChildren < 2) {
//			System.out.println("Yes!");
//		} else if (numberOfCookies % numberOfChildren < 5) {
//			System.out.println("Whoohoooo!");
//		} else if (numberOfCookies % numberOfChildren > 5) {
//			System.out.println("Jackpot!");
//		} 
//		
//		String loyaltyMemberStatus = "Gold";
//		double loyaltyMemberDiscount = 0.0;
//		
//		switch(loyaltyMemberStatus) {
//		case "Silver":
//		loyaltyMemberDiscount = 0.10;
//		break;
//		case "Gold":
//		loyaltyMemberDiscount = 0.15;
//		break;
//		case "Platinum":
//		loyaltyMemberDiscount = 0.25;
//		break;
//		}
////		
////		System.out.println(loyaltyMemberDiscount);
////		
//		
//		
//		
//		double billTotal = 2000.00;
//		double adjustedTotal = billTotal - (loyaltyMemberDiscount * billTotal);
//				
//		if (adjustedTotal > 500) { 	
//			if	(loyaltyMemberStatus == "Silver") {
//			loyaltyMemberStatus = "Gold";
//			} else if (loyaltyMemberStatus == "Gold") {
//				loyaltyMemberStatus = "Platinum";
//			}
//			System.out.println(loyaltyMemberStatus);
//	}
//		String username = "Tommy123";
//		String password = "12345"	;	
//		
//		if (username == "Tommy123" && password == "12345") {
//			System.out.println("login successful");
//		} else {
//			System.out.println("access denied");
//		}
//		for (int i=0; i<=100; i++) {
//			if (i%2 ==0) {
//				System.out.println("Even");
//			} else {
//				System.out.println("Odd");
//			}
//		}
//		int i = 101;
//				while (i!=0) {
//				System.out.println(i%3);
//				i--;
//				}
		
//		double[] numbers = {7, 5, 2, 8, 13, 6};
//				for (int i : numbers) {
//					if (i%2 != 0) {
//						System.out.println(i);
//					}
//						
//				}
//		
//		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
//		int sumOfLetters = 0;
//		for (String name : names) {
//			System.out.println(sumOfLetters += name.length());
//		}
		
//		System.out.println(doesItExist (names, "Sam" ));
		
//		String greeting = greet("Rowan");
//		System.out.println(greeting);
		
	//takes string and int
		//returns true (boolean)
		//true if .length() of numbers > int
	
	
	

//}
//	public static String greet(String name) {
//		return "Hi, " + name + "!";
//	}
//	System.out.println(isEqual("Five", 4));
//	}
//	
//	public static boolean isEqual(String word, int number ) {
//		return word.length() == number;
		
//	}
		
//	public static boolean doesItExist(String[] array, String str) {
//		for (String i : array) {
//			if (str.equals(i)) {
//			return true;
//			} 
//		} return false;
//		System.out.println(getSmallestNumber(numbers));
	
	
//	public static int getSmallestNumber(int[] numbers) {
//		int smallest = numbers[0];
//		for (int number : numbers) {
//			if (number < smallest) {
//				smallest = number;
//			}
//		} 
//		return smallest;
//	}
//	System.out.println(findAverageOfDouble(numbers));	
//		String[] emotionsArray =  {"Happy", "Sad", "Mad"};
//		int [] lengthOfStrings = lengthOfStrings(emotionsArray);
//		for (int number : lengthOfStrings) {
//			System.out.println(number);
//		}
//		System.out.println(String[0].length());
//		System.out.println(isThereMoreEvenThanOdd(emotionsArray));
//		String password  = "word!";
//		System.out.println(word.contains("w"));
//		boolean trueOrFalse = true;
//	    trueorFalse = password.length() >= 8;
//	    trueOrFalse = password.contains("!");
//	    trueOrFalse = password.contains("$");
//	    trueOrFalse = password.contains("%");
//	    trueOrFalse = password.contains("&");
//	    System.out.println(trueOrFalse);
//		
		int test = 5 / 0;
		System.out.println(test);
		
		
//		System.out.println(isPalindrome(word));

	}
	
//	
//	public static double findAverageOfDouble(double[] array) {
//		double sum = 0;
//		for (double number : array) {
//			sum += number;
//		} 
//		return sum / array.length;
//		
 
//	public static int[] lengthOfStrings(String[] str) {
//		int[] results = new int[str.length];
//		for (int i = 0; i < str.length; i++) {
//			results[i] = str[i].length();
//		} return results;
//	}
	
//	public static boolean isThereMoreEvenThanOdd(String[] array) {
//		int sumOfEven = 0;
//		int sumOfOdd = 0;
//		for (String string : array) {
//			if (string.length() % 2 == 0) {
//				sumOfEven += string.length();
//			} else {
//				sumOfOdd += string.length();
//			}
//		}
//		
//		return sumOfEven > sumOfOdd;
	
	//go through each letter in string
	//set a string that is each letter of the string backwards
	//compare new string to old string
//		
//	}
//	public static boolean isPalindrome(String str) {
//		String reversedString = "";
//		char characters = str.charAt(str.length() - 1);
//		for (int i = str.length() - 1; i > -1; i--) {
//			characters = str.charAt(i);
//			reversedString += characters;
//		} 
//		return reversedString.equals(str);
//	}
	
	
}



//if (num1 % 3 == 0 && num1 % 5 == 0) {
//    System.out.println("FizzBuzz");
//} else if (num1 % 3 == 0) {
//    System.out.println("Fizz");
//} else if (num 1 % 5 == 0) {
//    System.out.println("Buzz");
//} else {
//    System.out.println("Hello world!");
//}
//
//
//
//if (num1 % 3 == 0 && num1 % 5 == 0) {
//    System.out.println("FizzBuzz");
//} else if (num1 % 3 == 0) {
//    System.out.println("Fizz");
//} else if (num1 % 5 == 0) {
//    System.out.println("Buzz");
//} else {
//    System.out.println("Hello world!");
//}