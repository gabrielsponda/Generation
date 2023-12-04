-- Criar o banco de dados.
CREATE DATABASE db_quitanda;

-- Selecionar banco de dados;
USE db_quitanda;

-- Criar a tabela de produtos.
CREATE TABLE tb_produtos(
id BIGINT AUTO_INCREMENT,
nome VARCHAR(255) NOT NULL,
quantidade INT,
validade DATE,
preco DECIMAL NOT NULL,
PRIMARY KEY (id)
);

-- Criar e inserir produtos na tabela.
INSERT INTO tb_produtos(nome, quantidade, validade, preco)
VALUES ("Tomate", 100, "2023-12-20", 8.00);

-- Mostrar todos os produtos da tabela.
SELECT * FROM tb_produtos;

-- Criar e inserir mais produtos na tabela.
INSERT INTO tb_produtos(nome, quantidade, validade, preco) 
VALUES ("Maçã", 20, "2023-12-15", 5.00),
("Laranja", 50, "2023-12-15", 10.00),
("Banana", 200, "2023-12-15", 12.00),
("Uva", 1200, "2023-12-15", 30.00),
("Pêra", 500, "2023-12-15", 2.99);

-- Mostrar todos os produtos da tabela.
SELECT * FROM tb_produtos;

-- Mostrar todos os nomes dos produtos da tabela.
SELECT nome FROM tb_produtos;

-- Mostrar todos os nomes e preços dos produtos da tabela.
SELECT nome, preco FROM tb_produtos;

-- Selecionar dados da tabela com critérios de filtragem.
SELECT * FROM tb_produtos WHERE id = 1;

-- Selecionar dados com os operadores relacionais.
SELECT * FROM tb_produtos WHERE preco > 5.00;

-- Selecionar dados com os operadores lógicos.
SELECT * FROM tb_produtos WHERE preco > 5.00 AND quantidade < 100;

-- Modificar a coluna 'preco' na tabela para armazenar valores decimais com até 6 dígitos, incluindo 2 casas decimais.
ALTER TABLE tb_produtos MODIFY preco DECIMAL(6,2);

-- Mostrar todos os produtos da tabela.
SELECT * FROM tb_produtos;

-- Adicionar a coluna 'descricao' à tabela.
ALTER TABLE tb_produtos ADD descricao VARCHAR(255);

-- Desativar as atualizações seguras no SQL, permitindo modificações nas tabelas sem condições WHERE ou LIMIT explícitas.
SET SQL_SAFE_UPDATES = 0;

-- Reativar as atualizações seguras no SQL, exigindo condições WHERE ou LIMIT para modificações nas tabelas.
SET SQL_SAFE_UPDATES = 1;

-- Atualizar o preço para 2.99 na tabela apenas para o registro com id igual a 6.
UPDATE tb_produtos SET preco = 2.99 WHERE id = 6;

-- Atualizar a descrição de vários produtos na tabela.
UPDATE tb_produtos SET descricao = 'Tomate Italiano' WHERE Id = 1;
UPDATE tb_produtos SET descricao = 'Maçã Verde' WHERE Id = 2;
UPDATE tb_produtos SET descricao = 'Laranja Lima' WHERE Id = 3;
UPDATE tb_produtos SET descricao = 'Banana Prata' WHERE Id = 4;
UPDATE tb_produtos SET descricao = 'Uva Italiana' WHERE Id = 5;
UPDATE tb_produtos SET descricao = 'Pêra Williams' WHERE Id = 6;

-- Mostrar todos os produtos da tabela.
SELECT * FROM tb_produtos;

-- Remover a coluna 'descricao' da tabela.
ALTER TABLE tb_produtos DROP descricao;

-- Excluir o registro da tabela onde o campo id é igual a 2.
DELETE FROM tb_produtos WHERE Id = 2;

-- Mostrar todos os produtos da tabela.
SELECT * FROM tb_produtos;