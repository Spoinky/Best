import java.util.Scanner;


public class Main {
	
	private static Scanner clavier;

	public static void main(String[] args) {
		
		// Initialisation de la saisie en mode console
		clavier = new Scanner(System.in);
		
		int nb1, nb2;
		// Déclaration de variables
		
		System.out.print("Entrez ton nom");
		// Afficher sur l'ecrant
		
		String nom = clavier.nextLine();
		// Garder se qu'il a noter dans "nom"
		
		System.out.println("Bonjour "+ nom);
		System.out.print("Dans quel classe es-tu ?");
		String classe = clavier.nextLine();
		System.out.println("Cool t en "+ classe);
		System.out.println("Quel âge as-tu ?");
		int age = clavier.nextInt();
		
		for(int i= 1 ; i <= 3 ; i++){
		// Boucle defini 
			nb1 = (int) Math.round(Math.random()*10);
			nb2 = (int) Math.round(Math.random()*10);
			System.out.print("\nCalcule : " + nb1 + " + " + nb2 + " = ");
			int result = clavier.nextInt();
		
			if (result == (nb1 + nb2)){
				System.out.print("Bravo " + nom + " bonne reponce");
			}
			else{
				System.out.print("Faux " + nom + "il fallait trouver " + (nb1 + nb2));
			}
		}
	}

}
