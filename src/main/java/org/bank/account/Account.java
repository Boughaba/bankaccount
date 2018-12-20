package org.bank.account;

import org.bank.account.exception.NotEnoughtBalanceException;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class Account {

    private String owner;
    private BigDecimal balance;

    public Account(String owner, BigDecimal initBalance){
        this.owner = owner;
        this.balance = initBalance;
    }


    public void withrow(BigDecimal amount)  throws NotEnoughtBalanceException {
          checkSufficientBalance(amount);
          this.balance = this.balance.subtract(amount);
    }

    private void checkSufficientBalance(BigDecimal amount) throws  NotEnoughtBalanceException{
        if(balance.subtract(amount).signum() < 0){
            throw new NotEnoughtBalanceException(MessageFormat.format("You can not withrow more than {0} euros", Formatter.format(this.balance)));
        }
    }


    public BigDecimal getBalance() {
        return balance;
    }

    public void transfer(BigDecimal amount) {

        this.balance = this.balance.add(amount);
    }
}
