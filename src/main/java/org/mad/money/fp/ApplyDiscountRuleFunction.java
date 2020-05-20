package org.mad.money.fp;

import java.math.BigDecimal;

public class ApplyDiscountRuleFunction {
    public boolean ShouldApplyDiscount(BigDecimal thresholdPrice, BigDecimal amount) {
        return amount.compareTo(thresholdPrice) > 0;
    }
}
