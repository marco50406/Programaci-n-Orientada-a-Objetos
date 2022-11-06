
package tareamodulo5;

import helpers.Circulo;
import helpers.Cuadrado;
import helpers.Lineas;
import helpers.Triangulo;

/**
 *
 * @author Potro
 */
public class TareaModulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instaciar las clases
        
        Circulo circulo = new Circulo();
        Lineas lineas = new Lineas();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        
        System.out.println(circulo.obtenerInformacionFormas());
        circulo.imprimirDatos();
        
        System.out.println(lineas.obtenerInformacionFormas());
        lineas.imprimirDatos();
        
        System.out.println(triangulo.obtenerInformacionFormas());
        triangulo.imprimirDatos();
        
        System.out.println(cuadrado.obtenerInformacionFormas());
        cuadrado.imprimirDatos();
    }
    
}
