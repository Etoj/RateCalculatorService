package model;

import java.math.BigDecimal;

public class Summary {
    private final BigDecimal interestSum;

    private final BigDecimal overpaymentProvisions;

    private final BigDecimal totalLost;

    public Summary(BigDecimal interestSum, BigDecimal overpaymentProvisions, BigDecimal totalLost) {
        this.interestSum = interestSum;
        this.overpaymentProvisions = overpaymentProvisions;
        this.totalLost = totalLost;
    }

    public BigDecimal getInterestSum() {
        return interestSum;
    }

    public BigDecimal getOverpaymentProvisions() {
        return overpaymentProvisions;
    }

    public BigDecimal getTotalLost() {
        return totalLost;
    }
}
