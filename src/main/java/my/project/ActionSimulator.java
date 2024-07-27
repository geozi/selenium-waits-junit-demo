package my.project;

import org.openqa.selenium.WebDriver;

/**
 * The {@link ActionSimulator} class
 * allows for the optimal distribution of common
 * functionalities through inheritance.
 * It has two inheritors, the {@link Clicker} and
 * {@link Typer} classes.
 */
public class ActionSimulator {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
