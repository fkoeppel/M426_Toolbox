	/*
	 * author:		Kimi Janshon
	 * element:		011
	 * date:		1.04.19
	 * 
	 */

package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import Toolbox.Round;

public class RoundTest {
	private Round test = new Round();
	
	@Test
	public void testRound() {
		double test1, test2, test3;
		test1 = test.getStarted(4.5, "up", 1, 0.2);
		assertEquals(4.6, test1);
		
		test2 = test.getStarted(4.555, "down", 2, 0.3);
		assertEquals(4.533333333333333, test2);
		
		test3 = test.getStarted(5.465555555555, "up", 5, 0.5);
		assertEquals(5.4656, test3);
	}
}
