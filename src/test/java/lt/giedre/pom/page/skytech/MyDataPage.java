package lt.giedre.pom.page.skytech;

import lt.giedre.pom.page.Common;
import lt.giedre.pom.page.Locators;

public class MyDataPage {
    public static void open() {
        LoginPage.openWithCorrectUserLogin();
    }

    public static void clickOnEdit() {
        Common.clickOnElement(
                Locators.Skytech.HomePage.editIcon
        );
    }

    public static void clickOnLastNameFieldAndDeleteText() {
        Common.getElementAndDeleteText(
                Locators.Skytech.HomePage.sendLastName
        );
    }

    public static void clickAndSendText(String textToSent) {
        Common.sendKeysToField(
                Locators.Skytech.HomePage.sendLastName,
                textToSent
        );
    }

    public static void clickOnSave() {
        Common.clickOnElement(
                Locators.Skytech.HomePage.save
        );
    }

    public static void waitTextInElement(String expectedResult) {
        Common.waitForTextInElement(
                Common.getElement(Locators.Skytech.HomePage.checkingLastName), expectedResult);
    }

    public static String isLastNameChanged() {
        return Common.getTextFromElement(
                Locators.Skytech.HomePage.checkingLastName
        );
    }
}

