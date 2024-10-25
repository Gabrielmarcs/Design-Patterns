public abstract class NotificacaoFactory {
    public abstract Notificacao criarNotificacao();

    public void enviarNotificacao(String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviarNotificacao(mensagem);
    }

}
