import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Auxiliar aux = new Auxiliar();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        boolean v = true;
        Moeda test;

        while (v) {
            System.out.println("\n============================================");
            System.out.println("         SISTEMA CONVERSOR DE MOEDAS ");
            System.out.println("============================================");
            System.out.println("Escolha uma das opções abaixo:\n");
            System.out.println(" 1  Dólar (USD) → Peso Argentino (ARS)");
            System.out.println(" 2  Peso Argentino (ARS) → Dólar (USD)");
            System.out.println(" 3 Dólar (USD) → Real Brasileiro (BRL)");
            System.out.println(" 4 Real Brasileiro (BRL) → Dólar (USD)");
            System.out.println(" 5 Dólar (USD) → Peso Colombiano (COP)");
            System.out.println(" 6  Peso Colombiano (COP) → Dólar (USD)");
            System.out.println(" 7  ❌ Sair do programa");
            System.out.println("--------------------------------------------");
            System.out.print("Digite o número da opção desejada: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    test = new Moeda(aux.buscaMoeda("USD", "ARS"));
                    System.out.print("Digite o valor em Dólares (USD): ");
                    System.out.println(" Valor Convertido: " + test.convertE(sc.nextDouble()) + " ARS");
                    System.out.println(test.toString());
                    break;

                case 2:
                    test = new Moeda(aux.buscaMoeda("ARS", "USD"));
                    System.out.print("Digite o valor em Pesos Argentinos (ARS): ");
                    System.out.println(" Valor Convertido: " + test.convertE(sc.nextDouble()) + " USD");
                    System.out.println(test.toString());
                    break;

                case 3:
                    test = new Moeda(aux.buscaMoeda("USD", "BRL"));
                    System.out.print("Digite o valor em Dólares (USD): ");
                    System.out.println(" Valor Convertido: " + test.convertE(sc.nextDouble()) + " BRL");
                    System.out.println(test.toString());
                    break;

                case 4:
                    test = new Moeda(aux.buscaMoeda("BRL", "USD"));
                    System.out.print("Digite o valor em Reais (BRL): ");
                    System.out.println(" Valor Convertido: " + test.convertE(sc.nextDouble()) + " USD");
                    System.out.println(test.toString());
                    break;

                case 5:
                    test = new Moeda(aux.buscaMoeda("USD", "COP"));
                    System.out.print("Digite o valor em Dólares (USD): ");
                    System.out.println(" Valor Convertido: " + test.convertE(sc.nextDouble()) + " COP");
                    System.out.println(test.toString());
                    break;

                case 6:
                    test = new Moeda(aux.buscaMoeda("COP", "USD"));
                    System.out.print("Digite o valor em Pesos Colombianos (COP): ");
                    System.out.println(" Valor Convertido: " + test.convertE(sc.nextDouble()) + " USD");
                    System.out.println(test.toString());
                    break;

                case 7:
                    System.out.println("\nEncerrando o sistema...");
                    v = false;
                    break;

                default:
                    System.out.println("\n  Opção inválida! Escolha um número entre 1 e 7.");
            }
        }

        sc.close();
    }
}
