package Testes;

import Classes.Conta;
import Classes.ContaCorrente;
import Classes.GuardadorDeContas;

public class TesteS {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);

        guardador.adiciona(cc);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
    }
}
