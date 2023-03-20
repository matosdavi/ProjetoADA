public class ContaInvestimento extends Conta {

    private double saldoCI;

    public double getSaldoCI() {
        return saldoCI;
    }

    public void setSaldoCI(double saldoCI) {
        this.saldoCI = saldoCI;
    }

    public double depositar(double valor) {
        this.saldoCI = this.saldoCI + valor;
        imprime("Investimento feito com sucesso!");
        return this.saldoCI;
    }
    @Override
    public double sacar(double valor) {
        if (this.saldoCI > valor) {
            this.saldoCI = this.saldoCI - valor;
            imprime("Saque feito com sucesso!");
        } else {
            imprime("Não foi possível realizar o saque, saldo insuficiente.");
        }
        return 0;
    }

    @Override
    public double transferir(double valor, int transferencia) {
        if (this.saldoCI >= valor) {
            this.saldoCI = this.saldoCI - valor;
            imprime("Transferência feita com sucesso!");
        } else {
            imprime("Não foi possível realizar a transferência, saldo insuficiente.");
        }
        return 0;
    }

    public double depositarPJ(double valor) {
        this.saldoCI = this.saldoCI + valor;
        this.saldoCI = this.saldoCI + (valor * 0.02);
        imprime("Investimento feito com sucesso!");
        return this.saldoCI;
    }

    public double sacarPJ(double valor) {
        if (this.saldoCI >= valor) {
            this.saldoCI = this.saldoCI - valor;
            this.saldoCI = this.saldoCI - (valor * 0.005);
            imprime("Saque feito com sucesso!");
        } else {
            imprime("Não foi possível realizar o saque, saldo insuficiente.");
        }
        return 0;
    }

    public double transferirPJ(double valor) {
        if (this.saldoCI >= valor) {
            this.saldoCI = this.saldoCI - valor;
            this.saldoCI = this.saldoCI - (valor * 0.005);
            imprime("Transferência feita com sucesso!");
        } else {
            imprime("Não foi possível realizar a transferência, saldo insuficiente.");
        }
        return 0;
    }

    @Override
    public void consultarSaldo() {
        imprime("\nSaldo: " + this.saldoCI);
    }

    public String toString() {
        return "\nConta Investimento { Nome: " + getNomeCliente() +" / Número da Conta Investimento: " + getNumConta() + " }";
    }
}