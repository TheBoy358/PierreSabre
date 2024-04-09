package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boissonfavorite, int argent) {
		super(nom, boissonfavorite, argent);
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getBoissonfavorite() {
		return boissonfavorite;
	}
	
	public int getArgent() {
		return argent;
	}
	
	private String prendreParole() {
		return nom + " - ";
	}
	
	public void parler(String texte) {
		System.out.println("« " + texte + " »");
	}
	
	public void direBonjour() {
		parler(prendreParole() + "Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + boissonfavorite + ".");
	}
	
	public void boire() {
		parler(prendreParole() + "Mmmm, un bon verre de " + boissonfavorite + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public int seFaireExtorquer() {
		parler(prendreParole() + "J’ai tout perdu! Le monde est trop injuste...");
		perdreArgent(argent);
		return argent;
	}
	
	public void recevoir(int argentgagné) {
		 gagnerArgent(argentgagné);
		 parler(prendreParole() + argentgagné + " sous ! Je te remercie généreux donateur!");
	 }
}
