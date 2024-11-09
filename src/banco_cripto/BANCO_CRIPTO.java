package banco_cripto;

import banco_cripto.view.AtualizarCotacao;
import banco_cripto.view.Cadastro;
import banco_cripto.view.ComprarCriptomoedas;
import banco_cripto.view.ConsultaExtrato;
import banco_cripto.view.MenuPrincipal;
import banco_cripto.view.ConsultaSaldo;
import banco_cripto.view.Depositar;
import banco_cripto.view.Sacar;
import banco_cripto.view.VenderCriptomoedas;

public class BANCO_CRIPTO {
    public static void main(String[] args) {
        Cadastro cadastroFrame = new Cadastro();
        cadastroFrame.setVisible(true);      
    }
}