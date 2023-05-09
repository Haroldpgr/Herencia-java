package interlemd;

public class Aereo extends Vehiculo {
    public Aereo() {

    }

    public void Volar() {
        System.out.println("Empieza a volar");
    }

    public Aereo(String color, String marca, String combustible) {
        super(color, marca, combustible);

    }

}
