package org.example;

import org.junit.Assert;
import org.junit.Test;
import static org.example.baseTest.initialTest.URL_login_email;

public class loginTest extends baseTest{
    loginPage loginPg;

    @Test
    public void loginByUser() {
        loginPg = new loginPage(loginPg.driver);
        loginPg.login("leminhthai1");
        Assert.assertEquals(loginPg.driver.getCurrentUrl(), URL_login_email);
    }

    @Test
    public void loginWithBlank() {
        loginPg = new loginPage(loginPg.driver);
        loginPg.login("");
        Assert.assertEquals(loginPg.driver.getCurrentUrl(), URL_login_email);
    }
}
