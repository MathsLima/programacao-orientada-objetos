O sistema deve ser composto pela classe Caixa, que deve possuir como atributos os
seguintes atributos de instância: 
(a) identificação: int; 
(b) tamFilaAtual: int; 
(c) faturamento:
double 
(d) status: Operacional. 

Adicionalmente, a classe Caixa deve possuir os seguintes
atributos de classe: 
(a) nroMaximoNaFila: int e 
(b) classID: int. 

Crie métodos get para cada um dos atributos. Além dos getters básicos, crie também o seguinte conjunto de métodos:
• setStatus(Operacional status): void → modifica o status atual do caixa. Como
resultado, elimina a fila.

• incFila():bool → permite a inclusão de mais um cliente na fila do caixa, caso o
tamanho da fila não exceda o nroMaximoNaFila.

• Cheio():bool → retorna TRUE se a fila chegou a sua capacidade máxima, ou seja, é
igual a nroMaximoNaFila.

• realizaAtendimento():void → Caso a fila seja maior do que zero, o caixa consome
um cliente da fila. Durante este passo, um valor aleatório de compra é realizado a
ser contabilizado como faturamento do caixa. Caso não exista ninguém na fila, nada é feito.
Operacional, associado a um dos atributos da classe Caixa, é um tipo enumerado. Indica
que um caixa está funcionando ou que está parado.

Adicionalmente, elabore a classe Supermercado, que deve ter com atributos de
instância: 
(a) um conjunto de caixas; 
(b) nroClientesEntraram: int; 
(c) clientesNaoAtendidos: int.

A classe Supermercado deve fornecer as seguintes operações a partir de sua elaboração:
• entraCliente(): void → Sinaliza a entrada de um cliente no supermercado que realiza
comprar, o que deve ser anotado no atributo nroClientesEntraram. Neste método,
deve-se procurar por um caixa disponível, ou seja, um caixa que esteja operando e
que o tamanho da fila não tenha atingido o máximo. Caso um caixa com esta
característica seja encontrado, deve-se incluir mais um a fila do caixa. Caso
contrário, deve-se gerar um valor aleatório de compra (R$), anotar como cliente não
atendido e incrementar o valor de compra como perdido.

• avanca(): void → faz com que os caixas atendam um cliente em sua fila. Durante o
atendimento, deve-se gerar um valor aleatório de compra, o qual deve ser
considerado como faturamento.

• listaCaixas():void → lista cada caixa com sua identificação, informando seu status, o
faturamento de cada um e o tamanho da fila.

• mudaStatusCaixa(int identificacao): void → permite que um caixa seja parado ou
que volte a funcionar. Caso seja posto em funcionamento, esta caixa fica apto a
receber novos clientes a partir da nova entrada de clientes. Caso este seja parado,
os clientes da fila devem ser realocados conforme disponibilidade dos demais caixas.
Caso haja caixa disponível, deve-se incluir na fila. Caso não haja, deve-se contabilizar
a perda de faturamento

• valorFaturado(): double → apresenta o valor faturado até o momento de forma
global no supermercado

• valorPerdido():double → apresenta o valor perdido até o momento de forma global
no supermercado

• caixasDisponíveis: int → apresenta a quantidade de caixas que existem no
supermercado

• caixasOperando():int → apresenta a quantidade de caixas que estão operando no
momento

• caixasParados():int → apresenta a quantidade de caixas que estão parados neste
momento.

![UML](D:/Programaçao/programacao-orientada-objetos/exercicios/03-modelagem-orientada-objetos/simulador-supermercado/SimuladorSupermercado.png)

