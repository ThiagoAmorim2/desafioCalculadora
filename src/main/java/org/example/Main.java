package org.example;

import org.example.model.CalculadoraIMC;
import org.example.model.CalculadoraPadrao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer calcularNovamente = 2;
        Scanner sc = new Scanner(System.in);

        while (calcularNovamente == 2){

        System.out.println("------------------------------------");
        System.out.println("-------------CALCULADORA------------");
        System.out.println("------------------------------------");
        System.out.println("Qual a opção que você deseja escolher? ");
        System.out.println("1 - Calculadora Padrão");
        System.out.println("2 - Calculadora IMC");
        System.out.println("3 - Calculadora de áreas geométricas");
        Integer opcao = sc.nextInt();

        while (opcao == 1) {
                Integer retornocalculadoraPadrao = 1;
                while (retornocalculadoraPadrao == 1) {
                    System.out.println("------------------------------------");
                    System.out.println("--------CALCULADORA-PADRÃO----------");
                    System.out.println("------------------------------------");
                    System.out.println("Que operação padrão deseja realizar? ");
                    System.out.println("1 - Soma");
                    System.out.println("2 - Subtração");
                    System.out.println("3 - Divisão");
                    System.out.println("4 - Multiplicação");
                    System.out.println("5 - Potenciação");
                    System.out.println("6 - Sair");
                    Integer opcaoCalculadoraPadrao = sc.nextInt();

                    if (opcaoCalculadoraPadrao == 1) {
                        Integer rebootSoma = 1;
                        while (rebootSoma == 1) {
                            System.out.println("Informe o 1o número da soma: ");
                            Double numero1 = sc.nextDouble();
                            System.out.println("Informe o 2o número da soma: ");
                            Double numero2 = sc.nextDouble();

                            CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao(numero1, numero2);
                            System.out.println("A soma entre " + numero1 + " e " + numero2 + " é " + calculadoraPadrao.soma(numero1, numero2) + "\n");
                            System.out.println("Deseja realizar outra SOMA? \n");
                            System.out.println("1 - SIM ou 2 - NÃO");
                            rebootSoma = sc.nextInt();
                        }
                        opcao = 1;
                    }else if (opcaoCalculadoraPadrao == 2){
                            Integer rebootSubtracao = 1;
                            while (rebootSubtracao == 1) {
                                System.out.println("Informe o 1o número da subtração: ");
                                Double numero1 = sc.nextDouble();
                                System.out.println("Informe o 2o número da subtração: ");
                                Double numero2 = sc.nextDouble();

                                CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao(numero1, numero2);
                                System.out.println("A subtração entre " + numero1 + " e " + numero2 + " é " + calculadoraPadrao.subtracao(numero1, numero2) + "\n");
                                System.out.println("Deseja realizar outra SUBTRAÇÃO? \n");
                                System.out.println("1 - SIM ou 2 - NÃO");
                                rebootSubtracao = sc.nextInt();
                            }
                            opcao = 1;
                    }else if (opcaoCalculadoraPadrao == 3){
                        Integer rebootDivisão = 1;
                        while (rebootDivisão == 1) {
                            System.out.println("Informe o 1o número da divisão: ");
                            Double numero1 = sc.nextDouble();
                            System.out.println("Informe o 2o número da divisão: ");
                            Double numero2 = sc.nextDouble();

                            CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao(numero1, numero2);
                            System.out.println("A divisão entre " + numero1 + " e " + numero2 + " é " + calculadoraPadrao.divisao(numero1, numero2) + "\n");
                            System.out.println("Deseja realizar outra DIVISÃO? \n");
                            System.out.println("1 - SIM ou 2 - NÃO");
                            rebootDivisão = sc.nextInt();
                        }
                        opcao = 1;
                    }else if (opcaoCalculadoraPadrao == 4){
                        Integer rebootMuliplicacao = 1;
                        while (rebootMuliplicacao == 1) {
                            System.out.println("Informe o 1o número da multiplicação: ");
                            Double numero1 = sc.nextDouble();
                            System.out.println("Informe o 2o número da multiplicação: ");
                            Double numero2 = sc.nextDouble();

                            CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao(numero1, numero2);
                            System.out.println("A multiplicação entre " + numero1 + " e " + numero2 + " é " + calculadoraPadrao.multiplicacao(numero1, numero2) + "\n");
                            System.out.println("Deseja realizar outra MULTIPLICAÇÃO? \n");
                            System.out.println("1 - SIM ou 2 - NÃO");
                            rebootMuliplicacao = sc.nextInt();
                        }
                        opcao = 1;
                    }else if (opcaoCalculadoraPadrao == 5){
                        Integer rebootPotenciacao = 1;
                        while (rebootPotenciacao == 1) {
                            System.out.println("Informe o 1o número da potenciação: ");
                            Double numero1 = sc.nextDouble();
                            System.out.println("Informe o 2o número da potenciação: ");
                            Double numero2 = sc.nextDouble();

                            CalculadoraPadrao calculadoraPadrao = new CalculadoraPadrao(numero1, numero2);
                            System.out.println("A potenciação entre " + numero1 + " e " + numero2 + " é " + calculadoraPadrao.exponenciacao(numero1, numero2) + "\n");
                            System.out.println("Deseja realizar outra POTENCIAÇÃO? \n");
                            System.out.println("1 - SIM ou 2 - NÃO");
                            rebootPotenciacao = sc.nextInt();
                        }
                        opcao = 1;
                    }else{
                        calcularNovamente = 2;
                        opcao=0;
                        retornocalculadoraPadrao=0;
                    }
                }
            }
        while (opcao == 2){
            System.out.println("------------------------------------");
            System.out.println("----------CALCULADORA-IMC-----------");
            System.out.println("------------------------------------");
            System.out.println("Por favor informe sua altura: ");

            Double altura = sc.nextDouble();
            System.out.println("Por favor informe seu peso: ");
            Double peso = sc.nextDouble();
            CalculadoraIMC calculadoraIMC = new CalculadoraIMC(altura, peso);
            System.out.println("Seu IMC é: " + calculadoraIMC.calculaIMC(altura, peso));
            System.out.println("Deseja realizar outro cálculo de IMC? \n");
            System.out.println("1 - SIM ou 2 - NÃO");
            Integer naoRebootIMC = sc.nextInt();
            if(naoRebootIMC == 2){
                opcao = 0;
            }else{
                opcao = 2;
            }

        }

        }
    }
}