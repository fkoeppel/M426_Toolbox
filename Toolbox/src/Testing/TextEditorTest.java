package Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
	
	@Test
	public void loeschen() {
		String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
		String loeschen = "consetetur";
		String expected = "Lorem ipsum dolor sit amet, sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";
		assertEquals(expected, test.loeschen(text, loeschen, -1));
		assertEquals(expected, test.loeschen(text, loeschen, 1));
		assertNotEquals(expected, test.loeschen(text, loeschen, 0));
	}
	
	@Test
	public void zaehlen() {
		assertEquals(8, test.textZaehlen("Lorem ipsum ö hansli ä ! ? d asdmflkn Ü -. \r\r\n"));
	}
	
	@Test
	public void ersetzen() {
		String text = "Hallo meine Freunde!";
		String expected = "Moin deine Freunde!";
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Hallo", "Moin");
		map.put("meine", "deine");
		
		assertEquals(expected, test.textErsetzen(text, map));
	}
}
