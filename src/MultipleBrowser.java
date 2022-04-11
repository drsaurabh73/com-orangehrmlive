import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {


    static String browser = "chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/ ";
    static WebDriver driver;

    public void multiDriver() {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase(("edge"))) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
        } else {
            System.out.println("Incorrect Browser name ");
        }
        driver.get(baseUrl);
    }

    public static void main(String[] args) {
        MultipleBrowser obj2 = new MultipleBrowser();
        obj2.multiDriver();
    }
}
