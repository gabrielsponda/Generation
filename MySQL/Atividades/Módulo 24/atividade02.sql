CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categorias (
    id INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE tb_pizzas (
    id INT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    preco DECIMAL(5,2),
    ingredientes TEXT,
    tamanho VARCHAR(50),
    categoria INT,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias (nome, descricao) VALUES ('Tradicional', 'Pizzas com ingredientes clássicos');
INSERT INTO tb_categorias (nome, descricao) VALUES ('Gourmet', 'Pizzas com ingredientes especiais');
INSERT INTO tb_categorias (nome, descricao) VALUES ('Vegetariana', 'Pizzas sem carne');
INSERT INTO tb_categorias (nome, descricao) VALUES ('Doce', 'Pizzas doces e sobremesas');
INSERT INTO tb_categorias (nome, descricao) VALUES ('Especial', 'Pizzas com receitas exclusivas');

INSERT INTO tb_pizzas (nome, preco, ingredientes, tamanho, categoria) VALUES ('Margherita', 42.90, 'Queijo, tomate, manjericão', 'Grande', 1);
INSERT INTO tb_pizzas (nome, preco, ingredientes, tamanho, categoria) VALUES ('Frutos do Mar', 80.00, 'Lulas, polvo, camarões, mexilhões, molho de tomate', 'Grande', 5);
INSERT INTO tb_pizzas (nome, preco, ingredientes, tamanho, categoria) VALUES ('Trufa Negra', 70.00, 'Queijo mussarela, trufas negras, cogumelos, azeite trufado', 'Grande', 2);
INSERT INTO tb_pizzas (nome, preco, ingredientes, tamanho, categoria) VALUES ('Margherita Especial', 50.00, 'Tomate, queijo mussarela de búfala, manjericão, azeite', 'Grande', 3);
INSERT INTO tb_pizzas (nome, preco, ingredientes, tamanho, categoria) VALUES ('Camarão', 75.00, 'Camarões, alho poró, queijo mussarela, molho branco', 'Grande', 2);
INSERT INTO tb_pizzas (nome, preco, ingredientes, tamanho, categoria) VALUES ('Banana com Canela', 40.00, 'Bananas, canela, açúcar, queijo mussarela', 'Média', 4);
INSERT INTO tb_pizzas (nome, preco, ingredientes, tamanho, categoria) VALUES ('Chocolate com Morango', 45.00, 'Chocolate, morangos, chantilly', 'Média', 4);
INSERT INTO tb_pizzas (nome, preco, ingredientes, tamanho, categoria) VALUES ('Carne Seca', 65.00, 'Carne seca desfiada, queijo coalho, cebola roxa, molho barbecue', 'Grande', 5);

SELECT * FROM tb_pizzas WHERE preco > 45.00;

SELECT * FROM tb_pizzas WHERE preco BETWEEN 50.00 AND 100.00;

SELECT * FROM tb_pizzas WHERE nome LIKE '%M%';

SELECT * FROM tb_pizzas INNER JOIN tb_categorias ON tb_pizzas.id = tb_categorias.id;

SELECT * FROM tb_pizzas INNER JOIN tb_categorias ON tb_pizzas.id = tb_categorias.id WHERE tb_categorias.nome = 'Doce';