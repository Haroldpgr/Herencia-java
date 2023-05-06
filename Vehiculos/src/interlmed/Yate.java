package interlmed;

public class Yate extends Acuatico {
    public Yate() {

    }

    public Yate(String color, String marca, String combustible, Integer numeroMotores) {
        super(color, marca, combustible);
        this.numeroMotores = numeroMotores;
    }

    public Integer getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(Integer numeroMotores) {
        this.numeroMotores = numeroMotores;

    }

    @Override
    public String toString() {

        return " Yate [color " + getColor() + " marca " + getMarca() + " combustible " + getCombustible()
                + " NumeroMotores " + getNumeroMotores() + "]";
    }

    private Integer numeroMotores;
}
