package kmj.abstracts;

public abstract class FormaGeometrica {
    public abstract String nome();
    public abstract Double area();

    public String desenha(int x, int y){
        return String.format("Desenhando nas coordenadas X=%o Y:%o", x, y);
    }
}
