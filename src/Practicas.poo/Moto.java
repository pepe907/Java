public class Moto {
    private String marca;
    private String cilindraje;
    private int precio;

    public Moto(String marca, String cilindraje, int precio){
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.precio = precio;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getCilindraje() { return cilindraje; }
    public void setCilindraje(String cilindraje) { this.cilindraje = cilindraje; }

    public int getPrecio() { return precio; }
    public void setPrecio(int precio) { this.precio = precio; }

}