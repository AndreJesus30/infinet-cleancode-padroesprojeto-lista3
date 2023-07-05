package sem_observer;
import java.util.ArrayList;
import java.util.List;

public class Assunto {

    private List<Observador> observadores = new ArrayList<>();
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.atualizar();
        }
    }

}
