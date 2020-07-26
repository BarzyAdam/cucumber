package com.cybertek.pages;

import com.cybertek.utilities.Driver09;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBear {
   public SmartBear(){
       PageFactory.initElements(Driver09.getDriver(),this);
    }
    @FindBy (id = "ctl00_MainContent_username")
    public WebElement username;

    @FindBy (id = "ctl00_MainContent_password")
    public WebElement password;

    @FindBy (id = "ctl00_MainContent_login_button")
    public WebElement submite;

    @FindBy (xpath = "//div[@class='login_info']")
    public WebElement loginInfo;

    @FindBy (xpath = "//h1")
    public WebElement webPage;

    @FindBy (linkText = "Order")
 public WebElement Order;
    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
 public WebElement product;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
 public WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
 public WebElement Name;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
 public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
 public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
 public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
 public WebElement zip;

 @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
 public WebElement visa;

 @FindBy(xpath = "//td[.='MasterCard']")
 public WebElement MasterCard;

 @FindBy(xpath = "//td[.='American Express']")
 public WebElement AmericanExpress;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
 public WebElement cardNumber;

 @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
 public WebElement Expiration;

 @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
 public WebElement proceed;

 @FindBy(xpath = "//table[@class='SampleTable']//td[2]")
 public List<WebElement> names;


}
