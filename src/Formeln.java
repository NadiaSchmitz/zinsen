import java.text.DecimalFormat;

import Prog1Tools.IOTools;

public class Formeln {

	public static void main(String[] args) {
		
		int i = 1;
		
		float kapital, zinsfuss, zins, tage, werteNummer;
		
		String ausgehen = "Danke, dass Sie das Programm benutzen haben.";
		String falscheEingabe = "Diese Werte kann das Programm nicht berechnen";
		//String wiederholen = 
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		while (i == 1) {
		
			System.out.println("Welche Wert möchten Sie erfahren? ");
			System.out.println("1 - Kapital");
			System.out.println("2 - Zinsfuss");
			System.out.println("3 - Tage");
			System.out.println("4 - Zins");
			System.out.println("oder ");
			System.out.println("9, wenn Sie das Programm beenden möchten.");
			System.out.println();
			
			werteNummer = IOTools.readInteger("Geben Sie die gewünschte Werte ein: ");
			
			if (werteNummer == 9) {
				System.out.println(ausgehen);
			} else if (werteNummer == 1) {
				zinsfuss = IOTools.readInteger("Geben Sie den Zinsfuss ein (%): ");
				zins = IOTools.readInteger("Geben Sie die Zins ein  (Euro): ");
				tage = IOTools.readInteger("Geben Sie die Anzahle der Tage ein: ");
				kapital = (zins * 100 * 360) / (zinsfuss * tage);
				System.out.println("Kapital: " + df.format(kapital));
			} else if (werteNummer == 2) {
				zins = IOTools.readInteger("Geben Sie die Zins ein: ");
				kapital = IOTools.readInteger("Geben Sie den Kapital ein (Euro): ");
				tage = IOTools.readInteger("Geben Sie die Anzahle der Tage ein: ");
				zinsfuss = (zins * 100 * 360) / (kapital * tage);
				System.out.println("Zinsfuss: " + df.format(zinsfuss));
			} else if (werteNummer == 3) {
				zinsfuss = IOTools.readInteger("Geben Sie den Zinsfuss ein (%): ");
				kapital = IOTools.readInteger("Geben Sie den Kapital ein (Euro): ");
				zins = IOTools.readInteger("Geben Sie die Zins ein  (Euro): ");
				tage = (zins * 100 * 360) / (kapital * zinsfuss);
				System.out.println("Tage: " + df.format(tage));
			} else if (werteNummer == 4) {
				zinsfuss = IOTools.readInteger("Geben Sie den Zinsfuss ein (%): ");
				kapital = IOTools.readInteger("Geben Sie den Kapital ein (Euro): ");
				tage = IOTools.readInteger("Geben Sie die Anzahle der Tage ein: ");
				zins = (kapital * zinsfuss * tage) / (100 * 360);
				System.out.println("Zins: " + df.format(zins));
			} else {
				System.out.println(falscheEingabe);
			}
			System.out.println();
			i = IOTools.readInteger("Wollen Sie noch etwas berechnen? Geben Sie 1 oder 0: ");
			System.out.println();
		} 
		System.out.println(ausgehen);
	}

}
