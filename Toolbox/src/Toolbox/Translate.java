/*
 * author:		Nikolas Kanakis
 * element:		Translate
 * date:		25.03.2019
 */
package Toolbox;

import java.io.IOException;

import com.darkprograms.speech.translator.GoogleTranslate;

public class Translate
{
	public String translate(String fromlang, String tolang, String text) {
		try 
		{
			String newText;
			newText = GoogleTranslate.translate(fromlang, tolang, text);
			return newText;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return null;	
	}
}
