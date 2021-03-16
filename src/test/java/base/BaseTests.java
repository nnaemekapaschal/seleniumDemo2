package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().fullscreen();
        System.out.println(driver.getTitle());

        WebElement shiftingContentLink = driver.findElement(By.linkText("Shifting Content"));
        shiftingContentLink.click();

        WebElement example1Link = driver.findElement(By.linkText("Example 1: Menu Element"));
        example1Link.click();

        List <WebElement> liElements = driver.findElements(By.tagName("li"));
        System.out.println(liElements.size());

        driver.quit();
    }

    public static void main (String[] args) {
        BaseTests base = new BaseTests();
        base.setup();
    }
}
