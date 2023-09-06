package lt.giedre.pom.page.skytech;

import lt.giedre.pom.page.Common;
import lt.giedre.pom.page.Locators;

public class CartPage {
    public static void open() {
        LoginPage.openWithCorrectUserLogin();
    }

    public static void clickOnSearchFieldAndEnterText(String searchValue) {
        Common.sendKeysToField(
                Locators.Skytech.HomePage.searchField,
                searchValue
        );
    }

    public static void clickOnSearchButton() {
        Common.clickOnElement(
                Locators.Skytech.HomePage.searchButton
        );
    }

    public static void addItemIntoCart() {
        Common.clickOnElement(
                Locators.Skytech.Cart.cartIcon
        );

    }

    public static String checkIfCartStatusIsChanged() {
        return Common.getTextFromElement(
                Locators.Skytech.Cart.cartText
        );
    }

    public static void clickOnCart() {
        Common.clickOnElement(
                Locators.Skytech.Cart.cartText

        );
    }

    public static void clickOnRemoveIcon() {
        Common.clickOnElement(
                Locators.Skytech.Cart.removeIcon
        );
    }

    public static String checkIfCartStatusIsChangedAfterRemoving() {
        return Common.getTextFromElement(
                Locators.Skytech.Cart.itemIsRemoved
        );
    }

    public static void clearSearchField() {
        Common.getElementAndDeleteText(
                Locators.Skytech.HomePage.searchField
        );
    }
}
