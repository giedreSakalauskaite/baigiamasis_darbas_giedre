package lt.giedre.pom.page.skytech;

import lt.giedre.pom.page.Common;
import lt.giedre.pom.page.Locators;

public class LoginPage {
    public static void open() {
        Common.setUpChromeDriver();
        Common.openUrl("https://www.skytech.lt/");
    }

    public static void openWithCorrectUserLogin() {
        String addEmailAddress = "mokinysVCS@gmail.com";
        String addPassword = "mokinysvcs";

        Common.setUpChromeDriver();
        Common.openUrl("https://www.skytech.lt/");
        LoginPage.clickOnTheLogIn();
        LoginPage.enterEmail(addEmailAddress);
        LoginPage.enterPassword(addPassword);
        LoginPage.clickOnSubmit();
    }

    public static void clickOnTheLogIn() {
        Common.clickOnElement(
                Locators.Skytech.HomePage.linkLogin
        );
    }

    public static void enterEmail(String addEmailAddress) {
        Common.sendKeysToField(
                Locators.Skytech.LogIn.emailAdress,
                addEmailAddress
        );
    }

    public static void enterPassword(String addPassword) {
        Common.sendKeysToField(
                Locators.Skytech.LogIn.password,
                addPassword
        );
    }

    public static void clickOnSubmit() {
        Common.clickOnElement(
                Locators.Skytech.LogIn.userLogin
        );
    }

    public static String doesMyAccountAppeard() {
        return Common.getTextFromElement(
                Locators.Skytech.HomePage.myAccount
        );
    }

    public static String doesAlertErrorMessageAppears() {
        return Common.getTextFromElement(
                Locators.Skytech.LogIn.loginError
        );
    }
}
