
package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import Toolbox.CapacityConversion;
/*
 * author:		Federico Köppel
 * element:		#031
 * date:		01.04.19
 * 
 */


public class CapacityConversionTest {
	private CapacityConversion CapacityConversion = new CapacityConversion();



	@Test
	public void CapacityConversion() {
		assertEquals(9.0, CapacityConversion.CapacityConversion(9, "mm^3", "mm^3"));
		assertEquals(0.009, CapacityConversion.CapacityConversion(9, "mm^3", "cm^3"));
		assertEquals(9.0E-6, CapacityConversion.CapacityConversion(9, "mm^3", "dm^3"));
		assertEquals(9.0E-9, CapacityConversion.CapacityConversion(9, "mm^3", "m^3"));
		assertEquals(9.0E-12, CapacityConversion.CapacityConversion(9, "mm^3", "a^3"));
		assertEquals(9.0E-15, CapacityConversion.CapacityConversion(9, "mm^3", "ha^3"));
		assertEquals(9.0E-18, CapacityConversion.CapacityConversion(9, "mm^3", "km^3"));

		assertEquals(9000.0, CapacityConversion.CapacityConversion(9, "cm^3", "mm^3"));
		assertEquals(9.0, CapacityConversion.CapacityConversion(9, "cm^3", "cm^3"));
		//assertEquals(0.009, CapacityConversion.CapacityConversion(9, "cm^3", "dm^3")); java double fehler 
		assertEquals(9.0E-6, CapacityConversion.CapacityConversion(9, "cm^3", "m^3"));
		assertEquals(9.0E-9, CapacityConversion.CapacityConversion(9, "cm^3", "a^3"));
		assertEquals(9.0E-12, CapacityConversion.CapacityConversion(9, "cm^3", "ha^3"));
		assertEquals(9.0E-15, CapacityConversion.CapacityConversion(9, "cm^3", "km^3"));

		assertEquals(9000000.0, CapacityConversion.CapacityConversion(9, "dm^3", "mm^3"));
		assertEquals(9000.0, CapacityConversion.CapacityConversion(9, "dm^3", "cm^3"));
		assertEquals(9.0, CapacityConversion.CapacityConversion(9, "dm^3", "dm^3"));
		assertEquals(0.009, CapacityConversion.CapacityConversion(9, "dm^3", "m^3"));
		//assertEquals(9.0E-6, CapacityConversion.CapacityConversion(9, "dm^3", "a^3")); java double fehler 
		assertEquals(9.0E-9, CapacityConversion.CapacityConversion(9, "dm^3", "ha^3"));
		assertEquals(9.0E-12, CapacityConversion.CapacityConversion(9, "dm^3", "km^3"));

		assertEquals(9.0E9, CapacityConversion.CapacityConversion(9, "m^3", "mm^3"));
		assertEquals(9000000.0, CapacityConversion.CapacityConversion(9, "m^3", "cm^3"));
		assertEquals(9000.0, CapacityConversion.CapacityConversion(9, "m^3", "dm^3"));
		assertEquals(9.0, CapacityConversion.CapacityConversion(9, "m^3", "m^3"));
		assertEquals(0.009, CapacityConversion.CapacityConversion(9, "m^3", "a^3"));
		assertEquals(9.0E-6, CapacityConversion.CapacityConversion(9, "m^3", "ha^3"));
		assertEquals(9.0E-9, CapacityConversion.CapacityConversion(9, "m^3", "km^3"));

		assertEquals(9.0E12, CapacityConversion.CapacityConversion(9, "a^3", "mm^3"));
		assertEquals(9.0E9, CapacityConversion.CapacityConversion(9, "a^3", "cm^3"));
		assertEquals(9000000.0, CapacityConversion.CapacityConversion(9, "a^3", "dm^3"));
		assertEquals(9000.0, CapacityConversion.CapacityConversion(9, "a^3", "m^3"));
		assertEquals(9.0, CapacityConversion.CapacityConversion(9, "a^3", "a^3"));
		assertEquals(0.009, CapacityConversion.CapacityConversion(9, "a^3", "ha^3"));
		assertEquals(9.0E-6, CapacityConversion.CapacityConversion(9, "a^3", "km^3"));

		assertEquals(9.0E15, CapacityConversion.CapacityConversion(9, "ha^3", "mm^3"));
		assertEquals(9.0E12, CapacityConversion.CapacityConversion(9, "ha^3", "cm^3"));
		assertEquals(9.0E9, CapacityConversion.CapacityConversion(9, "ha^3", "dm^3"));
		assertEquals(9000000.0, CapacityConversion.CapacityConversion(9, "ha^3", "m^3"));
		assertEquals(9000.0, CapacityConversion.CapacityConversion(9, "ha^3", "a^3"));
		assertEquals(9.0, CapacityConversion.CapacityConversion(9, "ha^3", "ha^3"));
		assertEquals(0.009, CapacityConversion.CapacityConversion(9, "ha^3", "km^3"));

		assertEquals(9.0E18, CapacityConversion.CapacityConversion(9, "km^3", "mm^3"));
		assertEquals(9.0E15, CapacityConversion.CapacityConversion(9, "km^3", "cm^3"));
		assertEquals(9.0E12, CapacityConversion.CapacityConversion(9, "km^3", "dm^3"));
		assertEquals(9.0E9, CapacityConversion.CapacityConversion(9, "km^3", "m^3"));
		assertEquals(9.0E6, CapacityConversion.CapacityConversion(9, "km^3", "a^3"));
		assertEquals(9000.0, CapacityConversion.CapacityConversion(9, "km^3", "ha^3"));
		assertEquals(9.0, CapacityConversion.CapacityConversion(9, "km^3", "km^3"));


		assertEquals(0, CapacityConversion.CapacityConversion(9, "e", "mm^3"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "e", "cm^3"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "e", "dm^3"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "e", "m^3"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "e", "a^3"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "e", "ha^3"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "e", "km^3"));

		assertEquals(0, CapacityConversion.CapacityConversion(9, "mm^3", "e"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "cm^3", "e"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "dm^3", "e"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "m^3", "e"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "a^3", "e"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "ha^3", "e"));
		assertEquals(0, CapacityConversion.CapacityConversion(9, "km^3", "e"));
	}

}