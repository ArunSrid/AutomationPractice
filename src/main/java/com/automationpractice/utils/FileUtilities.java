package com.automationpractice.utils;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class FileUtilities {

	public static String fnGetCurrentUserDir() {
		String dir = System.getProperty("user.dir");
		dir = dir.replaceAll("\\\\", "/");

		return dir;
	}

	public static Properties fnGetPropertiesDetail(String strFileName) {
		Properties prop = new Properties();
		try {
			String dir = fnGetCurrentUserDir();
			strFileName = strFileName.replace(".properties", "");
			String strFilePath = dir + "/" + strFileName + ".properties";
			prop.load(new FileInputStream(strFilePath));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

	public static String fnGetConfigFileName() {
		String strConfigFile = "Default";
		try {
			String strTest = System.getProperty("configfile");
			if (strTest.equals("null") == false) {
				strConfigFile = strTest;
			}
		} catch (Exception e) {
		}
		return strConfigFile;
	}

	// Get current system time
	public static String GetCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}

	// Get current system time
	public static String GetCurrentDateStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");// dd/MM/yyyy
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}

}
