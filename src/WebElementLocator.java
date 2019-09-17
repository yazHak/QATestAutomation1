import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementLocator {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        invokeFirefox();
        driver.get("http://www.expedia.com");
        Thread.sleep(1000);
        driver.findElement(By.id("tab-flight-tab-hp")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("H");
        Thread.sleep(1000);
        driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.id("flight-origin-hp-flight")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("A");
        Thread.sleep(1000);
        driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(By.id("flight-destination-hp-flight")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.id("flight-departing-hp-flight")).sendKeys("10/01/2019");
        Thread.sleep(1000);
        driver.findElement(By.id("flight-returning-hp-flight")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("flight-returning-hp-flight")).sendKeys(Keys.chord(Keys.COMMAND,"A"));
        Thread.sleep(1000);
        driver.findElement(By.id("flight-returning-hp-flight")).sendKeys(Keys.DELETE);
        driver.findElement(By.id("flight-returning-hp-flight")).sendKeys("10/21/2019");
        Thread.sleep(1000);
        driver.findElement(By.id("flight-returning-hp-flight")).sendKeys(Keys.ENTER);
        //Thread.sleep(5000);
        //driver.findElement(By.id("primary-header-flight")).click();
    }
    public static void invokeFirefox() {
        System.setProperty("webdriver.gecko.driver","/Users/hakkiyaz/Downloads/geckodriver");
        driver = new FirefoxDriver();
    }
}
