package org.bank.account;

import org.bank.account.exception.NotEnoughtBalanceException;

import java.math.BigDecimal;
import java.text.DecimalFormat;
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
            throw new NotEnoughtBalanceException(MessageFormat.format("You can not withrow more than {0} euros", format(this.balance)));
        }
    }

    private String format(BigDecimal amount){

        BigDecimal bd = amount.setScale(2);
        DecimalFormat df = new DecimalFormat("###,###.###");
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(0);
        df.setGroupingUsed(false);
        return df.format(bd);
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
