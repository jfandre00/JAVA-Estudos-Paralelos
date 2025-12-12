
public class AT_Ex05 {

    public static void main(String[] args) {

        // ------------------------------------------------------------
        // 1. Header HTTP obrigatório
        // ------------------------------------------------------------
        // O CGI deve sempre imprimir primeiro o tipo de conteúdo.
        System.out.println("Content-Type: text/html");

        // ------------------------------------------------------------
        // 2. Linha em branco obrigatória separando headers do corpo
        // ------------------------------------------------------------
        System.out.println();

        // ------------------------------------------------------------
        // 3. Corpo da resposta em HTML
        // ------------------------------------------------------------
        System.out.println("<html>");
        System.out.println("<head><title>Saudação CGI</title></head>");
        System.out.println("<body>");
        System.out.println("<h1>Olá, Terráqueos!</h1>");
        System.out.println("</body>");
        System.out.println("</html>");

    }

}
