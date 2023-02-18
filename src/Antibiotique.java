
	public class Antibiotique extends Medicament implements Remboursable{
		
		//variables
		protected String bacterie;
		
		//constructeurs
		public Antibiotique() {
			super();
			bacterie = "";
		}
		
		public Antibiotique(String libl, int ref, double prix, String dateFab, String bacterie) {
			super(libl, ref, prix, dateFab);
			this.bacterie = bacterie;
		}
		
		// Setters and getters
		public String getBactarie() {
			return bacterie;
		}
		
		public void setBactarie(String bacterie) {
			this.bacterie = bacterie;
		}
		//méthodes
		public float calculTaxeAppliquee() {
			if (bacterie == "thermophyle") {
				return (float)(prix/10)/100;
			}
			if (bacterie == "mésophyle") {
				return (float)(prix/12)/100;
			}
			return (float)(prix*0.15);
		}
		
		public String toString() {
			return super.toString()+"\n bacterie :"+bacterie+"\n valeur de taxes appliquée est :"+this.calculTaxeAppliquee()+"\n il est remboursable et sa valeur de remboursement est :"+this.remboursement();
		}
		
		public float remboursement() {
			return (float)(prix*90)/100;
		}
	}
