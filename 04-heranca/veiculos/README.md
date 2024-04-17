#### Hierarquia de classes em Java para representar diferentes tipos de veículos. 

A classe base deve ser Veiculo, e dela devem ser derivadas as classes Carro, Moto e Caminhao. Cada classe deve ter os seguintes atributos:

Veiculo: marca, modelo, ano, cor, preco
Carro: numeroPortas, tipoCombustivel
Moto: cilindradas, tipoPartida (elétrica ou manual)
Além disso, cada classe deve ter um construtor para inicializar seus atributos, métodos para obter e definir valores dos atributos (getters e setters), e um método toString() para representar o objeto em formato de string.

Após criar as classes, crie uma classe AppVeiculos com um método main() para testar as funcionalidades das classes. Instancie pelo menos um objeto de cada classe e demonstre o uso dos métodos definidos.


#### Exercício de Programação em Java: Gerenciamento de Frota de Veículos

Crie um sistema em Java para gerenciar uma frota de veículos. Você deve definir uma hierarquia de classes similar ao exercício anterior, com as classes Veiculo, Carro, Moto e Caminhao.

Além disso, crie uma classe chamada FrotaVeiculos, que contenha uma lista para armazenar os veículos. A classe FrotaVeiculos deve ter métodos para adicionar um veículo à lista, remover um veículo da lista, e um método para imprimir os detalhes de todos os veículos da frota.

Cada veículo deve ter um identificador único (por exemplo, um número de série) para facilitar a remoção e identificação na lista.

Após criar as classes, implemente uma pequena aplicação na classe TesteFrotaVeiculos com um método main(), onde você cria uma frota de veículos, adiciona alguns veículos, remove um ou dois veículos e, por fim, imprime os detalhes dos veículos restantes na frota.
