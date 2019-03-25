package Testing;

import static org.junit.Assert.assertEquals;

/*
 * author:		Manuel Häuptli
 * element:		037 & 039
 * date:		18.03.19
 * 
 */

import java.util.HashMap;
import java.util.LinkedList;

import org.junit.Test;
import Toolbox.TextEditor;

public class TextEditorTest {
	private TextEditor test = new TextEditor();
	
	@Test
	public void suchen() {
		String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
		String suche = "consetetur";
		LinkedList<String> expected = new LinkedList<String>();
		expected.add("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.");
		expected.add("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.");
		assertEquals(expected, test.suchen(text,suche));
	}
	
	public boolean zaehlen() {
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
	
	public boolean ersetzen() {
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
