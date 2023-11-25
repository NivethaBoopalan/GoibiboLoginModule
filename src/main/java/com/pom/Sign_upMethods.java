package com.pom;

import org.openqa.selenium.support.PageFactory;

import com.Goibibo.Base_Class;

public class Sign_upMethods extends Base_Class {
public Sign_upMethods() {
	PageFactory.initElements(driver,this);
}
private static Sign_upMethods som;
private static Sign_upElements soe;
public static Sign_upMethods getsignupmethods()
{
	som=new Sign_upMethods();
	return som;
}
public Sign_upElements getsignupelements()
{
	soe=new Sign_upElements();
	return soe;
}
}
