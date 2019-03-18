package Toolbox;

/*
 * author:		Kimi Janshon
 * element:		022
 * date:		18.03.19
 * 
 */

public class Length {
	private double length;
	private String from;
	private String to;
	public Length(double length, String from, String to) {
		this.length = length;
		this.from = from;
		this.to = to;
	}
	
	public double getStarted() {
		double res;
		switch (this.from) {
		case "meter":
			res = this.meter(this.to);
			break;
		
		case "mile":
			res = this.mile(this.to);
			break;
			
		case "feet":
			res = this.feet(this.to);
			break;
			
		case "inche":
			res = this.inche(this.to);
			break;

		default:
			res = -1.0;
			break;
		}
		return res;
	}
	
	private double meter(String to) {
		switch (to) {
		case "mile":
			return this.length/1609.344;
		case "feet":
			return this.length*3.281;
		case "inche":
			return this.length*39.37;
		default:
			return -1.0;
		}
	}
	private double mile(String to) {
		switch (to) {
		case "meter":
			return this.length*1609.344;
		case "feet":
			return this.length*5280;
		case "inche":
			return this.length*63360;
		default:
			return -1.0;
		}
	}
	private double feet(String to) {
		switch (to) {
		case "meter":
			return this.length/3.281;
		case "mile":
			return this.length/5280;
		case "inche":
			return this.length*12;
		default:
			return -1.0;
		}
	}
	private double inche(String to) {
		switch (to) {
		case "meter":
			return this.length/39.37;
		case "mile":
			return this.length/63360;
		case "feet":
			return this.length/12;
		default:
			return -1.0;
		}
	}
}
