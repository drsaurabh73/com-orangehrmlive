import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {


        String baseUrl = "https://opensource-demo.orangehrmlive.com/ ";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// launch the URL
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //we will implicit the time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // get the title of the page
        String title = driver.getTitle();
        System.out.println("The title of the page is : " +title);
        // get the source page
        String pagesource = driver.getPageSource();
        System.out.println("Page source of the given URL : " + pagesource);
        // locator of email field
        driver.findElement(By.id("Email"));
        WebElement id = driver.findElement(By.id("txtUsername"));
        id.sendKeys("mahantswami@gmail.com");
        //locator of passward field
        driver.findElement(By.name("password"));
        WebElement password1 = driver.findElement(By.name("txtPassword"));
        password1.sendKeys("12345@");



    }
}
