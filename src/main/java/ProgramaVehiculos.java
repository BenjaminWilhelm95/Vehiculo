import java.util.ArrayList;
import java.util.Scanner;
public class ProgramaVehiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        while (true) {
            System.out.println("Menú Interactivo de Vehículos:");
            System.out.println("1. Crear un Auto");
            System.out.println("2. Crear una Motocicleta");
            System.out.println("3. Ver todos los Vehículos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca del auto: ");
                    String marcaAuto = scanner.nextLine();
                    System.out.print("Ingrese el modelo del auto: ");
                    String modeloAuto = scanner.nextLine();
                    Auto auto = new Auto(marcaAuto, modeloAuto);
                    vehiculos.add(auto);
                    System.out.println("Auto creado con éxito.");
                    break;
                case 2:
                    System.out.print("Ingrese la marca de la motocicleta: ");
                    String marcaMoto = scanner.nextLine();
                    System.out.print("Ingrese el modelo de la motocicleta: ");
                    String modeloMoto = scanner.nextLine();
                    Motocicleta moto = new Motocicleta(marcaMoto, modeloMoto);
                    vehiculos.add(moto);
                    System.out.println("Motocicleta creada con éxito.");
                    break;
                case 3:
                    if (vehiculos.isEmpty()) {
                        System.out.println("No hay vehículos registrados.");
                    } else {
                        System.out.println("Listado de vehículos:");
                        for (Vehiculo vehiculo : vehiculos) {
                            System.out.println(vehiculo);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}