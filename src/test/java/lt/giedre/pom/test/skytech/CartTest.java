package lt.giedre.pom.test.skytech;

import lt.giedre.pom.page.skytech.CartPage;
import lt.giedre.pom.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        CartPage.open();
    }

    @Test
    public void addingItemToCart() {
        String firstItem = "Ariete elektrinis kavos aparatas 1368/01";
        String expectedResult = "Krepšelyje yra 1 prekė";
        String actualResult;
        CartPage.clickOnSearchFieldAndEnterText(firstItem);
        CartPage.clickOnSearchButton();
        CartPage.addItemIntoCart();
        actualResult = CartPage.checkIfCartStatusIsChanged();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test
    public void addingAndremovingItemFromTheCart() {
        String secondItem = "Netatmo Indoor Siren";
        String expectedResult = "Krepšelis yra tuščias";
        String actualResult;
        CartPage.clickOnSearchFieldAndEnterText(secondItem);
        CartPage.clickOnSearchButton();
        CartPage.addItemIntoCart();
        CartPage.clickOnCart();
        CartPage.clickOnRemoveIcon();
        actualResult = CartPage.checkIfCartStatusIsChangedAfterRemoving();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
