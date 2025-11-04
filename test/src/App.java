import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver" , "D:\\2021ICT48\\SQA\\Software_Testing\\test\\src\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://vle.fas.vau.ac.lk/login/index.php");
        driver.manage().window().maximize();
        //Thread.sleep(5000);
        Thread.sleep(5000);
        driver.quit();
    }
}
