package one.digitalinnovation.interfaces;

/*

Interfaces
Pode ter métodos abstratos, se alguém extenda-la a interface se torna aquele tipo.

É implementado por implements ao invés do extends de classe;

Metodos Abstratos
Devem ser implementados por todos;
Novos metodos quebram as implementações;

Métodos Default
São herdados a todos que implementam;
Novos metodos não quebram as implementações;

Herança Múltipla
Só é possível com interface;

 */


public class Programa {

    public static void main(String[] args) {

        //igual a final Gol gol = new Gol();
        final Carro gol = new Gol();
        System.out.println("Marca do Gol : "+gol.marca());
        gol.ligar();

        final Veiculo trator = new Trator();
        System.out.println("Registro do Trator :"+trator.registro());
        trator.ligar();

        //Não devemos utilizar nem Carro e nem Veiculo, pois não temos o registro e marca neles
        // Entao o ideal será usar o fiesta
        final Fiesta fiesta = new Fiesta();

        System.out.println("Marca do Fiesta : "+fiesta.marca());
        System.out.println("Registro do Fiesta : "+fiesta.registro());

        fiesta.ligar();

        //Carro.super.ligar(); //só pode ser acessado por que implementa
    }

}
