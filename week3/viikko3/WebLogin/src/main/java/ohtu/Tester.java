package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class Tester {

    public static void main(String[] args) {
        Random r = new Random();

        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:4567");

        // Test registering
        WebElement element = driver.findElement(By.linkText("register new user"));
        element.click();

        element = driver.findElement(By.name("username"));
        element.sendKeys("newusr"+r.nextInt(10000000));
        element = driver.findElement(By.name("password"));
        element.sendKeys("password2000");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("password2000");
        element = driver.findElement(By.name("signup"));
        element.click();

        element = driver.findElement(By.linkText("continue to application mainpage"));
        element.click();

        // log out after creating new user
        element = driver.findElement(By.linkText("logout"));
        element.click();

        // Test login operations
        
        element = driver.findElement(By.linkText("login"));
        element.click();

        // Fail login by entering right username but bad password
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdf");
        element = driver.findElement(By.name("login"));
        element.submit();

        // Fail login by entering username which doesn't exist
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdf");
        element = driver.findElement(By.name("login"));
        element.submit();


        // login succesfully
        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));

        element.submit();

        driver.quit();
    }
    
    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}
