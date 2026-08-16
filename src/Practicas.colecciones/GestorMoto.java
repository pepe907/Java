import java.util.ArrayList;

public class GestorMoto {
    ArrayList<Moto> motos = new ArrayList<>();

    public void agregarMoto(String marca, String cilindraje, int precio){
        motos.add(new Moto(marca,cilindraje,precio));
        System.out.println("Moto agregado");
    }

    public void verMotos(){
        for (Moto m : motos){
                System.out.println("Marca: " + m.getMarca());
                System.out.println("Cilindrage: " + m.getCilindraje());
                System.out.println("Precio: " + m.getPrecio());
        }
    }

    public void comprarMoto(String marca, int presupuesto){
        boolean disponible = false;
        for (Moto m : motos){
            if (m.getMarca().equals(marca)){
                System.out.println("Marca: " + m.getMarca());
                System.out.println("Cilindrage: " + m.getCilindraje());
                System.out.println("Precio: " + m.getPrecio());
                disponible = true;

                int total = m.getPrecio() - presupuesto;
                System.out.println("Total: " + total);
                break;
            }
        }
        if (!disponible){
            System.out.println("Moto no disponible ");
        }
    }
}
