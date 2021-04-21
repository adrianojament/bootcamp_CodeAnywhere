package kmj.classes.pessoa;

import kmj.classes.cliente.Cliente;

public class ProgramaDoCliente {
    public static void main(String[] args){
        final var cliente = new Cliente(18);
        System.out.println(cliente.getIdade());
        System.out.println(cliente.getPeso());
        System.out.println(cliente.Relatorio());

    }
}
