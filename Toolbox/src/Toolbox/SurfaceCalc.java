package Toolbox;
/*
 * author:		Joe Tüscher
 * element:		#028
 * date:		25.03.19
 * 
 */

public class SurfaceCalc {
	public String SurfaceCalculation(double value, String from, String to) {
		
		if(from.equals(to)) {
			return Double.toString(value);
		}
		switch(from) {
			case "mm^2":
				value = value/1000000;
				break;
				
			case "cm^2":
				value = value/10000;
				break;
				
			case "dm^2":
				value = value/100;
				break;
				
			case "m^2":
				break;
				
			case "a^2":
				value = value*100;
				break;
				
			case "ha^2":
				value = value*10000;
				break;
				
			case "km^2":
				value = value*1000000;
				break;
			default:
				return "Error: Wrong Parameter";
		}
		switch(to) {
			case "mm^2":
				value = value*1000000;
				break;
				
			case "cm^2":
				value = value*10000;
				break;
				
			case "dm^2":
				value = value*100;
				break;
				
			case "m^2":
				break;
				
			case "a^2":
				value = value/100;
				break;
				
			case "ha^2":
				value = value/10000;
				break;
				
			case "km^2":
				value = value/1000000;
				break;
			default:
				return "Error: Wrong Parameter";
		}
		return Double.toString(value);
	}
}
