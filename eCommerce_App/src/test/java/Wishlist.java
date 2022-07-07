import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//SC10: ADD TO WISHLIST

public class Wishlist {
    public static void main(String[] args) throws InterruptedException {

        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.jumia.com.eg/sensodyne-extra-fresh-mouthwash-green-500-ml-21926344.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //VALID TESTCASE
        driver.findElement(By.xpath("//svg[@aria-label=Add to wishlist]")).click();
        Thread.sleep(3000);

        driver.close();

    }
}
