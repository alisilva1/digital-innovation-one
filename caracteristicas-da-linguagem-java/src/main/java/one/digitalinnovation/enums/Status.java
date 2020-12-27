package one.digitalinnovation.enums;

/*
Enums
É um dicionários de dados imutável;
Não é permitido novas instâncias;
Construtor é sempre declarado como private;
Por ser constante e imutável é ideal declarar em UpperCase;

 */

public enum Status {
    OPEN(13, "Aberto"),
    CLOSE(02, "Fechado");

    private int cod;
    private String texto;

    Status(final int cod, final String texto) {

        this.cod = cod;
        this.texto = texto;
    }

    public int getCod() {
        return cod;
    }

    public String getTexto() {
        return texto;
    }
}
