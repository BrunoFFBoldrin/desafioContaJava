
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DadosConta conta = new DadosConta("John Jones", "Conta Corrente", 2500.00);
        boolean opcaosaida = true;
        Scanner sc = new Scanner(System.in);

        while (opcaosaida) {
            System.out.println("=========================");
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.println("=========================");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.extrato();
                    break;
                case 2:
                    System.out.println("Informe o valor a ser recebido.");
                    double inputValor = sc.nextDouble();

                    if (inputValor <= 0) {

                        System.out.println("Valor invalido. O valor precisa ser maior que zero");
                    } else {
                        conta.receberValor(inputValor);
                        System.out.println("Saldo atualizado: " + conta.getSaldo());
                    }

                    break;

                case 3:
                    System.out.println("Informe o valor a ser sacado.");
                    double inputSacar = sc.nextDouble();

                    if (inputSacar <= 0) {
                        System.out
                                .println("Valor invalido para saque, informe apenas o valor, sem o sinal de negativo");
                    } else if (inputSacar <= conta.getSaldo()) {
                        conta.sacarValor(inputSacar);
                        System.out.println("Saldo atualizado: " + conta.getSaldo());
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;

                case 4:
                    opcaosaida = false;
                    sc.close();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }
}
