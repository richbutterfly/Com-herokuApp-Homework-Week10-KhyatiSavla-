package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * 1. Setup Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */
public class HerokuApp {

    public static void main(String[] args)  {

        String baseURL = "http://the-internet.herokuapp.com/login";
        // Set up Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseURL);
        // Maximise the browser
        driver.manage().window().maximize();
        // Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Print the title of the page
        System.out.println("The title of the page: " + driver.getTitle());
        // Print the current Url
        System.out.println("The current URL is: " + driver.getCurrentUrl());
        // Print the page source
        System.out.println("The page source of current URL is: " + driver.getPageSource());
        //Enter the Email to email field
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("Testing321@gmail.com");
        // Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("4321");
        //Click on Login Button
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
        login.click();
        //Print the current URL
        System.out.println("The current URL is: " + driver.getCurrentUrl());
        //Refresh the page
        driver.navigate().refresh();
        // Close the browser
        driver.quit();


    }
}
