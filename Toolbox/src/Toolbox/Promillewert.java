/*
 * author:		Kimi Janshon
 * element:		012
 * date:		18.03.19
 *
 */

package Toolbox;
import java.util.Scanner;

public class Promillewert {
	public double wassergehalt;
	public int anz_getraenke;
	public double gewicht;
	public double[] liter;
	public double[] volumen;
	public int[] anzahl;
	private Scanner scanner = new Scanner(System.in);

	public void getStarted() {
		boolean success = this.getInformation();
		if (success) {
			this.getraenke();
			double promillewert = this.berechnen();
			System.out.println("\nIhr Promillewert beträgt etwa " + promillewert + " ‰");
		}else {
			System.out.println("FEHLER!");
		}
	}

	private boolean getInformation() {
		System.out.println("Wählen Sie ihr Geschlecht. Männlich (1) oder Weiblich (2)");
		int geschlecht_zahl = this.scanner.nextInt();
		if (geschlecht_zahl == 1) {
			this.wassergehalt = 0.68;
		}else if (geschlecht_zahl == 2) {
			this.wassergehalt = 0.55;
		}else {
			System.out.println("Befolgen Sie die Anweisungen!");
			return false;
		}
		System.out.println("Geben Sie ihr Gewicht an:");
		this.gewicht = this.scanner.nextDouble();
		if (this.gewicht < 0) {
			return false;
		}
		return true;
	}

	private void getraenke() {
		System.out.println("Wieviele verschiedene Getränke haben Sie konsumiert? (Bier, Vodka, Gin, etc.)");
		this.anz_getraenke = this.scanner.nextInt();
		this.liter = new double[this.anz_getraenke];
		this.volumen = new double[this.anz_getraenke];
		this.anzahl = new int[this.anz_getraenke];
		for (int i = 1; i <= this.anz_getraenke; i++) {
			System.out.println(i + ". Getränk:");
			System.out.printf("\tAnzahl Liter von einem Getränk: ");
			liter[i-1] = this.scanner.nextDouble();
			System.out.printf("\tVolumen eines Getränkes: ");
			volumen[i-1] = this.scanner.nextDouble();
			System.out.printf("\tWieviele Getränke hatten Sie von dieser Sorte? ");
			anzahl[i-1] = this.scanner.nextInt();
		}
	}

	public double berechnen() {
		double res = 0.0;
		for (int i = 0; i < this.anz_getraenke; i++) {
			res += ((((this.liter[i] * 100) * (this.volumen[i] / 100) * 0.8)* this.anzahl[i]) / (this.gewicht * this.wassergehalt));
		}
		res *= 10;
		res = (double) Math.round(res * 100) / 100;
		return res;
	}

}
