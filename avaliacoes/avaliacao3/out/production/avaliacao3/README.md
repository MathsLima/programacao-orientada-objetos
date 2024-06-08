Desenvolver um código em Java para um laboratório deseja armazenar dados de exames, clientes e suas solicitações de exames.

Requisitos:
1. Deverá ser possível criar novos exames (ex. “Hemograma”, “TGO”, “TGP” etc), armazenando um código de 3
a 5 letras, o nome do exame e seu preço.

2. Deverá ser possível adicionar exames (sem repetir) ao laboratório.

3. Deverá ser possível cadastrar um novo cliente no laboratório, armazenando seu CPF e seu nome.

4. A partir do laboratório deverá ser possível,
a. localizar um exame pelo seu código. Retornar o exame.
b. Localizar um ciente pelo seu CPF.
c. Buscar uma lista de clientes que realizaram determinado exame.
d. Buscar uma lista de clientes por parte do nome (ex. “Silva”).

5. Um cliente poderá ter associado a ele várias solicitações de exame e, para cada solicitação de exame,
poderão ser adicionado vários exames.

6. Para um cliente, deverá ser possível:
a. Adicionar uma solicitação de exame, armazenando o nro da solicitação (sequencial, iniciando em
1000), o ano e o mês em que foi realizada.
b. Calcular a média de valor pago em todas as suas solicitações.

7. Para uma solicitação de exame, deverá ser possível:
a. Armazenar o CRM do médico solicitante
b. Adicionar um ou mais exames solicitados (da lista já existente no Laboratório)
c. Calcular o total do valor de todos os exames daquela solicitação.

8. Deverá ser possível salvar em um arquivo os dados de um cliente e seus exames. Você define o formato e
quais dados serão armazenados.
