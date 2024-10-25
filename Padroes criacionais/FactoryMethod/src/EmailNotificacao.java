public class EmailNotificacao implements Notificacao {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação por e-mail enviada: " + mensagem);
    }
}
