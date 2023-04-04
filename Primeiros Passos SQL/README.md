## Primeiros Passos com SQL

### Classificações:
* **DDL (Data Definition Language)**: São comandos utilizados para definir a estrutura do banco de dados, como a criação, alteração e exclusão de tabelas, índices, visões, procedimentos armazenados, entre outros. Exemplos: CREATE, ALTER, DROP, RENAME, etc.

* **DML (Data Manipulation Language)**: São comandos utilizados para manipular os dados dentro das tabelas do banco de dados, como a inserção, atualização e exclusão de registros. Exemplos: INSERT, UPDATE, DELETE, etc.

* **DQL (Data Query Language)**: São comandos utilizados para consultar os dados de uma ou mais tabelas do banco de dados, retornando um conjunto de resultados. Exemplos: SELECT, FROM, WHERE, JOIN, GROUP BY, ORDER BY, etc.

* **DCL (Data Control Language)**: São comandos utilizados para controlar o acesso e as permissões de usuários e grupos no banco de dados, incluindo a criação de usuários, concessão de privilégios, revogação de privilégios e outras operações de segurança. Exemplos: GRANT, REVOKE, DENY, etc.

* **TCL (Transaction Control Language)**: São comandos utilizados para gerenciar transações dentro do banco de dados, incluindo o início, confirmação ou reversão de transações. Exemplos: COMMIT, ROLLBACK, SAVEPOINT, etc.

### Tipos de Dados:

* Numericos:

TINYINT (inteiro) -127 a 127
SMALLINT (inteiro) -32768 a 32767
MEDIUMINT (inteiro) -8388608 a 8388607
INT (inteiro) -2147483648 a 2147483647
BIGINT (inteiro) -9223372036854775808 a 9223372036854775807
FLOAT (decimal) -3.402823466E+38 a -1.175494351E-38 ou 0 a 1.175494351E-38 a 3.402823466E+38
DOUBLE (decimal) -1.7976931348623157E+308 a -2.2250738585072014E-308 ou 0 a 2.2250738585072014E-308 a 1.7976931348623157E+308
DECIMAL (decimal) -10^38 +1 a 10^38 -1

* Temporais:

DATE (data) '1000-01-01' a '9999-12-31'
TIME (horário) '-838:59:59' a '838:59:59'
DATETIME (data e horário) '1000-01-01 00:00:00' a '9999-12-31 23:59:59'
TIMESTAMP (data e horário) '1970-01-01 00:00:01' UTC a '2038-01-19 03:14:07' UTC

* Texto:

CHAR (caracteres fixos) 0 a 255 caracteres
VARCHAR (caracteres variáveis) 0 a 65535 caracteres
TINYTEXT (texto curto) 0 a 255 caracteres
TEXT (texto) 0 a 65535 caracteres
MEDIUMTEXT (texto longo) 0 a 16777215 caracteres
LONGTEXT (texto muito longo) 0 a 4294967295 caracteres

* Binário:

BINARY (binário fixo) 0 a 255 bytes
VARBINARY (binário variável) 0 a 65535 bytes
TINYBLOB (dados binários curtos) 0 a 255 bytes
BLOB (dados binários) 0 a 65535 bytes
MEDIUMBLOB (dados binários longos) 0 a 16777215 bytes
LONGBLOB (dados binários muito longos) 0 a 4294967295 bytes
Outros:

ENUM (lista de valores) lista de até 65535 valores
SET (conjunto de valores) até 64 membros



### Comandos básicos:
* `CREATE DATABASE nomeDoBanco;` - Cria um banco de dados

* `SHOW DATABASES;` - Mostra todos os bancos criados

* `Use nomeDoBandoDeDados` - Usa o banco de dados sitado 

*  `nomeDecoluna SMALLINT UNSIGNED` - Cria uma variável inteira somente positiva (unsigned)

* `nomeDecoluna VARCHAR(20)` - Cria uma variavel texto com tamanho maximo de 20 caracteres

* `CONSTRAINT pk_person PRIMARY KEY (person_id) - ` Define uma chave primaria. *Essa linha cria uma constraint (restrição) na tabela person, chamada pk_person (podendo ser qualquer nome válido), que define a coluna person_id como chave primária (PRIMARY KEY) da tabela*
INSERT
* `Desc NomeDeTabela` - Descreve a estrutura de uma tabela

* `INSERT INTO - Insere valores em tabela`.
1. Inserindo valores fixos em todas as colunas:
    `INSERT INTO tabela (coluna1, coluna2, coluna3) VALUES (valor1, valor2, valor3);` 

2. Inserindo valores em algumas colunas, e deixando outras com valor nulo:
`INSERT INTO tabela (coluna1, coluna3) VALUES (valor1, valor3);`

3. Inserindo valores de outra tabela:
`INSERT INTO tabela_destino (coluna1, coluna2, coluna3)`
`SELECT coluna1, coluna2, coluna3 FROM tabela_origem;`

4. Inserindo vários valores de uma vez:
`INSERT INTO tabela (coluna1, coluna2, coluna3) VALUES (valor1, valor2, valor3), (valor4, valor5, valor6), (valor7, valor8, valor9);`

5. Inserindo valores de uma subquery:
`INSERT INTO tabela (coluna1, coluna2, coluna3)`
`SELECT coluna1, coluna2, coluna3 FROM outra_tabela WHERE coluna4 = valor;`

* `DELETE FROM nomeTabela WHERE nomeColuna = valorColuna` - Deleta valores onde a coluna é igual ao valor sugerido. 