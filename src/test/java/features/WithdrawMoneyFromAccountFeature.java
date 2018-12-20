package features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

public class WithdrawMoneyFromAccountFeature {

    private Account account;

    @Given("an existing client named {string} with {double} EUR in his account")
    public void an_existing_client_named_with_EUR_in_his_account(String name, Double balance) {
        account = new Account( name, new BigDecimal(balance));
    }

    @When("he withdraws {double} EUR from his account")
    public void he_withdraws_EUR_from_his_account(Double amount) throws Throwable{
        account.withrow(new BigDecimal(amount));
    }

    @Then("the new balance is {double} EUR")
    public void the_new_balance_is_EUR(Double double1) {
        assertThat(account.getBalance()).isEqualTo(new BigDecimal(double1));
    }
}


