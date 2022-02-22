package Activity1;

public class Stringcontainsonlydigits {
 public static void main(String[] args){
		String str = "1234987651";
		boolean result = str.matches("[0-9]+");
		System.out.println("Original String : " + str);
		System.out.println("Does string contain only Digits? : " + result);
	}

}
