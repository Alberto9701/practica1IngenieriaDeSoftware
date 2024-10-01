/*package ipn.mx.cerraduraweb.Model

class CerraduraKleene {

    String aplicarCerraduraKleene(String opcion, int longitud) {
        StringBuilder resultado = new StringBuilder()
        String base = "01"

        if (opcion == "estrella") { //se incluye la cadena vacia en estrella
            for (int i = 0; i < longitud; i++) {
                resultado.append(base.charAt((int) (Math.random() * base.length())))
            }
        } else if (opcion == "positiva") { // si es positiva se inicia desde 1, no se incluye la cadena vacia
            for (int i = 1; i <= longitud; i++) {
                resultado.append(base.charAt((int) (Math.random() * base.length())))
            }
        }

        return resultado.toString()
    }
}*/


package ipn.mx.cerraduraweb.Model;

import java.util.ArrayList;
import java.util.List;

public class CerraduraKleene {

    public List<String> aplicarCerraduraKleene(String opcion, int longitud) {
        List<String> combinaciones = new ArrayList<>();
        String base = "01";
        
        // La cerradura estrella incluye la cadena vacía
        if ("estrella".equals(opcion)) {
            combinaciones.add(""); // Incluimos la cadena vacía
        }

        // Para ambas opciones (estrella y positiva), generamos combinaciones
        for (int i = 1; i <= longitud; i++) {
            generarCombinaciones(base, i, combinaciones);
        }

        return combinaciones;
    }

    private void generarCombinaciones(String base, int longitud, List<String> combinaciones) {
        int numCombinaciones = (int) Math.pow(base.length(), longitud); // 2^longitud si base es "01"

        for (int i = 0; i < numCombinaciones; i++) {
            StringBuilder combinacion = new StringBuilder();

            // Generar la combinación basada en el valor de i
            int temp = i;
            for (int j = 0; j < longitud; j++) {
                combinacion.append(base.charAt(temp % base.length()));
                temp /= base.length();
            }

            combinaciones.add(combinacion.toString());
        }
    }
}
