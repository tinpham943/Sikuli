package com.DriverPortal.automation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import com.DriverPortal.utils.DataProperties;

public class SelectRouteScreen extends AbstractScreen {

	private Pattern PopupConfirmYes;
	private Pattern SelectRoute180LResult;
	private Pattern SelectRoute717Result;
	private Pattern SelectRouteIDSearch;
	private Pattern SelectRoute180LResultList;
	private Pattern SelectRoute717ResultList;
	private Pattern SelectRouteSection;
	private Pattern SelectRouteStartRouteButton;
	private Pattern SelectRouteStartRouteOK;
	private Pattern AndroidMockup;
	private Pattern HomeKey;
	private Pattern GPXHomeFile;
	private Pattern GPXOpenFile;
	private Pattern GPXStart;
	private Pattern GPXFrequencyTime;
	private Pattern GPXRoute180L;
	private Pattern GPXOpenSelectedFile;
	private Pattern EdulogMenu;
	private Pattern GPXDrag;
	private Pattern GPXDrop;
	private Pattern GPXFileSystRoot;
	private Pattern GPXOther;
	private Pattern GPXShared;
	private Pattern GPXMNT;
	private Pattern DriverPortalMini;
	private Pattern MultitaskKey;
	private Pattern GPXRouteKv717;
	public SelectRouteScreen() throws FindFailed {

		DriverPortalMini = new Pattern(DataProperties.getPathURL("DriverPortalMini.PNG"));
		MultitaskKey = new Pattern(DataProperties.getPathURL("MultitaskKey.PNG"));
		EdulogMenu = new Pattern(DataProperties.getPathURL("EdulogMenu.PNG"));
		PopupConfirmYes = new Pattern(DataProperties.getPathURL("PopupConfirmYes.PNG"));
		SelectRoute180LResult = new Pattern(DataProperties.getPathURL("SelectRoute180LResult.PNG"));
		SelectRoute717Result = new Pattern(DataProperties.getPathURL("SelectRoute717Result.PNG"));
		SelectRouteIDSearch = new Pattern(DataProperties.getPathURL("SelectRouteIDSearch.PNG"));
		SelectRoute180LResultList = new Pattern(DataProperties.getPathURL("SelectRoute180LResultList.PNG"));
		SelectRoute717ResultList = new Pattern(DataProperties.getPathURL("SelectRoute717ResultList.PNG"));
		SelectRouteStartRouteButton = new Pattern(DataProperties.getPathURL("SelectRouteStartRouteButton.PNG"));
		SelectRouteStartRouteOK = new Pattern(DataProperties.getPathURL("SelectRouteStartRouteOK.PNG"));
		SelectRouteSection = new Pattern(DataProperties.getPathURL("SelectRouteSection.PNG"));
		AndroidMockup = new Pattern(DataProperties.getPathURL("AndroidMockup.PNG"));
		HomeKey = new Pattern(DataProperties.getPathURL("HomeKey.PNG"));
		GPXStart = new Pattern(DataProperties.getPathURL("GPXStart.PNG"));
		GPXOpenFile = new Pattern(DataProperties.getPathURL("GPXOpenFile.PNG"));
		GPXFrequencyTime = new Pattern(DataProperties.getPathURL("GPXFrequencyTime.PNG"));
		GPXRoute180L = new Pattern(DataProperties.getPathURL("GPXRoute180L.PNG"));
		GPXOpenSelectedFile = new Pattern(DataProperties.getPathURL("GPXOpenSelectedFile.PNG"));
		GPXHomeFile = new Pattern(DataProperties.getPathURL("GPXHomeFile.PNG"));
		GPXDrag = new Pattern(DataProperties.getPathURL("GPXDrag.PNG"));
		GPXDrop = new Pattern(DataProperties.getPathURL("GPXDrop.PNG"));
		GPXFileSystRoot = new Pattern(DataProperties.getPathURL("GPXFileSystRoot.PNG"));
		GPXOther = new Pattern(DataProperties.getPathURL("GPXOther.PNG"));
		GPXShared = new Pattern(DataProperties.getPathURL("GPXShared.PNG"));
		GPXMNT = new Pattern(DataProperties.getPathURL("GPXMNT.PNG"));
		GPXRouteKv717 = new Pattern(DataProperties.getPathURL("GPXRouteKv717.PNG"));
		
	}

	public SelectRouteScreen StarRoute180L() throws FindFailed {
		waitAndClick(EdulogMenu);
		waitAndClick(SelectRouteSection);
		paste(SelectRouteIDSearch, "180L");
		if (isexist(SelectRoute180LResult) == false) {
			waitAndClick(EdulogMenu);
			waitAndClick(SelectRouteSection);
			paste(SelectRouteIDSearch, "180L");
		}
		waitAndClick(SelectRoute180LResult);
		waitAndClick(SelectRoute180LResultList);
		wait(3.0);
		waitAndClick(SelectRouteStartRouteOK);
		waitAndClick(SelectRouteStartRouteButton);
		wait(1.0);
		if (isexist(PopupConfirmYes) == false) {
			waitAndClick(SelectRouteStartRouteButton);
		}
		waitAndClick(PopupConfirmYes);
		return this;
	}
	public SelectRouteScreen StarRoute717() throws FindFailed {
		waitAndClick(EdulogMenu);
		waitAndClick(SelectRouteSection);
		paste(SelectRouteIDSearch, "717");
		if (isexist(SelectRoute180LResult) == false) {
			waitAndClick(EdulogMenu);
			waitAndClick(SelectRouteSection);
			paste(SelectRouteIDSearch, "717");
		}
		wait(0.5);
		waitAndClick(SelectRoute717Result);
		waitAndClick(SelectRoute717ResultList);
		wait(3.0);
		waitAndClick(SelectRouteStartRouteOK);
		waitAndClick(SelectRouteStartRouteButton);
		wait(1.0);
		if (isexist(PopupConfirmYes) == false) {
			waitAndClick(SelectRouteStartRouteButton);
		}
		waitAndClick(PopupConfirmYes);
		return this;
	}

	public SelectRouteScreen SetupRunGPX() throws FindFailed {
		waitAndClick(HomeKey);
		waitAndClick(AndroidMockup);
		wait(GPXFrequencyTime);
		type(GPXFrequencyTime, "5000");
		waitAndClick(GPXOpenFile);
		wait(1.0);
		waitAndClick(GPXHomeFile);
		waitAndClick(GPXFileSystRoot);
		DragandDrop(GPXDrag, GPXDrop);
		waitAndClick(GPXMNT);
		waitAndClick(GPXShared);
		waitAndClick(GPXOther);
		waitAndClick(GPXRoute180L);
		waitAndClick(GPXOpenSelectedFile);
		waitAndClick(GPXStart);
		waitAndClick(GPXStart);
		return this;
	}
	public SelectRouteScreen SetupRunGPXKv717() throws FindFailed {
		waitAndClick(HomeKey);
		waitAndClick(AndroidMockup);
		wait(GPXFrequencyTime);
		type(GPXFrequencyTime, "1000");
		waitAndClick(GPXOpenFile);
		wait(1.0);
		waitAndClick(GPXHomeFile);
		waitAndClick(GPXFileSystRoot);
		DragandDrop(GPXDrag, GPXDrop);
		waitAndClick(GPXMNT);
		waitAndClick(GPXShared);
		waitAndClick(GPXOther);
		waitAndClick(GPXRouteKv717);
		waitAndClick(GPXOpenSelectedFile);
		waitAndClick(GPXStart);
		waitAndClick(GPXStart);
		return this;
	}


	public SelectRouteScreen BackToDriverPortal() throws FindFailed {
		waitAndClick(MultitaskKey);
		waitAndClick(DriverPortalMini);
		return this;
	}
}
