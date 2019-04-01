package Testing;
import Toolbox.mp4tomp3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class mp4tomp3Test {
	private mp4tomp3 test = new mp4tomp3();

	@Test
	public void mp4tomp3()
	{
		assertEquals(true, test.mp4tomp3rename("/home/bztadmin/Desktop/", "test"));
	}
	
	@Test
	public void mp3tomp4()
	{
		assertEquals(true, test.mp3tomp4rename("/home/bztadmin/Desktop/", "test"));
	}
}
