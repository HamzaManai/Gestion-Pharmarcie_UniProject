
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// Instantiation
		Scanner s = new Scanner(System.in);
		Pharmacie ph = new Pharmacie(5);
		// Variables
		int choix;
		int typeMed;
		boolean rep=true;
			
		do {
			// Menu	
			System.out.println("          ************************************************");
			System.out.println("          --------------------- Menu ---------------------");
			System.out.println("          ************************************************");
			System.out.println("");
			System.out.println("            1- Ajouter un m�dicament.");
			System.out.println("            2- Supprimer un m�dicament.");
			System.out.println("            3- Afficher un m�dicament.");
			System.out.println("            4- Afficher les m�dicanments selon le type:.");
			System.out.println("            5- Afficher l'ensemble des m�dicaments.");
			System.out.println("            6- Rechercher un m�dicament.");
			System.out.println("            7- Afficher les m�dicaments remboursables.");
			System.out.println("            8- Afficher les m�dicaments non remboursables");
			System.out.println("            9- Quitter");
			System.out.println("          ************************************************");
			

			System.out.println("Donnez votre choix :");
			choix = s.nextInt();
			switch(choix) {
// Choix 1------------------------------------------------
			case 1:
				do {
					System.out.println("******************************");
					System.out.println("Donner le type de m�dicament :");
					System.out.println("******************************");
					System.out.println("******************************");
					System.out.println("1- Antibiotique :");
					System.out.println("2- Antinflamatoire :");
					System.out.println("3- Homeopathique :");
					System.out.println("******************************");
					System.out.println("Donnez votre choix :");


					typeMed = s.nextInt();
				} while(typeMed != 1 && typeMed != 2 && typeMed != 3);
				switch(typeMed) {
				//Antibiotique
				case 1:
					System.out.println("Le libelle de :");
					String lib = s.next();
					System.out.println("La r�f�rence :");
					int ref = s.nextInt();
					System.out.println("Le prix :");
					double prix = s.nextDouble();
					System.out.println("La date de fabrication :");
					String dateFab = s.next();
					System.out.println("La bacterie :");
					String bacterie = s.next();
					ph.ajout(new Antibiotique(lib, ref, prix, dateFab, bacterie));
					break;
					//Antiflamatoire
				case 2:
					System.out.println("Le libelle de :");
					lib = s.next();
					System.out.println("La r�f�rence :");
					ref = s.nextInt();
					System.out.println("Le prix :");
					prix = s.nextDouble();
					System.out.println("La date de fabrication :");
					dateFab = s.next();
					System.out.println("La mol�cule :");
					String molecule = s.next();
					System.out.println("L'accidit� :");
					int acid = s.nextInt();
					ph.ajout(new AntiInflamatoire(lib, ref, prix, dateFab, molecule, acid));
					break;
					// Homeopathique
				case 3:
					System.out.println("Le libelle de :");
					lib = s.next();
					System.out.println("La r�f�rence :");
					ref = s.nextInt();
					System.out.println("Le prix :");
					prix = s.nextDouble();
					System.out.println("La date de fabrication :");
					dateFab = s.next();
					System.out.println("La plante :");
					String plante = s.next();
					ph.ajout(new Homeopathique(lib, ref, prix, dateFab, plante));
				}
				break;
// Choix 2------------------------------------------------
			case 2:
				System.out.println("Donner la r�f�rence du m�dicament � supprimer :");
				int ref = s.nextInt();
				if	(ph.suppression(ref))
					System.out.println("M�dicament est supprimer avec succes !");
				else
					System.out.println("M�dicament introuvable !");
				break;
// Choix 3------------------------------------------------
			case 3:
				
				System.out.println("Donner la r�f�rence du m�dicament � afficher :");
				ref = s.nextInt();
				int res = ph.recherche(ref);
				if (res == -1)
					System.out.println("Le m�dicament n'existe pas dans la pharmacie");
				else
					System.out.println(ph.tabMed[res].toString());
				
				
				break;
			
// Choix 4------------------------------------------------
			case 4:
				System.out.println("Donner le type de medicament'\n'");
				String type1=s.next();
				if(type1.equals("Antibiotique")||type1.equals("AntiInflamatoire")|| type1.equals("Homeopathique"))
				ph.affichage(type1);
				else
					System.out.println("type Introuvable!");
		
			
			break ; 
// Choix 5------------------------------------------------
			case 5:
				System.out.println(ph.toString());
				break;
// Choix 6------------------------------------------------
			case 6:
				System.out.println("Donner la r�f�rence du m�dicament � chercher :");
				ref = s.nextInt();
				if (ph.recherche(ref) != -1)
					System.out.println("Le m�dicament existe dans la pharmacie.");
				else
					System.out.println("Le m�dicament n'existe pas dans la pharmacie.");
				break;
// Choix 7------------------------------------------------
			case 7:
				System.out.println("les remboursables sont : \n");
				ph.lesRemboursables();
				
				
				break;
// Choix 8------------------------------------------------
			case 8:
				System.out.println("les Non remboursables sont : \n");
				ph.lesNonRemboursables();
				break;
// Choix 9------------------------------------------------
			case 9:
				rep=false;
				break;

		}
	} while(rep==true);
}	
}
