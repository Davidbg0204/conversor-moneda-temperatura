package enums;

public enum TipeConversor {
	PESO_MEXICANO_DOLAR("De Peso Mexicano a Dolar"),
	PESO_mEXICANO_EURO("De Peso Mexicano a Euro"),
	PESO_MEXICANO_ESTERLINA("De Peso Mexicano a Libra Esterlina"),
	PESO_MEXICANO_PESO_ARGENTINO ("De Peso Mexicano a Peso Argentino"),
	PESO_MEXICANO_PESO_CHILENO("De Peso Mexicano a Peso Chileno"),
	DOLAR_PESO_MEXICANO("De Dólar a Peso Mexicano"),
	EURO_PESO_MEXICANO("De Euro a Peso Mexicano"),
	LIBRA_ESTERLINA_PESO_MEXICANO("De Libra Esterlina a Peso Mexicano"),
	PESO_ARGENTINO_PESO_MEXICANO("De Peso Argentino a Peso Mexicano"),
	PESO_CHILENO_PESO_MEXICANO("De Peso Chileno a Peso Mexicano"),


    CELSIUS_PARA_FAHRENHEIT("Celsius a Fahrenheit"),
    CELSIUS_PARA_KELVIN("Celsius a Kelvin"),
    KELVIN_PARA_FAHRENHEIT("Kelvin a Fahrenheit"),
    KELVIN_PARA_CELSIUS ("Kelvin a Celsius"),
    FAHRENHEIT_PARA_CELSIUS ("Fahrenheit a Celsius"),
    FAHRENHEIT_PARA_KELVIN("Fahrenheit a Kelvin");

    private String descripcion;

    TipeConversor(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
