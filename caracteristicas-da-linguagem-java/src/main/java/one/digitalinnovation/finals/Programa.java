package one.digitalinnovation.finals;

//Boas práticas são os metodos receberem final para proteger

public class Programa {

    public static void main(String[] args) {
        final HardcoreGamer hardcoreGamer = new HardcoreGamer();

        final Gamer gamer = new Gamer();

        final CasualGamer casualGamer = new CasualGamer();

        final var game = "PUBG";

        //Não posso alterar o valor já que é final
        //game = "WoW";

        System.out.println(casualGamer.play(game));


    }

}
