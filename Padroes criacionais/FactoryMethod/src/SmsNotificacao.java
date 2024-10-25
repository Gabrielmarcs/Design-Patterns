public class SmsNotificacao implements Notificacao {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação por SMS enviada: " + mensagem);
    }
}
