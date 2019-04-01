/*
 * author:		Kimi Janshon
 * element:		011
 * date:		25.03.19
 * 
 */

package Toolbox;

public class Round {
	private String upordown = "test";
	public double getStarted(double number, String upordown, int stelle_nach_komma, double schritt) {
		int factor = (int) (1/schritt);
		int mal = 1;
		for (int i = 1; i < stelle_nach_komma; i++) {
			mal *= 10;
		}
		factor *= mal;
		this.upordown = upordown;
		double res = roundToFraction(number, factor);
		return res;
	}
	
	private double roundToFraction(double x, long fraction) {
		if (this.upordown.equals("up")) {
			return (double) Math.ceil(x * fraction) / fraction;
		}else if (this.upordown.equals("down")) {
			return (double) Math.floor(x * fraction) / fraction;
		}
	    return -1.0;
	}
}
