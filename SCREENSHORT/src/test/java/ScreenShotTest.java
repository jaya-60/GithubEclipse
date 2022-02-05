import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotTest {
 WebDriver driver;

 @BeforeMethod
 public void setup() {
  System.setProperty("webdriver.chrome.driver",
    "C:\\study softwares\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.google.com/");
 }
 @Test
 public void testCase1() throws InterruptedException {
  driver.findElement(By.name("q")).sendKeys("Pawan Kalyan");
  Thread.sleep(1000);
  TakeScreenShot.screenShot(driver, "sh1");


}

 @AfterMethod
 public void tearDown() {
  driver.close();
 }

}