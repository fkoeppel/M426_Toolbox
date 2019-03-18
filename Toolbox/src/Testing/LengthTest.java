/*
 * author:		Kimi Janshon
 * element:		022
 * date:		18.03.19
 * 
 */
package Testing;

import Toolbox.Length;

public class LengthTest {
	public LengthTest() {
		this.meterToMile();
		this.meterToFeet();
		this.meterToInche();
		this.mileToMeter();
		this.mileToFeet();
		this.mileToInche();
		this.feetToMeter();
		this.feetToMile();
		this.feetToInche();
		this.incheToMeter();
		this.incheToMile();
		this.incheToFeet();
	}
	
	public boolean meterToMile() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "meter", "mile");
			double res = leng.getStarted();
			if (res == 0.0074564543068480075) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	public boolean meterToFeet() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "meter", "feet");
			double res = leng.getStarted();
			if (res == 39.372) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	public boolean meterToInche() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "meter", "inche");
			double res = leng.getStarted();
			if (res == 472.43999999999994) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	public boolean mileToMeter() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "mile", "meter");
			double res = leng.getStarted();
			if (res == 19312.128) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	public boolean mileToFeet() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "mile", "feet");
			double res = leng.getStarted();
			if (res == 63360.0) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	public boolean mileToInche() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "mile", "inche");
			double res = leng.getStarted();
			if (res == 760320.0) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	public boolean feetToMeter() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "feet", "meter");
			double res = leng.getStarted();
			if (res == 3.65742151782993) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	public boolean feetToMile() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "feet", "mile");
			double res = leng.getStarted();
			if (res == 0.0022727272727272726) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	public boolean feetToInche() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "feet", "inche");
			double res = leng.getStarted();
			if (res == 144.0) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	public boolean incheToMeter() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "inche", "meter");
			double res = leng.getStarted();
			if (res == 0.30480060960121924) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	public boolean incheToMile() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "inche", "mile");
			double res = leng.getStarted();
			if (res == 1.893939393939394E-4) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	public boolean incheToFeet() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Length leng = new Length(12, "inche", "feet");
			double res = leng.getStarted();
			if (res == 1.0) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
}
