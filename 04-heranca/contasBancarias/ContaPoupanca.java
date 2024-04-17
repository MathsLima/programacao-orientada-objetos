class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(int numeroConta, double taxaJuros) {
        super(numeroConta);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + getNumeroConta());
            return true;
        } else {
            System.out.println("Saque de R$" + valor + " não autorizado na conta " + getNumeroConta() + ". Saldo insuficiente.");
            return false;
        }
    }

    @Override
    public double calcularSaldo() {
        double saldoComJuros = saldo + (saldo * taxaJuros);
        return saldoComJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }
}