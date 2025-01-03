/* O nome da classe tem que ser igual ao nome do arquivo e ser pública */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* 
        // numeros inteiros (int)
        // byte -> vai do número -128 até 127 (8 bits na memória)
        byte idade = 127;
        // short -> vai do número -32768 até 32767 (16 bits na memória)
        short idade2 = 32767;
        // int -> vai do número -2.147.483.648 até 2.147.483.647 (32 bits na memória)
        int idade3 = 2147483647;
        // long -> vai do número -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 (64 bits na memória)
        long idade4 = 9223372036854775807L;
        // numeros decimais (float e double)
        // float -> 32 bits na memória
        float altura = 1.63f;
        // double -> 64 bits na memória
        double altura2 = 1.63;

        // char -> 16 bits na memória
        char letra = 'F';

        // string -> não é um tipo primitivo, é uma classe
        String nome = "Fernanda";
        */

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 1000000000L;
        float f = 10.5f;
        double d = 10.5;
        char c = 'F';
        String str = "Fernanda";
        boolean bool = true;

        int[] colecaoDeInteiros = {1, 2, 3, 4, 5}; //esse vetor tem um tamanho fixo, não podem ser adicionados mais elementos

        boolean[] colecaoDeBooleans = {true, false, true, false, true};

        int[] meusNumeros = new int[10]; // eu preciso dizer o tamanho do vetor na hora de declarar

        //Como resolver o problema de tamanho fixo do vetor?
        //ArrayList é uma classe que permite criar vetores de tamanho dinâmico

        ArrayList<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Fernanda");
        listaDeNomes.add("João");
        listaDeNomes.add("Maria");

        for (int j = 0; j < listaDeNomes.size(); j++) {
            int k = j + 1;
            System.out.println("O " + k + "º elemento da lista é " + listaDeNomes.get(j));
        }

        listaDeNomes.remove(0); //remove o primeiro elemento da lista
        System.out.println("Após a exclusão, o primeiro elemento da lista é: " + listaDeNomes.get(0));


        if(bool) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if (b > 99) {
            System.out.println("b é maior que 99");
        } else {
            System.out.println("b é menor que 99");
        }

        if (str == "Fernanda") {
            System.out.println("O nome é Fernanda");
        } else {
            System.out.println("O nome não é Fernanda");
        }

        System.out.println(colecaoDeInteiros[0]);
        System.out.println("O tamanho da coleção é: " + colecaoDeInteiros.length);


        String[] nomesArr = new String[10];
        nomesArr[0] = "André";
        nomesArr[1] = "Bento";
        nomesArr[2] = "Carlos";

        for (int j = 0; j < nomesArr.length; j++) {
            System.out.println(nomesArr[j]);
        } // imprime os 3 nomes e 7 posições vazias
      
        ArrayList<String> nomeArraysNovo = new ArrayList<>();
        nomeArraysNovo.add("Fernando");
        nomeArraysNovo.add("Joana");
        nomeArraysNovo.add("Mario");

        for (String nome : nomeArraysNovo) {
            System.out.println(nome);
        }

        int contador = 0;
        while(contador < 5) {
            System.out.println("Executando o while pela " + (contador + 1) + "ª vez");
            contador++;
        }

        //Convertendo entre um tipo de dado e outro - CAST

        double resultado = 0.0;
        int resultadoInt = (int)resultado;

        int meuInt = 10;
        double meuDouble = (double)meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);
        
        String meuString2 = String.valueOf(meuInt2);

        
        boolean verdadeiro = true;
        String verdadeiroString = String.valueOf(verdadeiro);
        System.out.println(verdadeiroString);

        
    } 
}

