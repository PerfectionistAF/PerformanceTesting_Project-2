import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//SC3: RESET PASSWORD

public class PassReset {
    public static void main(String[] args) throws InterruptedException {

        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.jumia.com.eg/customer/account/login/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        //VALID TESTCASE
        driver.findElement(By.name("email")).sendKeys("tom.smith12341@yahoo.com");
        driver.findElement(By.xpath(("//a[@href=\"/customer/account/forgotpassword/\"]"))).click();
        driver.findElement(By.name("email")).sendKeys("tom.smith12341@yahoo.com");
        //driver.findElement(By.xpath("//label[@text=Enter your e-mail address]")).sendKeys("tom.smith12341@yahoo.com");
        //driver.findElement(By.className("btn _prim -fw")).click();
        driver.findElement(By.xpath("//button[@class=btn _prim -fw]")).click();
        //driver.findElement(By.xpath("//div[@class=col8 -df -pvm]")).click();
        //Thread.sleep(3000);

        driver.close();

    }
}
