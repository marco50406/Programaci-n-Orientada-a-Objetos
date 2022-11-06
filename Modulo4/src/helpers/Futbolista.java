
package helpers;

/**
 *
 * @author Potro
 */
public class Futbolista {

  
    private int edad;
    private String nombre;
    private String equipoActual;
    
    
    public void setEdad(int _edad){
        this.edad = _edad;
    }
    
    
    public int getEdad(){
        return edad;
    }
    
    
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    
  
    public String getNombre(){
        return nombre;
    }
    
    
    public void setEdquipoActual(String _equipoActual){
        this.equipoActual = _equipoActual;
    }
    
  
    public String getEquipoActual(){
        return equipoActual;
    }

}
