
public class StringMethods {

	public static void main(String[] args) {
		// String = a reference data type that can store one or more characters
		// 			reference data types have access to useful methods.
		
		//String name = "    Roberto Gabriel    ";
		String name = "Roberto";

		
		//boolean result = name.equalsIgnoreCase("roberto");
		//int result = name.length();
		//char result = name.charAt(3);
		//int result = name.indexOf("r");
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
		//String result = name.trim();
		String result = name.replace("o", "0");
		
		System.out.println(result);
	}
}
