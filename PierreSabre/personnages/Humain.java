package personnages;

public class Humain {
	protected String nom;
	protected String boissonfavorite;
	protected int argent;
	
	// TP 5
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[30];
	
	public Humain(String nom, String boissonfavorite, int argent) {
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argent = argent;
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
		System.out.println("� " + texte + " �");
	}
	
	public void direBonjour() {
		parler(prendreParole() + "Bonjour ! Je m�appelle " + nom + " et j�aime boire du " + boissonfavorite + ".");
	}
	
	public void boire() {
		parler(prendreParole() + "Mmmm, un bon verre de " + boissonfavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler(prendreParole() + "j'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " � " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler(prendreParole() + "je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir un " + bien + " � " + prix + " sous");
		}
	}
	
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	
	public void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain){
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	private void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}
	
	private void memoriser(Humain humain) {
		memoire[this.nbConnaissance] = humain;
		nbConnaissance += 1;
	}
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("boisson",12);
		prof.boire();
		prof.acheter("jeu",2);
		prof.acheter("kimono",50);
	}
}
