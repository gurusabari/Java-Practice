package string;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    // Immutable base URL
    private static final String BASE_URL = "https://www.google.com/";

    public static void main(String[] args) {
        // Set path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");

        // Create WebDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to the home page
        driver.get(BASE_URL + "/home");

        // Perform some actions on the home page
        WebElement element = driver.findElement(By.id("someId"));
        element.click();

        // Navigate to another page
        driver.get(BASE_URL + "/dashboard");

        // Perform some actions on the dashboard page
        WebElement dashboardElement = driver.findElement(By.id("anotherId"));
        dashboardElement.click();

        // Close the browser
        driver.quit();
    }
}

