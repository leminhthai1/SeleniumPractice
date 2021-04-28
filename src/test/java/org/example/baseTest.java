package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseTest {

    public class initialTest {

        public static final String URL_login_email = "https://bitly.com.vn/wzl7qg";
        public static final String URL_login_password = "https://bitly.com.vn/4ykkib";

        WebDriver driver;

        @BeforeClass
        public void setUp() {
            driver = new ChromeDriver();
            driver.get(URL_login_email);
        }

        @AfterClass
        public void tearDown() {
            driver.quit();
        }
    }

//    public class loginPassword extends loginEmail {
//        String URL_login_password = "https://bitly.com.vn/4ykkib";
//        String passwordTxt = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
//        String showPasswordChk = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]";
//        String nextBtn = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]";
//        String user_password = "user_password";
//
//        public void login(String user_password) {
//            driver.findElement(By.xpath(passwordTxt)).sendKeys(user_password);
//            driver.findElement(By.xpath(showPasswordChk)).click();
//            driver.findElement(By.xpath(nextBtn)).click();
//        }
//
//        @Test
//        public void loginWithPassword() {
//            login("ad1234");
//            Assert.assertEquals(driver.getCurrentUrl(), URL_login_password);
//        }
//    }
}

