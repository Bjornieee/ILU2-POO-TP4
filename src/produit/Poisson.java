package produit;
import personnages.Gaulois;

public class Poisson extends Produit {
	private String jour;
	public Poisson(String nom, Unite unite, String jour) {
		super(nom,unite);
		this.jour = jour;
	}
	public void decrireProduit(Produit produit) {
		StringBuilder chaine = new StringBuilder();
		chaine.append(produit.getNom());
		chaine.append(" p�ch� ");
		chaine.append(jour);
		System.out.println(chaine);
	}

}

