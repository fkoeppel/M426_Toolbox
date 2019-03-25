package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import Toolbox.Density;

public class DensityTest {
	
	public DensityTest() {
		this.testDensity();
	}
	
	@Test
	public void testDensity() {
		Density den = new Density();
		assertEquals(1.0588235294117647, den.getDensity(36, 34));
	}
}
