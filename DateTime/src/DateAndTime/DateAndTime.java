package DateAndTime;
import java.util.*;
public class DateAndTime {
	public static void main(String[] args) {
		int gun, ay, yil;
		int saniye, dakika, saat;
		GregorianCalendar tarih = new GregorianCalendar();
		gun = tarih.get(Calendar.DAY_OF_MONTH);
		ay = tarih.get(Calendar.MONTH);
		yil = tarih.get(Calendar.YEAR);
		saniye = tarih.get(Calendar.SECOND);
		dakika = tarih.get(Calendar.MINUTE);
		saat = tarih.get(Calendar.HOUR);
		System.out.println("BUGÜN TARİH : " + gun + "." + ay + "." + yil);
		System.out.println("SAAT : " + saat + "." + dakika + "." + saniye);
	}
}