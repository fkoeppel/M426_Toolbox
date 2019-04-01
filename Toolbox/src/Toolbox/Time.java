/*
 * author:		Kimi Janshon
 * element:		032
 * date:		1.04.19
 * 
 */

package Toolbox;

public class Time {
	private String to;
	private double number;
	
	// 1 Year contains 12 Months 
	// 1 Year contains 365 Days
	// 1 Month contains 4 Weeks
	// 1 Month contains 30 Days
	// 1 Week contains 7 Days
	// 1 Day contains 24 Hours
	// 1 Hour contains 60 Minutes
	// 1 Minutes contains 60 Seconds
	
	//From Or To Params are: y (year), m (month), w (week), d (day), h (hour), min (minute), s (second)
	public double getStarted(double number, String from, String to) {
		if (number < 0) {
			return 0.0;
		}
		if (from.equals(to)) {
			return number;
		}
		this.to = to;
		this.number = number;
		switch (from) {
		case "y":
			return this.year();
		case "m":
			return this.month();
		case "w":
			return this.week();
		case "d":
			return this.day();
		case "h":
			return this.hour();
		case "min":
			return this.minute();
		case "s":
			return this.second();
		default:
			return 0;
		}
	}
	
	private double year() {
		switch (this.to) {
		case "s":
			return this.number*365*24*60*60;
		case "min":
			return this.number*365*24*60;
		case "h":
			return this.number*365*24;
		case "d":
			return this.number*365;
		case "w":
			return this.number*52;
		case "m":
			return this.number*12;
		default:
			return 0;
		}
	};
	
	private double month() {
		switch (this.to) {
		case "s":
			return this.number*30*24*60*60;
		case "min":
			return this.number*30*24*60;
		case "h":
			return this.number*30*24;
		case "d":
			return this.number*30;
		case "w":
			return this.number*4;
		case "y":
			return this.number/12;
		default:
			return 0;
		}
	};
	
	private double week() {
		switch (this.to) {
		case "s":
			return this.number*7*24*60*60;
		case "min":
			return this.number*7*24*60;
		case "h":
			return this.number*7*24;
		case "d":
			return this.number*7;
		case "m":
			return this.number/4;
		case "y":
			return this.number/52;
		default:
			return 0;
		}
	};
	
	private double day() {
		switch (this.to) {
		case "s":
			return this.number*24*60*60;
		case "min":
			return this.number*24*60;
		case "h":
			return this.number*24;
		case "w":
			return this.number/7;
		case "m":
			return this.number/7/4;
		case "y":
			return this.number/365;
		default:
			return 0;
		}
	};
	
	private double hour() {
		switch (this.to) {
		case "s":
			return this.number*60*60;
		case "min":
			return this.number*60;
		case "d":
			return this.number/24;
		case "w":
			return this.number/24/7;
		case "m":
			return this.number/24/7/4;
		case "y":
			return this.number/24/365;
		default:
			return 0;
		}
	};

	
	private double minute() {
		switch (this.to) {
		case "s":
			return this.number*60;
		case "h":
			return this.number/60;
		case "d":
			return this.number/60/24;
		case "w":
			return this.number/60/24/7;
		case "m":
			return this.number/60/24/7/4;
		case "y":
			return this.number/60/24/365;
		default:
			return 0;
		}
	};
	
	private double second() {
		switch (this.to) {
		case "min":
			return this.number/60;
		case "h":
			return this.number/60/60;
		case "d":
			return this.number/60/60/24;
		case "w":
			return this.number/60/60/24/7;
		case "m":
			return this.number/60/60/24/7/4;
		case "y":
			return this.number/60/60/24/365;
		default:
			return 0;
		}
	};
	
}
