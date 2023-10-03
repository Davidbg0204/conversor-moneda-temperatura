import enums.TipeConversor;
import modelo.*;

import javax.swing.*;
import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) throws Exception {

        String conversionDeMoneda = "Conversor de  moneda";
        String conversionDeTemperatura = "Conversor de temperatura";

        boolean ejecuta = true;

        ReiniciarPrograma reiniciar = new ReiniciarPrograma();

        while(ejecuta){
            String operacion = JOptionPane.showInputDialog(null, "Elige lo que deseas hacer",
                    "Conversiones", JOptionPane.QUESTION_MESSAGE, null, new String[]
                            {conversionDeMoneda, conversionDeTemperatura}, "Elección").toString();

            if (operacion.equals(conversionDeMoneda)) {
                IniciadorConversionMonedas iniciadorConversionMonedas = new IniciadorConversionMonedas();
                String operacaoMoedas = JOptionPane.showInputDialog(null, "Elige una moneda",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipeConversor.PESO_MEXICANO_DOLAR.getDescripcion(),
                                TipeConversor.PESO_mEXICANO_EURO.getDescripcion(),
                                TipeConversor.PESO_MEXICANO_ESTERLINA.getDescripcion(),
                                TipeConversor.PESO_MEXICANO_PESO_ARGENTINO.getDescripcion(),
                                TipeConversor.PESO_MEXICANO_PESO_CHILENO.getDescripcion(),
                                TipeConversor.DOLAR_PESO_MEXICANO.getDescripcion(),
                                TipeConversor.EURO_PESO_MEXICANO.getDescripcion(),
                                TipeConversor.LIBRA_ESTERLINA_PESO_MEXICANO.getDescripcion(),
                                TipeConversor.PESO_ARGENTINO_PESO_MEXICANO.getDescripcion(),
                                TipeConversor.PESO_CHILENO_PESO_MEXICANO.getDescripcion()},
                        "Escoja").toString();

                String valorString = JOptionPane.showInputDialog("Introduce la cantidad a convertir");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    BigDecimal valorConvertido = iniciadorConversionMonedas.operarConversao(operacaoMoedas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            } else if(operacion.equals(conversionDeTemperatura)){
                IniciadorConversionTemperatura iniciadorConversionTemperatura = new IniciadorConversionTemperatura();
                String operacaoTemperaturas = JOptionPane.showInputDialog(null, "Elige la escala de temperatura",
                        "Monedas", JOptionPane.QUESTION_MESSAGE, null, new String[] {
                                TipeConversor.CELSIUS_PARA_FAHRENHEIT.getDescripcion(),
                                TipeConversor.CELSIUS_PARA_KELVIN.getDescripcion(),
                                TipeConversor.FAHRENHEIT_PARA_CELSIUS.getDescripcion(),
                                TipeConversor.FAHRENHEIT_PARA_KELVIN.getDescripcion(),
                                TipeConversor.KELVIN_PARA_CELSIUS.getDescripcion(),
                                TipeConversor.KELVIN_PARA_FAHRENHEIT.getDescripcion(),},
                        "Elección").toString();

                String valorString = JOptionPane.showInputDialog("Introduce un valor");
                Validador validador = new Validador();
                if(!validador.verificar(valorString)){
                    JOptionPane.showMessageDialog(null, "Valor Inválido");
                } else{
                    double valorInicial = validador.transformarEnDouble(valorString);
                    double valorConvertido = iniciadorConversionTemperatura.operarConversao(operacaoTemperaturas, valorInicial);
                    JOptionPane.showMessageDialog(null, valorConvertido);
                }
            }
            ejecuta = reiniciar.intentaReiniciar();
        }

    }
}
