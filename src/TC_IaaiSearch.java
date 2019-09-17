import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_IaaiSearch {
    static WebDriver driver;
    public static void main (String[] args) throws InterruptedException {
        String url = "http://iaai.com";
        //Chrome invocation
        invokeChrome();
        driver.get(url);
        Thread.sleep(1000);
        driver.findElement(By.id("txtSearch")).sendKeys("LEXUS");
        Thread.sleep(1000);
        // driver.findElement(By.xpath("//*[@id='btnSearch']/span/svg")).click();
        driver.findElement(By.id("txtSearch")).sendKeys(Keys.ENTER);
        //driver.findElement(By.id("txtSearch")).getAttribute("placeholder");

        System.out.println(driver.findElement(By.id("txtSearch")).getAttribute("placeholder"));
        Thread.sleep(1000);
        driver.navigate().to("http://www.amazon.com");
        Thread.sleep(2000);
        System.out.println("text : "+driver.findElement(By.xpath("//*[@id='nav-orders']/span[2]")).getText());

    }
    public static void invokeChrome() {
        System.setProperty("webdriver.chrome.driver","/Users/hakkiyaz/Downloads/chromedriver");
        driver=new ChromeDriver();
    }
    //@yazHak
}
