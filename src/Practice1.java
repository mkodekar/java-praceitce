
public class Practice1 {  //main class -- line comment
	
	/*
	 *  this is a paragraph comment can be use to 
	 */
	
	 /*
	  * function main - this is required  in every java project you will ever create
	  * main function always executes first
	  * public - allows all other classes to access this function
	  * static - this means that practice1 class that can call this function
	  * void - means this functions doesn't not return any values after it is done executing
	  * String[] - means every main function should calls array of strings in the main function
	  * args means argument here can arguments you can insert any argument here.  
	  */
	
	 // Remember String is a non primitive type because it is a class and not an object
	 static String firstString = "String to print";
	 
	 static final double PIE = 3.1415;  // final  is for keeping the value constant, double is used
	 // in java to represent numbers that have decimals
	 // Common practice in java : whenver you create a constant let the variable name be all upper case letters.
	 
	 // String  is storage area
	 // firstString is assigning a name to it while assigning a name always remember that the object
	 // must start in lower case assigning it like FirstString may render you having 
	 // 2 different objects First and String.
	 
	 public static void main(String[] args) {
		System.out.println("Hello world"); // Semicolon is always important whenever you have inserted an argumnet to the function 
		System.out.println(firstString);
		System.out.println(PIE);// just add the object to sysout function 
		//here you will get the output to what is stored in the object
		// In this case firstString is the object and  "String to print" is value is stored in it
		
		// Remember before using a variable you should first declare it before you use it.
		
		int  intOne = 22, intTwo = intOne +1;
		System.out.println(intOne);
		System.out.println(intTwo);
		
		byte myByte = 123;
		short myShort = 32454;
		int myInt = 2100000000;
		long myLong = 9220000000000000000L;
		float myFloat = 3.14F;
		double myDouble =  3.143333333344654464545435454433;
		boolean trueOrFalse = true;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(myByte);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myInt);
		System.out.println(myLong);
		System.out.println(myShort);
		System.out.println(trueOrFalse);
		
		char randomCharacter = 64;
		char anotherCharacter = 'A';
		
		char escapeChars = '\n';
		
		String secondString = "to show how it works";
		
		String combination = firstString + ' ' + secondString;
		String byteString = Byte.toString(myByte);
		String shortString = Short.toString(myShort);
		String intString = Integer.toString(myInt);
		String longString = Long.toString(myLong);
		String floatString = Float.toString(myFloat);
		String doubleString = Double.toString(myByte);
		
		double aDouble = 2.22223233343434;
		int doubleToInt = (int) aDouble;
		
		int stringToInt = Integer.parseInt(intString);
		
		
		System.out.println(randomCharacter);
		System.out.println(escapeChars);
		System.out.println(anotherCharacter);
		
		System.out.println(combination);
		System.out.println(byteString);
		System.out.println(shortString);
		System.out.println(intString);
		System.out.println(longString);
		System.out.println(floatString);
		System.out.println(doubleString);
		System.out.println(doubleToInt);
		System.out.println(stringToInt);
	}

}