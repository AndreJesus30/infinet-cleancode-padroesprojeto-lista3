package com_observer;
import com_observer.Assunto2;
import com_observer.Observador2;

public class Runner2 {
    public static void main(String[] args) {
        Assunto2 assunto = new Assunto2();
        ObservadorImplementado observador1 = new ObservadorImplementado();
        ObservadorImplementado observador2 = new ObservadorImplementado();

        assunto.adicionarObservador(observador1);
        assunto.adicionarObservador(observador2);

        // Alterar o estado do assunto automaticamente notifica os observadores
        assunto.setEstado("O time XPTO ganhou o jogo hoje");
    }
}

