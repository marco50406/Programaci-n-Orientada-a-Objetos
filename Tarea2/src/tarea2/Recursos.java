
package tarea2;

import java.util.Scanner;

public class Recursos {
    
    //Atributos
    String mensaje;
    int numero;
    int multiplicacion;

    //Método mostrar mensaje en pantalla
    public void mostrarMensaje(){
        
      mensaje = "Programacion Orientada a Objetos 2021";
        System.out.println(mensaje);
    }
    
    
    //Método para ingresar edad y mostrar si es mayor de edad o menor de edad
    public void edad(){
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su Edad: ");
        numero = teclado.nextInt();

        if(numero>=21){
            System.out.println("Mayor de Edad\n");
        }else{
            System.out.println("Menor de Edad\n"); 
    }
        
    }
    
    
    //Método para hacer una multiplicación solicitando dos números enteros al usuario.
    public void operacionMate(int numero1, int numero2){
        
         Scanner teclado2 = new Scanner(System.in);
         System.out.print("Ingrese un Valor 1 para Multiplicar ");
         numero1=teclado2.nextInt();
         System.out.print("Ingrese Valor 2 para Multiplicar");
         numero2 = teclado2.nextInt();
 
         multiplicacion = numero1 * numero2;
        
         System.out.println("El resultado es: "+multiplicacion);
    }
    
    
    //Método para listar números cuando el usuario ingresa el tamaño de la lista
    public void listaNumeros(int lista){
       
        Scanner teclado3 = new Scanner(System.in);
        System.out.println("\nDigite el Tamanio de lista de numeros: ");
     
        System.out.print("Numeros en Lista: ");
        lista = teclado3.nextInt();
        for(int i = 1;i<=lista;i++){
        
            System.out.println(i);
        }
 
    }
    
}
