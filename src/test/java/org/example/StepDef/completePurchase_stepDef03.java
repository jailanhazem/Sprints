package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.completePurchase_pages03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.example.StepDef.Hooks.driver;

public class completePurchase_stepDef03 {
    completePurchase_pages03 completePurchase = new completePurchase_pages03();

    @Given("click checkout")
    public void click_checkout() {
        try {
            completePurchase.checkoutButton.click();
        } catch (Exception e)
        {
            System.out.println("Error occurred while clicking checkout: " + e.getMessage());
            Assert.fail("Failed to click checkout button.");
        }
    }

    @And("insert the mandatory fields")
    public void insertTheMandatoryFields() {
        try {
            completePurchase.phoneNum.sendKeys("01150020030");
            completePurchase.address.sendKeys("EL Haram");
        } catch (Exception e)
        {
            System.out.println("Error occurred while inserting the data: " + e.getMessage());
            Assert.fail("Failed to insert the data.");
        }
    }

    @And("click the checkbox of terms and conditions")
    public void clickTheCheckboxOfTermsAndConditions() {
        try {
            completePurchase.checkBox.click();
        } catch (Exception e)
        {
            System.out.println("Error occurred while clicking checkbox: " + e.getMessage());
            Assert.fail("Failed to click checkbox button.");
        }
    }

    @And("click place order")
    public void clickPlaceOrder() {
        try {
            completePurchase.placeOrder.click();
        } catch (Exception e)
        {
            System.out.println("Error occurred while clicking place order: " + e.getMessage());
            Assert.fail("Failed to click place order.");
        }
    }
    @Then("check the pop-up message")
    public void checkThePopUpMessage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        try{
            WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/strong")));
            Assert.assertEquals(confirmationMessage.getText(), "ORDER PLACED");
            String x=confirmationMessage.getText();
            System.out.println("Confirmation Message is: "+x);
            // If assertion passes, log success message
            System.out.println("Order placed successfully.");
        } catch (Exception e) {
            // If any exception occurs, log failure message
            System.out.println("Failed to place order: " + e.getMessage());
        }
    }
}
