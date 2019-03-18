package Testing;

import Toolbox.ElectricalResistance;

public class ElectricalResistanceTest {
	private ElectricalResistance ElectricalRes = new ElectricalResistance();
	
	public ElectricalResistanceTest(){
		this.testResistance();
		this.testVoltage();
		this.testElectricity();
	}

	private boolean testResistance() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			double i = 10;
			double r = 0.5;
			
			//Resistance Test
			double result = ElectricalRes.Resistance(r, i);
			if (result == 5.0) {
				System.out.println("SUCCESS " + methodName);
				return true;
			}
			
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	private boolean testVoltage() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			double u = 5;
			double i = 10;
			
			//Voltage Test
			double result= ElectricalRes.voltage(u, i);
			if (result == 0.5) {
				System.out.println("SUCCESS " + methodName);
				return true;
			}
			
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	private boolean testElectricity() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			double u = 5;
			double r = 0.5;
			
			//Voltage Test
			double result= ElectricalRes.electricity(u, r);
			if (result == 10.0) {
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
