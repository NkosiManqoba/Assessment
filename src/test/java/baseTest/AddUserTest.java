package baseTest;

import Pages.AddUser;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddUserTest extends BaseTests {

    @Test(dataProvider = "UserData")
    public void newUserAdded(String fName, String lName,String userName, String passWord , String InputRole ,String InputEmail,
    String InputCellphone) throws InterruptedException {

        AddUser newUser =homePage.clickAddUser();
        newUser.setFirstName(fName);
        newUser.setLastName(lName);
        newUser.setUserName(userName);
        newUser.setPassword(passWord);
        newUser.setCompanyAAA();
        newUser.setRole(InputRole);
        newUser.setEmail(InputEmail);
        newUser.setCellPhone(InputCellphone);
        newUser.setSaveButton();
        //newUser.setCloseButton();

    }
    @DataProvider
    public Object[][] UserData(){
        Object[][] data = new Object[3][7];

        data[0][0] = "FName1";data[0][1] = "LName1";data[0][2] ="User1";data[0][3]="Pass1";data[0][4]="Admin";
        data[0][5]="Admin@mail.com";data[0][6]="082555";
        data[1][0] = "FName2";data[1][1] = "LName2";data[1][2] ="User1";data[1][3]="Pass2";data[1][4]="Customer";
        data[1][5]="customer@mail.com";data[1][6]="083444";
        data[2][0] = "FName3";data[2][1] = "LName3";data[2][2] ="User1";data[2][3]="Pass3";data[2][4]="Sales Team";
        data[2][5]="customermail.com";data[2][6]="089444";
        return data;

        //Added an invalid email in the 3rd data set so that the save button is not clickable and the system
        // shouldn't allow me to save but my script doesn't fail on the last data entry
    }

}

