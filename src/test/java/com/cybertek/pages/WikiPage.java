package com.cybertek.pages;

import com.cybertek.utilities.Driver09;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage {
public WikiPage(){
    PageFactory.initElements(Driver09.getDriver(),this);

}
@FindBy(id = "searchInput")
    public WebElement searchbox;

    @FindBy(id = "firstHeading")
    public WebElement mainHeaderAfterSearch;

    @FindBy(className = "fn")
    public WebElement imageHeaderAfterSearch;}
