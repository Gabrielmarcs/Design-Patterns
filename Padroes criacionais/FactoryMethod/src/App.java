public class App {
    public static void main(String[] args) throws Exception {
        NotificacaoFactory notificacaoFactory = new EmailNotificacaoFactory();
        notificacaoFactory.enviarNotificacao("teste de notificação por email");

        notificacaoFactory = new SmsNotificacaoFactory();
        notificacaoFactory.enviarNotificacao("teste de notificação por SMS");
    }
}
