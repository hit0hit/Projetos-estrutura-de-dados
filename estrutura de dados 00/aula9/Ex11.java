package Aula09;

import java.util.ArrayList;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("Criando Pessoas...");
        Pessoa p1 = new Pessoa("kaname");
        Pessoa p2 = new Pessoa("anya");
        Pessoa p3 = new Pessoa("yuno");
        Pessoa p4 = new Pessoa("kakame");
        Pessoa p5 = new Pessoa("hit");
        Pessoa p6 = new Pessoa("yanima");
        Pessoa p7 = new Pessoa("sayar");
        Pessoa p8 = new Pessoa("meid");
        System.out.println("Criando Relacionamentos Conjuges...");
        p1.setConjuge(p2);
        p2.setConjuge(p1);
        p4.setConjuge(p5);
        p5.setConjuge(p4);
        p7.setConjuge(p8);
        p8.setConjuge(p7);
        System.out.println("Criando relacionamento de filhos");
        List<Pessoa> f1 = new ArrayList<Pessoa>();
        f1.add(p3);
        f1.add(p4);
        p1.setFilhos(f1);
        p2.setFilhos(f1);
        System.out.println("Mostrando Árvore Inteira: ");
        p1.mostrarArvore();

    }
}
