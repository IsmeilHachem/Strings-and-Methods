package gcdemos;

public class StringMethods {
	
	public static String capitalize(String word) {
		return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
	}
	
	public static int wheresWaldo(String phrase) {
		return phrase.indexOf("Waldo");
	}
	
	public static String firstThingsFirst(String a, String b) {
		if (a.toLowerCase().charAt(0) < b.toLowerCase().charAt(0)) {
			return a + " " + b;
		} else {
			return b + " " + a;
		}
	}
	
	public static String reverse(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		return reverse;
	}
	
	public static String afterMath(String phrase) {
		if (phrase.toLowerCase().indexOf("math") != -1) {
			return phrase.substring(phrase.indexOf("math"));
		} else {
			return "dud";
		}
	}
	
	public static String camelCase(String phrase) {
		String result = "";
		if (phrase.length() == 0) {
			return result;
		}
		char firstChar = phrase.charAt(0);
		char firstCharToLowerCase = Character.toLowerCase(firstChar);
		result = result + firstCharToLowerCase;
		for (int i = 1; i < phrase.length(); i++) {
			char currentChar = phrase.charAt(i);
			char previousChar = phrase.charAt(i - 1);
			if (previousChar == ' ') {
				char currentCharToUpperCase = Character.toUpperCase(currentChar);
				result = result + currentCharToUpperCase;
			} else {
				char currentCharToLowerCase = Character.toLowerCase(currentChar);
				result = result + currentCharToLowerCase;
			}
		}
		result = result.replace(" ", "");
		return result;
		
	}

}
