-- Apagar Banco de Dados db_quitanda
DROP DATABASE db_quitanda;

-- Recriar o Banco de dados db_quitanda
CREATE DATABASE db_quitanda;

-- Selecionar o Banco de Dados db_quitanda
USE db_quitanda;

-- Criar a tabela tb_categorias
CREATE TABLE tb_categorias(
id bigint AUTO_INCREMENT,
descricao varchar(255) NOT NULL,
PRIMARY KEY (id)
);

-- Insere dados na tabela tb_categorias
INSERT INTO tb_categorias (descricao)
VALUES ("Frutas");

INSERT INTO tb_categorias (descricao)
VALUES ("Verduras");

INSERT INTO tb_categorias (descricao)
VALUES ("Legumes");

INSERT INTO tb_categorias (descricao)
VALUES ("Temperos");


INSERT INTO tb_categorias (descricao)
VALUES ("Ovos");

INSERT INTO tb_categorias (descricao)
VALUES ("outros");

-- Lista todos os dados da tabela tb_categorias
SELECT * FROM tb_categorias;

-- Criar a Tabela tb_produtos
CREATE TABLE tb_produtos(
id bigint AUTO_INCREMENT,
nome varchar(255) NOT NULL,
quantidade int, 
dtvalidade date NULL,
preco decimal(6, 2),
categoria_id bigint, 
PRIMARY KEY (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categorias(id)
);

-- Insere dados na tabela tb_produtos
INSERT INTO tb_produtos (nome, quantidade, dtvalidade, preco, categoria_id)
VALUES ("Maçã", 1000, "2022-03-07", 1.99, 1);

INSERT INTO tb_produtos (nome, quantidade, dtvalidade, preco, categoria_id)
VALUES ("Banana", 1300, "2022-03-08", 5.00, 1);

INSERT INTO tb_produtos (nome, quantidade, dtvalidade, preco, categoria_id)
VALUES ("Batata doce", 2000, "2022-03-09", 10.00, 3);

INSERT INTO tb_produtos (nome, quantidade, dtvalidade, preco, categoria_id)
VALUES ("Alface", 300, "2022-03-10", 7.00, 2);

INSERT INTO tb_produtos (nome, quantidade, dtvalidade, preco, categoria_id)
VALUES ("Cebola", 1020, "2022-03-08", 5.00, 3);

INSERT INTO tb_produtos(nome, quantidade, dtvalidade, preco, categoria_id)
VALUES("Ovo Branco", 1000, "2022-03-07", 15.00, 5);

INSERT INTO tb_produtos(nome, quantidade, dtvalidade, preco, categoria_id)
VALUES("Agrião", 1500, "2022-03-06", 3.00, 2);

INSERT INTO tb_produtos(nome, quantidade, dtvalidade, preco, categoria_id)
VALUES("Cenoura", 1800, "2022-03-09", 3.50, 3);

INSERT INTO tb_produtos (nome, quantidade, dtvalidade, preco, categoria_id)
VALUES ("Pimenta", 1100, "2022-03-15", 10.00, 4);

INSERT INTO tb_produtos (nome, quantidade, dtvalidade, preco, categoria_id)
VALUES ("Alecrim", 130, "2022-03-10", 5.00, 4);

INSERT INTO tb_produtos (nome, quantidade, dtvalidade, preco, categoria_id)
VALUES ("Manga", 200, "2022-03-07", 5.49, 1);

INSERT INTO tb_produtos (nome, quantidade, dtvalidade, preco, categoria_id)
VALUES ("Laranja", 3000, "2022-03-13", 10.00, 1);

INSERT INTO tb_produtos (nome, quantidade, dtvalidade, preco, categoria_id)
VALUES ("Couve", 100, "2022-03-12", 1.50, 2);

INSERT INTO tb_produtos(nome, quantidade, dtvalidade, preco, categoria_id)
VALUES("Tomate", 1105, "2022-03-15", 3.00, 3);

INSERT INTO tb_produtos(nome, quantidade, dtvalidade, preco, categoria_id)
VALUES("Rabanete", 1200, "2022-03-15", 13.00, 3);

INSERT INTO tb_produtos(nome, quantidade, preco)
VALUES("Sacola Cinza", 1118, 0.50);

INSERT INTO tb_produtos(nome, quantidade, preco)
VALUES("Sacola Verde", 1118, 0.50);

-- Visualiza todos os dados da tabela tb_produtos
SELECT * FROM tb_produtos;

-- Visualiza todos os dados da tabela tb_produtos ordenados de forma crescente pelo nome e, em seguida, pelo preço.
SELECT * FROM tb_produtos ORDER BY nome, preco;

-- Visualiza todos os dados da tabela tb_produtos ordenados de forma decrescente pelo nome.
SELECT * FROM tb_produtos ORDER BY nome DESC;

-- Visualiza todos os dados da tabela tb_produtos com preços iguais a 5, 10 ou 15.
SELECT * FROM tb_produtos WHERE preco IN (5, 10, 15);

-- Visualiza todos os dados da tabela tb_produtos com preços entre 5 e 15.
SELECT * FROM tb_produtos WHERE preco BETWEEN 5 AND 15;

-- Visualiza todos os dados da tabela tb_produtos com nome que contenham "ra" em qualquer posição.
SELECT * FROM tb_produtos WHERE nome LIKE "%ra%";

-- Visualiza todos os dados da tabela tb_produtos com nome que contenham "ra" no início.
SELECT * FROM tb_produtos WHERE nome LIKE "ra%";

-- Visualiza todos os dados da tabela tb_produtos com nome que contenham "ra" no final.
SELECT * FROM tb_produtos WHERE nome LIKE "%ra";

-- Conta o total de linhas na tabela tb_produtos.
SELECT count(*) FROM tb_produtos;

-- Soma os preços de todos os produtos da tabela tb_produtos.
SELECT sum(preco) FROM tb_produtos;

-- Calcula a média dos preços de todos os produtos da tabela tb_produtos.
SELECT avg(preco) FROM tb_produtos;

-- Retorna o maior preço dentre os preços de todos os produtos da tabela tb_produtos.
SELECT max(preco) FROM tb_produtos;

-- Retorna o menor preço dentre os preços de todos os produtos da tabela tb_produtos.
SELECT min(preco) FROM tb_produtos;

-- Consulta dados dos produtos e suas respectivas categorias através de um INNER JOIN entre tb_produtos e tb_categorias.
SELECT nome, preco, quantidade, tb_categorias.descricao 
FROM tb_produtos 
INNER JOIN tb_categorias ON categoria_id = tb_categorias.id;

-- Seleciona produtos com descrições de categorias, incluindo produtos sem categoria.
SELECT nome, preco, quantidade, tb_categorias.descricao 
FROM tb_produtos 
LEFT JOIN tb_categorias ON categoria_id = tb_categorias.id;

-- Seleciona categorias com detalhes de produtos, incluindo categorias sem produtos.
SELECT nome, preco, quantidade, tb_categorias.descricao 
FROM tb_produtos 
RIGHT JOIN tb_categorias ON categoria_id = tb_categorias.id;

-- Calcula o preço médio dos produtos agrupados por categoria.
SELECT tb_categorias.descricao, avg(preco) AS Preço_Médio
FROM tb_produtos 
INNER JOIN tb_categorias ON categoria_id = tb_categorias.id
GROUP BY tb_categorias.descricao;