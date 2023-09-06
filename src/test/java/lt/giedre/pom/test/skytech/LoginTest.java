package lt.giedre.pom.test.skytech;

import lt.giedre.pom.page.skytech.LoginPage;
import lt.giedre.pom.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        LoginPage.open();
    }

    @Test
    public void loginWithValidEmail() {
        String addEmailAddress = "mokinysVCS@gmail.com";
        String addPassword = "mokinysvcs";
        String expectedText = "Mano paskyra";
        String actualText;
        LoginPage.clickOnTheLogIn();
        LoginPage.enterEmail(addEmailAddress);
        LoginPage.enterPassword(addPassword);
        LoginPage.clickOnSubmit();
        actualText = LoginPage.doesMyAccountAppeard();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void loginWithInvalidEmail() {
        String addEmailAddress = "mokinysVCS@mail.com";
        String addPassword = "mokinysvcs";
        String expectedText = "Neteisingas el. pašto adresas arba / ir slaptažodis.";
        String actualText;
        LoginPage.clickOnTheLogIn();
        LoginPage.enterEmail(addEmailAddress);
        LoginPage.enterPassword(addPassword);
        LoginPage.clickOnSubmit();
        actualText = LoginPage.doesAlertErrorMessageAppears();
        Assert.assertEquals(actualText, expectedText);
    }
}
