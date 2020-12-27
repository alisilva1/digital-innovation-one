package one.digitalinnovation.abstracts;

public class Programa {

    public static void main(String[] args) {

        /*

        Abstract não pode ser usado em variáveis, apenas em classes e métodos. Não pode ser instanciada.
        Se a classe for abstrata(ideia de uma classe, não pode virar um objeto).
        Se eu extender alguma nova classe a partir de uma abstrata. Tenho que instanciar os metodos abstract,
        através do @Override.

         */


        //final FormaGeometrica formaGeometrica = new FormaGeometrica();

        final FormaGeometrica quadrado = new Quadrado("quadrado", 10.0);

        System.out.println(quadrado);
        
        System.out.println(quadrado.desenha(12,34));
        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());
    }

}
