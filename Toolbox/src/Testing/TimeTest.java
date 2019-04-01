	/*
	 * author:		Kimi Janshon
	 * element:		032
	 * date:		1.04.19
	 * 
	 */

package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import Toolbox.Time;

public class TimeTest {
	private Time test = new Time();
	
	@Test
	public void testRound() {
		double test1, test2, test3;
		test1 = test.getStarted(1, "y", "s");
		assertEquals(3.1536E7, test1);
		
		test2 = test.getStarted(3, "m", "y");
		assertEquals(0.25, test2);
		
		test3 = test.getStarted(1, "w", "min");
		assertEquals(10080, test3);
	}
}
