
public abstract class Medicament {
	//variables
		protected String libl;
		protected int ref;
		protected double prix;
		protected String dateFab;

		//  constructeurs
		public Medicament() {
			libl = "";
			ref = 0;
			prix = 0;
			dateFab = "";
		}
		
		public Medicament(String libl, int ref, double prix, String dateFab) {
			this.libl = libl;
			this.ref = ref;
			this.prix = prix;
			this.dateFab = dateFab;
		}
		
		// méthodes
		public abstract float calculTaxeAppliquee();
		
		public String toString() {
			return libl+":\n référence est :"+ref+"\n prix est :"+prix+"\n date de fabrication est :"+dateFab;
		}
}
