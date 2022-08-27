import java.util.Scanner;

public class ParaBozma {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);

		System.out.println("Bozduracağınız para tutarını giriniz:");

		double para = klavye.nextDouble();
		

		int toplamPara = (int) (para * 100);
		System.out.println("Toplam para: " + toplamPara);
		int yuzluk = toplamPara / 100;
		System.out.println("Yüzlük "+yuzluk);
		int kalanPara = toplamPara % 100;
		int ellikurus = kalanPara / 50;
		System.out.println("Elli kuruş "+ ellikurus);
		kalanPara = kalanPara % 50;
		int yirmibesKurus = kalanPara / 25;
		System.out.println("Yirmibeş kuruş " + yirmibesKurus);
		kalanPara=kalanPara%25;
		int onKurus = kalanPara / 10;
		System.out.println("on kuruş " + onKurus);
		kalanPara %= 10;
		int besKurus=kalanPara/5;
		System.out.println("beş kuruş " + besKurus);
		kalanPara %=5;
		int birKurus=kalanPara/1;
		System.out.println("bir kuruş "+birKurus);
	}
}
