package InterviewQuestions;

public class w04_Interview04 {

	public static void main(String[] args) {
		String s = "Edaaasseyma";
		String result = "";
		String c = "";

		for (int i = 0; i < s.length(); i++) {
			c = "" + s.charAt(i);
			if (result.contains(c) == false) {
				result = result + s.toLowerCase().charAt(i);
			}

		}
		System.out.println(result);
	}
}
