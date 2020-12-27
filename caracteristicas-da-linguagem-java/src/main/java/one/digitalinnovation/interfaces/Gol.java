package one.digitalinnovation.interfaces;

//Meu gol é um carro ele implementa e vira aquele objeto
public class Gol implements Carro {

    @Override
    public String marca() {

        return "Volkswagen";
    }

    @Override
    public Double valor() {
        return null;
    }
}
