package stepdefinitions;

import io.cucumber.java.en.*;


import static com.codeborne.selenide.Selenide.*;
import static utilities.ReusableMethods.*;


public class CommonStepDefinitions {

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String url) {
       open(url);
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int time) {
        // selenide default olarak 4 sn bekler
        // 4 saniyeden fazla beklemek icin sleep methodu kullanilir
        // sleep fonksiyonu mili saniye kabul eder. saniyeye cevirmek icin *1000 yapilir
        //sleep(time*1000);
        waitSleep(time);
    }

    @Then("kullanici onceki sayfaya gider")
    public void kullaniciOncekiSayfayaGider() {
        back();
    }

    @Then("kullanici sonraki sayfaya gider")
    public void kullaniciSonrakiSayfayaGider() {
        forward();
    }

    @Then("kullanici sayfayi yeniler")
    public void kullaniciSayfayiYeniler() {
        refresh();
    }

    @Then("kullanici sayfayi acik tutar")
    public void kullaniciSayfayiAcikTutar() {


    }
}