package personnages;

public class Samourai extends Humain {
	String seigneur;

	public Samourai(String seigneur, String nom, String boissonfavorite, int argent) {
		super(nom, boissonfavorite, argent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		parler(prendreParole() + "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonfavorite + ".");
		parler(prendreParole() + "Je suis fier de servir le seigneur " + seigneur + ".");
	}
	
	@Override
	public void boire() {
		parler(prendreParole() + "Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boissonfavorite + ".");
	}

}
