package interlemd;

public class Terrestre extends Vehiculo {
    public Terrestre() {

    }
    public void rodar() {
        System.out.println("Empieza a rodar moto");
    }

    public Terrestre(String color, String marca, String combustible) {
        super(color, marca, combustible);

    }

}
