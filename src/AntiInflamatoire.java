
public class AntiInflamatoire extends Medicament implements Remboursable {


	// variables
	protected String molecule;
	protected int acidite;
	
	// constructeurs
	public AntiInflamatoire() {
		super();
		molecule = "";
		acidite = 0;
	}
	
	public AntiInflamatoire(String libl, int ref, double prix, String dateFab, String molecule, int acidite) {
		super(libl, ref, prix, dateFab);
		this.molecule = molecule;
		this.acidite = acidite;
	}
	
	// Setters and getters
	public String getMolecule() {
		return molecule;
	}

	public void setMolecule(String molecule) {
		this.molecule = molecule;
	}

	public int getAcidite() {
		return acidite;
	}

	public void setAcidite(int acidite) {
		this.acidite = acidite;
	}

	//  méthodes
	public float calculTaxeAppliquee() {
		if (molecule == "stéroïdien") {
			return (float)(prix*10)/100;
		}
		if (molecule == "non stéroïdien") {
			return (float)(prix*15)/100;
		}
		return 20;
	}
	
	public String toString() {
		return super.toString()+"\n molecule : "+molecule+"\n acidite : "+acidite+"\n valeur de taxes appliquée est :"+this.calculTaxeAppliquee()+"\n il est remboursable et sa valeur de remboursement est :"+this.remboursement();
	}
	
	public float remboursement() {
		return (float)(prix*80)/100;
	}
}
