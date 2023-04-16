package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestCenterPage {

    //  LOGIN ELEMENTLERI
    public SelenideElement usernameBox=$(By.id("exampleInputEmail1"));
    public SelenideElement passwordBox=$("#exampleInputPassword1");
    public SelenideElement submitButton=$(By.xpath("//button[@type='submit']"));
    public SelenideElement loginMessage=$(By.xpath("//*[contains(text(),'You logged into a secure area!')]"));

    //  CHECKBOX AND RADIO BUTTON ELEMENTLERI
    public SelenideElement checkbox1=$("#box1");
    public SelenideElement checkbox2=$("#box2");
    public SelenideElement redRadioButton=$("#red");
    public SelenideElement footballRadioButton=$("#football");

    //  DROPDOWN MENU ELEMENTLERI

    public SelenideElement firstDropdown=$("#dropdown");
    public SelenideElement year=$("#year");
    public SelenideElement month=$("#month");
    public SelenideElement day=$("#day");

    //  ALERT ELEMENTERI
    public SelenideElement promptButton=$(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
    public SelenideElement sonuc=$("#result");

    //FRAME ELEMENTLERI
    public SelenideElement techProLink=$(By.xpath("//a[@type='button']"));
    public SelenideElement reklamClose=$(By.xpath("//i[@class='eicon-close']"));

    //ACTIONS ELEMENTLERI
    public SelenideElement kaynak =$("#draggable");
    public SelenideElement hedef=$("#droppable");






}
