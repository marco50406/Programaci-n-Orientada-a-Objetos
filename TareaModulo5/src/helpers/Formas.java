
package helpers;

/**
 *
 * @author Potro
 */
public abstract class Formas {
    //Atributos
    private String dibujar;
    private String establecerColor;
    
    //Cpnstructor
    public Formas(){
        
    }
    
    //Métodos set y get
    
    public void setdibujar(String dibujar){
        this.dibujar = dibujar;
    }
    
    public String getdibujar(){
        return this.dibujar;
    }
    
    public void setestablecerColor(String establecerColor){
        this.establecerColor = establecerColor;
    }
    
    public String getestablecerColor(){
        return this.establecerColor;
    }
    
    public void imprimirDatos(){
        System.out.println("Figura: " + dibujar);
    }
    
    abstract String obtenerInformacionFormas();
    
}
