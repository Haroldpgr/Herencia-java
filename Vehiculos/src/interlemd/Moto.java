package interlemd;


public class Moto extends Terrestre {
    
    public Moto() {

    }

    public Moto(String color, String marca, String combustible, Integer numeroRuedas) {
        super(color, marca, combustible);
        this.numeroRuedas = numeroRuedas;

       

    }

    public Integer getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(Integer numeroRuedas) {
        this.numeroRuedas = numeroRuedas;

    }

    @Override
    public String toString() {
        return " Moto [color " + getColor() + " marca " + getMarca() + " combustible " + getCombustible()
                + " numeroRuedas= " + numeroRuedas + "]";
    }

    private Integer numeroRuedas;
}
