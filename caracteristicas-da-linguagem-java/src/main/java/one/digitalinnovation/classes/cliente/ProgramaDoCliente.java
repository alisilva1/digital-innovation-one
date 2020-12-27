package one.digitalinnovation.classes.cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {
        final var cliente = new Cliente(18);

        cliente.getIdade();

        cliente.getPeso();


        /* Apesar da Herança por estar em pacote diferente o Protected não irá funcionar */

        //System.out.println(cliente.relatorio());
    }

}
