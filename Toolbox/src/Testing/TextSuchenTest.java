package Testing;

import Toolbox.TextSuchen;

public class TextSuchenTest {
	private TextSuchen test = new TextSuchen();
	
	public TextSuchenTest() {
		this.testSuchen();
	}
	
	public boolean testSuchen() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			String s = test.suchen("Hello", "World");
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
