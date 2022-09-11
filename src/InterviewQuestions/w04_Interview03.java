package InterviewQuestions;

public class w04_Interview03 {

	public static void main(String[] args) {
		String s = "Hannah";
		String result="";
		for (int i =s.length()-1; i>=0 ; i--) {
			result=result+s.charAt(i);
		}
		if(s.equals(result)) {
			System.out.println("This is palindrome");
		}else {
			System.out.println("This is not palindrome");
		}
	}

}
