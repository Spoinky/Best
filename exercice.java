import java.util.Scanner;

public class exercice {

	private static Scanner clavier;

	
	public static void main(String[] args) {
	
		clavier = new Scanner(System.in);
		
		System.out.print("Saisir 1 nombres entier");
		int x = clavier.nextInt();
		System.out.print("Saisir un autre nombres entier");
		int y = clavier.nextInt();
		System.out.print("Saisir un dernier nombres entier");
		int z = clavier.nextInt();

		if (x == z && y == z){
			System.out.print("3");
		}	
		else {
			if (x == y || y == z || z == x){
				System.out.print("2");
			}
			else{
				System.out.print("0");
			}
		}		
		}
	}


