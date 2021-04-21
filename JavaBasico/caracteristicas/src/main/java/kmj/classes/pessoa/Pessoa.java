package kmj.classes.pessoa;

public class Pessoa {

    private Integer idade;
    private Float peso;

    public Pessoa(){}

    public Pessoa(final Integer idade) {
        this.idade = idade;
    }

    public Pessoa(final Integer idade,final Float peso) {
        this.idade = idade;
        this.peso = peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public Float getPeso() {
        return peso;
    }

    protected String Relatorio(){
        return String.format("Idade: %d e peso: %f", this.idade,this.peso);


    }
}
