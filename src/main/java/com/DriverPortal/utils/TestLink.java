package com.DriverPortal.utils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import br.eti.kinoshita.testlinkjavaapi.TestLinkAPI;
import br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus;

public class TestLink {
	public static final String DEV_KEY = "0e85d5c6c82d45b46d93477271d5f747"; // Your
																				// API
	public static final String SERVER_URL = "http://localhost:81/testlink/lib/api/xmlrpc/v1/xmlrpc.php"; // http://anphan:8081/testlink/index.php
	public static final String PROJECT_NAME = "Driver Portal";
	public static final String PLAN_NAME = "Test Login Function";// 5
	public static final String BUILD_NAME = "Driver portal Build 6.4";// 1
	public static String result = "";
	public static String exception = null;
	static String planIds = DataProperties.get("plan.Id");
	static String buildIds = DataProperties.get("build.Id");
	static String flatformIds = DataProperties.get("flatform.ID");
	int planId = Integer.parseInt(planIds);
	int buildId = Integer.parseInt(buildIds);
	int flatformID = Integer.parseInt(flatformIds);

	public static void updateTestLinkResult(Integer testCaseId, ExecutionStatus executionStatus, String note) {
		URL url = null;
		try {
			url = new URL(SERVER_URL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		TestLinkAPI testlinkAPIClient = new TestLinkAPI(url, DEV_KEY);
		testlinkAPIClient.setTestCaseExecutionResult(testCaseId, testCaseId, Integer.parseInt(planIds), executionStatus,
				Integer.parseInt(buildIds), null, note, false, null, Integer.parseInt(flatformIds), null, null, false);
	}

	public static void uploadErrorAttachment(Integer testCaseId, Integer planId, ExecutionStatus executionStatus,
			Integer buildId, String note, Integer flatformID, String Namefile) {
		URL url = null;
		try {
			url = new URL(SERVER_URL);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		TestLinkAPI testlinkAPIClient = new TestLinkAPI(url, DEV_KEY);

		int id = testlinkAPIClient.setTestCaseExecutionResult(testCaseId, testCaseId, Integer.parseInt(planIds),
				executionStatus, Integer.parseInt(buildIds), null, note, false, null, Integer.parseInt(flatformIds),
				null, null, false).getExecutionId();
		File attachmentFile = new File("c:\\tmp\\" + Namefile + ".png");

		String fileContent = null;

		try {
			byte[] byteArray = FileUtils.readFileToByteArray(attachmentFile);
			fileContent = new String(Base64.encodeBase64(byteArray));
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.exit(-1);
		}

		testlinkAPIClient.uploadExecutionAttachment(id, // executionId
				"Attachment", // title
				"Location Error", // description
				"screenshot_" + System.currentTimeMillis() + ".png", // fileName
				"png", // fileType
				fileContent); // content
		System.out.println("Attachment uploaded");

	}

}
