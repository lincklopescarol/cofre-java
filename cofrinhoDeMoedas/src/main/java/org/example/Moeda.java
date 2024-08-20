package org.example;

import java.util.Objects;

abstract class Moeda {
    double valor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(moeda.valor, valor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    abstract double converter();
}
