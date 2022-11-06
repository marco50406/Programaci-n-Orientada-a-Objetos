/*
1. Crear un nuevo proyecto en Netbeans 
2. Crear un archivo de clase llamada Estudiante (u otra ocupación que usted seleccione, por ejemplo Doctor, Ingeniero, etc) y agregar los métodos necesarios para obtener los atributos de ese "objeto" desde la clase que contiene el método principal de la aplicación.. 
   Basarse en el ejemplo del módulo 3
2. Desde la clase que contiene el método principal (main), agregar el código necesario para instanciar ese objeto y obtener los valores.
 */

package com.mycompany.tarea3;

/**
 * Marco Tulio Núñez Día
 * 202220060228
 * @author MarcoNúñez
 */
public class Tarea3 {

    public static void main(String[] args) {
       
        
        //Instanciar la clase Fotografo
        
        Fotografo fotografo = new Fotografo();
        
        fotografo.setIdentidad("0801198902871.");
        fotografo.setName("Marco Nunez.");
        fotografo.setmodelCam("Canon R5.");
        fotografo.setnickName("md_fotografiahn.");
        fotografo.setwebSite("www.md_fotografiahn.com");
        fotografo.setstyle("Black and White.");
        fotografo.setworkExp("Bogue Magazine, New York Time and NATGEO.");
        
        //Obtener los valores del objeto fotografo
        
        System.out.println("ID: " + fotografo.getIdentidad());
        System.out.println("Name: " + fotografo.getname());
        System.out.println("Camera: "+fotografo.getmodelCam());
        System.out.println("Social Network: "+fotografo.getnickName());
        System.out.println("Web Site: "+fotografo.getwebSite());
        System.out.println("photographic Style: "+fotografo.getstyle());
        System.out.println("Work experience: "+fotografo.getworkExp());
    }
}
