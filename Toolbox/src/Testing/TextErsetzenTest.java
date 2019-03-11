package Testing;

import Toolbox.TextErsetzen;

public class TextErsetzenTest {
	
	private TextErsetzen test = new TextErsetzen();
	
	public TextErsetzenTest() {
		this.testErsetzen();
	}
	
	public boolean testErsetzen() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			String s = test.ersetzen("Hello", "World");
			if (s.equals("Hello World")) {
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
