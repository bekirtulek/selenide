package stepdefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.TestCenterPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.switchTo;
import static utilities.ReusableMethods.*;


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
       // Assert.assertTrue(testCenterPage.loginMessage.isDisplayed()); JUnit
        //testCenterPage.loginMessage.shouldBe(visible);
        testCenterPage.loginMessage.shouldBe(visible);//selenide assertion
        //fail ederse ekran goruntusu otomatik alinir ve build icine kayder

    }

    @And("kullanici {string} secili degilse secer")
    public void kullaniciSeciliDegilseSecer(String text) {
        if (text.equals("Checkbox 1")&&!testCenterPage.checkbox1.isSelected()){
            testCenterPage.checkbox1.click();
            //Assert.assertTrue(testCenterPage.checkbox1.isSelected());
            //testCenterPage.checkbox1.shouldBe(Condition.checked);
            testCenterPage.checkbox1.shouldBe(checked);
        }
        if (text.equals("Checkbox 2")&&!testCenterPage.checkbox2.isSelected()) {
            testCenterPage.checkbox2.shouldNotBe(checked);// secili olmadigini test et
            testCenterPage.checkbox2.click();
            testCenterPage.checkbox2.shouldBe(checked);
        }
        if (text.equals("Red")&&!testCenterPage.redRadioButton.isSelected()){
            testCenterPage.redRadioButton.shouldNotBe(checked);
            testCenterPage.redRadioButton.click();
            testCenterPage.redRadioButton.shouldBe(checked);
        }
        if (text.equals("Football")&&!testCenterPage.redRadioButton.isSelected()){
            testCenterPage.footballRadioButton.shouldNotBe(checked);
            testCenterPage.footballRadioButton.click();
            testCenterPage.footballRadioButton.shouldBe(checked);
        }


    }
// DROPDOWN MENU
    @And("kullanici yil olarak {int}, ay olarak {string} gun olarak {int} secer")
    public void kullaniciYilOlarakAyOlarakGunOlarakSecer(int year, String mount, int day) {
        testCenterPage.year.selectOption(String.valueOf(year));
        waitSleep(2);
        testCenterPage.month.selectOption(mount);
        waitSleep(2);
        testCenterPage.day.selectOption(String.valueOf(day));
        waitSleep(2);


    }
// ALERT STEP DEFS
    @And("kullanici alert prompt butonuna tiklar")
    public void kullaniciAlertPromptButonunaTiklar() {
        testCenterPage.promptButton.click();
        waitSleep(2);
    }

    @And("kullanici alerte {string} yazar ve OKe tiklar")
    public void kullaniciAlerteYazarVeOKeTiklar(String text) {
        switchTo().alert().sendKeys(text);
        waitSleep(2);
        switchTo().alert().accept();
        waitSleep(2);
    }

    @Then("kullanici sonucun {string} icerdigini test eder")
    public void kullaniciSonucunIcerdiginiTestEder(String message) {
        testCenterPage.sonuc.shouldHave(text(message));
    }
}
