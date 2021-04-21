package kmj.classes.pessoa;

public class ProgramaPessoaFisica {
    public static void main(String[] args){
        final PessoaFisica pessoaFisica = new PessoaFisica(33,115.50f);
        System.out.println(pessoaFisica.Relatorio());
    }
}
