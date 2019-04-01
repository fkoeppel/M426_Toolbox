package Testing;
import Toolbox.Translate;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;



public class TranslateTest {
	private Translate test = new Translate();
	
	@Test
	public void translate() 
	{
		assertEquals("guten tag griechenland", test.translate("el", "de", "καλημέρα ελλάδα"));
	}
}
