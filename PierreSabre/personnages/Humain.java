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
		this.nbConnaissance = nbConnaissance;
		this.memoire = memoire;
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
	
	public String prendreParole() {
		return nom + " - ";
	}
	
	public void parler(String texte) {
		System.out.println("« " + texte + " »");
	}
	
	public void direBonjour() {
		parler(prendreParole() + "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonfavorite + ".");
	}
	
	public void boire() {
		parler(prendreParole() + "Mmmm, un bon verre de " + boissonfavorite + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler(prendreParole() + "j'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler(prendreParole() + "je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous");
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
	
	public void repondre(Humain humain) {
		this.direBonjour();
		this.memoriser(humain);
	}
	
	public void memoriser(Humain humain) {
		memoire[this.nbConnaissance] = humain;
		nbConnaissance += 1;
	}
	
	public void listerConnaissance(){
		String connaissance = " ";
		for (int i=0; i<nbConnaissance; i++) {
			connaissance += memoire[i].getNom() + ", ";
		   }
		parler(prendreParole() + "Je connais beaucoup de monde dont :" + connaissance);
	}
}