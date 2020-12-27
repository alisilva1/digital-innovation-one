package one.digitalinnovation.classes.usuario;

/*
Grupos de acessos são responsaveis por habilitar ou não a visualização de um metodo ou classe.

Public - Qualquer lugar

Private - Só pode ser aplicado a atributos e métodos de uma classe e só podem ser usados por aquela classe.

Protected - Só tem acesso as classes que pertencem ao mesmo pacote ou através de herança.
Se herdar um membro e não estiver no mesmo pacote, não tem acesso.

*/

public class ProgramaDoSuperUsuario {

    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("root", "1234%$#@");

        /* Não consigo acessar diretamente o atributo Senha do arquivo SUPERUSUARIO que estão no pacote USUÁRIO */
        /* Pois esta como PROTECTED, mas o getLogin que é publico pode ser acessado em outro pacote */
        /* Temos referência ao objeto SuperUsuario no Pacote PESSOA */

        superUsuario.getLogin();

        superUsuario.getSenha();

        String root = superUsuario.nome;

    }

}
