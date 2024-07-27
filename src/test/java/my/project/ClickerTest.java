package my.project;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ClickerTest {

    @BeforeEach
    void setUp() throws InterruptedException {
        System.out.println("\nWaiting for a test to run...");
        Thread.sleep(5000);
    }

    @Test
    @Order(1)
    @DisplayName("Testing the clicking API: footerbar_menu web element")
    void clickFooterBarMenu() {

        // Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("https://bsqtalent.com/");
        Clicker clicker = new Clicker(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);


        // Act
        try {
            // Maximize browser window
            System.out.println("Maximizing window...");
            driver.manage().window().maximize();
            actions.pause(Duration.ofSeconds(3)).perform();

            // First click
            WebElement element = wait.
                    until(ExpectedConditions.elementToBeClickable(By.className("footerbar_menu")));
            System.out.println("Opening footer menu icon...");
            clicker.click(element);
            actions.pause(Duration.ofSeconds(3)).perform();

            // Second click
            System.out.println("Closing footer menu icon...");
            clicker.click(element);
            actions.pause(Duration.ofSeconds(3)).perform();

            // Exit browser
            System.out.println("Closing the browser...");
            driver.quit();
        } catch (NoSuchElementException | ElementNotInteractableException e) {
            fail(e.getMessage());
        }

    }

    @Test
    @Order(2)
    @DisplayName("Testing the clicking API: open_menu web element")
    void clickOpenMenu() {

        // Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("https://bsqtalent.com/");
        Clicker clicker = new Clicker(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        // Act
        try {
            // Maximize browser window
            System.out.println("Maximizing window...");
            driver.manage().window().maximize();
            actions.pause(Duration.ofSeconds(3)).perform();

            // First click
            WebElement element = wait.
                    until(ExpectedConditions.elementToBeClickable(By.className("open_menu")));
            System.out.println("Opening top right menu icon...");
            clicker.click(element);
            actions.pause(Duration.ofSeconds(3)).perform();

            // Second click
            System.out.println("Closing top right menu icon...");
            clicker.click(element);
            actions.pause(Duration.ofSeconds(3)).perform();

            // Exit browser
            System.out.println("Closing the browser...");
            driver.quit();
        } catch (NoSuchElementException | ElementNotInteractableException e) {
            fail(e.getMessage());
        }
    }

    @Test
    @Order(3)
    @DisplayName("Testing the clicking API: LinkedIn icon")
    void clickLinkedInIcon() {

        // Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("https://bsqtalent.com/");
        Clicker clicker = new Clicker(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        // Act
        try {

            // Maximize browser window
            System.out.println("Maximizing window...");
            driver.manage().window().maximize();
            actions.pause(Duration.ofSeconds(3)).perform();

            // Click on LinkedIn icon
            WebElement element = wait.
                    until(ExpectedConditions.elementToBeClickable(By.className("wp-social-link-linkedin")));
            System.out.println("Clicking on the Linkedin icon...");
            clicker.click(element);
            actions.pause(Duration.ofSeconds(3)).perform();

            // Navigate back to landing pages
            System.out.println("Going back to https://bsqtalent.com/ ...");
            driver.navigate().back();
            actions.pause(Duration.ofSeconds(5)).perform();

            // Exit browser
            System.out.println("Closing the browser...");
            driver.quit();

        } catch (NoSuchElementException | ElementNotInteractableException e) {
            fail(e.getMessage());
        }
    }

    @Test
    @Order(4)
    @DisplayName("Testing the clicking API: Facebook icon")
    void clickTwitterIcon() {

        // Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("https://bsqtalent.com/");
        Clicker clicker = new Clicker(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        // Act
        try {

            // Maximize browser window
            System.out.println("Maximizing window...");
            driver.manage().window().maximize();
            actions.pause(Duration.ofSeconds(3)).perform();

            // Click on X icon
            WebElement element = wait.
                    until(ExpectedConditions.elementToBeClickable(By.className("wp-social-link-facebook")));
            System.out.println("Clicking on the Facebook icon...");
            clicker.click(element);
            actions.pause(Duration.ofSeconds(3)).perform();

            // Navigate back to landing pages
            System.out.println("Going back to https://bsqtalent.com/ ...");
            driver.navigate().back();
            actions.pause(Duration.ofSeconds(5)).perform();

            // Exit browser
            System.out.println("Closing the browser...");
            driver.quit();

        } catch (NoSuchElementException | ElementNotInteractableException e) {
            fail(e.getMessage());
        }
    }


}