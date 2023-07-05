package com_observer;
import java.util.ArrayList;
import java.util.List;

public class Assunto2 {
    private List<Observador2> observadores = new ArrayList<>();
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarObservadores();
    }

    public void adicionarObservador(Observador2 observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador2 observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador2 observador : observadores) {
            observador.atualizar(estado);
        }
    }
}
