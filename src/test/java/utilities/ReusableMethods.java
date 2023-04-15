package utilities;

import static com.codeborne.selenide.Selenide.*;

public class ReusableMethods {

    public static void waitSleep(Integer sec){
        sleep(sec*1000);
    }
}
