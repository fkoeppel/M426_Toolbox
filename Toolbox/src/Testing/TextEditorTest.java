package Testing;

/*
 * author:		Manuel Häuptli
 * element:		037 & 039
 * date:		18.03.19
 * 
 */

import java.util.HashMap;

import Toolbox.TextEditor;

public class TextEditorTest {
	private TextEditor test = new TextEditor();
	
	public TextEditorTest() {
		this.textZaehlen();
		this.textErsetzen();
	}
	
	public boolean textZaehlen() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			int count = test.textZaehlen("Lorem ipsum ö hansli ä ! ? d asdmflkn Ü -. \r\r\n");
			if (count == 8) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}else {
				System.out.println("Should:" + 8 + "Actual:" + count);
				return false;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
	
	public boolean textErsetzen() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			String text = "Hallo meine Freunde!";
			String expected = "Moin deine Freunde!";
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("Hallo", "Moin");
			map.put("meine", "deine");
			
			if (test.textErsetzen(text, map).equals(expected)) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}else {
				System.out.println(test.textErsetzen(text, map));
				return false;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
}
