package com.automationpractice.configdetails;

import com.automationpractice.utils.*;
import com.automationpractice.helper.*;

import java.lang.reflect.Field;
import java.util.Properties;

import org.testng.Assert;

public class ConfigDetails

{

	public static String browser = Constants.CHROME_TEXT;
	public static String enableScreenShotForAllStep = "false";

	public static Properties prop = FileUtilities.fnGetPropertiesDetail(FileUtilities.fnGetConfigFileName());

	public static void setConfigDetails() {
		try {
			browser = fnGetPropertiesFileDetails(Constants.BROWSER);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	public static String fnGetPropertiesFileDetails(String strPropertyName) {
		String strData = null;
		try {

			if (System.getProperty(strPropertyName) != null) {
				strData = System.getProperty(strPropertyName);
				// We can change to loggers here
				System.out.println("property set from Maven call: " + strPropertyName + " is :" + strData);

			} else if (System.getenv(strPropertyName) != null) {
				strData = System.getenv(strPropertyName);

				System.out.println("property set as environment variable: " + strPropertyName + " is :" + strData);
			} else if (prop.getProperty(strPropertyName) != null) {
				strData = prop.getProperty(strPropertyName);
				System.out.println("property set in Default.properties file: " + strPropertyName + " is :" + strData);

			} else {
				ConfigDetails configs = new ConfigDetails();
				Field field = ConfigDetails.class.getField(strPropertyName);
				if (field.getType().toString().equals("class java.lang.String"))
					strData = (String) field.get(configs);
				System.out
						.println("default value set ConfigDetails class: " + "" + strPropertyName + " is :" + strData);

			}

		} catch (Exception e) {
			Assert.fail();
		}
		return strData;
	}
}
