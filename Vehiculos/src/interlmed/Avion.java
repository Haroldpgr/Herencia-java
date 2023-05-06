package interlmed;

public class Avion extends Aereo {

    public Avion() {

    }

    public Avion(String color, String marca, String combustible, Integer numeroTurbinas) {
        super(color, marca, combustible);
        this.numeroTurbinas = numeroTurbinas;
    }

    public Integer getNumeroTurbinas() {
        return numeroTurbinas;
    }

    public void setNumeroTurbinas(Integer numeroTurbinas) {
        this.numeroTurbinas = numeroTurbinas;

    }

    @Override
    public String toString() {

        return " Avion [color " + getColor() + " marca " + getMarca() + " combustible " + getCombustible()
                + " NumeroTurbinas " + getNumeroTurbinas() + "]";
    }

    private Integer numeroTurbinas;
}
