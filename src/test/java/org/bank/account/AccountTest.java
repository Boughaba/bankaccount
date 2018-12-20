package org.bank.account;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void should__Balance_equal_90_When_client_withdraws_10_and_initial_eq_100()  {

        //Given
        Account account = new Account("owner" ,new BigDecimal(100.0));
        //when
        account.withrow(new BigDecimal(10.0));
        //Then
        assertThat(account.getBalance()).isEqualTo(new BigDecimal(90.0));
    }
}
