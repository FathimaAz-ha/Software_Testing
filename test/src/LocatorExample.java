import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class LocatorExample {
    public static void main(String[] args){
         System.setProperty("webdriver.chrome.driver", "D:\\2021ICT48\\SQA\\Software_Testing\\test\\src\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vle.fas.vau.ac.lk/login/index.php");
        driver.manage().window().maximize();
        // 1. Locate by ID
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("username");

        // 2. Loacte by Name
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Your password");

        // 3. Locate className
        WebElement logo = driver.findElement(By.className("img-fluid"));
        System.out.println("Logo displayed: " + logo.isDisplayed());

        // 4. Locate by tagname
        WebElement heading = driver.findElement(By.tagName("h1"));
        System.out.println("Heading displayed: " + heading.isDisplayed());

        // 5. Locate by link text
        WebElement lostpassword = driver.findElement(By.linkText("Lost password?"));
        lostpassword.click();

        // 6. Locate by X path
       WebElement username_X = driver.findElement(By.xpath("//input[@id='username']"));
       username_X.sendKeys("username");


        //Thread.sleep(5000);
        driver.quit();
    }
    
}
