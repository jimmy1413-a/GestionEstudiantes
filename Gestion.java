import java.util.ArrayList;
import java.util.Scanner;

public class Gestion
{
    
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (true) {
            System.out.println("\n1. Agregar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Buscar Estudiante por Número de Estudiante");
            System.out.println("4. Salir del Programa");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            
            if(opcion == 1 ){
                agregarEstudiante();
                
            }else if(opcion == 2){
                listarEstudiantes();
                
            }else if(opcion == 3){
                buscarPorNumeroEstudiante();
                
            }else if(opcion ==4){
                salirDelPrograma();
            }else{
                System.out.println("Opción no válida. Por favor, ingrese una opción válida.");

            }
            
            
            }
        }
    

    
    private static void agregarEstudiante() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = scanner.next();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el número de estudiante: ");
        String numeroEstudiante = scanner.next();

        estudiantes.add(new Estudiante(nombre, apellido, edad, numeroEstudiante));
        System.out.println("Estudiante agregado correctamente.");
    }

    
    
    
    private static void listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("Lista de Estudiantes:");
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante.getInfo());
            }
        }
    }

    
        private static void buscarPorNumeroEstudiante() {
        System.out.print("Ingrese el número de estudiante a buscar: ");
        String numBuscado = scanner.next();
        boolean encontrado = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNumeroEstudiante().equals(numBuscado)) {
                System.out.println("Estudiante encontrado:");
                System.out.println(estudiante.getInfo());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado, lista de estudiantes: ");
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante.getInfo());
        }
        }
    }
    
    
    private static void salirDelPrograma() {
        System.out.println("Hasta luego");
        System.exit(0);
    }   
}
