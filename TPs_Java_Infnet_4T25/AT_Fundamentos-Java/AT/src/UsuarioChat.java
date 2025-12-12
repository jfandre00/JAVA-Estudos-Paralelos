public class UsuarioChat {
    private String nome;
    private String[] mensagens;
    private int contadorMensagens;
    
    public UsuarioChat(String nome, int capacidadeMensagens) {
        this.nome = nome;
        this.mensagens = new String[capacidadeMensagens];
        this.contadorMensagens = 0;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void enviarMensagem(String mensagem) {
        if (contadorMensagens < mensagens.length) {
            mensagens[contadorMensagens] = mensagem;
            contadorMensagens++;
        } else {
            System.out.println("Limite de mensagens atingido para o usuário " + nome);
        }
    }
    
    public String[] getMensagens() {
        return mensagens;
    }
}