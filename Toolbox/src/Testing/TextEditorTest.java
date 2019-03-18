package Testing;

import Toolbox.TextEditor;

public class TextEditorTest {
	private TextEditor test = new TextEditor();
	
	public TextEditorTest() {
		this.textZaehlen();
	}
	
	public boolean textZaehlen() {
		String methodName = new Object() {}
	      .getClass()
	      .getEnclosingMethod()
	      .getName();
		System.out.println(methodName + "...");
		try {
			//OWN BEGIN
			int count = test.textZaehlen("Lorem ipsum ö hansli ä ! ? d asdmflkn Ü -. \r\r\n");
			if (count == 8) {
			//OWN END
				System.out.println("SUCCESS " + methodName);
				return true;
			}else {
				System.out.println("Should:" + 8 + "Actual:" + count);
				return false;
			}
		} catch (Exception e) {
			System.out.println("FAILURE, " + methodName + " " + e);
		}	
		
		System.out.println("FAILURE " + methodName);
		return false;
	}
}
