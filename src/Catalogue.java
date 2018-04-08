import java.util.ArrayList;

public class Catalogue {
	private String nom;
	private ArrayList<Roman> romans = new ArrayList<>();
	private ArrayList<BD> bds = new ArrayList<>();
	private DVD[] dvds = new DVD[1000];
	private int i;

	public Catalogue(String nom) {
		super();
		this.nom = nom;

	}

	public void ajouterArticle(Livre livre){
		if (livre instanceof Roman) {
			romans.add((Roman)livre);
		}
		else if (livre instanceof BD) {
			bds.add((BD) livre);
		}
	}
	public void ajouterArticle(DVD dvd) {
		dvds[i]=dvd; i++;

	}

	public void afficherArticle () {


	}
	//-----------------------
	// GETTERS SETTERS
	//------------------------


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<Roman> getRomans() {
		return romans;
	}

	public void setRomans(ArrayList<Roman> romans) {
		this.romans = romans;
	}
	public ArrayList<BD> getBds() {
		return bds;
	}
	public void setBds(ArrayList<BD> bds) {
		this.bds = bds;
	}
	public DVD[] getDvds() {
		return dvds;
	}
	public void setDvds(DVD[] dvds) {
		this.dvds = dvds;
	}



}
