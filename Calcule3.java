import java.util.Scanner;

public class Calcule3 {

	private static Scanner clavier;
	
	public static void main(String[] args) {
		
		clavier = new Scanner(System.in);
		
		System.out .print("Bonjour");
		System.out.print("Tapper un nombre");
		int x = clavier.nextInt();
		System.out.print("Tapper à nouveau un nombre");
		int y = clavier.nextInt();
		System.out.print("x=" + x + " y=" + y + ";     ");
		int z = 0;
		z = x;
		x = y;
		y = z;
		System.out.print("x=" + x + " y=" + y);

	}

}
