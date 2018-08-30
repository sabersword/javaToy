package org.ypq.jmx;

import java.math.BigDecimal;

public class Asset {

    private BigDecimal value;

    public Asset() {
    }

    public Asset(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
