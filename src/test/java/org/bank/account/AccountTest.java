package org.bank.account;

import org.bank.account.exception.NotEnoughtBalanceException;
import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void should__Balance_equal_90_When_client_withdraws_10_and_initial_eq_100() throws Throwable {

        //Given
        Account account = new Account("owner" ,new BigDecimal(100.0));
        //when
        account.withrow(new BigDecimal(10.0));
        //Then
        assertThat(account.getBalance()).isEqualTo(new BigDecimal(90.0));
    }

    @Test
    public void should_throws_exception_When_amount_to_withrow_is_lessThan_current_balance() {

        //Given
        Account account = new Account("Owner", new BigDecimal(100.0));
        //when
        try {
            account.withrow(new BigDecimal(110.00));
        }catch (Exception e){

            assertThat(e).isInstanceOf(NotEnoughtBalanceException.class).hasMessage("You can not withrow more than 100 euros");
        }

    }
}
