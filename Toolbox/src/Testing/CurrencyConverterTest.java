/*
 * author:		Kimi Janshon
 * element:		024
 * date:		25.03.19
 * 
 */

package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import Toolbox.CurrencyConverter;

public class CurrencyConverterTest {
	private CurrencyConverter test = new CurrencyConverter();
	
	@Test
	public void testCurrency() {
		double test1, test2, test3, test4;
		test1 = this.test.getCurrency(20, "chf", "eur");
		assertEquals(17.8, test1);
		
		test2 = this.test.getCurrency(20, "achf", "eur");
		assertEquals(-1.0, test2);
		
		test3 = this.test.getCurrency(20, "chf", "esdfur");
		assertEquals(-1.0, test3);
		
		test4 = this.test.getCurrency(20, "eur", "chf");
		assertEquals(22.4, test4);
	}
}
