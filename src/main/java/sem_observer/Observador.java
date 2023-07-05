package sem_observer;

public class Observador {
    private Assunto assunto;

    public Observador(Assunto assunto) {
        this.assunto = assunto;
    }

    public void atualizar() {
        String estado = assunto.getEstado();
        System.out.println("Novo estado recebido pelo observador  (sem padrão observer): " + estado);
    }
}