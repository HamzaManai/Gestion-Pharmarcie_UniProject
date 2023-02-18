
public class Homeopathique extends Medicament {

	// variables
		protected String plante;
		
		//  constructeurs
		public Homeopathique() {
			super();
			plante = "";
		}
		
		public Homeopathique(String libl, int ref, double prix, String dateFab, String plante) {
			super(libl, ref, prix, dateFab);
			this.plante = plante;
		}
		
		// Setters and getters
		public String getPlante() {
			return plante;
		}
		
		public void setPlante(String plante) {
			this.plante = plante;
		}
		
		//  m�thodes
		public float calculTaxeAppliquee() {
			return (float)(prix*20)/100;
		}
		public String toString() {
			return super.toString()+"\n plante :"+plante+"\n valeur de taxes appliqu�e est :"+this.calculTaxeAppliquee()+"\n il n'est pas remboursable !";
		}
	}


