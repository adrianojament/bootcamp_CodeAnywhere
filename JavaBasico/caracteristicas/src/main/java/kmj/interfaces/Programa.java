package kmj.interfaces;

public class Programa {
    public static void main(String[] args){
        final Carro gol = new Gol();
        System.out.println("Marca do gol: "+ gol.marca());
        gol.ligar();

        final IVeiculo trator = new Trator();
        System.out.println("Registro do trator: "+ trator.registro());
        trator.ligar();

        final var fiesta = new Fiesta();
        System.out.println("Registro do fiesta: "+ fiesta.registro());
        System.out.println("Marca do fiesta: "+ fiesta.marca());
        fiesta.ligar();

    }
}
