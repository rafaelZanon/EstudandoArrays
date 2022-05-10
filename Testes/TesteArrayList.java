package Testes;

import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {

        ArrayList <Conta> lista = new ArrayList();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);
        Conta cp = new ContaPoupanca(33, 22);
        lista.add(cp);

        System.out.println(lista.size());

        Conta ref = lista.get(0);

        System.out.println(ref.getNumero());

        Conta cc2 = new ContaCorrente(44, 44);
        lista.add(cc2);
        Conta cp2 = new ContaPoupanca(55, 55);
        lista.add(cp2);

        for (int i = 0; i <lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

    }
}
