package sem_observer;

public class Runner {
    public static void main(String[] args) {
        Assunto assunto = new Assunto();
        Observador observador1 = new Observador(assunto);
        Observador observador2 = new Observador(assunto);

        assunto.setEstado("O time XPTO ganhou o jogo ontem!");
        observador1.atualizar();
        observador2.atualizar();
    }

}
