import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/*
public class Principal {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Digite seu nome: ");
    	String nome = scanner.nextLine();
    	
    	if (nome.equalsIgnoreCase("André")) {
    		System.out.println("Olá, mestre André! Preparado para dominar o Java?");
    	} else {
    		System.out.println("Olá, " + nome + "! Seja bem-vindo ao mundo Java!");
    	}
        scanner.close();
    }
}
*/


/*
public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		
		while (opcao != 3) {
			System.out.println("\n==== MENU ====");
            System.out.println("1. Dizer olá");
            System.out.println("2. Mostrar data e hora atual");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            // Verifica se digitou um número
            
            if (scanner.hasNextInt()) {
            	opcao = scanner.nextInt();
            	scanner.nextLine(); // Limpar o buffer
            	
            	switch (opcao) {
            	case 1:
            		System.out.print("Digite o seu nome: ");
            		String nome = scanner.nextLine();
            		System.out.println("Olá, " + nome + "! Tudo bem?");
            		break;
            		
            	case 2:
            		LocalDateTime agora = LocalDateTime.now();
            		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            		System.out.println("Data e hora atual: " + agora.format(formato));
            		break;
            		
            	case 3:
            		System.out.println("Encerrando o programa. Até logo!");
            		break;
            	
            	default:
            		System.out.println("Opção inválida! Tente novamente.");
            	}
              	
            } else {
            	System.out.println("Você precisa digitar um número!");
                scanner.nextLine(); // Limpar entrada inválida
            }
		}	
		scanner.close();
	}
}
*/

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		int opcao = 0;
		
		while (opcao != 4) {
			System.out.println("\n==== MENU ====");
            System.out.println("1. Cadastrar pessoa");
            System.out.println("2. Listar pessoas");
            System.out.println("3. Mostrar data e hora atual");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            if (scanner.hasNextInt()) {
            	opcao = scanner.nextInt();
            	scanner.nextLine(); // Limpa o buffer
            	
            	switch (opcao) {
            	case 1: 
            		System.out.print("Digite o nome: ");
            		String nome = scanner.nextLine();
            		
            		System.out.print("Digite a idade: ");
            		int idade;
            		if (scanner.hasNextInt()) {
            			idade = scanner.nextInt();
            			scanner.nextLine(); // Limpa o buffer
            			Pessoa pessoa = new Pessoa(nome, idade);
            			pessoas.add(pessoa);
            			System.out.println("Pessoa cadastrada com sucesso!");
            		} else {
            			System.out.println("Idade inválida! Cadastro cancelado.");
                        scanner.nextLine(); // Limpa entrada inválida
            		}
            		break;
            		
            	case 2:
            		if (pessoas.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {
                        System.out.println("Lista de pessoas cadastradas:");
                        for (Pessoa p : pessoas) {
                            System.out.println("- " + p);
                        }
                    }
                    break;
                case 3:
            		LocalDateTime agora = LocalDateTime.now();
            		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            		System.out.println("Data e hora atual: " + agora.format(formato));

            		break;

            	case 4:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            	} 
                } else {
                    System.out.println("Entrada inválida. Digite um número.");
                    scanner.nextLine(); // Limpa entrada inválida
            }
		}
		
		scanner.close();
	}
}
