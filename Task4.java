package class01.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Open chrome browser
Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D"
fill in the complete form
 */
public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();

        WebElement fname=driver.findElement(By.cssSelector("input[name='first_name']"));
        fname.sendKeys("Keanu");
        WebElement lname=driver.findElement(By.cssSelector("input[name='last_name']"));
        lname.sendKeys("Sebastian");
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("krsebastian@gmail.com");
        WebElement phone=driver.findElement(By.cssSelector("input[name='phone']"));
        phone.sendKeys("7513458902");
        WebElement address=driver.findElement(By.xpath("//input[@name='address']"));
        address.sendKeys("1234 22 St. Woodbridge");
        WebElement city=driver.findElement(By.cssSelector("input[data-bv-field='city']"));
        city.sendKeys("Miami");
        WebElement state=driver.findElement(By.cssSelector("select[data-bv-field='state']"));
        state.sendKeys("Florida");
        WebElement zipcode=driver.findElement(By.cssSelector("input[placeholder='Zip Code']"));
        zipcode.sendKeys("22500");
        WebElement website=driver.findElement(By.xpath("//input[@name='website']"));
        website.sendKeys("instagram.com");
        WebElement host=driver.findElement(By.cssSelector("input[value='yes']"));
        host.click();
        Thread.sleep(2000);
        WebElement comment=driver.findElement(By.cssSelector("textarea[name='comment']"));
        comment.sendKeys("hola amigo");
        Thread.sleep(2000);
        WebElement send = driver.findElement(By.xpath("//button[text()='Send ']"));
        send.click();

        driver.close();
    }
}
