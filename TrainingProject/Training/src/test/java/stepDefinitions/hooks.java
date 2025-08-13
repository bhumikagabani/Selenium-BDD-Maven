package stepDefinitions;

import io.cucumber.java.Before;

public class hooks {
    @Before("@NetBanking")
    public void netBankingSetup(){
        System.out.println("Setup the entries in Netbanking");
    }
    @Before("@Mortgage")
    public void mortgageSetup(){
        System.out.println("Setup the entries in Netbanking");
    }
}
