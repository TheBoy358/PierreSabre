package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP5 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco","th�",20);
		Commercant chonin = new Commercant("Chonin","th�",40);
		Commercant kumi = new Commercant("Kumi","th�",10);
		Yakuza yaku = new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		Ronin roro = new Ronin("Roro","shochu", 60);
	}
}
