package org.example.Pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addItemToCard_pages02
{
    public addItemToCard_pages02() {
        PageFactory.initElements(Hooks.driver,this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[3]/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div[1]/div[1]/div/form/div/div[1]")
    public WebElement randomProduct;

    @FindBy(xpath = "//div[4]//form/div[7]/div[2]/div/button\n")
    public WebElement clickAdd;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div/div/div/div[3]/div[3]")
    public WebElement cartIcon;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div/div/div/div[3]/div[3]/div/div[2]/div/div[3]/a[1]")
    public WebElement cartView;

}

