CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_colaboradores (
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cargo VARCHAR(255),
    data_inicio DATE,
    salario DECIMAL(8,2),
    PRIMARY KEY (id)
);

INSERT INTO tb_colaboradores(nome, cargo, data_inicio, salario)
VALUES
("Gabriel", "CEO", "2023-10-26", 316000.00),
("Bryan", "Recepcionista", "2023-11-01", 1320.00),
("Pablo", "Gerente", "2023-11-10", 7777.00),
("Felipe", "Coordenador", "2023-11-20", 3064.00),
("Vinicius", "Presidente", "2023-12-01", 190000.00);

SELECT nome, salario FROM tb_colaboradores WHERE salario > 2000;

SELECT nome, salario FROM tb_colaboradores WHERE salario < 2000;

SET SQL_SAFE_UPDATES = 0;

UPDATE tb_colaboradores SET salario = 5280.00 WHERE cargo = "Coordenador";

SET SQL_SAFE_UPDATES = 1;

SELECT * FROM tb_colaboradores;
