package Toolbox;

import java.io.File;

public class mp4tomp3
{
	
	public Boolean mp4tomp3rename(String pfilepath, String pfilename) 
    {
    	File file = new File(pfilepath + pfilename + ".mp4");
    	file.renameTo(new File(pfilepath + pfilename +".mp3"));
    	return true;        
    }
	
	public Boolean mp3tomp4rename(String pfilepath, String pfilename) 
    {
    	File file = new File(pfilepath + pfilename + ".mp3");
    	file.renameTo(new File(pfilepath + pfilename +".mp4"));
    	return true;        
    }
}
