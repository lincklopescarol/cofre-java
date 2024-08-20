package org.example;

public class Euro extends Moeda{
    private int quantidadeMoedas;

    public Euro(double valor, int quantidadeMoedas) {
        this.valor = valor;
        this.quantidadeMoedas = quantidadeMoedas;
    }

    public String info() {
        return "Essa é a moeda de euro. ";
    }

    @Override
    double converter() {
        double total = valor * 6;
        return total;
    }

    @Override
    public String toString() {
        return info() + " Você possui " + quantidadeMoedas +
                " de moedas de euro e valor total de euros é de: " + valor * (quantidadeMoedas)+
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
