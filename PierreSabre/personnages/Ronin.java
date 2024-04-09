package personnages;

public class Ronin {
	protected String nom;
	protected String boissonfavorite;
	protected int argent;
	protected int honneur = 1;
	protected int force = honneur*2;

	public Ronin(String nom, String boissonfavorite, int argent) {
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argent = argent;
		this.honneur = honneur;
		this.force = force;
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
	
	public void donner(Commercant beneficiaire) {
		int gain = argent/10;
		parler(prendreParole() + beneficiaire.getNom() + " prend ces " + gain + " sous.");
		beneficiaire.recevoir(gain);
	}
	
	public void provoquer(Yakuza adversaire){
		parler(prendreParole() + "Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		
		if (adversaire.getReput() < force) {
			honneur += 1;
			parler(prendreParole() + "Je t’ai eu petit yakusa!");
			adversaire.perdre();
		} else {
			honneur -= 1;
			parler(prendreParole() + "J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(argent);
		}
	}
}
