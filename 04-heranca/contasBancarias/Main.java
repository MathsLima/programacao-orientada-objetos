public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(123456, 1000);
        contaCorrente.depositar(500);
        contaCorrente.sacar(700);
        System.out.println("Saldo atual da conta corrente: R$" + contaCorrente.calcularSaldo());
        System.out.println("Limite de cheque especial da conta corrente: R$" + contaCorrente.getLimiteChequeEspecial());

        ContaPoupanca contaPoupanca = new ContaPoupanca(654321, 0.03);
        contaPoupanca.depositar(1000);
        contaPoupanca.sacar(200);
        System.out.println("Saldo atual da conta poupança: R$" + contaPoupanca.calcularSaldo());
        System.out.println("Taxa de juros da conta poupança: " + (contaPoupanca.getTaxaJuros() * 100) + "%");
    }
}