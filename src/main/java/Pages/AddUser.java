package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddUser {
    public WebDriver driver;

    private By firstName = By.name("FirstName");
    private By lastName = By.name("LastName");
    private By userName = By.name("UserName");
    private By password = By.name("Password");
    private By companyAAA = By.xpath("//label[text()='Company AAA']");
    private By roleSelect = By.name("RoleId");
    private By email =By.name("Email");
    private By cellPhone =By.name("Mobilephone");
    private By closeButton = By.className("btn btn-danger");
    private By saveButton = By.xpath("//button[text()='Save']");


    public AddUser(WebDriver driver){
        this.driver =driver;

    }

    public void setFirstName(String inputFirstName){
        driver.findElement(firstName).clear();
       driver.findElement(firstName).sendKeys(inputFirstName);
    }

    public void setLastName(String inputLastName){
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(inputLastName);
    }

    public void setUserName(String inputUserName){
        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys(inputUserName);

    }
    public void setPassword(String inputPassword){
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(inputPassword);
    }
    public void setCompanyAAA(){
        driver.findElement(companyAAA).click();

    }
    public void setRole(String InputRole){
        driver.findElement(roleSelect).sendKeys(InputRole);
    }
    public void setEmail(String InputEmail){
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(InputEmail);
    }
    public void setCellPhone(String InputCellphone){
        driver.findElement(cellPhone).clear();
        driver.findElement(cellPhone).sendKeys(InputCellphone);
    }
    public void setSaveButton(){

        driver.findElement(saveButton).click();
    }

    public void setCloseButton() {
        driver.findElement(closeButton).click();

    }
}
