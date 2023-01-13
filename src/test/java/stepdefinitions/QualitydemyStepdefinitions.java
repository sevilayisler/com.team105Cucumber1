package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class QualitydemyStepdefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Then("ilk sayfa login linkine click yapar")
    public void ilk_sayfa_login_linkine_click_yapar() {
        qualitydemyPage.ilkLoginLinki.click();
    }
    @Then("kullanici kutusuna manuel olarak {string} yazar")
    public void kullanici_kutusuna_manuel_olarak_yazar(String yanlisUsename) {
       qualitydemyPage.kullaniciEmailKutusu.sendKeys(yanlisUsename + Keys.ENTER);
    }
    @Then("password kutusuna manuel olarak {string} yazar")
    public void password_kutusuna_manuel_olarak_yazar(String yanlisPassword) {
        qualitydemyPage.passwordKutusu.sendKeys(yanlisPassword + Keys.ENTER);
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qualitydemyPage.loginButonu.click();
    }
    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
    }

    @Then("cookie varsa accept eder")
    public void cookieVarsaAcceptEder() {
        if (qualitydemyPage.qdCookiesAcceptButton.isDisplayed()){
            qualitydemyPage.qdCookiesAcceptButton.click();
        }else {
            qualitydemyPage.loginButonu.click();
        }
    }


}