import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {

    //Test eCommerce App:JUMIA
    public static void main(String[] args) throws InterruptedException {

        String driverPath= System.getProperty("user.dir")+ "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(driverPath);
        System.setProperty("webdriver.chrome.driver",driverPath);

        WebDriver driver = new ChromeDriver();
        //JUMIA HOMEPAGE
        driver.navigate().to("https://www.jumia.com.eg/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        /*driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(3000);
        //REGISTER TESTCASE
        driver.navigate().to("https://www.amazon.eg/-/en/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.eg%2F%3F%26tag%3Degtxabkgode-21%26ref%3Dnav_ya_signin%26adgrpid%3D123528178741%26hvpone%3D%26hvptwo%3D%26hvadid%3D542971874049%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D10236497667615662389%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9048955%26hvtargid%3Dkwd-10573980%26hydadcr%3D334_2546792%26gclid%3DCjwKCAjw46CVBhB1EiwAgy6M4mp5Moj_W3I6JnK_qhnzMEMVI6trbmZars0eNscw5TaJEJcn0Vg4ShoCxWMQAvD_BwE%26language%3Den_AE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=egflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        driver.findElement(By.id("createAccountSubmit")).click();
        driver.navigate().to("https://www.amazon.eg/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&language=en&pageId=egflex&openid.return_to=https%3A%2F%2Fwww.amazon.eg%2F%3F%26tag%3Degtxabkgode-21%26ref%3Dnav_ya_signin%26adgrpid%3D123528178741%26hvpone%3D%26hvptwo%3D%26hvadid%3D542971874049%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D10236497667615662389%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9048955%26hvtargid%3Dkwd-10573980%26hydadcr%3D334_2546792%26gclid%3DCjwKCAjw46CVBhB1EiwAgy6M4mp5Moj_W3I6JnK_qhnzMEMVI6trbmZars0eNscw5TaJEJcn0Vg4ShoCxWMQAvD_BwE%26language%3Den_AE&prevRID=W7WRGPYQZWDAM15Q7VA7&openid.assoc_handle=egflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        driver.findElement(By.id("ap_customer_name")).sendKeys("Tom Smith");
        driver.findElement(By.id("ap_email")).sendKeys("tom.smith12341@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.name("passwordCheck")).sendKeys("SuperSecretPassword!");
        Thread.sleep(3000);
        driver.findElement(By.className("a-button-input")).click();
        //https://www.amazon.eg/ap/cvf/request?arb=513e5695-13c3-4534-84d9-d5285e0b9ccb&language=en
        //https://www.amazon.eg/ap/cvf/request?arb=513e5695-13c3-4534-84d9-d5285e0b9ccb&language=en

         */

        driver.close();
    }
}
