package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> num = new ArrayList<String>();
		//2. Add five Strings to your list
		num.add("one");
		num.add("two");
		num.add("three");
		num.add("four");
		num.add("five");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < num.size(); i++) {
			String value = num.get(i);
			System.out.println(value);
		}
		
		//4. Print all the Strings using a for-each loop
		for (String Value : num) {
			System.out.println(Value);
		}
		
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < num.size(); i+=2) {
			String value = num.get(i);
			System.out.println(value);
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
