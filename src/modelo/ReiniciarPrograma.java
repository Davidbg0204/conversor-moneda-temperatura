package modelo;

import javax.swing.*;

public class ReiniciarPrograma {

    public boolean intentaReiniciar(){
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "Deseas continuar haciendo converciones?");
        if(respuesta !=0){
                JOptionPane.showMessageDialog(null, "El programa a finalizado");
                return false;
        }
        return true;
    }
}
