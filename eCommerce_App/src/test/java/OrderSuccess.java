import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//SC12: SUCCESSFUL ORDER

public class OrderSuccess {
    public static void main(String[] args) throws InterruptedException {

        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.jumia.com.eg/receiver-i-fun-hd-mini-nova-mpg890452.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //VALID TESTCASE
        driver.findElement(By.xpath("//button[@class=add btn _prim -pea _i -fw]")).click();
        driver.findElement(By.xpath(("//a[@href=\"/cart/\"]"))).click();
        driver.findElement(By.xpath(("//a[@href=\"/checkout/\"]"))).click();
        //LOGIN
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("tom.smith12341@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//label[text()='E-mail']")).sendKeys("tom.smith12341@yahoo.com");
        //driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("SuperSecretPassword!");
        //driver.findElement(By.className("btn _prim _i -mts")).click();
        driver.findElement(By.xpath("//button[@class=\"btn _prim _i -mts\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"rc-imageselect-checkbox\"]")).click();
        //ADDRESS DETAILS
        driver.findElement(By.name("ShippingAddressForm[phone]")).sendKeys("1023210809");
        driver.findElement(By.name("ShippingAddressForm[address1]")).sendKeys("Abbas Elakad/Bldg 12/Fifth Floor");
        driver.findElement(By.name("ShippingAddressForm[fk_customer_address_city]")).click();
        driver.findElement(By.xpath("//select//option[@value=Nasr City Al Hay Al Asher]")).click();
        //DELIVERY METHOD
        driver.findElement(By.id("osh-opc-btn-save-address-shipping")).click();
        driver.findElement(By.id("osh-opc-btn-save")).click();
        //PAYMENT
        driver.findElement(By.xpath("//label[@for=CashOnDelivey_CashOnDelivery]")).click();
        //CONFIRM ORDER
        driver.findElement(By.className("osh-btn -primary -full-width -mtxxl js-throttle")).click();


        //Thread.sleep(3000);

        driver.close();

    }
}
