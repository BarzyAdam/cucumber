package com.cybertek.pages;

import com.cybertek.utilities.Driver09;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsaySearchPage {
    public EtsaySearchPage(){
        PageFactory.initElements(Driver09.getDriver(), this);
    }

    @FindBy(name = "search_query")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement searchButton;
}
