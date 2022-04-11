import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/ ";
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);

        //print the title of the page
        String title = driver.getTitle();
        System.out.println( "The title of the page is :"  +title);
        //print the source page
        String sourcepage = driver.getPageSource();
        System.out.println("The source page is :"  + sourcepage);
        //enter the email field
        WebElement emailfield = driver.findElement(By.id("txtUsername"));
        emailfield.sendKeys("sahajanand@gmail.com");
        // enter the password
        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("1234?##");

        driver.close();







    }
}
