/**
 * @author TinPham
 * Test automation of search and play functionality
 */

package com.DriverPortal.automation;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;
import com.DriverPortal.automation.LoginScreen;


public class LoginTest extends BaseTestCase {

	@Test(groups = "Login", priority = 1, retryAnalyzer = LoginTest.class)
	public void SetNoxHomeAlwaysTrue() throws FindFailed, InterruptedException {
		LoginScreen loginS = new LoginScreen();
		System.out.println("SetNoxHomeAlwaysTrue");
		loginS.SetNoxHomeAlwaysTrue();
		/*assertTrue(loginS.GetValueFromDtb("api/mam/getstopevent/kv1214_31_2/106/2017-12-14_08:21", "eventName").equalsIgnoreCase("STOP_BEGIN")); 
		System.out.println(loginS.GetValueFromDtb("api/mam/getstopevent/kv1214_31_2/106/2017-12-14_08:21", "eventName").toString());*/
	}

	@Test(groups = "Login", priority = 2, retryAnalyzer = LoginTest.class)
	public void LoginFailed() throws FindFailed, InterruptedException {
		LoginScreen loginS = new LoginScreen();
		System.out.println("LoginFailed");
		loginS.LoginFailed();
		

	}

	@Test(groups = "Login", priority = 3, retryAnalyzer = LoginTest.class)
	public void LoginFailedEmtyPass() throws FindFailed, InterruptedException {
		LoginScreen loginS = new LoginScreen();
		System.out.println("LoginFailedEmtyPass");
		loginS.LoginFailedEmtyPass();//

	}

	@Test(groups = "Login", priority = 4, retryAnalyzer = LoginTest.class)
	public void LoginFailedEmtyIDPass() throws FindFailed, InterruptedException {
		LoginScreen loginS = new LoginScreen();
		System.out.println("LoginFailedEmtyIDPass");
		loginS.LoginFailedEmtyIDPass();//

	}

	@Test(groups = "Login", priority = 5, retryAnalyzer = LoginTest.class)
	public void LoginFailedemtyAll() throws FindFailed, InterruptedException {
		LoginScreen loginS = new LoginScreen();
		System.out.println("LoginFailedemtyAll");
		loginS.LoginFailedemtyAll();//
	}

	@Test(groups = "Login", priority = 6, retryAnalyzer = LoginTest.class)
	public void LoginFailed3time() throws FindFailed, InterruptedException {
		LoginScreen loginS = new LoginScreen();
		System.out.println("LoginFailed3time");
		loginS.LoginFailed3time();
	}

	@Test(groups = "Login", priority = 7, retryAnalyzer = LoginTest.class)
	public void Login() throws FindFailed, InterruptedException {
		LoginScreen loginS = new LoginScreen();
		System.out.println("Login");
		loginS.Login();

	}
	
	@Test(groups = "Login", priority = 8, retryAnalyzer = LoginTest.class)
	public void Logout() throws FindFailed, InterruptedException {
		LoginScreen loginS = new LoginScreen();
		System.out.println("Logout");
		loginS.Logout();
	}

	@Test(groups = "Login", priority = 9, retryAnalyzer = LoginTest.class)
	public void reLogin() throws FindFailed, InterruptedException {
		LoginScreen loginS = new LoginScreen();
		System.out.println("ReLogin");
		loginS.ReLogin();
	}

}
