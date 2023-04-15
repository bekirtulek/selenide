package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestCenterPage {

    public SelenideElement usernameBox=$(By.id("exampleInputEmail1"));
    public SelenideElement passwordBox=$("#exampleInputPassword1");
    public SelenideElement submitButton=$(By.xpath("//button[@type='submit']"));
    public SelenideElement loginMessage=$(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));
    public SelenideElement checkbox1=$("#box1");
    public SelenideElement checkbox2=$("#box2");
    public SelenideElement redRadioButton=$("#red");
    public SelenideElement footballRadioButton=$("#football");


}
