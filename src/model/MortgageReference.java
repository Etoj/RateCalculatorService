package model;

import java.math.BigDecimal;

public class MortgageReference {
    private final BigDecimal ReferenceAmount;
    private final BigDecimal ReferenceDuration;

    public MortgageReference(BigDecimal referenceAmount, BigDecimal referenceDuration) {
        ReferenceAmount = referenceAmount;
        ReferenceDuration = referenceDuration;
    }

    public BigDecimal getReferenceAmount() {
        return ReferenceAmount;
    }

    public BigDecimal getReferenceDuration() {
        return ReferenceDuration;
    }
}
