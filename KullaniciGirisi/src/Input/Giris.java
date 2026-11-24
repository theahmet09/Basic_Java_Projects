package Input;
import java.io.*;
public class Giris {
	public static void main(String[] args) throws Exception {
		int sayi1, sayi2, sonuc;
		BufferedReader okuyucu = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("BİRİNCİ SAYIYI GİRİN : ");
		sayi1 = Integer.parseInt(okuyucu.readLine());
		System.out.print("İKİNCİ SAYIYI GİRİN : ");
		sayi2 = Integer.parseInt(okuyucu.readLine());
		sonuc = sayi1 + sayi2;
		System.out.println("GİRİLEN İKİ SAYININ TOPLAMI : " + sonuc);
	}
}