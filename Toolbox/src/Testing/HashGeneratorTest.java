package Testing;

import Toolbox.HashGenerator;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

/*
 * author:		Federico Köppel
 * element:		041
 * date:		25.03.19
 * 
 */


public class HashGeneratorTest {
	private HashGenerator test = new HashGenerator();


	@Test
	public void testHashGeneratedSaltGenerator() {
		assertNotEquals("a383bd590d65753748212f339840ad25c1f75d19fa39d6bc364f7721b1dbfe42", test.hash("federico", 0));
	}
	
	@Test
	public void testHashGivenSaltGenerator() {
		assertEquals("a383bd590d65753748212f339840ad25c1f75d19fa39d6bc364f7721b1dbfe42", test.hash("federico", 5));
	}

}
