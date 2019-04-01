/*
 * author:		Kimi Janshon
 * element:		023
 * date:		25.03.19
 * 
 */

package Toolbox;

public class MetricUnit {
	// Symbols: E, P, T, G, M, k, h, da, , d, c, m, mu, n, p, f, a
	public double getStartedSymbol(double amount, String prefix_symbol_from, String prefix_symbol_to) {
		int from = this.getNumberOfSymbol(prefix_symbol_from);
		int to = this.getNumberOfSymbol(prefix_symbol_to);
		amount *= this.getResult(from, to);
		return amount;
	}
	// Sind die "Hochnummern", im Beispiel die 2, für  10^2
	public double getStartedScientific(double amount, int notation_from, int notation_to) {
		amount *= this.getResult(notation_from, notation_to);
		return amount;
		
	}
	
	private double getResult(int from, int to) {
		int factor = this.getFactor(from, to);
		double res = Math.pow(10, factor);
		return res;
	}
	
	
	private int getFactor(int from, int to) {
		int factor = 0;
		factor = from - to;
		return factor*-1;
	}
	
	private int getNumberOfSymbol(String symbol) {
		switch (symbol) {
		case "E":
			return 18;
		case "P":
			return 15;
		case "T":
			return 12;
		case "G":
			return 9;
		case "M":
			return 6;
		case "k":
			return 3;
		case "h":
			return 2;
		case "da":
			return 1;
		case "":
			return 0;
		case "d":
			return -1;
		case "c":
			return -2;
		case "m":
			return -3;
		case "mu":
			return -6;
		case "n":
			return -9;
		case "p":
			return -12;
		case "f":
			return -15;
		case "a":
			return -18;
		default:
			return 0;
		}
	}
}
