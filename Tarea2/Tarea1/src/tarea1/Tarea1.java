
package tarea1;

import java.util.Arrays;

/**
 *
 * @author Potro
 */
public class Tarea1 {

    
    public static void main(String[] args) {
        
        //Ejercicio #1
        System.out.println("Hola, soy Marco Tulio Nunez Diaz");
        
        //Ejercicio #2
        System.out.print("\nEjercicio #2");
        //Declaración de variables
        int numero1 = 10, numero2 = 4, suma, resta, multi, divi, mod;
        
        //Procesa las operaciones matemáticas
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multi = numero1 * numero2;
        divi = numero1 / numero2;
        mod = numero1 % numero2;
        
        //Imprime los resultados de las operaciones matemáticas
        System.out.println("\nLa suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multi);
        System.out.println("La division es: "+divi);
        System.out.println("El mod es: "+mod);
        
        //Ejercicio #3
        System.out.print("\nEjercicio #3");
        int m = 6, t= 1, k = -10;
        
        if(m>t)
        {
            System.out.println("\nM>T---Verdadero ");
        }else
        {
            System.out.println("M>T---Falso ");
        }if(t / k == -5)
        {
            System.out.println("T / K == -5---Verdadero ");
        }else
        {
            System.out.println("T/K==-5---Falso ");
        }if(m+t==7||m-t==5)
        {
            System.out.println("M+M==7||M-T==5---Verdadero ");
        }else
        {
            System.out.println("M+M==7||M-T==5---Falso");
        }
        
        //Ejercicio #4
        System.out.print("\nEjercicio #4");
        String[] nombres = new String[10];
        nombres[0] = "\nMarco Nunez";
        nombres[1] = "Kevin Rivas";
        nombres[2] = "David Hernandez";
        nombres[3] = "Luis Vallecillo";
        nombres[4] = "Marlon Carias";
        nombres[5] = "Victor Sosa";
        nombres[6] = "Oscar Hernandez";
        nombres[7] = "Tiffany Batiz";
        nombres[8] = "Judy Castro";
        nombres[9] = "Delmer Mendoza";
        
        for(int i=0;i<10;i++)
        {
            System.out.println(nombres[i]);
        }
        
        
       //Ejercicio #5
        System.out.print("\nEjercicio #5\n");
        String nombre[][] = new String[5][4];
        
        nombre[0][0] = "Marco";
        nombre[0][1] = "Nunez";
        nombre[0][2] = "Computacion";
        nombre[0][3] = "Claro";
        
        nombre[1][0] = "Victor";
        nombre[1][1] = "Hernandez";
        nombre[1][2] = "Computacion";
        nombre[1][3] = "Mega";
        
        nombre[2][0] = "Ayniver";
        nombre[2][1] = "Chavarria";
        nombre[2][2] = "Informatica";
        nombre[2][3] = "Hugo";
        
        nombre[3][0] = "Jefferson";
        nombre[3][1] = "Davila";
        nombre[3][2] = "Computacion";
        nombre[3][3] = "Cerveceria";
        
        nombre[4][0] = "Kevin";
        nombre[4][1] = "Rivas";
        nombre[4][2] = "Computacion";
        nombre[4][3] = "Dinant";
   
        for(int i=0;i<5;i++)
        {
            System.out.println(Arrays.toString(nombre[i]));
        }
        
        
        //Ejercicio #6
        
        System.out.print("\nEjercicio #6\n");
        String array[][] = new String[4][3];
        
        array[0][0] = "Marco";
        array[0][1] = "90";
        array[0][2] = "Aprobado";
       
        
        array[1][0] = "Victor";
        array[1][1] = "69";
        array[1][2] = "Reprobado";
      
        
       array[2][0] = "Ayniver";
       array[2][1] = "80";
       array[2][2] = "Aprobado";
  
        for(int i=0;i<3;i++)
        {
            System.out.println(Arrays.toString(array[i]));
        }
       
    }
    
}
