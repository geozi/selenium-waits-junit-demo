# selenium-waits-junit-demo
![Demo App](https://img.shields.io/badge/demo_app-blue)

### About the Project
This project was created as part of my preparation for the "Software Engineer in Test" job application. Its purpose is to showcase the combination of JUnit sequence and Java time control commands with Selenium explicit waits. 

### Prerequisites
* Java 17 or higher,
* Intellij IDEA (or any other Java IDE),
* Maven,
* Selenium.

### Dependencies

```
    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>4.23.0</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-firefox-driver -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-firefox-driver</artifactId>
      <version>4.23.0</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver -->
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-chrome-driver</artifactId>
      <version>4.23.0</version>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-api</artifactId>
      <version>5.10.3</version>
      <scope>test</scope>
    </dependency>

    <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine -->
    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>5.10.3</version>
      <scope>test</scope>
    </dependency>
```

### Web elements under test
The web elements tested with Selenium are the following:

Element 1:
![bsq_elem1](https://github.com/user-attachments/assets/d72065e0-28bd-496b-8abb-92a538a76c16),
Element 2:
![bsq_elem2](https://github.com/user-attachments/assets/22fb8e35-0305-496d-9665-01e3eb1421b6),
Element 3:
![bsq_elem3](https://github.com/user-attachments/assets/a44b403b-4ad7-4b41-b8a6-b6e89c7eeabe)


### Actions used
* Opening a web page,
* Maximizing the browser window,
* Finding a web element,
* Calling the WebElement's click() and sendKeys() methods,
* Use of the WebDriverWait's methods,
* Using action chains with pause() and perform(),
* Calling the WebDriver's quit() method,

### Further documentation

For more information, please check the provided javadoc.

<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=java,idea,maven,selenium&theme=light"/>
	 
  </a>
</p>
