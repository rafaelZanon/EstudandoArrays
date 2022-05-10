package Testes;

import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

public class TesteArrayReferencias {
    public static void main(String[] args) {

        //ContaCorrente[] contasCorrentes = new ContaCorrente[5];
        Conta[] contas = new Conta[5];

        ContaCorrente cc = new ContaCorrente(22, 11);
        ContaPoupanca cp = new ContaPoupanca(33, 22);


        contas[0] = cc;
        contas[1] = cp;

        System.out.println(contas[1].getNumero());

        ContaPoupanca ref = (ContaPoupanca) contas[1];
    }
}
