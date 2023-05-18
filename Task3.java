package class01.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    /* HW (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textBoxes
close the popup
close the browser

Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account

what is the reason, will discuss in next lecture

     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suzy");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Catindig");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("catindigsuzanne@gmail.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("S098765c");

        driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}

