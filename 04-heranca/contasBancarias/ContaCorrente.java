class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, double limiteChequeEspecial) {
        super(numeroConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + getNumeroConta());
            return true;
        } else {
            System.out.println("Saque de R$" + valor + " não autorizado na conta " + getNumeroConta() + ". Saldo insuficiente.");
            return false;
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}
