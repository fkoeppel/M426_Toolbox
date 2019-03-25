package Toolbox;
/*
 * author:		Federico Degan
 * element:		#020
 * date:		25.03.19
 * 
 */

public class CircleCalc {
	
	public double CircleArea(double radius) {
		if(radius > 0) {
			return Math.pow(radius, 2) * Math.PI;
		}
		else
			System.out.println("Bad Data");
		return 0;
	}
	public double CircleCircumference(double radius) {
		if(radius > 0) {
			return radius * Math.PI * 2;
		}
		else
			System.out.println("Bad Data");
		return 0;
	}

}
