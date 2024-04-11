Exercício Avaliativo 1
Programação Orientada a Objetos
Prof. Daniel Callegari
Autor: Matheus Silva de Lima

### Tarefa:
Deseja-se armazenar dados sobre livros. Para cada livro deseja-se saber o título, o autor principal (apenas
um), e a lista de capítulos (para cada capítulo deseja-se saber o título do capítulo e o número de páginas
daquele capítulo).
Considere também que para cada livro:
a) deverá ser possível consultar o título; mas não deverá ser possível alterá-lo;
b) deverá ser possível consultar o autor; mas não deverá ser possível alterá-lo;
c) deverá ser possível adicionar os dados de um capítulo; mas não será possível alterar nem remover
capítulos;
d) deverá ser possível consultar a quantidade total de páginas do livro;
e) deverá ser possível consultar a quantidade de capítulos;
f) deverá ser possível consultar o título de um capítulo, dado o seu índice (ex. 4; considere que o
primeiro capítulo deverá ter o de número 1).

### Exemplo de método main
No método main, crie 2 livros, cada um com pelo menos 3 capítulos.
Para o primeiro livro criado, imprima na tela o seu título e o total de páginas.
Para o segundo livro criado, imprima o autor e o título do seu segundo capítulo.

### Logia utilizada
Criei uma classe chamada capitulo para poder armazenar os capitulos e istanciei na classe Livro.
A classe Livro possui os atributos basicos de autor e titulo com a classe Capitulo para armazenar os capiulos dentro de um unico livro.
O metodo adicionarCapitulo verifica e percorre a lista e adiciona o titulo do capitulo e a quantidade de pagina do capitulo.
Foi criado um getCapitulo para fazer o get do capitulo.
O metodo imprimirCapitulo2 verifica a quantidade de capitulos inseridos e percorre o capitulo obtendo o indice desejado.
Classe Main divide em livro 1 e livro 2 criando o objeto com a classe Livro.
Classe Main utiliza metodos da classe Livro para adicionar capitulos.

Foi solicitado, mas não consegui desenvolver uma solução para o total de paginas do livro com todos os capitulos.
