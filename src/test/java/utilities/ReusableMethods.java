package utilities;

import static com.codeborne.selenide.Selenide.*;

public class ReusableMethods {

    public static void waitSleep(int sec){
        sleep(sec*1000);
    }
}
