CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_alunos (
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    nascimento DATE,
    turma VARCHAR(255),
    nota DECIMAL(4,2) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO tb_alunos(nome, nascimento, turma, nota)
VALUES
("Gabriel", "1994-10-25", "A2", 09.50),
("Pablo", "1996-04-21", "B1", 06.75),
("Bryan", "2000-07-13", "A2", 09.80),
("Felipe", "1995-09-05", "A1", 10.00),
("Vinicius", "1997-05-09", "A1", 07.00);

INSERT INTO tb_alunos(nome, turma, nota)
VALUES
("Luiza", "A2", 10.00),
("Victória", "B1", 09.25);

SELECT nome, nota FROM tb_alunos WHERE nota > 7.00;

SELECT nome, nota FROM tb_alunos WHERE nota < 7.00;

UPDATE tb_alunos SET nota = 10.00 WHERE id = 2;

SELECT * FROM tb_alunos;