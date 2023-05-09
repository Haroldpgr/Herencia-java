package interlemd;

public class Vehiculo {
    private String color;
    private String marca;
    private String combustible;

    public Vehiculo() {

    }

    public Vehiculo(String color, String marca, String combustible) {
        this.color = color;
        this.marca = marca;
        this.combustible = combustible;
    }

    public String getColor() {
        return color;

    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getMarca() {
        return marca;

    }

    public void setMarca(String marca) {
        this.marca = marca;

    }

    public String getCombustible() {
        return combustible;

    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;

    }
}