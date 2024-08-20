package org.example;

public class Real extends Moeda{

    int quantidadeMoedas;

    public Real(double valor, int quantidadeMoedas) {
        this.valor = valor;
        this.quantidadeMoedas = quantidadeMoedas;
    }

    public String info() {
        return "Essa é a moeda de real. ";
    }

    @Override
    double converter() {
        double total = valor;
        return total;
    }

    @Override
    public String toString() {
        return info() + " Você possui " + quantidadeMoedas +
                " de moedas de real e valor total de reais é de: " + valor * (quantidadeMoedas)+
                '.';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
