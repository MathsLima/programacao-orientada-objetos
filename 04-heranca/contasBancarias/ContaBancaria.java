abstract class ContaBancaria {
    protected int numeroConta;
    protected double saldo;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroConta);
    }

    public abstract boolean sacar(double valor);

    public double calcularSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
}
