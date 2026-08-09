import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Moto m1 = new Moto("Zusuqui", "250cc", 1200);
        Moto m2 = new Moto("Honda", "600cc", 50000);
        Scanner sc = new Scanner(System.in);
        int opcion, prosupuesto;

        do {
            System.out.println("== Menu ==");

            System.out.println("1 Ver Catalogo");
            System.out.println("2 Calcular Presupuesto");
            System.out.println("0 Salir");
            opcion = sc.nextInt();

            if (opcion == 0){
                System.out.println("Saliendo ...");
            }else {
                switch (opcion){
                    case 1:
                        System.out.println("Catalogo");
                        m1.mostrarDetalles();
                        m2.mostrarDetalles();
                    break;

                    case 2:
                        System.out.println("Calcular Presupuesto");

                        System.out.println("Agrega tu prosupesto");
                        prosupuesto = sc.nextInt();

                    break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }
        }while (opcion != 0);
    }
}
