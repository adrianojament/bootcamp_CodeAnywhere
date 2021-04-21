package kmj.classes.cliente;

import kmj.classes.pessoa.PessoaFisica;

public class ProgramaCliente {
    public static void main(String[] args){
        final var cliente = new Cliente(18);
        System.out.println(cliente.getIdade());
        System.out.println(cliente.getPeso());
    }

}
