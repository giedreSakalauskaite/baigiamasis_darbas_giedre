package lt.giedre.pom.test;

import lt.giedre.pom.page.Common;
import lt.giedre.pom.utilities.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public abstract class BaseTest {
    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public static void tearDown() {
        Common.quitDriver();
    }

}
