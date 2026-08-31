import java.util.Scanner;

public class MainCa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorCa gestorCa = new GestorCa();
        int opcion;
        double saldo;
        String nombre;

        System.out.println(" === Bienvenido a Levo ===");
        System.out.println(" 1 Menu ");
        System.out.println(" 0 Salir ");
        opcion = sc.nextInt();
        sc.nextLine();
        if (opcion == 0){
            System.out.println(" Saliendo ...");
        }else {
            do {
                System.out.println(" == Menu ==");

                System.out.println(" 1 Agregar Usuario ");
                System.out.println(" 2 Recargar ");
                System.out.println(" 3 Retirar ");
                System.out.println(" 4 Eliminar Cuenta ");
                System.out.println(" 5 Cuenta ");
                System.out.println(" 0 Salir ");
                opcion = sc.nextInt();
                sc.nextLine();

                if (opcion != 0){
                    switch (opcion) {

                        case 1:
                            System.out.println("=======================");
                            System.out.println(" == Agregar ==");
                            System.out.println("=======================");

                            System.out.print("Nombre: ");
                            nombre = sc.nextLine();
                            System.out.print("Saldo: ");
                            saldo = sc.nextDouble();

                            gestorCa.crearUsuario(nombre, saldo);
                            System.out.println("=======================");
                            break;

                        case 2:
                            System.out.println("=======================");
                            System.out.println(" == Recargar ==");
                            System.out.println("=======================");

                            System.out.println("Valor a recargar: ");
                            saldo = sc.nextDouble();

                            gestorCa.agregarSaldo(saldo);
                            System.out.println("=======================");
                            break;

                        case 3:
                            System.out.println("=======================");
                            System.out.println(" == Retirar ==");
                            System.out.println("=======================");

                            System.out.println("Valor a retitar: ");
                            saldo = sc.nextDouble();

                            gestorCa.retirarSaldo(saldo);
                            System.out.println("=======================");
                            break;

                        case 4:
                            System.out.println("=======================");
                            System.out.println(" == Eliminar Cuenta ==");
                            System.out.println("=======================");

                            System.out.println("Nombre: ");
                            nombre = sc.nextLine();

                            gestorCa.eliminarCuenta(nombre);
                            System.out.println("=======================");
                            break;

                        case 5:
                            gestorCa.verCuenta();
                            break;

                        default:
                            System.out.println("Opcion no valida ");
                            break;
                    }
                }else {
                    System.out.println("Saliendo");
                }
            }while (opcion != 0);
            sc.close();
        }
    }
}