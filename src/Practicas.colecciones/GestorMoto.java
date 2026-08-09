import java.util.ArrayList;

public class GestorMoto {

    ArrayList<Moto> motos = new ArrayList<>();

    public void agregarMoto(String marca, String cilindraje, int precio){
        motos.add(new Moto(marca,cilindraje,precio));
        System.out.println("Moto agregado");
    }

    public void verMotos(){
        boolean hayMotos = false;
        for (Moto m : motos){
            if (m.getCilindraje().contains("250")){
                System.out.println("Marca: " + m.getMarca());
                System.out.println("Cilindrage: " + m.getCilindraje());
                System.out.println("Precio: " + m.getPrecio());
                hayMotos = true;
            }
        }
        if (!hayMotos) {
            System.out.println("No hay Motos de 250cc ");
        }
    }
}
