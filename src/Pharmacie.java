
public class Pharmacie {
	// variables
		protected Medicament tabMed[];
		protected int nbrMed;
		
		//constructeurs
		public Pharmacie(int max) {
			if (max < 101 && max > 0) {
				tabMed = new Medicament[max];
				nbrMed = 0;	
			}
		}
		
		// méthodes
		public String toString() {
			String chaine = "\n L'ensemble des medicaments : \n";
			if (nbrMed > 0)
				for(int i = 0; i < nbrMed; i++)
					chaine +="\n Le medicament n= "+i+": \n "+tabMed[i].toString()+"\n";
			else
				chaine = "La pharmacie ne contient aucun medicament !";
			
			return chaine;
		}
		
		public void ajout(Medicament m) {
			if (tabMed.length > nbrMed) {
				tabMed[nbrMed] = m;
				nbrMed++;
			}
		}
		
		public int recherche(int ref) {
			for (int i = 0; i < nbrMed; i++) {
				if (tabMed[i].ref == ref)
					return i;
			}
			return -1;
		}
		
		/* public boolean suppression(int ref) 
		 {
			 int i=0;
			 do {
				 i++;
			 }while ((tabMed[i].ref == ref)&&(i<nbrMed));
			 
			 if (i != nbrMed) 
			 {
				 for (; i < nbrMed; i++)
				 {
					 tabMed[i]=tabMed[i+1];
				 }
				 nbrMed--;
				 return true;
			 }
			 else return false;
		 } */
		 public boolean suppression(int ref) 
		 {
		int i=recherche(ref);
		if(i!=-1)
		{if(i == nbrMed)
		{tabMed[i]=null;
		nbrMed --;
		}
		 else{
		for (; i<nbrMed; i++)
		{tabMed[i]=tabMed[i+1];}
		nbrMed --;
		}
		return true;
		}
		return false;
		}
		
		public void affichage(String type) {
			for (int i = 0; i < nbrMed; i++) {
				if (tabMed[i].getClass().getSimpleName().equals(type)) {
					System.out.println(tabMed[i].toString());
				}
			}
		}
		
		public void lesRemboursables() {
			for (int i = 0; i < nbrMed; i++) {
				if (tabMed[i] instanceof AntiInflamatoire || tabMed[i] instanceof Antibiotique) {
					System.out.println(tabMed[i].toString());
				}
			}	
		}
		
		public void lesNonRemboursables() {
			for (int i = 0; i < nbrMed; i++) {
				if (tabMed[i] instanceof Homeopathique) {
					System.out.println(tabMed[i].toString());
				}
			}
		}

}
