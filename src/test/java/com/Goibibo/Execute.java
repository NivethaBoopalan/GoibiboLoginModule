package com.Goibibo;



import java.lang.reflect.InvocationTargetException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


import com.pom.Sign_upElements;
import com.pom.Sign_upMethods;

public class Execute extends Base_Class {
static Sign_upMethods som=new Sign_upMethods();
@BeforeSuite
public void browserurl()
{
	browserLaunch("chrome");
	launchUrl("https://www.goibibo.com/flights/");
}
@Test
public void Mobile_Information() throws InvocationTargetException,Exception
{
	inputValues(Sign_upMethods.getsignupmethods().getsignupelements().getPhone(),"8825500954");
//	inputValues(som.getsignupelements().getFname(),"Durga");
	Thread.sleep(10000);
//	inputValues(som.getsignupelements().getEmail(),"durga2103@gmail.com");
//	clickMouse(som.getsignupelements().getLetgo());
	Thread.sleep(10000);
	clickMouse(Sign_upMethods.getsignupmethods().getsignupelements().getClose());
	clickMouse(som.getsignupmethods().getsignupelements().getFlights());
	Thread.sleep(1000);
	MouseActions(som.getsignupmethods().getsignupelements().getHeyclick());
	Thread.sleep(10000);
	clickMouse(som.getsignupelements().getViewprofile());
	Thread.sleep(10000);
	//clear(som.getsignupelements().getClearmobnum());
	clear(som.getsignupelements().getClearemailid());
	clear(som.getsignupelements().getClearfirstname());
	clear(som.getsignupelements().getLname());
	Thread.sleep(10000);
	//inputValues(som.getsignupelements().getClearmobnum(),"8825500954");
	inputValues(som.getsignupelements().getClearemailid(),"nive170592@gmail.com");
	inputValues(som.getsignupelements().getClearfirstname(),"Nivetha");
	inputValues(som.getsignupelements().getLname(),"Boopalan");
	Thread.sleep(2000);
	javaScript("down");
	//clear(som.getsignupelements().getGender());
	//clear(som.getsignupelements().getDob());
	Thread.sleep(1000);
	som.getsignupelements();
	clickMouse(som.getsignupelements().getGender());
	Thread.sleep(2000);
	clickMouse(som.getsignupelements().getDob());
	clickMouse(som.getsignupelements().getDat());
	Thread.sleep(2000);
	clickMouse(som.getsignupelements().getSavebut());
	Thread.sleep(3000);
	javaScript("down");
	inputValues(som.getsignupelements().getBilladdr(),"Veppampattu");
	Thread.sleep(10000);
	clickMouse(som.getsignupelements().getState());
	Thread.sleep(10000);
	clickMouse(som.getsignupelements().getIsland());
	Thread.sleep(10000);
	inputValues(som.getsignupelements().getPincode(),"602024");
	Thread.sleep(10000);
	clickMouse(som.getsignupelements().getAnyclick());
    Thread.sleep(1000);
//	clickMouse(som.getsignupelements().getSavestate());
//	Thread.sleep(10000);
	javaScript("down");
	clickMouse(som.getsignupelements().getLogout());
	Thread.sleep(10000);
	clickMouse(som.getsignupelements().getYeslogout());
}
@AfterSuite
public void close()
{
	Exit();
}
}
