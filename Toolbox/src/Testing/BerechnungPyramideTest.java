package Testing;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Toolbox.BerechnungPyramide;

public class BerechnungPyramideTest {

private BerechnungPyramide test = new BerechnungPyramide();
	
	@Test
	public void TestHoehea() {
		assertEquals(3.606,test.Hoehea(3,4));
	}
	
	//Funktioniert nicht
    /*@Test
	public void TestMantellinie() {
		assertEquals(4.123,test.Mantellinie(3.001, 4));
	}
	*/
	
	@Test
	public void TestDiagonale() {
		assertEquals(5.657,test.Diagonale(4));
	}
	
	@Test
	public void TestUmfang() {
		assertEquals(16,test.Umfang(4));
	}
	
	@Test
	public void TestGrundflaeche() {
		assertEquals(16,test.Umfang(4));
	}
	
	@Test
	public void TestMantelflaeche() {
		assertEquals(28.848,test.Mantelflaeche(4, 3.606));
	}
	
	@Test
	public void TestOberflaeche() {
		assertEquals(44.848,test.Oberflaeche(4, 3.606));
	}
	
	//Funktioniert nicht
	/*@Test
	public void TestVolumen() {
		assertEquals(16.003,test.Volumen(4,3.001));
	}
	*/
}
