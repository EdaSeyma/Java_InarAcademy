
public class StringPractise {

	public static void main(String[] args) {
		lenght();
		substring();
		equalsIgnoreCase();
		contains();
		trim();
		charAt();
		toLowerCase();
		toUpperCase();
		split();
		
		
	}
	//public static void split() {
		//String temp = "Inar Academy";
		//System.out.println("split -> " + String.join(",",temp.split(" ",));
	//}
	public static void toUpperCase() {
		String temp = "Inar Academy";-
		System.out.println("toUpperCase -> " + temp.toUpperCase());
	}
	public static void toLowerCase() {
		String temp = "Inar Academy";
		System.out.println("toLowerCase -> " + temp.toLowerCase());
	}
	public static void charAt() {
		String temp = "Inar Academy";
		System.out.println("charAt -> " + temp.charAt(0));
	}
	public static void trim() {
		String temp = " Inar Academy ";
		System.out.println("trim -> " + temp.trim());
	}


	public static void contains() {
		String temp = "Inar";
		System.out.println("Contains -> " + temp.contains("r"));
	}

	public static void equalsIgnoreCase() {

		String temp = "Inar";
		String temp2 = "INar";
		String temp3 = "Inar Academy";

		System.out.println("equalsIgnoreCase -> " + temp.equalsIgnoreCase(temp2));
		System.out.println("equalsIgnoreCase -> " + temp.equalsIgnoreCase(temp3));

	}

	public static void substring() {

		String temp = "Inar Academy";
		String yeni = temp.substring(3, 9);
		System.out.println("substring -> " + temp);
		System.out.println("substring -> " + yeni);

	}

	public static void lenght() {

		String temp = "I love Inar Academy";
		int length = temp.length();
		System.out.println("length -> " + length);

	}

}
