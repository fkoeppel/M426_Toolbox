package Testing;
import Toolbox.TriangleCalc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangleCalcTest {
	private TriangleCalc test = new TriangleCalc();
	
	@Test
	public void TriangleGleichSeitigUmfangTest() {
		assertEquals(18, test.TriangleGleichSeitigUmfang(6));
	}
	
	@Test
	public void TriangleGleichSeitigFlaecheTest() {
		assertEquals(43,test.TriangleGleichSeitigFlaeche(10));
	}
	
	@Test
	public void Triangle2SeitenWinkelTest() {
		assertEquals(39,test.Triangle2SeitenWinkel(15, 14, 22));
	}
}
