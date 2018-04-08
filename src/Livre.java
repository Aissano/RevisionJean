
public abstract class Livre extends Article {


	protected String nomAut;

	public Livre(int id, String nom, double prixHt, String nomAut) {
		super(id, nom, prixHt);
		this.nomAut = nomAut;
	}

	public String getNomAut() {
		return nomAut;
	}

	public void setNomAut(String nomAut) {
		this.nomAut = nomAut;
	}



}
