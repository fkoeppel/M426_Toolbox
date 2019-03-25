package Testing;

import Toolbox.Pythagoras;
public class PythagorasTest {

	public PythagorasTest() {
		this.testAandB();
		this.testAandC();
		
	}
	
	public boolean testAandB() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Pythagoras py = new Pythagoras();
			double res = py.getOtherNumber(3, "a", 4, "b");
			if (res == 5) {
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
	
	public boolean testAandC() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			Pythagoras py = new Pythagoras();
			double res = py.getOtherNumber(4, "a", 5, "c");
			if (res == 3) {
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
