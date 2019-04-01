package Testing;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import Toolbox.SurfaceCalc;
/*
 * author:		Joe Tüscher
 * element:		#026
 * date:		18.03.19
 * 
 */


public class SurfaceCalcTest {
	private SurfaceCalc SurfaceCalc = new SurfaceCalc();
	
	@Test
	public void SurfaceCalc() {
		assertEquals("9.0", SurfaceCalc.SurfaceCalculation(9, "mm^2", "mm^2"));
		assertEquals("0.09", SurfaceCalc.SurfaceCalculation(9, "mm^2", "cm^2"));
		assertEquals("9.0E-4", SurfaceCalc.SurfaceCalculation(9, "mm^2", "dm^2"));
		assertEquals("9.0E-6", SurfaceCalc.SurfaceCalculation(9, "mm^2", "m^2"));
		assertEquals("9.0E-8", SurfaceCalc.SurfaceCalculation(9, "mm^2", "a^2"));
		assertEquals("9.0E-10", SurfaceCalc.SurfaceCalculation(9, "mm^2", "ha^2"));
		assertEquals("9.0E-12", SurfaceCalc.SurfaceCalculation(9, "mm^2", "km^2"));
		
		assertEquals("900.0", SurfaceCalc.SurfaceCalculation(9, "cm^2", "mm^2"));
		assertEquals("9.0", SurfaceCalc.SurfaceCalculation(9, "cm^2", "cm^2"));
		assertEquals("0.09", SurfaceCalc.SurfaceCalculation(9, "cm^2", "dm^2"));
		assertEquals("9.0E-4", SurfaceCalc.SurfaceCalculation(9, "cm^2", "m^2"));
		assertEquals("9.0E-6", SurfaceCalc.SurfaceCalculation(9, "cm^2", "a^2"));
		assertEquals("9.0E-8", SurfaceCalc.SurfaceCalculation(9, "cm^2", "ha^2"));
		assertEquals("9.0E-10", SurfaceCalc.SurfaceCalculation(9, "cm^2", "km^2"));
		
		assertEquals("90000.0", SurfaceCalc.SurfaceCalculation(9, "dm^2", "mm^2"));
		assertEquals("900.0", SurfaceCalc.SurfaceCalculation(9, "dm^2", "cm^2"));
		assertEquals("9.0", SurfaceCalc.SurfaceCalculation(9, "dm^2", "dm^2"));
		assertEquals("0.09", SurfaceCalc.SurfaceCalculation(9, "dm^2", "m^2"));
		assertEquals("9.0E-4", SurfaceCalc.SurfaceCalculation(9, "dm^2", "a^2"));
		assertEquals("9.0E-6", SurfaceCalc.SurfaceCalculation(9, "dm^2", "ha^2"));
		assertEquals("9.0E-8", SurfaceCalc.SurfaceCalculation(9, "dm^2", "km^2"));
		
		assertEquals("9000000.0", SurfaceCalc.SurfaceCalculation(9, "m^2", "mm^2"));
		assertEquals("90000.0", SurfaceCalc.SurfaceCalculation(9, "m^2", "cm^2"));
		assertEquals("900.0", SurfaceCalc.SurfaceCalculation(9, "m^2", "dm^2"));
		assertEquals("9.0", SurfaceCalc.SurfaceCalculation(9, "m^2", "m^2"));
		assertEquals("0.09", SurfaceCalc.SurfaceCalculation(9, "m^2", "a^2"));
		assertEquals("9.0E-4", SurfaceCalc.SurfaceCalculation(9, "m^2", "ha^2"));
		assertEquals("9.0E-6", SurfaceCalc.SurfaceCalculation(9, "m^2", "km^2"));
		
		assertEquals("9.0E8", SurfaceCalc.SurfaceCalculation(9, "a^2", "mm^2"));
		assertEquals("9000000.0", SurfaceCalc.SurfaceCalculation(9, "a^2", "cm^2"));
		assertEquals("90000.0", SurfaceCalc.SurfaceCalculation(9, "a^2", "dm^2"));
		assertEquals("900.0", SurfaceCalc.SurfaceCalculation(9, "a^2", "m^2"));
		assertEquals("9.0", SurfaceCalc.SurfaceCalculation(9, "a^2", "a^2"));
		assertEquals("0.09", SurfaceCalc.SurfaceCalculation(9, "a^2", "ha^2"));
		assertEquals("9.0E-4", SurfaceCalc.SurfaceCalculation(9, "a^2", "km^2"));
		
		assertEquals("9.0E10", SurfaceCalc.SurfaceCalculation(9, "ha^2", "mm^2"));
		assertEquals("9.0E8", SurfaceCalc.SurfaceCalculation(9, "ha^2", "cm^2"));
		assertEquals("9000000.0", SurfaceCalc.SurfaceCalculation(9, "ha^2", "dm^2"));
		assertEquals("90000.0", SurfaceCalc.SurfaceCalculation(9, "ha^2", "m^2"));
		assertEquals("900.0", SurfaceCalc.SurfaceCalculation(9, "ha^2", "a^2"));
		assertEquals("9.0", SurfaceCalc.SurfaceCalculation(9, "ha^2", "ha^2"));
		assertEquals("0.09", SurfaceCalc.SurfaceCalculation(9, "ha^2", "km^2"));
		
		assertEquals("9.0E12", SurfaceCalc.SurfaceCalculation(9, "km^2", "mm^2"));
		assertEquals("9.0E10", SurfaceCalc.SurfaceCalculation(9, "km^2", "cm^2"));
		assertEquals("9.0E8", SurfaceCalc.SurfaceCalculation(9, "km^2", "dm^2"));
		assertEquals("9000000.0", SurfaceCalc.SurfaceCalculation(9, "km^2", "m^2"));
		assertEquals("90000.0", SurfaceCalc.SurfaceCalculation(9, "km^2", "a^2"));
		assertEquals("900.0", SurfaceCalc.SurfaceCalculation(9, "km^2", "ha^2"));
		assertEquals("9.0", SurfaceCalc.SurfaceCalculation(9, "km^2", "km^2"));
		
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "e", "mm^2"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "e", "cm^2"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "e", "dm^2"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "e", "m^2"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "e", "a^2"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "e", "ha^2"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "e", "km^2"));
		
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "mm^2", "e"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "cm^2", "e"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "dm^2", "e"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "m^2", "e"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "a^2", "e"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "ha^2", "e"));
		assertEquals("Error: Wrong Parameter", SurfaceCalc.SurfaceCalculation(9, "km^2", "e"));
	}
}
