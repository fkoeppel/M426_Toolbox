package Testing;
/*
 * author:		Joe Tüscher
 * element:		#026
 * date:		18.03.19
 * 
 */
import Toolbox.SpeedCalc;

public class SpeedCalcTest {
	private SpeedCalc speedCalc = new SpeedCalc();
	
	public SpeedCalcTest(){
		this.wrongParamSpeedCalc();
		this.msToKmh();
		this.kmhToMs();
	}

	private boolean kmhToMs() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			String result = speedCalc.speed(3.6, "km/h");
			if (result.equals("1.0 m/s")) {
				System.out.println("SUCCESS " + methodName);
				return true;
			}
			
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}
		System.out.println("FAILURE " + methodName);
		return false;
	}

	private boolean wrongParamSpeedCalc() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			String result = speedCalc.speed(3.6, "asdf");
			if (result.equals("Wrong Input parameter")) {
				System.out.println("SUCCESS " + methodName);
				return true;
			}
			
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}
		System.out.println("FAILURE " + methodName);
		return false;
	}

	private boolean msToKmh() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			String result = speedCalc.speed(1, "m/s");
			if (result.equals("3.6 km/h")) {
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
