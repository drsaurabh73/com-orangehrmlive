import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftEdgeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/ ";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        //maximize the page
        driver.manage().window().maximize();
        //print the title of the page

        String title = driver.getTitle();
        System.out.println("The title of the page is: " +title);
        // print the source page
        String sourcepage = driver.getPageSource();
        System.out.println("The source page is: " +sourcepage);
        //enter the email field
       WebElement email = driver.findElement(By.id("txtUsername"));
       email.sendKeys("mahantswami@gmail.com");
       // enter the password to password field
        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("1234##@");

        driver.close();




    }

}
