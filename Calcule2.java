import java.util.Scanner;


public class Calcule2 {
	
	private static Scanner clavier;

	public static void main(String[] args) {
		
		clavier = new Scanner(System.in);
		
		System.out.print("Bonjour");
		System.out.print("Quel est le nom du produit ?");
		String nom = clavier.nextLine();
		System.out.print("Quel est le montant de la TVA ?");
		float tva = clavier.nextFloat();
		System.out.print("Quel est le prix TTC ?");
		float ttc = clavier.nextFloat();
		tva = tva/100;
		System.out.print(" Le prix HT du produit " + nom + " est de " + ttc/(1+tva) + " € ");
				
	

	}

}
