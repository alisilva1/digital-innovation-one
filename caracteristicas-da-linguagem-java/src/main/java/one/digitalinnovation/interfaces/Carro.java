package one.digitalinnovation.interfaces;

public interface Carro extends Automovel{

    //Já é public não precisa colocar public String marca();
    String marca();

    Double valor();

    default void ligar() {

        System.out.println("Ligando o carro!");
    }

    //O default pode ser criado sem ser recriado. Na classe Gol
    default String codigoRenavan() {
        return "6533jijiio";
    }

}
