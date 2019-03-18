package Toolbox;
/*
 * author:		Joe Tüscher
 * element:		#026
 * date:		18.03.19
 * 
 */
public class SpeedCalc {
	
	public String speed(double value, String ending) {
		
		if(ending.equals("km/h")) {
			return Double.toString(value/3.6) + " m/s";
		}else if(ending.equals("m/s")) {
			return Double.toString(value*3.6) + " km/h";
		}
		return "Wrong Input parameter";
	}

}
