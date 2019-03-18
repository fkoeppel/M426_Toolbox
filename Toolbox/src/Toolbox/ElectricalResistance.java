package Toolbox;
/*
 * author:		Joe Tüscher
 * element:		#033
 * date:		18.03.19
 * 
 */
public class ElectricalResistance{
	
	public double Resistance(double r, double i){
		return r*i;
	}
	public double voltage(double u, double i) {
		return u/i;
	}
	public double electricity(double u, double r) {
		return u/r;
	}

}
