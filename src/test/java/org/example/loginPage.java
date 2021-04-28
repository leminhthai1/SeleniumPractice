package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    public String user_email = "user_email";
    public String emailTxt = "//input[@id='identifierId']";
    public String nextBtn = "//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]";

    WebDriver driver;

    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void login(String user_email) {
        driver.findElement(By.id(emailTxt)).sendKeys(user_email);
        driver.findElement(By.xpath(nextBtn)).click();
    }
}
