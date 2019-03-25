package Toolbox;

/*
 * author:		Manuel Häuptli
 * element:		037 & 039
 * date:		18.03.19
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

public class TextEditor {
	
	private LinkedList<String> umlaute;
	
	public TextEditor() {
		this.umlaute = new LinkedList<String>();
		umlaute.add("ä");
		umlaute.add("ö");
		umlaute.add("ü");
		umlaute.add("Ü");
		umlaute.add("Ä");
		umlaute.add("Ö");
	}
	
	public String textErsetzen(String text, HashMap<String, String> map) {
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entry = iterator.next();
	    	text = text.replaceAll(entry.getKey(), entry.getValue());
		}
		return text;
	}

	public int textZaehlen(String text) {
		LinkedList<String> list = new LinkedList<String>();
		LinkedList<String> validList = new LinkedList<String>();
		
		String[] words = splitTextIntoWords(text);
		createNotValidList(words, list);
		clearWordsArray(words);
		createValidList(list, validList);
		
		return validList.size();
	}

	private String[] splitTextIntoWords(String text) {
		String[] words = text.split(" ");
		return words;
	}

	private void createValidList(LinkedList<String> list, LinkedList<String> validList) {
		for (String word : list) {
			validateWord(validList, word);
		}
	}

	private void validateWord(LinkedList<String> validList, String word) {
		if(!isWordValid(word)) {
			String validWord = removeNotValidChar(word);
			if(!validWord.isEmpty()) {
				validList.add(validWord);
			}
		}else {
			validList.add(word);
		}
	}

	private void clearWordsArray(String[] words) {
		words = null;
	}

	private void createNotValidList(String[] words, LinkedList<String> list) {
		for (String string : words) {
			list.add(string);
		}
	}
	
	private String removeNotValidChar(String str) 
    { 
		String validWord = "";
        if (str.isEmpty()) { 
            return validWord; 
        } 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            validWord = createValidWord(validWord, ch); 
        } 
        return validWord; 
    }

	private String createValidWord(String validWord, char ch) {
		if (isCharValid(ch)) { 
			validWord = validWord + ch;
		}
		return validWord;
	}

	private boolean isCharValid(char ch) {
		return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || this.umlaute.contains(String.valueOf(ch));
	} 
	
	
	private boolean isWordValid(String str) 
    { 
        if (str.isEmpty()) { 
            return false; 
        } 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            if (!isCharValid(ch)) { 
                return false; 
            } 
        } 
        return true; 
    } 
	
}
