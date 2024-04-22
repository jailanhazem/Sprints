package org.example.TestRunner;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotUtils {

        public static byte[] takeScreenshot(WebDriver driver) {
            if (driver instanceof TakesScreenshot) {
                return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            }
            return null;
        }

    }

