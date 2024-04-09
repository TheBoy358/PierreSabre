package personnages;

public class Yakuza {
	protected String nom;
	protected String boissonfavorite;
	protected int argent;
	protected int ptReput = 4;
	protected String clan;

	public Yakuza(String nom, String boissonfavorite, int argent, String clan) {
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.argent = argent;
		this.clan = clan;
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
	
	public int getReput() {
		return ptReput;
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
	
	public void extorquer(Commercant victime) {
		parler(prendreParole() + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(prendreParole() + victime.getNom() + " , si tu tiens à la vie donne moi ta bourse !");
		gagnerArgent(victime.getArgent());
		victime.seFaireExtorquer();
		parler(prendreParole() + " J’ai piqué les " + victime.getArgent() + " sous de " + victime.getNom() + " , ce qui me fait " + argent + " sous dans ma poche. Hi ! Hi !");
	}
	
	int perdre() {
		ptReput -= 1;
		parler(prendreParole() + "J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan + " .");
		perdreArgent(argent);
		return argent;
	}
	
	void gagner(int gain){
		Ronin roro = new Ronin("Roro","shochu",60);
		gain = roro.getArgent();
		roro.perdreArgent(gain);
		gagnerArgent(gain);
		ptReput += 1;
		parler(prendreParole() + "Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
}
