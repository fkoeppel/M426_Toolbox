package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import Toolbox.GewichtsmasseUmwandeln;

public class GewichtsmasseUmwandelnTest {
	private GewichtsmasseUmwandeln test = new GewichtsmasseUmwandeln();
	
	@Test
	public void TestGrammtoKilogramm() {
		assertEquals(0.0173,test.GrammtoKilogramm(17.3));
	}
	
	@Test
	public void TestKilogrammtoGramm() {
		assertEquals(18200,test.KilogrammtoGramm(18.2));
	}
	
	@Test
	public void TestGrammtoTonne() {
		assertEquals(0.0000156,test.GrammtoTonne(15.6));
	}
	
	@Test
	public void TestTonnetoGramm() {
		assertEquals(1000000,test.TonnetoGramm(1));
	}
	
	@Test
	public void TestGrammtoPfund() {
		assertEquals(0.00220462,test.GrammtoPfund(1));
	}
	
	@Test
	public void TestPfundtoGramm() {
		assertEquals(453.592,test.PfundtoGramm(1));
	}
	
	@Test
	public void KilogrammtoTonne() {
		assertEquals(0.001,test.KilogrammtoTonne(1));
	}
	
	@Test
	public void TonnetoKilogramm() {
		assertEquals(1000,test.TonnetoKilogramm(1));
	}
	
	@Test
	public void KilogrammtoPfund() {
		assertEquals(-2.20462,test.KilogrammtoPfund(-1));
	}
	
	@Test
	public void PfundtoKilogramm() {
		assertEquals(0.453592,test.PfundtoKilogramm(1));
	}
	
	@Test
	public void TonnetoPfund() {
		assertEquals(2204.62,test.TonnetoPfund(1));
	}
	
	@Test
	public void PfundtoTonne() {
		assertEquals(0.000453592,test.PfundtoTonne(1));
	}
}
