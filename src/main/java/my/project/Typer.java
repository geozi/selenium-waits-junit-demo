package my.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * The {@link Typer} class simulates the
 * typing operation in a web element.
 * It inherits functionalities from the
 * {@link ActionSimulator} superclass.
 */
public class Typer extends ActionSimulator {

    // Constructors

    /**
     * Creates a Typer object in memory with
     * default values.
     */
    public Typer() {
    }

    /**
     * Creates a Typer object in memory with a
     * user-supplied driver.
     * @param driver The user-supplied driver.
     */
    public Typer(WebDriver driver) {
        super.setDriver(driver);
    }

    // Typing API

    /**
     * Performs a typing operation in a web element.
     * @param element A user-supplied element.
     * @param keys The String to be typed.
     */
    public void type(WebElement element, String keys) {
        element.sendKeys(keys);
    }
}
