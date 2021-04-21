package kmj.finals;

public class Programa {
    public static void main(String[] args){
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();
        final Gamer gamer = new CasualGamer();
        final CasualGamer casualGamer = new CasualGamer();

        final var game = "Fifa";
        System.out.println(casualGamer.play(game));

    }

}
