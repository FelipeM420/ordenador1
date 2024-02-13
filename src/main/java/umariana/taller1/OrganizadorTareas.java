/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umariana.taller1;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Scanner;
import mundo.Ordenador;



/**
 *
 * @author sebas
 */
public class OrganizadorTareas {
    ArrayList<Ordenador> tareas = new ArrayList<>();
    private Scanner scanner;

    public OrganizadorTareas() {
        this.scanner = new Scanner(System.in);
    }

    public void agregarTarea() {
        System.out.println("Ingrese el ID de la tarea:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.println("Ingrese la descripción de la tarea:");
        String descripcion = scanner.nextLine();
        System.out.println("Ingrese el tiempo estimado (en horas):");
        int tiempoEstimado = scanner.nextInt();
        Ordenador tarea = new Ordenador(id, descripcion, tiempoEstimado);
        tareas.add(tarea);
        System.out.println("Tarea agregada exitosamente.");
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        for (Ordenador tarea : tareas) {
            String estado = tarea.isCompletado() ? "Completada" : "Pendiente";
            System.out.println("ID: " + tarea.getId() + ", Descripción: " + tarea.getDescripcion() + ", Tiempo estimado: " + tarea.getTiempo() + " horas, Estado: " + estado);
        }
    }

    public void marcarTareaComoCompletada() {
        System.out.println("Ingrese el ID de la tarea a marcar como completada:");
        int id = scanner.nextInt();
        for (Ordenador tarea : tareas) {
            if (tarea.getId() == id) {
                tarea.setCompletado(true);
                System.out.println("Tarea marcada como completada.");
                return;
            }
        }
        System.out.println("Tarea no encontrada.");
    }

    public void ejecutar() {
        boolean activo = true;
        while (activo) {
            System.out.println("Seleccione una opción:\n1. Agregar tarea\n2. Mostrar tareas\n3. Marcar tarea como completada\n4. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    agregarTarea();
                    break;
                case 2:
                    mostrarTareas();
                    break;
                case 3:
                    marcarTareaComoCompletada();
                    break;
                case 4:
                    activo = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void main(String[] args) {
        OrganizadorTareas organizador = new OrganizadorTareas();
        organizador.ejecutar();
    }
}

