package kmj.abstracts;

public class Quadrado extends FormaGeometrica {
    private String nome;
    private Double area;

    public Quadrado(String nome, Double area) {
        this.nome = nome;
        this.area = area;
    }

    @Override
    public String nome() {
        return this.nome;
    }

    @Override
    public Double area() {
        return this.area;
    }

    @Override
    public String toString(){
        return String.format("Quadrado [ Nome: %s Area: %f]", this.nome, this.area);
    }
}
