### Modelagem de Contas Bancárias

O sistema deve permitir a criação de diferentes tipos de contas, como Conta Corrente e Conta Poupança, cada uma com funcionalidades específicas.

- Crie uma classe abstrata chamada ContaBancaria com os seguintes atributos protegidos:

numeroConta: int - Número da conta.
saldo: double - Saldo da conta.
Implemente os seguintes métodos abstratos na classe ContaBancaria:

- depositar(double valor): void - Adiciona um valor ao saldo da conta.
- sacar(double valor): boolean - Retira um valor do saldo da conta. Retorna verdadeiro se o saque for bem-sucedido e falso caso contrário.
- calcularSaldo(): double - Retorna o saldo atual da conta.

Implemente as seguintes classes concretas que herdam da classe ContaBancaria:
- ContaCorrente: Deve possuir um atributo para representar o limite de cheque especial.
ContaPoupanca: Deve possuir um atributo para representar a taxa de juros.
Implemente os métodos abstratos nas classes concretas de acordo com as regras específicas de cada tipo de conta:

- Para a ContaCorrente, o método sacar() deve considerar o limite de cheque especial, se houver.
Para a ContaPoupanca, o método calcularSaldo() deve aplicar a taxa de juros ao saldo atual.
No método main() de uma classe Main, crie instâncias de diferentes tipos de contas bancárias, realize operações de depósito, saque e exiba o saldo atual de cada conta.

- Requisitos Adicionais:

Utilize o conceito de encapsulamento, garantindo que os atributos das classes sejam privados e acessados por meio de métodos getters e setters.
Garanta que saques não possam resultar em saldo negativo, considerando o limite de cheque especial (se aplicável).
Dicas:

Para a ContaCorrente, o limite de cheque especial pode ser representado por um valor negativo.
A aplicação da taxa de juros na ContaPoupanca pode ser feita multiplicando o saldo pela taxa de juros e adicionando o resultado ao saldo atual.
