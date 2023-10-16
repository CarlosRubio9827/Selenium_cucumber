package seleniumgluecode;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Test extends TestBase {


    @Given("El usuario se encuentra en la pagina Home de imalittletester")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_imalittletester() throws Exception {

        Assert.assertTrue(homePage.homePageIsDisplayed());

    }

    @When("Hace click sobre el boton Latest Comics")
    public void hace_click_sobre_el_boton_latest_comics() throws Exception {

        homePage.clickOnTitleComics();

    }

    @Then("Se debe redirigir a la pantalla de comics")
    public void se_debe_redirigir_a_la_pantalla_de_comics() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        Assert.assertTrue("No se redirecciono correctamente", comicsPage.isTitleComicsDisplayed());


    }


}
