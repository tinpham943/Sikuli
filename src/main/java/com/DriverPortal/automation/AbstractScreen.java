package com.DriverPortal.automation;

import java.io.IOException;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import com.DriverPortal.utils.DataProperties;
import com.DriverPortal.utils.Driver;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AbstractScreen {
	protected final static double WIN_TIMEOUT = Double.parseDouble(DataProperties.get("window.timeout"));
	protected final static double CTL_TIMEOUT = Double.parseDouble(DataProperties.get("control.timeout"));
	public Region window;

	public AbstractScreen() {
		window = getDriver();
	}

	protected Screen getDriver() {
		return Driver.getInstance();
	}

	public void waitAndClick(Pattern pattern) throws FindFailed {
		window.wait(pattern, 60);
		window.wait(0.5);
		window.click(pattern);
		
		  String a = pattern.toString(); int c = a.indexOf("."); String b =
		  a.substring(34, c); System.out.println("click on "+ b);
		 
		window.wait(1.0);
	}

	public void type(Pattern pattern, String text) throws FindFailed {
		window.wait(pattern, 60);
		window.click(pattern);
		window.wait(0.5);
		window.type(pattern, text);
		
		  String a = pattern.toString(); int c = a.indexOf("."); String b =
		  a.substring(34, c); System.out.println("Type text on "+ b);
		 
		window.wait(1.0);
	}

	public void PressEnter() throws FindFailed {
		window.type(Key.ENTER);
	}

	public void PressBackspace() throws FindFailed {
		window.type(Key.BACKSPACE);
	}

	public void DeleteTextof(Pattern pattern) throws FindFailed {
		waitAndDoubleClick(pattern);
		PressBackspace();
	}

	public void paste(Pattern pattern, String text) throws FindFailed {
		window.wait(pattern, 60);
		window.click(pattern);
		window.wait(0.5);
		window.paste(pattern, text);
		
		  String a = pattern.toString(); int c = a.indexOf("."); String b =
		  a.substring(34, c); System.out.println("Past text on "+ b);
		 
		window.wait(1.0);
	}

	public void wait(double timer) throws FindFailed {
		window.wait(timer);
	}

	public void wait(Pattern pattern) throws FindFailed {
		window.wait(pattern, 60);
		
		 String a = pattern.toString(); int c = a.indexOf("."); String b =
		  a.substring(34, c); System.out.println("wait for "+ b);
		 
	}

	public void waituntildisappear(Pattern pattern) throws FindFailed {
		window.waitVanish(pattern, 20);
	}

	public boolean waittheresult(Pattern pattern) throws FindFailed {
		try {
			window.wait(pattern, 60);
			
			  String a = pattern.toString(); int c = a.indexOf("."); String b =
			  a.substring(34, c); System.out.println( b+" is visible");
			 
			return true;
		} catch (FindFailed e) {
			e.printStackTrace();
			
			   String a = pattern.toString(); int c = a.indexOf("."); String b =
			  a.substring(34, c); System.out.println( b+" is not visible");
			 
			return false;
		}
	}

	public void find(Pattern pattern) throws FindFailed {
		window.wait(pattern, 60);
		window.find(pattern);
		
		 String a = pattern.toString(); int c = a.indexOf("."); String b =
		 a.substring(34, c); System.out.println( "Find "+b);
		 
	}

	public void DragandDrop(Pattern pattern1, Pattern pattern2) throws FindFailed {
		window.wait(pattern1, 10);
		window.dragDrop(pattern1, pattern2);
	}

	public void waitAndDoubleClick(Pattern pattern) throws FindFailed {
		window.wait(pattern, 10);
		window.doubleClick(pattern);
		
		 String a = pattern.toString(); int c = a.indexOf("."); String b =
		  a.substring(34, c); System.out.println( "Double click on "+b);
		 
	}

	public boolean isexist(Pattern pattern) {
		try {
			window.find(pattern);
			
			 String a = pattern.toString(); int c = a.indexOf("."); String b =
			 a.substring(34, c); System.out.println( b+" is visible");
			 
			return true;
		} catch (FindFailed e) {
			
			  String a = pattern.toString(); int c = a.indexOf("."); String b =
			 a.substring(34, c); System.out.println( b+" is not visible");
			 
			return false;
		}
	}

	public void takeScreenshot(String Namefile) {

		
	/*	 * File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * try { FileUtils.copyFile(scrFile, new File("c:\\tmp\\"+Namefile+".png")); }
		 * catch (IOException e) { e.printStackTrace(); }
		 */
	}
	public String createRandomIdByDate(){
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMHHmmss");
		return sdf.format(date);
	}
	public String GetValueFromDtb( String Path, String tagertvalue) {
		String output = null;
		try {

			URL url = new URL("http://" + DataProperties.get("Sever.ip") + ":" + DataProperties.get("Sever.port") + "/" + Path);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			while ((output = br.readLine()) != null) {
				ObjectMapper mapper = new ObjectMapper();
				int c = output.indexOf("]");
				String json = output.substring(1, c);
				Map<String, Object> map = new HashMap<String, Object>();
				// convert JSON string to Map
				map = mapper.readValue(json, new TypeReference<Map<String, String>>(){});
				return (String) map.get(tagertvalue);
				
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return output;

	}

}
