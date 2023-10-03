package modelo;

import enums.Moneda;
import enums.TipeConversor;

import java.math.BigDecimal;
public class IniciadorConversionMonedas {

    private static final String PESO_MEXICANO_DOLAR = "De Peso Mexicano a Dolar";
    private static final String PESO_mEXICANO_EURO = "De Peso Mexicano a Euro";
    private static final String PESO_MEXICANO_ESTERLINA = "De Peso Mexicano a Libra Esterlina";
    private static final String PESO_MEXICANO_PESO_ARGENTINO = "De Peso Mexicano a Peso Argentino";
    private static final String PESO_MEXICANO_PESO_CHILENO = "De Peso Mexicano a Peso Chileno";
    private static final String DOLAR_PESO_MEXICANO = "De Dólar a Peso Mexicano";
    private static final String EURO_PESO_MEXICANO = "De Euro a Peso Mexicano";
    private static final String LIBRA_ESTERLINA_PESO_MEXICANO = "De Libra Esterlina a Peso Mexicano";
    private static final String PESO_ARGENTINO_PESO_MEXICANO = "De Peso Argentino a Peso Mexicano";
    private static final String PESO_CHILENO_PESO_MEXICANO = "De Peso Chileno a Peso Mexicano";
    private ConvertidorDeMoneda convertidorDeMonedaDolar = new ConvertidorDeMonedaDolar();
    private ConvertidorDeMoneda convertidorDeMonedaEuro = new ConvertidorDeMonedaEuro();
    private ConvertidorDeMoneda convertidorDeMonedaLibraEsterlina = new ConvertidorDeMonedaLibraEsterlina();
    private ConvertidorDeMoneda convertidorDeMonedaPesoArgentino = new ConvertidorDeMonedaPesoArgentino();
    private ConvertidorDeMoneda convertidorDeMonedaPesoChileno = new ConvertidorDeMonedaPesoChileno();

    private Moneda moneda;

    public BigDecimal operarConversao(String operacionMonedas, double valorInicial) throws Exception {

        switch (operacionMonedas) {
            case PESO_MEXICANO_DOLAR -> {
                return convertidorDeMonedaDolar.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_mEXICANO_EURO -> {
                return convertidorDeMonedaEuro.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_MEXICANO_ESTERLINA -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_MEXICANO_PESO_ARGENTINO -> {
                return convertidorDeMonedaPesoArgentino.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_MEXICANO_PESO_CHILENO -> {
                return convertidorDeMonedaPesoChileno.convertirParaMoneda(moneda, BigDecimal.valueOf(valorInicial));
            }
            case DOLAR_PESO_MEXICANO -> {
                return convertidorDeMonedaDolar.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case EURO_PESO_MEXICANO -> {
                return convertidorDeMonedaEuro.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case LIBRA_ESTERLINA_PESO_MEXICANO -> {
                return convertidorDeMonedaLibraEsterlina.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_ARGENTINO_PESO_MEXICANO -> {
                return  convertidorDeMonedaPesoArgentino.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            case PESO_CHILENO_PESO_MEXICANO -> {
                return convertidorDeMonedaPesoChileno.convertirParaReal(moneda, BigDecimal.valueOf(valorInicial));
            }
            default -> throw new Exception("ELECCIÓN INVÁLIDA");
        }

    }

}
