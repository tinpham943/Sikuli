package com.DriverPortal.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetRq {
	public static String getDayBefore() {
		Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -2);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(cal.getTime());
	}
	public static void main(String[] args) {

		try {
			String BusId = "Bus" + getDayBefore();
			System.out.println(BusId);
			//http://hungnguyen:8089/api/mam/getstopevent/kv1214_31_2/106/2017-12-14_08:21
			URL url = new URL("http://hungnguyen:8089/api/mam/getstudentevent/Bus0604101317/110/2018-04-04_08:41:41");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output + "\n");
				ObjectMapper mapper = new ObjectMapper();
				int c = output.indexOf("]");
				String json = output.substring(1, c);
				Map<String, Object> map = new HashMap<String, Object>();
				// convert JSON string to Map
				map = mapper.readValue(json, new TypeReference<Map<String, String>>(){});
				String s = (String) map.get("eventTime");
				System.out.println("value of eventTime is :" + s);
				
		
				// System.out.println(map);
				
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}

