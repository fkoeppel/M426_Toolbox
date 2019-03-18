package Testing;

import Toolbox.Density;

public class DensityTest {
	
	public DensityTest() {
		this.testDensity();
	}
	
	public boolean testDensity() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Density den = new Density();
			double res = den.getDensity(36, 34);
			if (res == 1.0588235294117647) {
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
