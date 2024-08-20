package org.example;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    // adicionando moedas na lista
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    // removendo moedas da lista
    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
    }

    // fazendo a listagem das moedas
    public void listagemMoedas() {
        for (Moeda moeda : listaMoedas) {
            System.out.println(moeda);
        }
    }


}
