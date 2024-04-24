package org.example.StepDef;

import com.fasterxml.jackson.core.JsonParseException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.addItemToCard_pages02;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.StepDef.Hooks.driver;

public class addItemToCard_stepDef02
{
    addItemToCard_pages02 addItemToCard = new addItemToCard_pages02();
    String productName;

    @Given("Open the browser and select random product")
    public void open_the_browser_and_select_random_product() {
        try {
            WebElement productTitle = driver.findElement(By.className("product-title"));
            productName = productTitle.getText();
            System.out.println("Product Name Is:" + productName);
            addItemToCard.randomProduct.click();
        }
        catch (Exception e) {

            System.out.println("Error occurred while selecting random product: " + e.getMessage());
            Assert.fail("Failed to select the product.");
        }



    }

    @And("click add to cart button")
    public void clickAddToCartButton() {
        try {
            addItemToCard.clickAdd.click();
        } catch (Exception e) {
            System.out.println("Error occurred while clicking add to cart: " + e.getMessage());
            Assert.fail("Failed to click the button.");
        }
    }

    @And("open the cart icon")
    public void openTheCartIcon() {
        try {
            Thread.sleep(10000);
            addItemToCard.cartIcon.click();
        } catch (Exception e) {
            System.out.println("Error occurred while clicking cart icon: " + e.getMessage());
            Assert.fail("Failed to open the cart.");
        }
    }

    @And("click view cart")
    public void clickViewCart() {
        try {
            addItemToCard.cartView.click();
        } catch (Exception e) {
            System.out.println("Error occurred while clicking view cart: " + e.getMessage());
            Assert.fail("Failed to view the cart.");
        }
    }

    @Then("verify the product appears in the cart")
    public void verifyTheProductAppearsInTheCart() {
        try {
            WebElement cartProduct = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[3]/div/div[2]/div/div/div/div/div/div[1]/form/div[2]"));
            String productDetails =cartProduct.getText();
            System.out.println("Product details are:" +productDetails);
            Assert.assertTrue(productDetails.contains(productName));

            // If assertion passes, log success message
            System.out.println("Product added to cart successfully.");
        } catch (Exception e) {
            // If any exception occurs, log failure message
            System.out.println("Product not added to cart: " + e.getMessage());
        }
}}
