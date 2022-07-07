import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//SC8: SELECT DIFFERENT TAGS(Select all)

public class SelectTags {
    public static void main(String[] args) throws InterruptedException {

        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.jumia.com.eg/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //VALID TESTCASE
        driver.findElement(By.xpath(("//h2[@class=-m -fs20 -elli]"))).sendKeys(Keys.chord(Keys.CONTROL, "a"));
        Thread.sleep(3000);

        driver.close();

    }
}
