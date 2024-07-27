package my.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.*;


class ActionSimulatorTest {

    @BeforeEach
    void setUp() throws InterruptedException {
        System.out.println("\nWaiting for a test to run...");
        Thread.sleep(5000);
    }

    @Test
    @DisplayName("Testing the driver getter and setter with no change")
    void setAndGetDriverWithNoChange() {
        // Arrange
        ActionSimulator actionSimulator = new ActionSimulator();

        // Act
        actionSimulator.setDriver(new ChromeDriver());
        WebDriver driver = actionSimulator.getDriver();
        driver.quit();

        // Assert
        assertAll(
                "Failure in testing the driver getter and setter with no change",
                () -> assertNotNull(driver),
                () -> assertSame(ChromeDriver.class, driver.getClass())
        );

    }

    @Test
    @DisplayName("Testing the driver getter and setter with change")
    void setAndGetDriverWithChange() {

        // Arrange
        ChromeDriver chromeDriver = new ChromeDriver();
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        ActionSimulator actionSimulator = new ActionSimulator();
        actionSimulator.setDriver(chromeDriver);


        // Act
        actionSimulator.setDriver(firefoxDriver);
        WebDriver retrievedFirefoxDriver = actionSimulator.getDriver();
        retrievedFirefoxDriver.quit();
        chromeDriver.quit();

        // Assert
        assertAll(
                "Failure in testing the retrievedFirefoxDriver getter and setter with change",
                () -> assertNotNull(retrievedFirefoxDriver),
                () -> assertNotSame(ChromeDriver.class, retrievedFirefoxDriver.getClass()),
                () -> assertSame(FirefoxDriver.class, retrievedFirefoxDriver.getClass())
        );
    }

}