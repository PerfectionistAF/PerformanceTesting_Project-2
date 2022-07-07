import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//SC5: CHANGE CURRENCIES FROM US-EURO
//Amazon NOT JUMIA
public class Currencies {
    public static void main(String[] args) throws InterruptedException {

        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //VALID TESTCASE
        //driver.findElement(By.xpath(("//span[@class=nav-icon nav-arrow]"))).click();
        driver.findElement(By.id("icp-nav-flyout")).click();
        driver.findElement(By.xpath("//span[@class=a-button-text a-declarative]")).click();
        //driver.findElement(By.className("btn _prim -fw")).click();
        driver.findElement(By.xpath("//button[@class=btn _prim -fw]")).click();
        driver.findElement(By.id("icp-currency-dropdown_19")).click();
        driver.findElement(By.className("a-button-input")).click();
        Thread.sleep(3000);

        driver.close();

    }
}
