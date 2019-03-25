package Testing;
import Toolbox.CircleCalc;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;



public class CircleCalcTest {
	private CircleCalc test = new CircleCalc();
	
	public CircleCalcTest(){
		this.CircleAreaTest();
	}

	@Test
	public void CircleAreaTest() {
		assertEquals(706.85, test.CircleArea(15.0), 706.85);
		
	}
	
	@Test
	public void CircleCircumferenceTest() {
		assertEquals(94.25, test.CircleCircumference(15.0), 94.25);
	}
	


}
