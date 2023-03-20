public class ContaPoupanca extends Conta {

    private double saldoCP;

    public double getSaldoCP() {
        return saldoCP;
    }

    public void setSaldoCP(double saldoCP) {
        this.saldoCP = saldoCP;
    }

    @Override
    public double depositar(double valor) {
        this.saldoCP = this.saldoCP + valor;
        imprime("Depósito feito com sucesso!");
        return this.saldoCP;
    }

    @Override
    public double sacar(double valor) {
        if (saldoCP >= valor) {
            this.saldoCP = this.saldoCP - valor;
            imprime("Saque feito com sucesso!" + this.saldoCP);
        } else {
            imprime("Não foi possível realizar o saque, saldo insuficiente.");
        }
        return valor;
    }

    @Override
    public double transferir(double valor, int transferencia) {
        if (this.saldoCP >= valor) {
            this.saldoCP = this.saldoCP - valor;
            imprime("Transferência feita com sucesso!");
        } else {
            imprime("Não foi possível realizar a transferência, saldo insuficiente.");
        }
        return 0;
    }

    @Override
    public void consultarSaldo() {
        imprime("\nSaldo: " + this.saldoCP);
    }

    public String toString() {
        return "\nConta Poupança { Nome: " + getNomeCliente() +" / Número da Conta Poupança: " + getNumConta() + " }";
    }
}