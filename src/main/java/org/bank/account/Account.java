package org.bank.account;

import java.math.BigDecimal;

public class Account {

    private String owner;
    private BigDecimal balance;
    public Account(String owner, BigDecimal initBalance){
        this.owner = owner;
        this.balance = initBalance;
    }


    public void withrow(BigDecimal amount) {

          this.balance = this.balance.subtract(amount);
    }


    public BigDecimal getBalance() {
        return balance;
    }
}
