/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calcular;

/**
 *
 * @author usuario
 */

public class Calculadora {

    public static Float calcular(float numero1, float numero2, String operacion) {
        switch (operacion) {
            case "suma":
                return numero1 + numero2;
            case "resta":
                return numero1 - numero2;
            case "multiplicacion":
                return numero1 * numero2;
            case "division":
                if (numero2 == 0) {
                    return null;
                } else {
                    return numero1 / numero2;
                }
            default:
                return null;
        }
    }
}
