/*
 * author:		Kimi Janshon
 * element:		024
 * date:		25.03.19
 * 
 */

package Toolbox;

public class CurrencyConverter 
{ 
	private double eur;
	private double chf;
	private double usd;
	private double gbp;
	
	public double getCurrency(double amount, String from, String to) {
		boolean forward = this.setCurrency(from);
		double res = -1.0;
		if (forward) {
			res = this.calc(amount, to);
		}
		if (res < 0) {
			res = -1.0;
		}
		double res1 = Math.round(res*100);
		res1 /= 100;
		return res1;
	}
	
	private double calc(double amount, String to) {
		double res, tocalc;
		switch (to) {
		case "eur":
			tocalc = this.eur;
			break;
		case "chf":
			tocalc = this.chf;
			break;
		case "usd":
			tocalc = this.usd;
			break;
		case "gbp":
			tocalc = this.gbp;
			break;
		default:
			tocalc = -1.0;
			break;
		}
		res = amount * tocalc;
		return res;
	}
	
	private boolean setCurrency(String currency) {
		switch (currency) {
		case "eur":
			this.eur();
			break;
		case "chf":
			this.chf();
			break;
		case "usd":
			this.usd();
			break;
		case "gbp":
			this.gbp();
			break;
		default:
			return false;
		}
		return true;
	}
	
	private void eur() {
		this.eur = 1.0;
		this.chf = 1.12;
		this.usd = 1.13;
		this.gbp = 0.86;
	}
	
	private void chf() {
		this.eur = 0.89;
		this.chf = 1.0;
		this.usd = 1.01;
		this.gbp = 0.76;
	}
	
	private void usd() {
		this.eur = 0.88;
		this.chf = 0.99;
		this.usd = 1.0;
		this.gbp = 0.76;
	}
	
	private void gbp() {
		this.eur = 1.17;
		this.chf = 1.31;
		this.usd = 1.32;
		this.gbp = 1.0;
	}
} 