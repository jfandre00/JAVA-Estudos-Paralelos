
import java.util.Scanner;

public class AT_Ex12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do primeiro usuário do chat: ");
        String nomeUsuario1 = sc.nextLine();
        UsuarioChat usuario1 = new UsuarioChat(nomeUsuario1, 5);
        System.out.print("Digite o nome do segundo usuário do chat: ");
        String nomeUsuario2 = sc.nextLine();
        UsuarioChat usuario2 = new UsuarioChat(nomeUsuario2, 5);
        System.out.println("Iniciando chat entre " + usuario1.getNome() + " e " + usuario2.getNome() + ".");

        for (int i = 0; i < 5; i++) {
            System.out.print(usuario1.getNome() + ", digite sua mensagem: ");
            String mensagem1 = sc.nextLine();
            usuario1.enviarMensagem(mensagem1);
            System.out.print(usuario2.getNome() + ", digite sua mensagem: ");
            String mensagem2 = sc.nextLine();
            usuario2.enviarMensagem(mensagem2);
        }

        // Exibir mensagens de ambos os usuários
        System.out.println("Histórico de mensagens:");
        // mostrar mensagens intercaladas
        String[] mensagens1 = usuario1.getMensagens();
        String[] mensagens2 = usuario2.getMensagens();
        for (int i = 0; i < 5; i++) {
            System.out.println(usuario1.getNome() + ": " + mensagens1[i]);
            System.out.println(usuario2.getNome() + ": " + mensagens2[i]);
        }
        System.out.println("-------------------------------");
        sc.close();

        System.out.println("Programa finalizado.");

    }

}
