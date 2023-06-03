package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNGExample {
    public  static WebDriver driver;

//   pre conditions---> to open the browser
//                      to set implicit wait
    @BeforeMethod(alwaysRun = true)
    public  void SetupBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

//    post-condition--> to  close the browser
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

//test case1
    @Test(groups = "regression")
    public void loginFunctionality(){
        WebElement username=driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBtn.click();
    }

//test case2
//verify that password text box is displayed on the logic
    @Test
    public void passwordTextBoxVerification(){
//find the webElement password text box
        WebElement password=driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        System.out.println(password.isDisplayed());

    }
}