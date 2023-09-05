package lt.giedre.pom.test;

import lt.giedre.pom.page.Common;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    @BeforeMethod
    public abstract void setUp();

    @AfterMethod
    public static void tearDown(){
        Common.quitDriver();
    }

}
