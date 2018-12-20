package org.bank.account;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Formatter {

    public static String format(BigDecimal amount){
        BigDecimal bd = amount.setScale(2);
        DecimalFormat df = new DecimalFormat("###,###.###");
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(0);
        df.setGroupingUsed(false);
        return df.format(bd);
    }
}
