package org.bank.account.exception;

public class NotEnoughtBalanceException extends  Exception {

    public NotEnoughtBalanceException(String message){
        super(message);
    }
}
