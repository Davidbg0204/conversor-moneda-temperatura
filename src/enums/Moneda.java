package enums;

import java.math.BigDecimal;

public enum Moneda {

	// valor de moneda 2023
    DOLAR(BigDecimal.valueOf(0.056)),
    EURO(BigDecimal.valueOf(0.054)),
    LIBRA_ESTERLINA(BigDecimal.valueOf(0.047)),
    PESO_ARGENTINO(BigDecimal.valueOf(19.75)),
    PESO_CHILENO(BigDecimal.valueOf(51.26));

    private BigDecimal CONVERSION;

    Moneda(BigDecimal FACTOR_CONVERSION) {
        this.CONVERSION = FACTOR_CONVERSION;
    }

    public BigDecimal getFACTOR_CONVERSION() {
        return CONVERSION;
    }
}
