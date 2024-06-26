package com.poo.introducao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Lista01 {

    public static void ex1(String[] args) {

        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicita e obtém o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcula a soma dos dois números
        double soma = numero1 + numero2;

        // Exibe o resultado
        System.out.println("A soma dos números é: " + soma);

        // Fecha o Scanner
        scanner.close();
    }

    public static void ex2(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o nome
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        // Solicita e obtém o sobrenome
        System.out.print("Digite o sobrenome: ");
        String sobrenome = scanner.nextLine();

        // Coloca em uma variavel o nome e sobrenome
        String nomesobrenome = nome + " " + sobrenome;

        // Exibe o resultado
        System.out.println("Seja bem vindo: " + nomesobrenome);

        // Fecha o Scanner
        scanner.close();
    } 

    public static void ex3(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o valor em reais
        System.out.print("Digite um valor em reais para converter em dolar: \n ");
        double valorDigitadoEmReais = scanner.nextDouble();

        // Solicita e obtém a taxa de conversao
        System.out.print("Digite o valor da taxa de conversao: \n ");
        double TaxaConversao = scanner.nextDouble();
        
        // Calcula a divisao dos dois valores
        double valorConvertidoParaDolar = valorDigitadoEmReais / TaxaConversao;

        // Arredonda o valor para ate 2 casas decimais
        // BigDecimal class fornece operações em números duplos para aritmética, manipulação de escala, arredondamento, comparação, conversão de formato e hashing.
        // HALF_EVEN indica que o arredondamento acontece para o valor mais próximo
        BigDecimal bd = new BigDecimal(valorConvertidoParaDolar).setScale(2, RoundingMode.HALF_EVEN);
        
        // Exibe o resultado
        System.out.println("O valor em dolar é: $" + bd.doubleValue());

        
        // System.out.println("O valor em dolar é: $" + Math.round(valorConvertidoParaDolar));
        // Fecha o Scanner100
        scanner.close();
    }

    public static void ex4(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém o número
        System.out.print("Digite o número: ");
        int numero1 = scanner.nextInt();

        // Calcular o antecessor e sucessor
        int antecessor = numero1 - 1;
        int sucessor = numero1 + 1;

        // Exibe o resultado
        System.out.println("O antecessor do numero " + numero1 + " é: " + antecessor + " e seu sucessor é: " + sucessor);

        // Fecha o Scanner
        scanner.close();
    }

    public static void ex5(String[] args) {

        double larguraTerreno;
        double comprimentoTerreno;
        double area;
        double valorDoM2;
        double valorTerreno;

        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém a largura do terreno
        System.out.print("Digite a largura do terreno: \n");
        larguraTerreno = scanner.nextDouble();

        // Solicita e obtém o comprimento do terreno
        System.out.print("Digite o comprimento do terreno: \n");
        comprimentoTerreno = scanner.nextDouble();

        // Solicita e obtém o valor do m2
        System.out.print("Digite o valor do m2 em reais: \n");
        valorDoM2 = scanner.nextDouble();

        // Calculando a area do terreno
        area = larguraTerreno * comprimentoTerreno;

        // Calculando o valor do terreno
        valorTerreno = valorDoM2 * area;

        // Arredonda o valor para ate 2 casas decimais
        // BigDecimal class fornece operações em números duplos para aritmética, manipulação de escala, arredondamento, comparação, conversão de formato e hashing.
        // HALF_EVEN indica que o arredondamento acontece para o valor mais próximo
        BigDecimal bd = new BigDecimal(valorTerreno).setScale(3, RoundingMode.HALF_EVEN);
        
        // Exibe o resultado
        System.out.println("O valor do terreno é: R$ " + bd.doubleValue());

        // Fecha o Scanner
        scanner.close();
    }

    public static void ex6(String[] args) {

        double distanciaKM;
        double consumoL;
        double custoL = 5.00;

        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém a distancia percorrida em km
        System.out.print("Digite a distancia percorrida em KM: \n");
        distanciaKM = scanner.nextDouble();

        // Solicita e obtém o gasto de combustivel em Litros
        System.out.print("Digite o total gasto em combustivel em L: \n");
        consumoL = scanner.nextDouble();

        System.out.print("Sua autonomia foi de: " + ( distanciaKM/(consumoL/custoL) ) + " Km/L.");

        // Fecha o Scanner
        scanner.close();
    }

    public static void ex7(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e obtém a nota 1
        System.out.print("Digite a primeira nota: \n ");
        int nota1 = scanner.nextInt();

        // Solicita e obtém a nota 1
        System.out.print("Digite a segunda nota: \n ");
        int nota2 = scanner.nextInt();

        // Solicita e obtém a nota 1
        System.out.print("Digite a terceira nota: \n ");
        int nota3 = scanner.nextInt();

        // Solicita e obtém a nota 1
        System.out.print("Digite a quarta nota: \n ");
        int nota4 = scanner.nextInt();
        
        // Calcula a media das notas
        int media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibe o resultado
        System.out.println("O media das notas é: $" + media);
        
        // System.out.println("O valor em dolar é: $" + Math.round(valorConvertidoParaDolar));
        // Fecha o Scanner100
        scanner.close();
    }

    public static void ex8(String[] args) {
        // Cria um Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e obtém a temperatura em Fahrenheit
        System.out.print("Digite a temperatura em Fahrenheit: \n ");
        Double temperaturaEmFahrenheit = scanner.nextDouble();

        // Calcula a media das notas
        Double temperaturaEmCelsius = (temperaturaEmFahrenheit - 32) / 1.8;

        // Exibe o resultado
        System.out.println(temperaturaEmFahrenheit + " oF corresponde a " + temperaturaEmCelsius + " oC");
        
        // Fecha o Scanner100
        scanner.close();
    }

}