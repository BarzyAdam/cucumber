package com.cybertek.pages;

import com.cybertek.utilities.Driver09;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver09.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(linkText = "About")
    public WebElement aboutLink;

    @FindBy(xpath = "//a[@class='Fx4vi']")
    public List<WebElement>footerlinks;
}
