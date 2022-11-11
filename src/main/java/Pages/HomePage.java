package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public AddUser clickAddUser(){

        driver.findElement(By.xpath("//*[text()=' Add User']")).click();
        return new AddUser(driver);
    }
}
