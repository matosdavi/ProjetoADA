import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        try {

            Scanner entrada = new Scanner(System.in);

            imprime("Você deseja abrir/entrar uma conta como Pessoa Física ou Pessoa Jurídica?\n1 - Pessoa Física\n2 - Pessoa Jurídica\n");
            int escolhaCliente = Integer.parseInt(entrada.nextLine());

            if (escolhaCliente == 1) {

                imprime("Você deseja abrir/entrar em uma Conta Corrente, Conta Poupança ou Conta Investimento?\n1- Conta Corrente\n2- Conta Poupança\n3- Conta Investimento\n");
                int escolhaConta = Integer.parseInt(entrada.nextLine());

                Conta conta = null;

                if (escolhaConta == 1) {
                    conta = new ContaCorrente();

                    imprime("Digite seu nome: ");
                    conta.setNomeCliente(entrada.nextLine());
                    imprime("Digite o número da conta: ");
                    conta.setNumConta(Integer.parseInt(entrada.nextLine()));
                    imprime("Digite o saldo da conta: ");
                    ((ContaCorrente) conta).setSaldoCC(Double.parseDouble(entrada.nextLine()));

                    imprime("Você deseja Depositar, Sacar ou Transferir?\n1- Depositar\n2- Sacar\n3- Transferir\n");
                    int escolhaOperacao = Integer.parseInt(entrada.nextLine());

                    if (escolhaOperacao == 1) {
                        imprime("Insira o valor que deseja depositar: ");
                        conta.depositar(Double.parseDouble(entrada.nextLine()));
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 2) {
                        imprime("Insira o valor que deseja sacar: ");
                        conta.sacar(Double.parseDouble(entrada.nextLine()));
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 3) {
                        imprime("Para qual tipo de conta deseja realizar a transferência?\n1- Conta Poupança\n2- Conta Investimento\n");
                        int transferencia = Integer.parseInt(entrada.nextLine());

                        imprime("Insira o valor que deseja transferir: ");
                        double valor = (Double.parseDouble(entrada.nextLine()));

                        conta.transferir(valor, transferencia);
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else {
                        imprime("Por favor, insira uma opção válida.\n\n");
                    }

                } else if (escolhaConta == 2) {
                    conta = new ContaPoupanca();

                    imprime("Digite seu nome: ");
                    conta.setNomeCliente(entrada.nextLine());
                    imprime("Digite o número da conta: ");
                    conta.setNumConta(Integer.parseInt(entrada.nextLine()));
                    imprime("Digite o saldo da conta: ");
                    ((ContaPoupanca) conta).setSaldoCP(Double.parseDouble(entrada.nextLine()));

                    imprime("Você deseja Depositar, Sacar ou Transferir?\n1- Depositar\n2- Sacar\n3- Transferir\n");
                    int escolhaOperacao = Integer.parseInt(entrada.nextLine());

                    if (escolhaOperacao == 1) {
                        imprime("Insira o valor que deseja depositar: ");
                        conta.depositar(Double.parseDouble(entrada.nextLine()));
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 2) {
                        imprime("Insira o valor que deseja sacar: ");
                        ((ContaCorrente) conta).sacarPJ(Double.parseDouble(entrada.nextLine()));
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 3) {
                        imprime("Para qual tipo de conta deseja realizar a transferência?\n1- Conta Corrente\n2- Conta Investimento\n");
                        int transferencia = Integer.parseInt(entrada.nextLine());

                        imprime("Insira o valor que deseja transferir: ");
                        double valor = (Double.parseDouble(entrada.nextLine()));

                        conta.transferir(valor, transferencia);
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else {
                        imprime("Por favor, insira uma opção válida.\n\n");
                    }

                } else if (escolhaConta == 3) {
                    conta = new ContaInvestimento();

                    imprime("Digite seu nome: ");
                    conta.setNomeCliente(entrada.nextLine());
                    imprime("Digite o número da conta: ");
                    conta.setNumConta(Integer.parseInt(entrada.nextLine()));
                    imprime("Digite o saldo da conta: ");
                    ((ContaInvestimento) conta).setSaldoCI(Double.parseDouble(entrada.nextLine()));

                    imprime("Você deseja Depositar, Sacar ou Transferir?\n1- Depositar\n2- Sacar\n3- Transferir\n4- Investir\n");
                    int escolhaOperacao = Integer.parseInt(entrada.nextLine());

                    if (escolhaOperacao == 1) {
                        imprime("Insira o valor que deseja depositar: ");
                        conta.depositar(Double.parseDouble(entrada.nextLine()));
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 2) {
                        imprime("Insira o valor que deseja sacar: ");
                        conta.sacar(Double.parseDouble(entrada.nextLine()));
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 3) {
                        imprime("Para qual tipo de conta deseja realizar a transferência?\n1- Conta Corrente\n2- Conta Poupança\n");
                        int transferencia = Integer.parseInt(entrada.nextLine());

                        imprime("Insira o valor que deseja transferir: ");
                        double valor = (Double.parseDouble(entrada.nextLine()));

                        conta.transferir(valor, transferencia);
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 4) {
                        imprime("Insira o valor que deseja investir: ");
                        ((ContaInvestimento) conta).depositar(Double.parseDouble(entrada.nextLine()));

                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else {
                        imprime("Por favor, insira uma opção válida.\n\n");
                    }
                }

            } else if (escolhaCliente == 2) {

                imprime("Você deseja abrir/entrar em uma Conta Corrente ou Conta Investimento?\n1- Conta Corrente\n2- Conta Investimento\n");
                int escolhaConta = Integer.parseInt(entrada.nextLine());

                Conta conta = null;

                if (escolhaConta == 1) {
                    conta = new ContaCorrente();

                    imprime("Digite seu nome: ");
                    conta.setNomeCliente(entrada.nextLine());
                    imprime("Digite o número da conta: ");
                    conta.setNumConta(Integer.parseInt(entrada.nextLine()));
                    imprime("Digite o saldo da conta: ");
                    ((ContaCorrente) conta).setSaldoCC(Double.parseDouble(entrada.nextLine()));

                    imprime("Você deseja Depositar, Sacar ou Transferir?\n1- Depositar\n2- Sacar\n3- Transferir\n");
                    int escolhaOperacao = Integer.parseInt(entrada.nextLine());

                    if (escolhaOperacao == 1) {
                        imprime("Insira o valor que deseja depositar: ");
                        conta.depositar(Double.parseDouble(entrada.nextLine()));
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 2) {
                        imprime("Insira o valor que deseja sacar: ");
                        ((ContaCorrente) conta).sacarPJ(Double.parseDouble(entrada.nextLine()));
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 3) {
                        imprime("Para qual tipo de conta deseja realizar a transferência?\n1- Conta Poupança\n2- Conta Investimento\n");
                        int transferencia = Integer.parseInt(entrada.nextLine());

                        imprime("Insira o valor que deseja transferir: ");
                        double valor = (Double.parseDouble(entrada.nextLine()));

                        conta.transferir(valor, transferencia);
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else {
                        imprime("Por favor, insira uma opção válida.\n\n");
                    }

                } else if (escolhaConta == 2) {
                    conta = new ContaInvestimento();

                    imprime("Digite seu nome: ");
                    conta.setNomeCliente(entrada.nextLine());
                    imprime("Digite o número da conta: ");
                    conta.setNumConta(Integer.parseInt(entrada.nextLine()));
                    imprime("Digite o saldo da conta: ");
                    ((ContaInvestimento) conta).setSaldoCI(Double.parseDouble(entrada.nextLine()));

                    imprime("Você deseja Depositar, Sacar ou Transferir?\n1- Depositar\n2- Sacar\n3- Transferir\n4- Investir\n");
                    int escolhaOperacao = Integer.parseInt(entrada.nextLine());

                    if (escolhaOperacao == 1) {
                        imprime("Insira o valor que deseja depositar: ");
                        conta.depositar(Double.parseDouble(entrada.nextLine()));
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 2) {
                        imprime("Insira o valor que deseja sacar: ");
                        ((ContaInvestimento) conta).sacarPJ(Double.parseDouble(entrada.nextLine()));
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 3) {
                        imprime("Para qual tipo de conta deseja realizar a transferência?\n1- Conta Poupança\n2- Conta Investimento\n");
                        int transferencia = Integer.parseInt(entrada.nextLine());

                        imprime("Insira o valor que deseja transferir: ");
                        double valor = (Double.parseDouble(entrada.nextLine()));

                        conta.transferir(valor, transferencia);
                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else if (escolhaOperacao == 4) {
                        imprime("Insira o valor que deseja investir: ");
                        ((ContaInvestimento) conta).depositarPJ(Double.parseDouble(entrada.nextLine()));

                        conta.consultarSaldo();
                        System.out.println(conta.toString());

                    } else {
                        imprime("Por favor, insira uma opção válida.\n\n");
                    }

                } else {
                    imprime("Por favor, insira uma opção válida.\n\n");
                }

            } else {
                imprime("Por favor, insira uma opção válida.\n\n");
            }

        } catch (Exception e) {
            imprime("Aconteceu um erro: " + e.getMessage() + ".\n");
            main(args);
        } finally {
            imprime("\nFim da execução.");
        }
    }

    public static void imprime(String msg) {
        System.out.print(msg);
    }
}