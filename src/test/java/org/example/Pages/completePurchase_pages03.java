package org.example.Pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completePurchase_pages03 {
    public completePurchase_pages03() {
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(xpath = "/html/body/div[1]/div[4]/div[2]/div/div[1]/div/div/div/div[3]/div[3]/div/div[2]/div/div[3]/a[2]")
    public WebElement checkoutButton;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[3]/div/div/div/div/div[2]/div/form/div/div/div[1]/div[1]/div/div[2]/div[2]/div/input")
    public WebElement phoneNum;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[3]/div/div/div/div/div[2]/div/form/div/div/div[1]/div[3]/div/div[2]/div[2]/div[1]/input")
    public WebElement address;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[3]/div/div/div/div/div[2]/div/form/div/div/div[2]/div[2]/div/div[3]/div/div/div/div/label/input")
    public WebElement checkBox;

    @FindBy(xpath = "/html/body/div[1]/div[4]/div[3]/div/div/div/div/div[2]/div/form/div/div/div[2]/div[2]/div/div[2]/div[2]/button")
    public WebElement placeOrder;
}

