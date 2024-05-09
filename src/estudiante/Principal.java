package estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author VANESSA
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = sc.nextInt();

        List<Estudiante> estudiantes = new ArrayList<>();

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese el codigo del estudiante " + (i + 1) + ": ");
            int codigo = sc.nextInt();

            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = sc.nextLine();
            System.out.println();
            
            System.out.print("Ingrese la nota del estudiante: ");
            double nota = sc.nextDouble();

            Estudiante estudiante = new Estudiante(codigo, nombre, nota);
            estudiantes.add(estudiante);
        }

        double promedio = calcularPromedio(estudiantes);
        System.out.println("Promedio de notas: " + promedio);
        
        System.out.print("Ingrese el codigo del estudiante a consultar: ");
        int codigoConsulta = sc.nextInt();
        Estudiante estudianteConsulta = consultarEstudiante(estudiantes, codigoConsulta);
        if (estudianteConsulta != null) {
            System.out.println("Estudiante encontrado:");
            System.out.println(estudianteConsulta);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
        
        Estudiante mejorEstudiante = obtenerEstudianteConMejorNota(estudiantes);
        if (mejorEstudiante != null) {
            System.out.println("Estudiante con mejor nota:");
            System.out.println(mejorEstudiante);
        } else {
            System.out.println("No hay estudiantes registrados.");
        }

  
        Estudiante peorEstudiante = obtenerEstudianteConPeorNota(estudiantes);
        if (peorEstudiante != null) {
            System.out.println("Estudiante con peor nota:");
            System.out.println(peorEstudiante);
        } else {
            System.out.println("No hay estudiantes registrados.");
        }
    }

    private static double calcularPromedio(List<Estudiante> estudiantes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static Estudiante consultarEstudiante(List<Estudiante> estudiantes, int codigoConsulta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static Estudiante obtenerEstudianteConMejorNota(List<Estudiante> estudiantes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static Estudiante obtenerEstudianteConPeorNota(List<Estudiante> estudiantes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
