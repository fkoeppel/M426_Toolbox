/*
 * author:		Kimi Janshon
 * element:		023
 * date:		25.03.19
 * 
 */

package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import Toolbox.MetricUnit;

public class MetricUnitTest {
	private MetricUnit test = new MetricUnit();
	
	@Test
	public void testMetricUnit() {
		double test1, test2;
		test1 = test.getStartedScientific(2, 18, -18);
		assertEquals(2.0E-36, test1);
		
		test2 = test.getStartedSymbol(-2, "E", "a");
		assertEquals(-2.0E-36, test2);
	}
}

