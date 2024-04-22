package org.example.Pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_pages01 {
    public search_pages01() {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div/div/div/div[2]/div[1]/form/input[9]")
    public WebElement searchInput;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div/div/div/div[2]/div[1]/form/button")
    public WebElement searchButton;
}
