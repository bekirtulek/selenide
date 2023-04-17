package utilities;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

    public class ReusableMethods {

    public static void waitSleep(int sec){
        sleep(sec*1000);
    }

    public static void scrollWithJSexecutor(SelenideElement element){
        executeJavaScript("arguments[0].scrollIntoView(true);",element);

    }


}
