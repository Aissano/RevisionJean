public class Main {


	public static void main(String[] args) {
		Article.afficher();
		Roman livre;
		livre = new Roman(123, "anna", 12.50, "bobo" );
		System.out.println("nom" + livre +" " + livre.getPrixHt());
		System.out.println(livre.getNom() + " " + livre.getId());
		livre.setNom("germinal");

		System.out.println(livre.getNom());
		livre.setNomAut("Zola");
		System.out.println( livre.getNomAut());

		Catalogue media;
		media= new Catalogue("jean");
		media.ajouterArticle(new DVD(321, "La vie est belle", 22.5, 1946 ));
		media.ajouterArticle(livre );
		System.out.println(media.getDvds()[0]);

	}

}
