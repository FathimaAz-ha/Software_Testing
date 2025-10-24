import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.WebDriver;

public class App {
    public static void main(String[] args) throws Exception {
       System.setProperty(key:"webdriver.chrome.drive", value:"D:\\2021ICT48\\Software_Testing\\ST1\\src\\Drivers\\chromedriver.exe"); //initializing the driver
       WebDriver driver = new ChromeDriver(); //creating interface for the web driver
       driver.get(url:"https://vle.fas.vau.ac.lk/login/index.php"); //destination url

        driver.manage().window().maximize();
        Thread.sleep(millis:5000);
        driver.quit();
    }
}
