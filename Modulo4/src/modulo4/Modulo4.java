
package modulo4;

import helpers2.España;
import helpers2.Francia;
import helpers.Futbolista;
import helpers2.Inglaterra;

/**
 *Marco Tulio Núñez Díaz
 *202220060228
 * @author Potro
 */

public class Modulo4 {

   
    public static void main(String[] args) {
        
        //Instanciar la clase Futbolista
        Futbolista futbolista = new Futbolista();
        
        //Establecemos los datos
        futbolista.setEdad(25);
        futbolista.setNombre("Leo Messi");
        futbolista.setEdquipoActual("PSG");
        
        //Imprimimos los datos establecidos
        System.out.println("Datos de la clase encapsulada:");
        System.out.println("Datos generales del futbolista");
        System.out.println("Edad " + futbolista.getEdad() + " anios");
        System.out.println("Nombre : " + futbolista.getNombre());
        System.out.println("Equipo Actual: " + futbolista.getEquipoActual());
        
        //Instanciamos las clases extendidas de la clase Equipo
        España es = new España();
        Inglaterra in = new Inglaterra();
        Francia fr = new Francia();
        
        System.out.println("\n");
        System.out.println("Datos de las clases abstractas");
        System.out.println("Equipo: " + es.getEquipo());
        System.out.println("Presidente: " + es.getCapitan());
        
        System.out.println("Equipo: " + in.getEquipo());
        System.out.println("Presidente: " + in.getCapitan());
        
        System.out.println("Equipo: " + fr.getEquipo());
        System.out.println("Presidente: " + fr.getCapitan());
    }
    
}
