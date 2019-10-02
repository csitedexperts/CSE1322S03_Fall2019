package stringOperations;

public class String_OperationsExamples {
	public static void main(String[] args) {
		String oop = "I like Object-Oriented Programming";

        
		System.out.println(oop.substring(7)); // [7, 14]

		String greeting = "Hello, World!";
		String sub = greeting.substring(0, 5); // [0, 5)
		System.out.println(sub);
		
		String s = "Agent";  // Agent 5
		
		System.out.println("Agent");
		System.out.println(s);
		
		
		s = s + s.length();  // Agent5 BUT not Agent 5
		System.out.println(s);
		String river ="Mississippi";
		System.out.println();
		
		System.out.println(river.substring(1, 2)); // [1, 1]
		System.out.println(river.substring(2, river.length() - 3));
		System.out.println(river.substring(1));
		System.out.println(river.substring(1,river.length()));
		//System.out.println(river.substring(4, 1)); // [4, 1]
	}
}
