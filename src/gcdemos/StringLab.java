package gcdemos;

public class StringLab {

	public static void main(String[] args) {
		capitalize("blAZes"); 
		wheresWaldo("Striped Waldo!");
		firstThingsFirst("dog", "bird");
		reverse("Happy");
		soLong("oompa", "loompa");
		afterMath("Jimmy cracked corn and I don't care");
		letterize("Betsy");
		
		
		StringMethods meth = new StringMethods();
		System.out.println(meth.capitalize("word"));
		System.out.println(meth.wheresWaldo("They will find Waldo!"));
		System.out.println(meth.firstThingsFirst("zebra", "horse"));
		System.out.println(meth.reverse("Larry"));
		System.out.println(meth.afterMath("This is some spiffy math there Larry!"));
		System.out.println(meth.camelCase("desert survival times"));
	}
	
	public static void capitalize(String word) {
		System.out.println(word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase());
	}
	
	public static void wheresWaldo(String phrase) {
		System.out.println(phrase.indexOf("Waldo"));
	}
	
	public static void firstThingsFirst(String a, String b) {
		if (a.toLowerCase().charAt(0) < b.toLowerCase().charAt(0)) {
			System.out.println(a + b);
		} else {
			System.out.println(b + a);
		}
	}
	
	public static void reverse(String s) {
		String reverse = new StringBuffer(s).reverse().toString();
		System.out.println(reverse);
	}
	
	public static void soLong(String a, String b) {
		if (a.length() > b.length()) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
	
	public static void afterMath(String phrase) {
		if (phrase.toLowerCase().indexOf("math") != -1) {
			System.out.println(phrase.substring(phrase.indexOf("math")));
		} else {
			System.out.println("dud");
		}
	}
	
	public static void letterize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
	
	
	

}
