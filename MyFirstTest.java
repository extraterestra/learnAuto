package webdriver.learnAuto;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
//some connent
public class MyFirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 10);
    }


    @Test
    public void myFirstTest() {
//        driver.navigate().to("http://www.google.com");
//        driver.findElement(By.name("q")).sendKeys("webdriver");
//        driver.findElement(By.name("btnG")).click();
//        wait.until(titleIs("webdriver - Поиск в Google"));


        //Step 2- Navigation: Open a website
        driver.navigate().to("https://www.swtestacademy.com/");

        //Step 3- Assertion: Check its title is correct
        //assertEquals method Parameters: Expected Value, Actual Value, Assertion Message
        assertEquals("Software Test Academy", driver.getTitle(), "Title check failed!");

    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
