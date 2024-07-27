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
class TyperTest {

    @BeforeEach
    void setUp() throws InterruptedException {
        System.out.println("\nWaiting for a test to run...");
        Thread.sleep(5000);
    }

    @Test
    @Order(1)
    @DisplayName("Testing typing API: empty String")
    void typeEmptyString() {

        // Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("https://bsqtalent.com/");
        Typer typer = new Typer(driver);
        Clicker clicker = new Clicker(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);


        // Act
        try {

            // Maximize browser window
            System.out.println("Maximizing window...");
            driver.manage().window().maximize();
            actions.pause(Duration.ofSeconds(3)).perform();

            // Typing on the search box
            WebElement searchBoxElement = wait.
                    until(ExpectedConditions.elementToBeClickable(By.id("search_keywords")));
            System.out.println("Typing in search box...");
            typer.type(searchBoxElement, "");

            // Click on the search button
            WebElement searchButtonElement = wait.
                    until(ExpectedConditions.elementToBeClickable(By.id("Rectangle")));
            System.out.println("Clicking on search button...");
            clicker.click(searchButtonElement);
            actions.pause(Duration.ofSeconds(3)).perform();

            // Navigate back to main landing
            System.out.println("Going back to main landing page ...");
            driver.navigate().back();
            actions.pause(Duration.ofSeconds(5)).perform();

            // Exit browser
            System.out.println("Closing the browser...");
            driver.quit();

        } catch(NoSuchElementException | ElementNotInteractableException e){
            fail(e.getMessage());
        }
    }

    @Test
    @Order(2)
    @DisplayName("Testing typing API: 'business' String")
    void typeWithSpecificString() {

        // Arrange
        WebDriver driver = new ChromeDriver();
        driver.get("https://bsqtalent.com/");
        Typer typer = new Typer(driver);
        Clicker clicker = new Clicker(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);


        // Act
        try {

            // Maximize browser window
            System.out.println("Maximizing window...");
            driver.manage().window().maximize();
            actions.pause(Duration.ofSeconds(3)).perform();

            // Typing on the search box
            WebElement searchBoxElement = wait.
                    until(ExpectedConditions.elementToBeClickable(By.id("search_keywords")));
            System.out.println("Typing in search box...");
            typer.type(searchBoxElement, "business");

            // Click on the search button
            WebElement searchButtonElement = wait.
                    until(ExpectedConditions.elementToBeClickable(By.id("Rectangle")));
            System.out.println("Clicking on search button...");
            clicker.click(searchButtonElement);
            actions.pause(Duration.ofSeconds(3)).perform();

            // Navigate back to main landing
            System.out.println("Going back to main landing page ...");
            driver.navigate().back();
            actions.pause(Duration.ofSeconds(5)).perform();

            // Exit browser
            System.out.println("Closing the browser...");
            driver.quit();

        } catch(NoSuchElementException | ElementNotInteractableException e){
            fail(e.getMessage());
        }
    }
}