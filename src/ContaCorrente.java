public class ContaCorrente extends Conta {

    private double saldoCC;

    public double getSaldoCC() {
        return saldoCC;
    }

    public void setSaldoCC(double saldoCC) {
        this.saldoCC = saldoCC;
    }

    @Override
    public double depositar(double valor) {
        this.saldoCC = this.saldoCC + valor;
        imprime("Depósito feito com sucesso!");
        return this.saldoCC;
    }
    @Override
    public double sacar(double valor) {
        if (this.saldoCC >= valor) {
            this.saldoCC = this.saldoCC - valor;
            imprime("Saque feito com sucesso!");
        } else {
            imprime("Não foi possível realizar o saque, saldo insuficiente.");
        }
        return 0;
    }

    @Override
    public double transferir(double valor, int transferencia) {
        if (this.saldoCC >= valor) {
            this.saldoCC = this.saldoCC - valor;
            imprime("Transferência feita com sucesso!");
        } else {
            imprime("Não foi possível realizar a transferência, saldo insuficiente.");
        }
        return 0;
    }

    public double sacarPJ(double valor) {
        if (this.saldoCC >= valor) {
            this.saldoCC = this.saldoCC - valor;
            this.saldoCC = this.saldoCC - (valor * 0.005);
            imprime("Saque feito com sucesso!");
        } else {
            imprime("Não foi possível realizar o saque, saldo insuficiente.");
        }
        return 0;
    }

    public double transferirPJ(double valor) {
        if (this.saldoCC >= valor) {
            this.saldoCC = this.saldoCC - valor;
            this.saldoCC = this.saldoCC - (valor * 0.005);
            imprime("Transferência feita com sucesso!");
        } else {
            imprime("Não foi possível realizar a transferência, saldo insuficiente.");
        }
        return 0;
    }

    @Override
    public void consultarSaldo() {
        imprime("\nSaldo: " + this.saldoCC);
    }

    public String toString() {
        return "\nConta Corrente { Nome: " + getNomeCliente() +" / Número da Conta Corrente: " + getNumConta() + " }";
    }
}