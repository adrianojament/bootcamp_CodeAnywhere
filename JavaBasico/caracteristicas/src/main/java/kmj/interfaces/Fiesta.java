package kmj.interfaces;

public class Fiesta implements Carro, IVeiculo {
    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public String registro() {
        return "123Af5545454";
    }

    @Override
    public void ligar(){
        Carro.super.ligar();
        IVeiculo.super.ligar();
    }
}
