package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import Toolbox.TextSuchen;

public class TextSuchenTest {
	private TextSuchen test = new TextSuchen();
	
	@Test
	public void testSuchen() {
		assertEquals("Hello World", test.suchen("Hello", "World"));
	}
}
