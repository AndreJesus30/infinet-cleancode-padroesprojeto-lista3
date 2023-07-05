package com_observer;

public class ObservadorImplementado implements Observador2 {
    @Override
    public void atualizar(String estado) {
        System.out.println("Novo estado recebido pelo observador (com padrão observer): " + estado);
    }
}
