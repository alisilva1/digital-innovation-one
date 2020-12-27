package one.digitalinnovation.finals;

public class CasualGamer extends Gamer {

    @Override
    public String keyboard() {
        return "Simple keyboard...";
    }

   //Não posso sobrescrever é ideal para proteger metodos


   /* @Override
    public String mouse() {
        return super.mouse();
    }*/

    public String play(final String game) {
        //Nao posso alterar pela funcao ser final
        //game = "WoW";

        return "Jogando "+ game;
    }
}
