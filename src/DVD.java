
public class DVD extends Article {

	protected int anSortie;

	public DVD(int id,String nom, double prixHt, int anSortie) {
		super(id, nom, prixHt);
		this.anSortie = anSortie;


	}

	public int getAnSortie() {
		return anSortie;
	}

	public void setAnSortie(int anSortie) {
		this.anSortie = anSortie;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "DVD "+ this.nom + " sortie en "+ anSortie;
		// va chercher les valeurs nom et anSortie de l'objet
	}
}
