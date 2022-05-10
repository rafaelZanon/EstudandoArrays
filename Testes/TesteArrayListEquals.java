package Testes;

import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        List<Conta> lista = new Vector<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);
        Conta cp = new ContaPoupanca(33, 22);
        lista.add(cp);

        System.out.println(lista.size());

        Conta ref = lista.get(0);

        System.out.println(ref.getNumero());

        Conta cc2 = new ContaCorrente(22, 11);
        lista.add(cc2);
        Conta cp2 = new ContaPoupanca(22, 22);
        lista.add(cp2);

        Conta cc3 = new ContaCorrente(22,22);
        boolean existe = lista.contains(cc3);

        System.out.println(existe);

        for (Conta conta : lista){
            System.out.println(conta);
        }

    }
}
