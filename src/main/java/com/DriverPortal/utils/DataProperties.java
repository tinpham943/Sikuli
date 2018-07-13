package com.DriverPortal.utils;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class DataProperties {

	private static Properties PROPERTIES;

	static {
		PROPERTIES = new Properties();
		URL props = ClassLoader.getSystemResource("data.properties");
		try {
			PROPERTIES.load(props.openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return PROPERTIES.getProperty(key);
	}
	
	public static String get(String key) {
		//just to use short name
		return getProperty(key);
	}	

	public static String getPathFor(String file) {
		// Using substring for full path to remove first slash.
		// Sikuli bug on Windows
		//System.out.println("Test: " + ClassLoader.getSystemResource(file).getPath().toString()
		//		.substring(1));
		return ClassLoader.getSystemResource(file).getPath().toString()
				.substring(1);
	}
	
	public static URL getPathURL(String file) {
		// Using substring for full path to remove first slash.
		// Sikuli bug on Windows
		//System.out.println("Test: " + ClassLoader.getSystemResource(file).getPath().toString()
		//		.substring(1));
		return ClassLoader.getSystemResource(file);
	}
	
	public static String path(String file) {
		return getPathFor(file);
	}			
}
