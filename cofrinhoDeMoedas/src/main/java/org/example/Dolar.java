package org.example;

public class Dolar extends Moeda{

    private int quantidadeMoedas;

    public Dolar(double valor, int quantidadeMoedas) {
        this.valor = valor;
        this.quantidadeMoedas = quantidadeMoedas;
    }
    public String info() {
        return "Essa é a moeda de dólar. ";
    }

    @Override
    public String toString() {
        return info() + " Você possui " + quantidadeMoedas +
                " de moedas de dólar e valor total de dólares é de: " + valor * (quantidadeMoedas)+
                '.';
    }

    @Override
    double converter() {
        double total = valor * 5.49;
        return total;
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
