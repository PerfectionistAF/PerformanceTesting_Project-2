import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//SC2:  SIGN IN

public class SignIn {
    /*** WORKING SELENIUM TEST FILE FOR VALID CASES ONLY ***\
    public static void main(String[] args) throws InterruptedException{
     String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
     System.out.println(driverPath);
     System.setProperty("webdriver.chrome.driver", driverPath);

     WebDriver driver = new ChromeDriver();

     driver.navigate().to("https://www.jumia.com.eg/customer/account/login/");
     driver.manage().window().maximize();
     Thread.sleep(3000);

     //VALID TESTCASE
     driver.findElement(By.name("email")).sendKeys("tom.smith12341@yahoo.com");
     driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
     //driver.findElement(By.xpath("//label[text()='E-mail']")).sendKeys("tom.smith12341@yahoo.com");
     //driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("SuperSecretPassword!");
     //driver.findElement(By.className("btn _prim _i -mts")).click();
     driver.findElement(By.xpath("//button[@class=\"btn _prim _i -mts\"]")).click();
     driver.findElement(By.xpath("//div[@class=\"rc-imageselect-checkbox\"]")).click();
     //driver.findElement(By.xpath("//div[className()='rc-imageselect-checkbox']")).click();
     //driver.findElement(By.xpath("//div[className()='rc-imageselect-checkbox']")).click();
     //driver.findElement(By.xpath("//button[text()='Verify']")).click();
     Thread.sleep(3000);

     driver.close();
    } ***/

    /*TESTNG FILE*/
    WebDriver driver = null ;

    @BeforeTest
    public void PreTest() throws InterruptedException {
        String driverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver2.exe";
        System.out.println(driverPath);
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        Thread.sleep(3000);

    }

    @Test
    public void Valid() {
        //VALID TESTCASE
        driver.navigate().to("https://www.jumia.com.eg/customer/account/login/");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("tom.smith12341@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//label[text()='E-mail']")).sendKeys("tom.smith12341@yahoo.com");
        //driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("SuperSecretPassword!");
        //driver.findElement(By.className("btn _prim _i -mts")).click();
        driver.findElement(By.xpath("//button[@class=\"btn _prim _i -mts\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"rc-imageselect-checkbox\"]")).click();
        //driver.findElement(By.xpath("//div[className()='rc-imageselect-checkbox']")).click();
        //driver.findElement(By.xpath("//div[className()='rc-imageselect-checkbox']")).click();
        //driver.findElement(By.xpath("//button[text()='Verify']")).click();
        String expectedResult= "Account Overview";
        String actualResult=driver.findElement(By.xpath("//header[@class=\"-df -i-ctr -pvs -phm -bb -mh-48px\"]")).getText();
        System.out.println("actual result:"+actualResult);

        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void InValid() {
        //INVALID TESTCASE
        driver.navigate().to("https://www.jumia.com.eg/customer/account/login/");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("invalid");
        driver.findElement(By.name("password")).sendKeys("Super");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
        //driver.findElement(By.className("btn _prim _i -mts")).click();
        driver.findElement(By.xpath("//button[@class=\"btn _prim _i -mts\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"rc-imageselect-checkbox\"]")).click();
        //driver.findElement(By.xpath("//div[className()='rc-imageselect-checkbox']")).click();
        //driver.findElement(By.xpath("//div[className()='rc-imageselect-checkbox']")).click();
        //driver.findElement(By.xpath("//button[text()='Verify']")).click();
        String expectedResult= "Invalid Information";
        /***String actualResult=driver.findElement(By.xpath("//header[@class=-df -i-ctr -pvs -phm -bb -mh-48px]")).getText();***/
        //System.out.println("actual result:"+actualResult);
        //Assert.assertTrue(actualResult.contains(expectedResult),"Error: Invalid Username or Password");

    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();

    }
}
