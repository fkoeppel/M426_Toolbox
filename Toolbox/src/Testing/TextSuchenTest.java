package Testing;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import Toolbox.TextSuchen;

public class TextSuchenTest {
	private TextSuchen test = new TextSuchen();
	
	public TextSuchenTest() {
		this.testSuchen();
	}
	
	@Test
	public void testSuchen() {
		assertEquals("", test.suchen("Hello", "World"), "Hello World");
	}
}
