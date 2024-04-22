package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.search_pages01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

import static org.example.StepDef.Hooks.driver;

public class search_stepDef01 {
        search_pages01 searchPages01 = new search_pages01();

        @Given("open the browser")
        public void open_the_browser() {
            try {
                searchPages01.searchInput.sendKeys("acer");
            } catch (Exception e)
            {
                System.out.println("Error occurred while entering search input: " + e.getMessage());
                Assert.fail("Failed to enter search input.");
            }
        }

        @And("search for inserted word")
        public void searchForInsertedWord() {
            try {
                searchPages01.searchButton.click();
            } catch (Exception e)
            {
                System.out.println("Error occurred while clicking search button: " + e.getMessage());
                Assert.fail("Failed to click search button.");
            }
        }

        @Then("check the results")
        public void checkTheResults() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
            try {
                WebElement searchResults = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[4]/div[3]/div/div[2]/div/div[1]/div/div/div")));
                List<WebElement> searchResults1 = driver.findElements(By.className("product-title"));
                // Assert that all search results contain the word "acer"
                for (WebElement result : searchResults1) {
                    // Verify that each search result contains the word "acer" in its title or description
                    String resultText = result.getText().toLowerCase();
                    Assert.assertTrue(resultText.contains("acer"), "Not all search results contain 'Acer', but I found a product with this description : " + resultText);
                }

                // Print validation result
                System.out.println("All search results contain 'acer'. Search functionality validated.");
            } catch (Exception e)
            {
                System.out.println("Error occurred while validating search results: " + e.getMessage());
                Assert.fail("Failed to validate search results.");
            }
        }
    }

