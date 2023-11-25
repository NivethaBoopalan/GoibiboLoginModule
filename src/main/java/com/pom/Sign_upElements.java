package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Goibibo.Base_Class;

public class Sign_upElements extends Base_Class {
public Sign_upElements() {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="(//input[@type='text'])[1]")
private  WebElement phone;
@FindBy(xpath="//input[@placeholder='Enter your full name']")
private  WebElement fname;
@FindBy(xpath="//input[@placeholder='Enter your email address']")
private  WebElement email;
@FindBy(xpath="//button[text()='Lets Go']")
private  WebElement letgo;
@FindBy(xpath="//button[@type='submit']")
private  WebElement submit;
@FindBy(xpath="//p[@class='sc-jlwm9r-1 ewETUe']")
private  WebElement close;
@FindBy(xpath ="//span[text()='SEARCH FLIGHTS']")
private  WebElement flights;
@FindBy(xpath="//span[text()='Hey ']")
private  WebElement heyclick;
@FindBy(xpath="//span[text()='View your profile']")
private  WebElement viewprofile;
@FindBy(xpath="//input[@id='Mobile Number']")
private  WebElement clearmobnum;
@FindBy(xpath="//input[@id='Email ID']")
private  WebElement clearemailid;
@FindBy(xpath="//input[@id='First Name']")
private  WebElement clearfirstname;
@FindBy(xpath="//input[@id='Last Name']")
private  WebElement lname;
@FindBy(xpath="//span[text()='Female']")
private  WebElement gender;
@FindBy(xpath="//input[@id='Date of Birth']")
private  WebElement dob;
@FindBy(xpath="//div[text()='2']")
private  WebElement dat;
@FindBy(xpath="(//button[text()='Save'])[1]")
private  WebElement savebut;
@FindBy(xpath="//input[@id='Billing Address']")
private  WebElement billaddr;
@FindBy(xpath="//input[@id='Pincode']")
private  WebElement pincode;
@FindBy(xpath="//label[text()='State']")
private  WebElement state;
@FindBy(xpath="//li[text()='Andaman and Nicobar']")
private  WebElement island;
@FindBy(xpath="//div[@class='sc-1e4no8h-0 jSiAGt']")
private  WebElement anyclick;
@FindBy(xpath="(//button[text()='Save'])[2]")
private  WebElement savestate;
@FindBy(xpath="//span[text()='LOGOUT']")
private  WebElement logout;
@FindBy(xpath="//button[text()='Yes, Log out']")
private  WebElement yeslogout;

public  WebElement getPhone() {
	return phone;
}
public  WebElement getFname() {
	return fname;
}
public  WebElement getEmail() {
	return email;
}
public WebElement getLetgo() {
	return letgo;
}
public WebElement getSubmit() {
	return submit;
}
public WebElement getClose() {
	return close;
}
public WebElement getFlights() {
	return flights;
}
public WebElement getHeyclick() {
	return heyclick;
}
public WebElement getViewprofile() {
	return viewprofile;
}
public  WebElement getClearmobnum() {
	return clearmobnum;
}
public  WebElement getClearemailid() {
	return clearemailid;
}
public  WebElement getClearfirstname() {
	return clearfirstname;
}
public WebElement getLname() {
	return lname;
}
public  WebElement getGender() {
	return gender;
}
public WebElement getDob() {
	return dob;
}
public  WebElement getDat() {
	return dat;
}
public WebElement getSavebut() {
	return savebut;
}
public WebElement getBilladdr() {
	return billaddr;
}
public WebElement getPincode() {
	return pincode;
}
public WebElement getState() {
	return state;
}
public WebElement getIsland() {
	return island;
}
public WebElement getSavestate() {
	return savestate;
}
public WebElement getLogout() {
	return logout;
}
public WebElement getYeslogout() {
	return yeslogout;
}
public  WebElement getAnyclick() {
	return anyclick;
}

}
