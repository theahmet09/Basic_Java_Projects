package Maths;
public class Islemler {
	public static void main(String[] args) {
		int sayi1 = 5, sayi2 = 7, toplam, cikarma, carpma;
		toplam = sayi1 + sayi2;
		cikarma = sayi2 - sayi1;
		carpma = sayi1 * sayi2;
		float bolme = sayi2 / sayi1;
		float kalan = sayi2 % sayi1;
		System.out.println("İKİ SAYININ TOPLAMI : " + toplam);
		System.out.println("İKİ SAYININ FARKI : " + cikarma);
		System.out.println("İKİ SAYININ ÇARPIMI : " + carpma);
		System.out.println("İKİ SAYININ BÖLÜMÜ : " + bolme);
		System.out.println("İKİ SAYININ BÖLÜMÜNDEN KALAN : " + kalan);
	}
}