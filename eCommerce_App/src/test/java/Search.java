import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

//SC4: SEARCH FOR PRODUCT

public class Search {
    public static void main(String[] args) throws InterruptedException {

        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.jumia.com.eg/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //VALID TESTCASE
        Scanner sc= new Scanner(System.in);
        String searched=sc.next();
        driver.findElement(By.id("fi-q")).sendKeys(searched);
        Thread.sleep(1000);
        driver.findElement(By.id("fi-q")).sendKeys(Keys.ENTER);

        driver.close();

    }
}
