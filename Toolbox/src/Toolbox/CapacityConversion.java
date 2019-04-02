package Toolbox;

/*
 * author:		Federico Köppel
 * element:		031
 * date:		01.04.19
 * 
 */

public class CapacityConversion {


	public double CapacityConversion(double value, String from, String to) {

		if(from.equals(to)) {
			return value;
		}
		switch(from) {
		case "mm^3":
			value = value/1000000000;
			break;

		case "cm^3":
			value = value/1000000;
			break;

		case "dm^3":
			value = value/1000;
			break;

		case "m^3":
			break;

		case "a^3":
			value = value*1000;
			break;

		case "ha^3":
			value = value*1000000;
			break;

		case "km^3":
			value = value*1000000000;
			break;
		default:
			System.out.println("bad data" + getClass());
			return 0;
		}
		switch(to) {
		case "mm^3":
			value = value*1000000000;
			break;

		case "cm^3":
			value = value*1000000;
			break;

		case "dm^3":
			value = value*1000;
			break;

		case "m^3":
			break;

		case "a^3":
			value = value/1000;
			break;

		case "ha^3":
			value = value/1000000;
			break;

		case "km^3":
			value = value/1000000000;
			break;
		default:
			System.out.println("bad data" + getClass());
			return 0;
		}
		return value;




	}
}
