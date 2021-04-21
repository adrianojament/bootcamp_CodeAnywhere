package kmj.finals;

public class CasualGamer extends Gamer {

    @Override
    public String keyboard() {return "Simple keyboard...";}

    public String play(final String game){
        return String.format("Jogando %s", game);
    }

}
