package class01.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    /* navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser

Note: use name or id as locators

     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("customer.firstName")).sendKeys("Suzanne");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Catindig");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.street")).sendKeys("1537 28th St Apt 1");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Arlington");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22206");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("5717337051");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.ssn")).sendKeys("271677130");
        Thread.sleep(2000);

        driver.findElement(By.id("customer.username")).sendKeys("suzycatindig");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.password")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("12345");
        Thread.sleep(2000);

        driver.close();
    }
}
