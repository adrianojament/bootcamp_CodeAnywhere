package kmj.interfaces;

public interface IVeiculo {
    String registro();
    default void ligar() {System.out.println("Ligando o veiculo!");}
}
