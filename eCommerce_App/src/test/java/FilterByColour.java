import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//SC7: FILTER BY COLOUR IN A CATEGORY(WOMEN'S FASHION)

public class FilterByColour {
    public static void main(String[] args) throws InterruptedException {

        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.jumia.com.eg/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //VALID TESTCASE
        driver.findElement(By.xpath(("//a[@href=\"/category-fashion-by-jumia/\"]"))).click();
        driver.findElement(By.xpath(("//a[@href=\"/womens-fashion/\"]"))).click();
        driver.findElement(By.xpath(("//a[@href=\"/womens-fashion/?color_family=Black#catalog-listing\"]"))).click();

        Thread.sleep(3000);

        driver.close();

    }
}
