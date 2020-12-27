package one.digitalinnovation.classes.pessoa;

import one.digitalinnovation.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {

    public static void main(String[] args) {
        final var batman = new SuperUsuario("batman", "1234%$#@");

        batman.getLogin();

        //batman.getSenha();    //ERRO


        /* Default também não é acessado por outro pacote */
        //String nomeDoCliente = batman.nome; //ERRO
    }

}
