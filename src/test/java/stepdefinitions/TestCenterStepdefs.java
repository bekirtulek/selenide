package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.visible;


public class TestCenterStepdefs {
    TestCenterPage testCenterPage=new TestCenterPage();
    @And("kullanici username girer")
    public void kullaniciUsernameGirer() {
        testCenterPage.usernameBox.setValue("techproed");
    }

    @And("kullanici password girer")
    public void kullaniciPasswordGirer() {
        testCenterPage.passwordBox.setValue("SuperSecretPassword");
    }

    @When("kullanici submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() {
        testCenterPage.submitButton.click();
    }

    @Then("kullanici login oldugunu gorur")
    public void kullaniciLoginOldugunuGorur() {
       // Assert.assertTrue(testCenterPage.loginMessage.isDisplayed());
        //testCenterPage.loginMessage.shouldBe(visible);
        testCenterPage.loginMessage.shouldBe(visible);//selenide assertion
        //fail ederse ekran goruntusu otomatik alinir ve build icine kayder

    }
}
