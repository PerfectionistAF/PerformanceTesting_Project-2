import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//SC11: ADD TO COMPARE LIST

public class Comparelist {
    public static void main(String[] args) throws InterruptedException {

        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.jumia.com.eg/receiver-i-fun-hd-mini-nova-mpg890452.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //VALID TESTCASE
        driver.findElement(By.xpath(("//a[@href=\"/satellite-television-receivers/nova/\"]"))).click();
        driver.findElement(By.xpath(("//a[@href=\"/satellite-television-receivers/nova/#catalog-listing\"]"))).click();
        driver.findElement(By.xpath(("//a[@href=\"/pro-max-full-hd-satellite-receiver-with-built-in-wifi-black-nova-mpg749189.html\"]"))).click();
        driver.findElement(By.xpath(("//a[@href=#othersellers]"))).click();

        Thread.sleep(3000);

        driver.close();

    }
}
