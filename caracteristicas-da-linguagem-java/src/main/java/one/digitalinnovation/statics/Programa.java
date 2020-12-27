package one.digitalinnovation.statics;

/*
    Static
    O valor do atributo vai estar em todas as instâncias daquele objeto. (Um atributo para todos)
    //Muito usado para constantes e metodos estaticos que não precisam ser instanciados.

    public static String late(){  //criado em Cachorro e usado no Programa
	    return "Au!Au!";
    }

    Nesse caso do cachorro, todos eles latem e da mesma forma, então pode usar sem problema.
    você instancia como Cachorro.late();

 */


public class Programa {

    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        //pitbull.zoologia = "Bipede";

        final Cachorro viraLatas = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viraLatas.zoologia);

        Cachorro.late();
    }

}
