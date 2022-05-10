package Testes;

import Classes.CalculadorDeImposto;
import Classes.ContaCorrente;
import Classes.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100);

        SeguroDeVida seguroDeVida = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registra(seguroDeVida);
        calculadorDeImposto.registra(cc);

        System.out.println(calculadorDeImposto.getTotalImposto());
    }
}
