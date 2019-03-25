package Testing;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


/*
 * author:		Joe Tüscher
 * element:		#017
 * date:		25.03.19
 * 
 */
import	Toolbox.ImageConverter;

public class ImageConverterTest {
	private ImageConverter imageConverter = new ImageConverter();
	
	@Test
	public void pngToJpg() {
		String path = "src/Testing/img/TestImage.png";
		String path2 = "src/Testing/img/TestImage.jpg";
		imageConverter.PngToJpg(path);
		imageConverter.JpgToPng(path2);
		String desPath = path.substring(0, path.length()-4) + "Result.jpg";
		String desPath2 = path.substring(0, path2.length()-4) + "Result.png";

		File file = new File(desPath);
		File file2 = new File(desPath2);
		
		boolean success = false;
		if(file.exists() && file2.exists()) {
			success = true;
		}else {
			success = false;
		}
		assertEquals("true", Boolean.toString(success));
				
	}
	
}
