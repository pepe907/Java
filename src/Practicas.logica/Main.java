import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestorMoto gestorMoto = new GestorMoto();

        Scanner sc = new Scanner(System.in);
        int opcion, presupuesto;

        do {
            System.out.println("== Menu ==");

            System.out.println("1 Ver Catalogo");
            System.out.println("2 Agregar Moto");
            System.out.println("3 Compra tu Moto");
            System.out.println("0 Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 0){
                System.out.println("Saliendo ...");
            }else {
                switch (opcion){
                    case 1:
                        System.out.println("\n=== Catalogo ===");
                        gestorMoto.verMotos();

                    break;

                    case 2:
                        System.out.println("\n=== Registrar Nueva Moto ===");
                        System.out.print("Ingresa la marca: ");
                        String marca = sc.nextLine();
                        System.out.print("Ingresa el cilindraje: ");
                        String cilindraje = sc.nextLine();
                        System.out.print("Ingresa el precio: ");
                        int precio = sc.nextInt();

                        gestorMoto.agregarMoto(marca, cilindraje, precio);
                    break;

                    case 3:
                        System.out.println("\n=== Comprar Moto ===");

                        System.out.println("Ingresa la marca: ");
                        marca = sc.nextLine();

                        System.out.println("Agrega tu presupuesto: ");
                        presupuesto = sc.nextInt();

                        gestorMoto.comprarMoto(marca, presupuesto);

                     break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }
        }while (opcion != 0);
    }
}
