package com.quest.foglight.exportTools;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;

public class ZipTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws IllegalArgumentException, IOException {
		// TODO Auto-generated method stub
//ZipTool.zipDirectory("/home/smarx/bin", "/home/smarx/Desktop/bin.zip");
		String erg = "c:\\windows\\system";
		erg = erg.replace('\\', '/');
		//"d".replaceAll("\\", "/"); // need to fix this to be compliant with the ZIP Standart
		String src = "C:\\Users\\mpearce1\\AppData\\Local\\Temp\\Capacity-Planning-Reports_tmp_1292239957923";
		String target = src+"\\tester\\test";
		
		System.out.println("ERG:"+replaceDirPrefix(new File(src),"/",new File(target)));
	}
	private static String replaceDirPrefix(File dir, String prefix, File f) {
		String erg = f.getPath().replaceAll((dir.getPath()), prefix);
	
		erg = erg.replace('\\', '/'); 
		//erg = erg.replaceAll("\\", "/"); // need to fix this to be compliant with the ZIP Standart 
		
		return erg;
	}
}
