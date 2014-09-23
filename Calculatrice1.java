import java.util.Scanner;

public class Calculatrice1 {
	
	private static Scanner clavier;
	
	public static void main(String[] args) {
		
		char signe;
		clavier = new Scanner(System.in);
		
		System.out.print("Saisir le signe de votre oppération");
		String sign = clavier.nextLine();
		
		System.out.print("Saisir le premier nombre");
		float x = clavier.nextFloat();
		
		System.out.print("Saisir le deuxieme nombre");;
		float y = clavier.nextFloat();;
		
		signe = sign.charAt(0);
		
		if( signe != '+' && signe != '-' && signe != '*' && signe != '/'){
			System.out.print("Opération incorecte");
		}
		
		else{ 
			if (sign.equals("+")){
			System.out.print( x + y);
			}
			else{
				if (sign.equals("-")){
					System.out.print( x - y);
				}
				else{ 
					if (sign.equals("*")){
						System.out.print(x * y);
						}
					else{
						if (y != 0){
							System.out.print(x / y);
							}
						else{ 
							System.out.print("Division par 0 impossible");
						}
					}
				}
			}	
		}				
	}	
}
