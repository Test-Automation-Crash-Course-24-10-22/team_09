package tests;


import org.testng.annotations.Test;

public class Test1 extends BaseTest{

    @Test
    public void catalogTest(){

        getHomePage().openCatalog();
        getHomePage().openCategorie();
        getCategoriePage().openPhones();


    }
}
