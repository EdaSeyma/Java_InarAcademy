package weeks.week_05;

public class unluharf {
	public static void main(String[] args) {
		String str = "Eda Seyma";
		//sadeceUnluHarfler(str);
		sadeceUnsuzHarfler(str);
	}

	public static void sadeceUnluHarfler(String str) {

		int lenght = str.length();
		for (int i = 0; i < str.length(); i++) {
			char harf = str.toLowerCase().charAt(i);
			if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'u' || harf == 'u' || harf == 'o'
					|| harf == 'ö') {
				System.out.println(harf);
			}
		}
	}
	public static void sadeceUnsuzHarfler(String str) {

		int lenght = str.length();
		String result ="";
		for (int i = 0; i < str.length(); i++) {
			char harf = str.toLowerCase().charAt(i);
			if (!(harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'u' || harf == 'u' || harf == 'o'
					|| harf == 'ö')) {
				result=result+str.charAt(i);
			}
		}
		System.out.println(result);
	}
}
