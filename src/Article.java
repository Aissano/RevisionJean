
public abstract class Article {

	protected int id ;
	protected String nom;
	protected double prixHt;


	public Article(int id, String nom, double prixHt) {
		super();
		this.id = id;
		this.nom = nom;
		this.prixHt = prixHt;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPrixHt() {
		return prixHt;
	}


	public void setPrixHt(float prixHt) {
		this.prixHt = prixHt;
	}





	public static void afficher() {
		System.out.println("Trois articles possibles : BD, Roman, Dvd");

	}

}
