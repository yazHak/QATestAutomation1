import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebLocatorsId {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        invokeFirefox();
        driver.get("http://skyscanner.com");
        Thread.sleep(2000);
        driver.findElement(By.id("fsc-origin-search")).clear();
        driver.findElement(By.id("fsc-origin-search")).sendKeys("Abuja");
        driver.findElement(By.id("fsc-destination-search")).sendKeys("Paris");

    }
    //Invokes Firefox
    public static void invokeFirefox() {
        System.setProperty("webdriver.gecko.driver","/Users/hakkiyaz/Downloads/geckodriver");
        driver = new FirefoxDriver();
    }
}
