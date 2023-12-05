CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos (
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    preco DECIMAL(6,2) NOT NULL,
    descricao VARCHAR(255),
    quantidade INT,
    PRIMARY KEY (id)
);

INSERT INTO tb_produtos(nome, preco, descricao, quantidade)
VALUES
("Mouse Gamer", 300.99, "Mouse de alta precisão para jogos.", 5),
("Teclado", 85.75, "Teclado comum para escritório.", 11),
("Cadeira de Escritório", 250.80, "Cadeira egonômica para escritório.", 2),
("Monitor", 750.00, "Monitor de 24 polegadas.", 8),
("Headset", 500.90, "Headset de alta performance.", 1);

INSERT INTO tb_produtos(nome, preco, quantidade)
VALUES
("Lapiseira", 1.00, 15),
("Caneta", 1.75, 23);

SELECT nome, preco FROM tb_produtos WHERE preco > 500;

SELECT nome, preco FROM tb_produtos WHERE preco < 500;

UPDATE tb_produtos SET preco = 299.99 WHERE id = 1;

SELECT * FROM tb_produtos;
