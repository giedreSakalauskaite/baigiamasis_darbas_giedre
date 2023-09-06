package lt.giedre.pom.test.skytech;

import lt.giedre.pom.page.skytech.MyDataPage;
import lt.giedre.pom.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyDataTest extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        MyDataPage.open();
    }

    @Test
    public void changeUserLastName() {
        String text = "Pilipaitienė";
        String expectedResult = "Pilipaitienė";
        String actualResult;
        MyDataPage.clickOnEdit();
        MyDataPage.clickOnLastNameFieldAndDeleteText();
        MyDataPage.clickAndSendText(text);
        MyDataPage.clickOnSave();
        MyDataPage.waitTextInElement(expectedResult);
        actualResult = MyDataPage.isLastNameChanged();
        Assert.assertTrue(actualResult.contains(expectedResult),
                """
                        \n Actual Result:%s
                        \n Expected Result: %s
                        """.formatted(actualResult, expectedResult));
    }
}
