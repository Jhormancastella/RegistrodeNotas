package com.taller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class registrodenotasconmap {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> registroNotas = new HashMap<>();

        // Pedir al usuario la cantidad de estudiantes.

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer Siempre después de nextInt o nextDouble

        // Solicitar nombres y notas para cada estudiante.

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la nota del estudiante " + nombre + ": ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); 

            // Almacenar en el Map

            registroNotas.put(nombre, nota);
        }

        // Mostrar la lista de estudiante y notas.

        System.out.println("\nLista completa de estudiantes y sus notas:");
        for (Map.Entry<String, Double> entry : registroNotas.entrySet()) {
            System.out.println("Estudiante: " + entry.getKey() + ", Nota: " + entry.getValue());
        }

        // Bucle para buscar notas de estudiantes

        boolean continuar = true;
        while (continuar) {

            // Permitir buscar la nota de un estudiante ingresando su nombre.

            System.out.print("\nIngrese el nombre del estudiante para buscar su nota: ");
            String nombreBusqueda = scanner.nextLine();

            if (registroNotas.containsKey(nombreBusqueda)) {
                System.out.println("La nota de " + nombreBusqueda + " es: " + registroNotas.get(nombreBusqueda));
            } else {
                System.out.println("Estudiante no encontrado.");
            }

            // Preguntar si desea buscar otra nota de estudiante.

            System.out.print("¿Desea buscar la nota de otro estudiante? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();
            
            // Salir del bucle si la respuesta no es "s"

            if (!respuesta.equals("s")) {
                continuar = false; 
            }
        }

        // Encontrar la nota más alta y el estudiante con mejor rendimiento.

        String mejorEstudiante = null;
        double mejorNota = Double.NEGATIVE_INFINITY;

        for (Map.Entry<String, Double> entry : registroNotas.entrySet()) {
            if (entry.getValue() > mejorNota) {
                mejorNota = entry.getValue();
                mejorEstudiante = entry.getKey();
            }
        }

        if (mejorEstudiante != null) {
            System.out.println("\nEl estudiante con mejor rendimiento es " + mejorEstudiante + " con una nota de " + mejorNota);
        } else {
            System.out.println("\nNo hay estudiantes registrados.");
        }

        // Cerrar el escáner
        scanner.close();
    }

}
