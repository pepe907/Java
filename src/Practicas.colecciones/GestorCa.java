import java.util.ArrayList;

public class GestorCa {
    ArrayList<UsuarioCa> usuarioCa = new ArrayList<>();


    public void crearUsuario(String nombre, double saldo){
        usuarioCa.add(new UsuarioCa(nombre,saldo));
        System.out.println("Usuario Creado Con EXITO!!! ");
    }


    public void agregarSaldo(double saldo){
        for (UsuarioCa usuarioCa1 : usuarioCa){
            double nuevoSaldo = usuarioCa1.getSaldo() + saldo;
            System.out.println("Recarga Con exito :) ");
            System.out.println("Nuevo Saldo: " + nuevoSaldo);
        }
    }

    public void retirarSaldo(double saldo){
        for (UsuarioCa usuarioCa1 : usuarioCa){
            double nuevoSaldo = usuarioCa1.getSaldo() - saldo;
            System.out.println("Retiro con EXITO :) ");
            System.out.println("Nuevo Saldo: " + nuevoSaldo);
        }
    }

    public void eliminarCuenta(String nombre){
        boolean eliminado = usuarioCa.removeIf(usuarioCa1 -> usuarioCa1.getNombre().equals(nombre));
        if (eliminado){
            System.out.println("Usuario eliminado");
        }else {
            System.out.println("Usuario no encontrado");
        }
    }

    public void verCuenta(){
        for(UsuarioCa usuarioCa1: usuarioCa){
            System.out.println("===================================");
            System.out.println(" == Cuenta ==");
            System.out.println("===================================");
            System.out.println("Nombre: " + usuarioCa1.getNombre());
            System.out.println("Saldo: " + usuarioCa1.getSaldo());
            System.out.println("===================================");
        }
    }
}
