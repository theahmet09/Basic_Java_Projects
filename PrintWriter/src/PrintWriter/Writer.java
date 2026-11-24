package PrintWriter;
import java.io.PrintWriter;
public class Writer {
	public static void main(String[] args) {
		PrintWriter yazici = new PrintWriter(System.out, true);
		String metin = "DENEME YAZISIDIR.";
		yazici.println("BU BİR " + metin);
	}
}