// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class E2ETESTTest {

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
      driver = new ChromeDriver();
      js = (JavascriptExecutor) driver;
      vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
      driver.quit();
    }
    @Test
    public void e2ETEST() {
      driver.get("http://localhost:3000/home");
      driver.manage().window().setSize(new Dimension(1440, 875));
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.linkText("Home")).click();
      {
        WebElement element = driver.findElement(By.linkText("Home"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.linkText("About Us")).click();
      {
        WebElement element = driver.findElement(By.linkText("About Us"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.findElement(By.linkText("Contact Us")).click();
      {
        WebElement element = driver.findElement(By.linkText("Contact Us"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }

      driver.findElement(By.cssSelector("li:nth-child(4)")).click();
      driver.findElement(By.cssSelector(".mb-3:nth-child(3) > .form-control")).click();
      driver.findElement(By.cssSelector(".mb-3:nth-child(3) > .form-control")).sendKeys("Executive One");
      driver.findElement(By.cssSelector(".row:nth-child(4) > .col:nth-child(1) .form-control")).sendKeys("exec1@gmail.com");
      driver.findElement(By.cssSelector(".row:nth-child(4) > .col:nth-child(2) .form-control")).sendKeys("exec1");
      driver.findElement(By.cssSelector(".row:nth-child(5) > .col:nth-child(1) .form-control")).sendKeys("2342342341");
      driver.findElement(By.cssSelector(".row:nth-child(5) > .col:nth-child(2) .form-control")).sendKeys("Test Address");
      driver.findElement(By.cssSelector(".row:nth-child(6) > .col > .mb-3 > .form-control")).sendKeys("Test Bank");
      driver.findElement(By.cssSelector(".row:nth-child(1) > .col:nth-child(1) .form-control")).sendKeys("999999999");
      driver.findElement(By.cssSelector(".row:nth-child(1) > .col:nth-child(2) .form-control")).sendKeys("999999999");
      driver.findElement(By.cssSelector(".btn:nth-child(9)")).click();
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      driver.findElement(By.cssSelector(".primary")).click();
      {
        WebElement element = driver.findElement(By.cssSelector(".primary"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.findElement(By.cssSelector(".mb-3:nth-child(3) > .form-control")).sendKeys("abcdef");
      driver.findElement(By.cssSelector(".mb-3:nth-child(4) > .form-control")).sendKeys("abcdef@gmail.com");
      driver.findElement(By.cssSelector(".mb-3:nth-child(5) > .form-control")).sendKeys("abcdef");
      driver.findElement(By.cssSelector(".mb-3:nth-child(6) > .form-control")).sendKeys("2602602609");
      driver.findElement(By.cssSelector(".btn:nth-child(9)")).click();
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      driver.findElement(By.cssSelector(".secondary")).click();
      {
        WebElement element = driver.findElement(By.cssSelector(".secondary"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.findElement(By.cssSelector(".mb-3:nth-child(3) > .form-control")).sendKeys("abhi@gmail.com");
      driver.findElement(By.cssSelector(".mb-3:nth-child(4) > .form-control")).sendKeys("abhi123");
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector(".login .btn")).click();
      driver.findElement(By.linkText("Home")).click();
      {
        WebElement element = driver.findElement(By.linkText("Home"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.get("http://localhost:3000/home");
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(4)")).click();
      driver.findElement(By.cssSelector(".form-control")).sendKeys("This is a test");
      driver.findElement(By.cssSelector(".position-absolute")).click();
      {
        WebElement element = driver.findElement(By.cssSelector(".position-absolute"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".customer-management .edit-toggle")).click();
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(2)")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(3)")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(4)")).click();
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector(".carry-btn")).click();
      driver.findElement(By.cssSelector(".mb-3:nth-child(3) > .form-control")).click();
      driver.findElement(By.cssSelector(".mb-3:nth-child(3) > .form-control")).sendKeys("9th street, Kings colony");
      driver.findElement(By.cssSelector(".mb-3:nth-child(4) > .form-control")).sendKeys("0-19/2, lEMAN COLONY");
      driver.findElement(By.cssSelector(".mb-3:nth-child(5) > .form-control")).sendKeys("Knock the door");
      driver.findElement(By.cssSelector(".carry-btn")).click();
      {
        WebElement element = driver.findElement(By.cssSelector(".carry-btn"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      driver.findElement(By.cssSelector(".carry-btn")).click();
      {
        WebElement element = driver.findElement(By.cssSelector(".carry-btn"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.findElement(By.cssSelector(".carry-btn")).click();
      {
        WebElement element = driver.findElement(By.cssSelector(".carry-btn"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.get("http://localhost:3000/home");
      driver.findElement(By.cssSelector(".primary")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      driver.findElement(By.cssSelector(".secondary")).click();
      {
        WebElement element = driver.findElement(By.cssSelector(".secondary"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.findElement(By.cssSelector(".mb-3:nth-child(3) > .form-control")).sendKeys("abhinay@gmail.com");
      driver.findElement(By.cssSelector(".mb-3:nth-child(4) > .form-control")).sendKeys("abhinay");
      driver.findElement(By.cssSelector(".login .btn")).click();
      driver.findElement(By.linkText("Home")).click();
      {
        WebElement element = driver.findElement(By.linkText("Home"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.get("http://localhost:3000/home");
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(4)")).click();
      driver.findElement(By.cssSelector(".form-control")).sendKeys("This is a test");
      driver.findElement(By.cssSelector(".position-absolute > img")).click();
      {
        WebElement element = driver.findElement(By.cssSelector(".position-absolute > img"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".edit-toggle")).click();
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(2)")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(3)")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(4)")).click();
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.get("http://localhost:3000/home");
      driver.findElement(By.cssSelector(".primary")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

      driver.findElement(By.cssSelector(".secondary")).click();
      {
        WebElement element = driver.findElement(By.cssSelector(".secondary"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.findElement(By.cssSelector(".mb-3:nth-child(3) > .form-control")).sendKeys("admin@gmail.com");
      driver.findElement(By.cssSelector(".mb-3:nth-child(4) > .form-control")).sendKeys("admin");
      driver.findElement(By.cssSelector(".login .btn")).click();
      driver.findElement(By.linkText("Home")).click();
      {
        WebElement element = driver.findElement(By.linkText("Home"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.get("http://localhost:3000/home");
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(4)")).click();
      {
        WebElement element = driver.findElement(By.cssSelector("li:nth-child(4)"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element).perform();
      }
      {
        WebElement element = driver.findElement(By.tagName("body"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element, 0, 0).perform();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(1)")).click();
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(2)")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(3)")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      driver.findElement(By.cssSelector(".col-6:nth-child(4)")).click();
      driver.findElement(By.cssSelector("li:nth-child(1)")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      driver.get("http://localhost:3000/home");
      driver.findElement(By.cssSelector(".primary")).click();
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
}
