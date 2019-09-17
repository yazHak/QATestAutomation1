import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowsers {
    public static void main (String [] args) {
        AllBrowsers driver = new AllBrowsers();

        for (int i = 0; i < 3; i++) {
            driver.Chrome();
            driver.Firefox();
        }

        int i=0;
        while (i<3) {
            driver.Chrome();
            driver.Firefox();
            i++;
        }
    }

    //This method will invoke Chrome Browser
    //Created by yazHak Date: 9/12/2019
    //Last modified by yazHak
    public void Chrome(){
        System.setProperty("webdriver.chrome.driver","/Users/hakkiyaz/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

    //This method will invoke Firefox Browser
    public void Firefox() {
        System.setProperty("webdriver.gecko.driver","/Users/hakkiyaz/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.apple.com");
    }
}
