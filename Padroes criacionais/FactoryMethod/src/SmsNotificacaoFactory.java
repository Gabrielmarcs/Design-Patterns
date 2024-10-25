public class SmsNotificacaoFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao() {
        return new SmsNotificacao();
    }
    
}
