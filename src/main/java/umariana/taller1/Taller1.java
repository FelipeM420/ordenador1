/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umariana.taller1;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;
import mundo.Tarea;


/**
 *
 * @author sebas
 */
public class Taller1 {

    public static void main(String[] args) { 
    
    Scanner lector = new Scanner(System.in);
    ArrayList<Tarea> misTareas = new ArrayList<>();
    boolean activo=true; 
    
    
    do{
        
            int opcion = lector.nextInt();
            
            switch(opcion){
                
                case 1:
                    System.out.println("AGREGAR NUEVA TAREA");
                    
                    
                    System.out.println("OPCION 1");
             
                    System.out.println("ingrese el id de la tarea");
                    int id  = lector.nextInt();
                    lector.nextLine();
                    
                    
                    System.out.println("ingrese la descripcion de la tarea");
                    String descripcion = lector.nextLine();
                    
                    System.out.println("ingrese la prioridad de 1 a 5");
                    int prioridad  = lector.nextInt();
                        
                    System.out.println("LA TAREA FUE GUARDADA CON EXITO");
                    
                    
                    
                  //creacion del objero y llenar la informacion
                    Tarea nuevaTarea = new Tarea(id,descripcion,prioridad);
                   //almacenar el objeto en la contenedora
                    misTareas.add(nuevaTarea);
                    System.out.println("TAREA AGREFADA SATISFACTORIAMENTE");
                    
                    
                    
                break;

                
                   
                case 2:
                System.out.println("MOSTRAR LA INFORMACION");
    System.out.println("OPCION 2");   

    // Ordena las tareas de forma descendente por prioridad
    Collections.sort(misTareas, new Comparator<Tarea>() {
        @Override
        public int compare(Tarea t1, Tarea t2) {
            return t2.getPrioridad() - t1.getPrioridad(); // Orden descendente
        }
    });

    System.out.println("***TAREAS REGISTRADAS***");
    for (Tarea t: misTareas)
    { 
        System.out.println("ID:"+ t.getId());
        System.out.println("DESCRIPCION:"+ t.getDescripcion());
        System.out.println("PRIORIDAD:"+ t.getPrioridad());
        System.out.println("todo listo");
    }
                break;
                        
                case 3:
                
                   activo = false; System.out.println("PROGRAMA TERMINADO");  
                        
                break;
                default:
                    System.out.println("OPCION NO VALIDO");
            }
            
}while (activo);

}

}