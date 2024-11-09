import banco_cripto.model.Usuario;
import java.util.ArrayList;

public class ControleCadastro {

    // Lista para armazenar os usuários cadastrados (simulação de banco de dados)
    private static ArrayList<Usuario> usuariosCadastrados = new ArrayList<>();

    // Método para verificar o login
    public boolean verificarLogin(String cpf, String senha) {
        // Verifica se o CPF e a senha não são nulos
        if (cpf == null || senha == null) {
            return false;
        }

        // Verifica se o usuário existe e a senha corresponde
        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.getCpf().equals(cpf) && usuario.getSenha().equals(senha)) {
                return true;  // Login bem-sucedido
            }
        }
        return false;  // Login falhou
    }

    // Método para cadastrar um novo usuário
    public boolean cadastrarUsuario(String nome, String cpf, String senha) {
        // Verifica se o CPF já está cadastrado
        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.getCpf().equals(cpf)) {
                return false;  // Usuário já existe
            }
        }

        // Se o CPF não existe, cria um novo usuário e o adiciona
        Usuario novoUsuario = new Usuario(nome, cpf, senha);
        usuariosCadastrados.add(novoUsuario);
        return true;  // Cadastro bem-sucedido
    }
}
