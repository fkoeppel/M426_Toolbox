package Toolbox;
/*
 * author:		Joe Tüscher
 * element:		#017
 * date:		25.03.19
 * 
 */

import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageConverter {

	public void PngToJpg(String path) {
		 try {
	            File input = new File(path);
	            String desPath = path.substring(0, path.length()-4) + "Result.jpg";
	            File output = new File(desPath);
	            BufferedImage image = ImageIO.read(input);
	            BufferedImage result = new BufferedImage(
	                    image.getWidth(),
	                    image.getHeight(),
	                    BufferedImage.TYPE_INT_RGB);
	            result.createGraphics().drawImage(image, 0, 0, Color.WHITE, null);
	            ImageIO.write(result, "jpg", output);

	        }  catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	public void JpgToPng(String path) {
		try {
			 
		      File file = new File(path);
		      BufferedImage bi = ImageIO.read(file);
		      path = path.substring(0, path.length()-4) + "Result.png";
		      
		      ImageIO.write(bi, "png", new File(path));
		 
		    } catch (IOException e) {
		      System.out.println("Exception occured :" + e.getMessage());
		    }
	}
}
