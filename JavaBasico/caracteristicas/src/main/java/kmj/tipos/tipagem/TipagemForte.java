package kmj.tipos.tipagem;

public class TipagemForte {
    public static void main(String[] args){
        String texto = "meu texto";

        // texto = 100; Erro

        Integer numero = Integer.valueOf("1024");
        numero = 512; // ok - msm Tipo

    }
}
