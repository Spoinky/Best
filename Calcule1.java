
import java.util.Scanner;

public class Calcule1 {

	private static Scanner clavier;

	
	public static void main(String[] args) {
	
		clavier = new Scanner(System.in);
		
		String prenom = "Antony";
		System.out.print("Bonjour" + prenom);
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.print("\n a:" + a + " b:" + b + " c:" + c + ";");
		a = 5;
		System.out.print("\n a:" + a + " b:" + b + " c:" + c + ";");
		b = 3;
		System.out.print("\n a:" + a + " b:" + b + " c:" + c + ";");
		c = a + b;
		System.out.print("\n a:" + a + " b:" + b + " c:" + c + ";");
		int NBEXEMPLE = 10;
		b = b + NBEXEMPLE;
		System.out.print("\n a:" + a + " b:" + b + " c:" + c + ";");
				

	}

}
