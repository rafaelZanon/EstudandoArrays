package Testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testeProblemaResolvido{
    public static void main(String[] args) {

        Aula aulaIntro = new Aula("Introdução às Coleções", 20);
        Aula aulaModelando = new Aula("Modelando a Classe Aula", 18);
        Aula aulaSets = new Aula("Trabalhando com Conjuntos", 16);

        List<Aula> aulas = new ArrayList<Aula>();
        aulas.add(aulaIntro);
        aulas.add(aulaModelando);
        aulas.add(aulaSets);

        Collections.sort(aulas);

        for (Aula aula : aulas) {
            System.out.println(aula);
        }
    }


}

//Para arrumar essa classe implementei o Comparable <Aula> + o metodo CompareTo

class Aula implements Comparable<Aula>  {

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String toString() {
        return "[título: " + titulo + ", tempo: " + tempo + " minutos]";
    }

    @Override
    public int compareTo(Aula outra) {
        return Integer.compare(this.tempo, outra.tempo);
    }
}

