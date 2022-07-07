import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//SC9: ADD TO CART

public class Cart {
    public static void main(String[] args) throws InterruptedException {

        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.jumia.com.eg/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //VALID TESTCASE
        //driver.navigate().to("https://www.jumia.com.eg/sensodyne-extra-fresh-toothpaste-for-sensitive-teeth-100ml-buy-2-get-1-free-27214753.html");
        driver.findElement(By.xpath(("//img[@data-src=\"https://eg.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/35/741272/1.jpg?7131\"]"))).click();
        driver.findElement(By.name("email")).sendKeys("tom.smith12341@yahoo.com");
        driver.findElement(By.xpath("//button[@class=add btn _prim -pea _i -fw]")).click();
        Thread.sleep(3000);

        driver.close();

    }
}
